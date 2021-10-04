package com.cybertek.tests.day01_Navigation_lcator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByLinkText {

    public static void main(String[] args) throws InterruptedException{
// set up chrome driver , open chrome
        WebDriverManager.chromedriver().setup();
        // navigate to https://google.com
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");
        // try to identify search box using both name and id
        WebElement line = driver.findElement(By.linkText("Gmail"));
        // submit the search by clicking on the search button
        line.click();
        // navigate back to google home page
        driver.navigate().back();
        // wait few second

         // click on about link


        Thread.sleep(2000);
// close the browser
        driver.close();




    }
}
