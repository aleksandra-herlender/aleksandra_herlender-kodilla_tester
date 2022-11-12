package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");      // [1]
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.allegro.pl");
        driver.findElement(By.cssSelector("#opbox-gdpr-consents-modal  button")).click();
        WebElement category = driver.findElement(By.cssSelector("#tab-dzialy > div > div > div > a"));
        category.click();

        WebElement input = driver.findElement(By.cssSelector("form > input"));
        input.sendKeys("Mavic mini");
        input.submit();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".opbox-listing article")));
        List<WebElement> results = driver.findElements(By.cssSelector("section > article"));
        for (WebElement result:results) {
            System.out.println(result.getText());
        }
    }
}
