package ru.otus.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import ru.otus.factory.WebDriverFactory;
import ru.otus.pages.MainPage;

import java.util.ArrayList;
import java.util.List;

public class TestBase {

    private static final String BROWSER_NAME = System.getenv("BROWSER_NAME");

    protected List<WebDriver> drivers = new ArrayList<>();
    protected ThreadLocal<WebDriver> trDriver = new ThreadLocal<>();
    protected ThreadLocal<MainPage> trMainPage = new ThreadLocal<>();

    protected WebDriver driver;
    protected MainPage mainPage;

    @BeforeSuite
    public void setUp() {
        printEnvData();
    }

    @BeforeMethod
    public void beforeMethod() {
        if (trDriver.get() == null) {
            trDriver.set(WebDriverFactory.getWebDriver(BROWSER_NAME));
            drivers.add(trDriver.get());
        }
        driver = trDriver.get();

        if (trMainPage.get() == null) {
            trMainPage.set(new MainPage(driver));
        }
        mainPage = new MainPage(driver);
    }

    @AfterSuite
    public void tearDown() {
        for (WebDriver webDriver : drivers) {
            try {
                webDriver.close();
            } catch (Exception e) {
                System.out.println();
            }
        }
    }

    private void printEnvData() {
        System.out.println("****************** BASE ******************");
        System.out.println("BROWSER_NAME: " + BROWSER_NAME);
    }
}