package com.cybertek.tests.day01_Navigation_lcator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args) {

        //setup Chrome driver
        WebDriverManager.chromedriver().setup();
        //create ChromeDriver Object
        WebDriver driver = new ChromeDriver();

        //navigate to https://yahoo.com
        driver.get("https://www.apple.com");
        /*
        navigate using:
         - get(url)
         - navigate().to(url)
         - navigate().back()
         - navigate().forward()
         - navigate().refresh()
         */
        //navigate().to(url)
        driver.navigate().to("https://google.com");
        //navigate().back()
        driver.navigate().back();

        //navigate().forward()
        driver.navigate().forward();

        //refreshing the page
        driver.navigate().refresh();

        //closing browser
        //close() -> close current tab
        //quite(0 -> close all tabs if there is more than one
       // driver.close();
        driver.quit();

    }
}
