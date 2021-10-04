package com.cybertek.tests.day01_Navigation_lcator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation_LocalHTML_File {

    public static void main(String[] args) {
        //setUp chrome driver, open chrome browser
        WebDriverManager.chromedriver().setup();
        //navigate to the html
        WebDriver driver = new ChromeDriver();
        driver.get("C:\\Users\\Marina\\Desktop\\puna-flamingo-58a6cb7d5f9b58a3c9fc5fc8.jpg");

       // driver.quit();


    }
}
