package com.cybertek.tests.day01_Navigation_lcator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicNavigation_FireFox {

    public static void main(String[] args) {

        //1. setup Firefox browser
        WebDriverManager.firefoxdriver().setup();
        //2. Create Webdriver instance using FireFox object
        WebDriver driver = new FirefoxDriver();
        //3. Navigate to "https://cybertekcshool.com"
        driver.get("https://cybertekschool.com");

        System.out.println("About to quit");

        driver.quit();

        WebDriverManager.edgedriver().setup();
        WebDriver driver1 = new EdgeDriver();
        driver1.navigate().to("https://apple.com");
        System.out.println("Apple tab open");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver1.quit();
    }
}
