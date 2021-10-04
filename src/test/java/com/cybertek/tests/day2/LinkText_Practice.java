package com.cybertek.tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText_Practice {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/");

        WebElement abcTest = driver.findElement(By.linkText("A/B Testing"));
        abcTest.click();
        driver.navigate().back();

        WebElement removeElem = driver.findElement(By.linkText("Add/Remove Elements"));
        removeElem.click();

        driver.findElement(By.linkText("Home")).click();

        driver.findElement(By.linkText("Redirect Link")).click();

        driver.close();
        // click on first link  "A/B Testing"
        // navigate back to home page
        // click on second link
        // click on "Home" link to go back to home
        // click on "Redirect Link"





    }
}
