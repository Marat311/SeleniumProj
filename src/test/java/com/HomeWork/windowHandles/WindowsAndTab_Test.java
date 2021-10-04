package com.HomeWork.windowHandles;

import com.cybertek.utility.BrowserUtil;
import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Set;

public class WindowsAndTab_Test extends TestBase {


    @Test
    public void testWindows(){

        driver.get("http://practice.cybertekschool.com/windows");

        String currentHandle = driver.getWindowHandle();
        System.out.println("currentHandle = " + currentHandle);


        Set<String> list = driver.getWindowHandles();
        System.out.println("list = " + list);

        WebElement clickElm = driver.findElement(By.linkText("Click Here"));
        clickElm.click();

        System.out.println("driver.getWindowHandle() = " + driver.getWindowHandle());

        System.out.println("driver.getWindowHandles() = " + driver.getWindowHandles());
        list = driver.getWindowHandles();

        for (String each : list) {
            System.out.println("each = " + each);
            BrowserUtil.waitFor(2);
            driver.switchTo().window(each);
            System.out.println("driver.getTitle() = " + driver.getTitle());

        }

        BrowserUtil.waitFor(2);

    }


}
