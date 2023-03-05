package ru.otus.factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

    public static synchronized WebDriver getWebDriver(String browser) {
        switch (browser.trim().toLowerCase()) {
            case "ff":
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                System.out.println("FirefoxDriver initialized");
                return new FirefoxDriver();
            case "chrome":
            default:
                WebDriverManager.chromedriver().setup();
                System.out.println("ChromeDriver initialized");
                return new ChromeDriver();
        }
    }
}
