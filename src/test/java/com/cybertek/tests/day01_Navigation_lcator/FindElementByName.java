package com.cybertek.tests.day01_Navigation_lcator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByName {

    public static void main(String[] args)throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://yahoo.com");

        //identify yahoo by it's name attribute
        //if ther locator is wrong, it will throw NoSuchElementEception
        WebElement searchLine = driver.findElement(By.name("p"));
        //locate and click on the button
        searchLine.sendKeys("apple");
        //locate and click on the search button (it does not have name attribute)
        WebElement searchBtn = driver.findElement(By.id("ybar-search"));
        //the buttons to submit the form can use submit method
        searchBtn.submit();

        Thread.sleep(2000);
        //close browser
        driver.quit();

    }
}
