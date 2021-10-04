package com.cybertek.tests.day4_common_elements_xpath_css_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://search.yahoo.com/");

        //try different way by ID
      //  WebElement searchBtn = driver.findElement(By.cssSelector("#yschsp"));

        //try different way by name
     //   WebElement searchBtn1 = driver.findElement(By.cssSelector("input[name='p']"));

        //try different way by ID
     //   WebElement searchBtn2 = driver.findElement(By.cssSelector("input[id='yschsp']"));

        //add 2 locators to find scc
        WebElement searchBtn = driver.findElement(By.cssSelector("input[name='p'][type='text']"));
        searchBtn.sendKeys("CSS SELECTOR");
         //Go parent  to Child we use ">" sign
      //     WebElement clearIcon1 = driver.findElement(By.cssSelector("button[type = 'button']>span"));
      //   clearIcon1.click();

         WebElement clearIcon = driver.findElement(By.cssSelector("button#sbq-clear>span"));
         clearIcon.click();

         //identify the search icon using css selector : span[title='Search']
        WebElement searchIcon = driver.findElement(By.cssSelector("span[title='Search']."));

driver.quit();

    }
}
