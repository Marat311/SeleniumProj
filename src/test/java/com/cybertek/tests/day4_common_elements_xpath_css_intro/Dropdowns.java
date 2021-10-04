package com.cybertek.tests.day4_common_elements_xpath_css_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/dropdown");

        WebElement yearDropdownEl = driver.findElement(By.id("year"));
        Select yearSelectObj = new Select(yearDropdownEl);
        yearSelectObj.selectByIndex(2);
        yearSelectObj.selectByValue("2021");
        yearSelectObj.selectByVisibleText("1990");
       // yearSelectObj.selectByVisibleText("BLA BLA");

        // TODO: identify the month dropdown
        WebElement monthDropdownElm = driver.findElement(By.id("month")) ;
        // TODO: Wrap it up using Select class so we can use easy methods
        Select monthSelectObj = new Select(monthDropdownElm) ;
        // TODO: select items in 3 different ways

        monthSelectObj.selectByIndex(4);
        monthSelectObj.selectByValue("7");
        monthSelectObj.selectByVisibleText("December");

        driver.quit();

    }
}
