package com.cybertek.tests.day01_Navigation_lcator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManagingBrowserWindow {

    public static void main(String[] args) {

        //1.setup Chrome driver
        WebDriverManager.chromedriver().setup();
        //create chromedriver object
        WebDriver driver = new ChromeDriver();
        //maximize the browser window
        driver.manage().window().maximize();
        //make the browser window full screen
        driver.manage().window().fullscreen();
        //quite the browser




    }
}
