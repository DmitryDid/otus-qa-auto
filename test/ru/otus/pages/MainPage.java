package ru.otus.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class MainPage {

    private final WebDriver driver;
    private final String url = "https://otus.ru/";

    @FindBy(css = ".lessons a")
    private List<WebElement> elLessons;

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public MainPage clickRandomLesson() {
        elLessons.get(new Random().nextInt(elLessons.size() - 1)).click();
        return this;
    }

    public MainPage openPage() {
        driver.get(url);
        return this;
    }
}
