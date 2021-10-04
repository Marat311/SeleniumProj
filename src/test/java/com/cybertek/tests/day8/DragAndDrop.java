package com.cybertek.tests.day8;

import com.cybertek.utility.BrowserUtil;
import com.cybertek.utility.TestBase;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DragAndDrop extends TestBase {

    @Test
    
    public void testDragAndDrop(){

        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        BrowserUtil.waitFor(2);

        Actions actions = new Actions(driver);
        WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement drop = drag.findElement(By.xpath("//div[@id='droptarget']"));
        BrowserUtil.waitFor(2);

        //dra and drop method of Actions class, accept 2 elements, first drop to second
        actions.dragAndDrop(drag, drop).perform();

        //verify the big circle text has changed to your did great!
        assertEquals("You did great!", drop.getText());


    }


    @Test
    public void testKeyboardAction(){

        // navigate to https://www.google.com
        // hold down to shift enter text "i love selenium" YOU SHOULD SEE UPPERCASE
        // release the shift
        // enter text "i love selenium"
        // hold down to command on mac control on windows and enter "A"
        // release the command or control key
        // then hit backspace to delete
        driver.get(" https://www.google.com");
        // locate searchBox using name value q
        WebElement searchBox = driver.findElement(By.name("q"));
        // create Actions class instance
        Actions actions = new Actions(driver);
        // keyDown method for holding down to certain modifier key like Control , SHIFT and so on
        // keyUp method for releasing what you are holding down to
        // sendKeys method of Actions class is for pressing key that provided
        // pause method of Actions class is for pausing in between actions in milliseconds

        // this is way more than enough
//            actions.keyDown(Keys.SHIFT).sendKeys("i love selenium")
//                    .pause(2000).keyUp(Keys.SHIFT)
//                    .sendKeys("i love selenium").pause(2000)
//                    .keyDown(Keys.COMMAND).sendKeys("A") // command+a on mac will select all text
//                    .perform();



        // this is way way way way way more than enough to demonstrate you can take any keyboard action
        actions.keyDown(Keys.SHIFT).sendKeys("i love selenium")
                .pause(2000).keyUp(Keys.SHIFT)
                .sendKeys("i love selenium").pause(2000)
                .keyDown(Keys.COMMAND).sendKeys("A") // command+a on mac will select all text
                // .keyDown(Keys.CONTROL).sendKeys("A") // control+a on windows will select all text
                .keyUp(Keys.COMMAND).pause(2000)
                .sendKeys(Keys.BACK_SPACE)
                .perform();




    }
@Ignore
    @Test
    public void testDoubleClick(){
        // navigate here
        //https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_ondblclick
        // double-click on paragraph with text "Double-click this paragraph to trigger a function.
        // then assert the new paragraph with text "Hello world" displayed right under
        // both of the elements are under iframe with id iframeResult
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_ondblclick");
        BrowserUtil.waitFor(2);
        // both elements are under the frame , so switch into it first
        driver.switchTo().frame("iframeResult");
        WebElement pElm1 =
                driver.findElement(By.xpath("//p[.='Double-click this paragraph to trigger a function.']"));
        // in order to double-click we will use actions class
        Actions actions = new Actions(driver) ;
        actions.doubleClick(pElm1).perform(); // this is how we double click

        BrowserUtil.waitFor(2);
        // TODO : go ahead and assert the Hello world showed up

    }

    @Test   // right click is called context click
    public void testRightClick(){
        // navigate to below url
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_oncontextmenu");
        // locate the yellow area : css selector div[contextmenu='mymenu']
        // first switch to the iframe
        driver.switchTo().frame("iframeResult");
        WebElement yellowArea = driver.findElement(By.cssSelector("div[contextmenu='mymenu']"));

        // right-click on that area using Actions class method contextClick( pass the element here)
        Actions actions = new Actions(driver);
        actions.contextClick(yellowArea).perform();

        BrowserUtil.waitFor(1);
        // close the alert that showed up after




    }
}