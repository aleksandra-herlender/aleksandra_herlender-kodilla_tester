package com.kodilla.googleselenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class GoogleResults extends AbstractPage {

    @FindBy(css = "div[class='g']")                  // [1]
    private List<WebElement> results;                // [2]

    public GoogleResults(WebDriver driver) {         // [3]
        super(driver);                                // [4]
        PageFactory.initElements(this.driver, this);  // [5]
    }

    public void iSeeResults() {
        System.out.println("I see results");
        System.out.println(results.size());
        openRandomResult(results.size());
    }

    private void openRandomResult(int range) {
        Random random = new Random();
        WebElement element = results.get(random.nextInt(range));
        WebElement a = element.findElement(By.cssSelector("a"));
        String selectedUrl = a.getAttribute("href");
        a.click();
        RandomPage randomPage = new RandomPage(driver);
        randomPage.checkCurrentUrl(selectedUrl);
    }
}

