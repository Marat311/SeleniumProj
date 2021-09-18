package com.HomeWork.frames;

import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class test_Frame extends TestBase {

    @Test
    public void testFrame(){
        driver.get("http://practice.cybertekschool.com/iframe");
        //switch iframe using index
       // driver.switchTo().frame(0);

        //switch the iframe using id or name
    //    driver.switchTo().frame("mce_0_ifr");

        //switch to the iframe using WebElement
        WebElement iFrameElm = driver.findElement(By.cssSelector("iframe[title^='Rich Text Area']"));
        driver.switchTo().frame(iFrameElm);


        //identify the <p>
        WebElement pTagElement = driver.findElement(By.tagName("p"));
        System.out.println("pTagElement.getText() = " + pTagElement.getText());

        //switch out of the frame
      //  driver.switchTo().defaultContent(); //this will switch to top level html
        driver.switchTo().parentFrame(); //this is switch back upone level inside nested html document

        //click home btn to go back to main
        driver.findElement(By.linkText("Home")).click();

    }

    @Test
    public void test_Nested_iFrame(){

        driver.get("http://practice.cybertekschool.com/nested_frames");

        //main content --> top , bottom frame
        //top --> left, middle, right frame

        //get the text out bottom frame
        driver.switchTo().frame("frame-bottom");
        WebElement bottomFrameBodyElm = driver.findElement(By.tagName("body"));
        System.out.println("bottomFrameBodyElm.getText() = " + bottomFrameBodyElm.getText());

        //switch out to the parent frame
       // driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();

        //go to the middle frame and get the text
        //first go to top frame then go to middle
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-middle");
        WebElement middleFrameElm = driver.findElement(By.id("content"));
        System.out.println("middleFrameElm.getText() = " + middleFrameElm.getText());

        //go to the right frame and get text
        driver.switchTo().parentFrame(); //now we are at top frame
        driver.switchTo().frame("frame-right");
        WebElement rightFrameelm = driver.findElement(By.tagName("body"));
        System.out.println("rightFrameelm.getText() = " + rightFrameelm.getText());

        //go back to the default content
        driver.switchTo().defaultContent();


    }
}
