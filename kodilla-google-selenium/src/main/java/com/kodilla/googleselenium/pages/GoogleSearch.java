package com.kodilla.googleselenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class GoogleSearch extends AbstractPage {            // [1]

    @FindBy(css = "input[name='q']")
    static WebElement inputField;

    @FindBy(css = "input[value='Google Suche']")
    static List<WebElement> searchButton;
    private  GoogleResults googleResults;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://wwww.google.com");
        GoogleSearch googleSearch = new GoogleSearch(driver);
        googleSearch.searchResults();
    }
    public GoogleSearch(WebDriver driver) {                  // [2]
        super(driver);
    }

    public void searchResults() {
        PageFactory.initElements(driver, GoogleSearch.class);
        inputField.sendKeys("Kodilla");
        googleResults = loadResults(driver);
        googleResults.iSeeResults();
    }


    public static GoogleResults loadResults(WebDriver driver) {
        inputField.submit();
        return new GoogleResults(driver);
    }
}