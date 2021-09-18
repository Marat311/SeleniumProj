package com.HomeWork;

import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Synchronization_ImplisitWait  extends TestBase{

    @Test
    public void testSlowerElement() {


        driver.get("http://practice.cybertekschool.com/dynamic_controls");

        //click on remove button //button[text()='Remove']
        driver.findElement(By.xpath("//button[text()='Remove']")).click();

        //identify the it's gone element
        WebElement itsGoneElm = driver.findElement(By.id("message"));
        System.out.println("itsGoneElm.getText() = " + itsGoneElm.getText());
        //assert the text is it's gone!

        assertEquals("It's gone!", itsGoneElm.getText());

    }
}
