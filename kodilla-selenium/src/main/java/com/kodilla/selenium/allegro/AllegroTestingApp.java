package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");      // [1]
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.allegro.pl");
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div/div[2]/button[1]")).click();
        WebElement category = driver.findElement(By.xpath("//*[@id=\"tab-dzialy\"]/div/div/div[1]/a"));
        category.click();

        WebElement input = driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div[1]/div/div/div/form/input"));
        input.sendKeys("Mavic mini");
        input.submit();

    }
}
