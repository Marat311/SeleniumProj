package com.cybertek.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtil {

    /**
     * A method to pause the thread certain seconds
     * @param seconds
     */
    public static void waitFor(int seconds){

        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static boolean checkVisibilityOfElement(By locator, int timeToWait){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 2);
        boolean result = false;
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            //if above line does not throw exception we will come to this line and below
            result=true;
        }catch (TimeoutException e){
            System.out.println("WE DID NOT SEE THE ERROR MESSAGE ELEMENT");
        }

        return result;
    }

}