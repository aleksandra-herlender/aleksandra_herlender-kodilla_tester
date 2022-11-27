package com.kodilla.googleselenium.pages;

import org.openqa.selenium.WebDriver;

public class RandomPage extends AbstractPage {

    public RandomPage(WebDriver driver) {
        super(driver);
    }

    public void checkCurrentUrl(String selectedUrl){
        System.out.println("selectedUrl = " + selectedUrl);
        System.out.println("currentUrl = " + driver.getCurrentUrl());
    }
}
