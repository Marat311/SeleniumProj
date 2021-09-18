package com.HomeWork;

import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class fileUpload extends TestBase {

    @Test
    public void testFileUpload(){

        driver.get("http://practice.cybertekschool.com/upload");

        String filePath = "C:\\Users\\Marina\\Desktop\\puna-flamingo-58a6cb7d5f9b58a3c9fc5fc8.jpg";

        driver.findElement(By.id("file-upload")).sendKeys(filePath);
        driver.findElement(By.id("file-submit")).click();
        System.out.println("end");

    }
}
