package ru.otus.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static ru.otus.factory.WebDriverFactory.getWebDriver;

public class TestBase {

    public static final String BROWSER_NAME = System.getenv("BROWSER_NAME");

    private WebDriver driver;


    @BeforeSuite
    public void setUp() {
        printEnvData();
        driver = getWebDriver(BROWSER_NAME);
    }

    @AfterSuite
    public void tearDown() {
        try {
            driver.close();
        } catch (Exception ignored) {
        }
    }

    private void printEnvData() {
        System.out.println("****************** BASE ******************");
        System.out.println("BROWSER_NAME: " + BROWSER_NAME);
    }
}