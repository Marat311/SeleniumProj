package com.HomeWork.JavaExecuter;

import com.HomeWork.test_Util.TestBase;
import com.cybertek.utility.BrowserUtil;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.Set;

public class JavaScriptExecutor extends TestBase {

    @Test
    public void testScroll(){
        driver.get("http://practice.cybertekschool.com/infinite_scroll");
        //get JavaScript executor from driver variable
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        BrowserUtil.waitFor(1);
        jse.executeScript("window.scrollBy(0,10000)");
        BrowserUtil.waitFor(2);

        for (int i = 0; i<10; i++){
            jse.executeScript("window.scrollBy(0,10000)");
            BrowserUtil.waitFor(1);
        }



    }


    @Test
    public void test_ScrollElement_the_view(){

        driver.get("http://practice.cybertekschool.com/large");
        //get JavaScript executor from driver variable

        WebElement schoolLink = driver.findElement(By.linkText("Cybertek School"));
        WebElement home = driver.findElement(By.linkText("Home"));


        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView(true)", schoolLink);
        BrowserUtil.waitFor(2);
        jse.executeScript("arguments[0].scrollIntoView(true)", home);
        BrowserUtil.waitFor(2);


    }


    @Test
    public void test_OpenNewTab_withURL(){
        driver.get("http://practice.cybertekschool.com");
        BrowserUtil.waitFor(1);
        //get JavaScriptExecutor reference
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.open('http://google.com', '_blank')");
        BrowserUtil.waitFor(2);
        jse.executeScript("window.open('http://cybertekschool.com', '_blank')");
        BrowserUtil.waitFor(2);
        jse.executeScript("window.open('http://yahoo.com', '_blank')");

        //get all windows handles and print it out
        //switch to each window and print the title
        Set <String> allWindows = driver.getWindowHandles();
        System.out.println("allWindows = " + allWindows);
        for (String window : allWindows) {

            BrowserUtil.waitFor(2);
            driver.switchTo().window(window);
            System.out.println("driver.getTitle() = " + driver.getTitle());
        }



    }

}
