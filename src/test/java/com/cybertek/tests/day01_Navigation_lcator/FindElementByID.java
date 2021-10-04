package com.cybertek.tests.day01_Navigation_lcator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByID {
    public static void main(String[] args)throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://yahoo.com");

        //locate search box and enter selenium
        WebElement searchBox = driver.findElement(By.id("ybar-sbq"));
        //enter text inside inputBox using sendKey("text)
        searchBox.sendKeys("Selenium");
        //locate the search button and click (or submit)


        WebElement searchBtn =driver.findElement(By.id("ybar-search"));
        //searchBtn.click();
        searchBtn.submit(); //only work with button in the form

        Thread.sleep(5000);
        driver.quit();





    }
}
