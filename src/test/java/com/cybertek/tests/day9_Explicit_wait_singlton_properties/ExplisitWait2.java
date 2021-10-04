package com.cybertek.tests.day9_Explicit_wait_singlton_properties;

import com.cybertek.utility.BrowserUtil;
import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;
public class ExplisitWait2 extends TestBase {

    @Test
    public void testWaitEnableOrDisable(){

        driver.get("http://practice.cybertekschool.com/dynamic_controls");

        //element to be clickable (by locator)
        //element to be clickable (Web Element)
        //An excpectation for checking an element is visible and enabled such that you cliak it

        //click on enable button and wait until the input=Box is enabled clickable
        WebElement inputField = driver.findElement(By.cssSelector("form#input-example>input"));
        System.out.println("inputField.isEnabled() = " + inputField.isEnabled());

        driver.findElement(By.xpath("//button[.='Enable']")).click();
        WebDriverWait wait = new WebDriverWait(driver, 7);
        //this will wait for 7 sec max for input element located by css selector
        //enabled, interactive, visible
        //wait.until(elementToBeClickable(By.cssSelector("form#input-example>input")));
        wait.until(elementToBeClickable(inputField));

        inputField.sendKeys("Hello world");

        BrowserUtil.waitFor(3);
    }
}
