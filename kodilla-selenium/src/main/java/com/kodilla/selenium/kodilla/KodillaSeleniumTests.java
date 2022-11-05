package com.kodilla.selenium.kodilla;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KodillaSeleniumTests {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");      // [1]
        WebDriver driver = new ChromeDriver();
        driver.get("https://kodilla.com/pl/sign-in");
        WebElement input = driver.findElement(By.xpath("//html/body/div/div/form/fieldset/input"));
        input.sendKeys("namr r ");
        WebElement input2 = driver.findElement(By.xpath("//html/body/div/div/form/fieldset[2]/input"));
        input2.sendKeys("namr r ");
    }
}
