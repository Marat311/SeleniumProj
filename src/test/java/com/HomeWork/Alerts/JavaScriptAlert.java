package com.HomeWork.Alerts;

import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptAlert extends TestBase {

    @Test
    public void testAlert(){
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
        driver.findElement(By.xpath("//button[.= 'Click for JS Alert'] ")).click();
        driver.switchTo().alert().accept(); //click ok button
        //Alert alertObj = driver.switchTo().alert(); //2-nd way
        //alertObj.accept();

        //confirm button ok
        WebElement confirmBtn = driver.findElement(By.xpath("//button[.= 'Click for JS Confirm'] "));
        confirmBtn.click();
        driver.switchTo().alert().accept(); //click to button
        confirmBtn.click();
        driver.switchTo().alert().dismiss(); //click cancel button

        WebElement promtBtn = driver.findElement(By.xpath("//button[.= 'Click for JS Prompt'] "));
        promtBtn.click();

        Alert alertObj = driver.switchTo().alert();
        System.out.println("pop-up text is "+alertObj.getText());
        alertObj.sendKeys("Hello World");
        alertObj.accept();

        System.out.println("The end");
    }


}
