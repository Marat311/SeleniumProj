package com.cybertek.tests.day10;

import com.cybertek.utility.BrowserUtil;
import com.cybertek.utility.TestBase;
import com.cybertek.utility.WebOrderUtility1;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.cybertek.utility.WebOrderUtility1.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

// This is new Test class we are using for day 10
public class WebOrderPracticeTest extends TestBase {

    @Test
    public void testDriverPractice(){

        WebOrderUtility1.openWebOrderApp();
        // assert the page title "WebOrder Login" to ensure you are at the login page
//        Driver.getDriver().getTitle() same as below in test class
        //    driver.getTitle()
        assertEquals("Web Orders Login" ,  driver.getTitle() ) ;

        //WebOrderUtil.login();
        login("Tester","test");



        BrowserUtil.waitFor(3);
    }

    @Test
    public void testInvalidCredentials(){

        openWebOrderApp();

        login("abc","efg");

        // locate the error message element
        // with text "Invalid Login or Password."  id ctl00_MainContent_status
        //span[@id='ctl00_MainContent_status']
        //span[. ='Invalid Login or Password.']
//        WebElement errorMsgElm = driver.findElement(By.xpath("//span[. ='blablanvalid Login or Password.']"));
//        assertTrue( errorMsgElm.isDisplayed()  );
//        WebDriverWait wait = new WebDriverWait(Driver.getDriver() ,2  ) ;
//        // check of visibility of the errorMsgElm in 2 seconds
//        try {
//            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[. ='blablanvalid Login or Password.']")));
//        }catch(TimeoutException e){
//            //System.out.println("The error message is = " + e.getMessage()  );
//            System.out.println("WE DID NOT SEE THE ERROR MESSAGE ELEMENT ");
//        }

        // check for element exists using the browser util we just created
     //   boolean elementFound =
       //         BrowserUtil.checkVisibilityOfElement(By.xpath("//span[. ='blablanvalid Login or Password.']"),2);
      //  assertTrue( elementFound );
assertTrue(loginErrorMsgVisible());
    }

    @Test
    public void clearInputBox(){
        openWebOrderApp();
        WebElement usernameField = driver.findElement(By.id("ctl00_MainContent_username")) ;
        usernameField.sendKeys("ASKJDHASKJDHASKJDHAKJSHDAKSJHD");
        BrowserUtil.waitFor(1);
       usernameField.clear(); // remove anything inside input element

    }

}