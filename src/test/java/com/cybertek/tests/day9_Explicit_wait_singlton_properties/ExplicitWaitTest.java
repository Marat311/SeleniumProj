package com.cybertek.tests.day9_Explicit_wait_singlton_properties;

import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitTest extends TestBase {

    @Test
    public void testWaitForTitle(){

        driver.get("http://practice.cybertekschool.com/dynamic_loading");
        //2. Click on Example 7
        driver.findElement(By.partialLinkText("Example 7")).click();
        // THe title will show loading .. until certain time
        //we want to wait until the title value bavome "Dynamic Title"
        WebDriverWait wait = new WebDriverWait(driver, 6);
        wait.until(ExpectedConditions.titleIs("Dynamic title"));
        System.out.println("END");

    }
}
