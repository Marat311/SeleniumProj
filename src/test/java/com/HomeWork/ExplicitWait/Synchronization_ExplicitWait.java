package com.HomeWork.ExplicitWait;

import com.HomeWork.test_Util.TestBase;
import com.cybertek.utility.BrowserUtil;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class Synchronization_ExplicitWait extends TestBase {

    @Test
    public void test_WaitForExpectedTitle(){

        driver.get("http://practice.cybertekschool.com/dynamic_loading");
        driver.findElement(By.partialLinkText("Example 7")).click();

        WebDriverWait wait = new WebDriverWait(driver, 6);
        wait.until(titleIs("Dynamic title"));

        WebElement succesElm = driver.findElement(By.id("alert"));
        assertTrue(succesElm.isDisplayed());



    }


    @Test
    public void test_WaitForElementClickable(){

        driver.get("http://practice.cybertekschool.com/dynamic_controls");

        WebElement inputBox = driver.findElement(By.xpath("//input[@type='text']"));

        driver.findElement(By.xpath("//button[.='Enable']")).click();

        WebDriverWait wait = new WebDriverWait(driver, 5);
       //1-st way wait.until(elementToBeClickable(inputBox));
      //2-nd way  wait.until(presenceOfElementLocated(By.id("message")));
        wait.until(textToBe(By.id("message"), "It's enabled!"));  //3-rd way


        inputBox.sendKeys("hello world");
        BrowserUtil.waitFor(2);




    }


}
