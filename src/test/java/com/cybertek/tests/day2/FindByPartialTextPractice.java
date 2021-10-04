package com.cybertek.tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindByPartialTextPractice {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/");

        //identify the link with text "Disappearing Elements
        //using partial link text then get the full txt out using new method getText
        WebElement myLink = driver.findElement(By.partialLinkText("Disappearing"));

        String fullinkText = myLink.getText();
        System.out.println("fullinkText = " + fullinkText);

        //what if I just provide partial link as letter A
        WebElement aLink = driver.findElement(By.partialLinkText("A"));
        System.out.println("aLink.getText() = " + aLink.getText());

        driver.quit();

    }
}
