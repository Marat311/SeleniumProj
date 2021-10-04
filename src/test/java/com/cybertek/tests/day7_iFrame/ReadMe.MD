Day 7
Recap on Day 6:
Using test Lifecycle annotations to simplify test class
Setting up TestBase
Setting up WebDriverFactory utility class
isDisplayed() method to check located element displayed on screen
Setting up ImplicitWait for maximum wait time before throwing Exception
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
Practicing XPath with index
iFrame
It's like having a picture inside another picture.

Frame

An iframe is used to embed another document within the current HTML document. IFrameHTML

The <iframe> tag specifies an inline frame.

<iframe src="https://www.selenium.dev/" height="500" width="100%"></iframe>
Here is the sample html we created for iframe.

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>iFrame DEMO</title>
</head>
<body>

<h1>THIS IS SIMPLE IFRAME DEMO</h1>
<iframe src="https://www.selenium.dev/" height="400" width="100%"></iframe>

</body>
</html>
HTML frames allow developers to present documents in multiple views, which may be in a separate child window or sub-window.

Finding Elements within the iFrame
Selenium can not directly interact with the elements within the frame.

First need to switch to the frame
so it can start searching within than frame using 3 different way as below.

Switch to the frame by passing index
driver.switchTo().frame(frameIndexNumber);
Switch to the frame by passing iframe WebElement
driver.switchTo().frame(iframeWebElement);
Switch to the frame by passing iframe name or id
driver.switchTo().frame(frameIdOrName);
Then we can just use regular locating technic we have been using to locate the elements.

Switching out of the iFrame
Once you are done with the elements inside frame
You need to switch out of the iframe to main content to continue to work with elements in regular part of the page.

go back to top level html document
driver.switchTo().defaultContent();
go back up one level from iframe
driver.switchTo().parentFrame();
Code Demo
Here is the full example we did on practice site

package com.cybertek.tests.day07_iframe;

import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class iFrameTest extends TestBase {

    @Test
    public void testSimpleIFrame(){

        driver.get("http://practice.cybertekschool.com/iframe");

        // locate the <p> element inside iframe
        /**
          first we need to switch to the iFrame
          -- by index (index in java starts with 0, we are calling java method here)
            driver.switchTo().frame(0);
          -- by name or id
            driver.switchTo().frame("mce_0_ifr");
          -- by passing iframe WebElement object
             locate the iframe element by it's title  "Rich Text Area. Press ALT-0 for help."
            css selector locator :
              iframe[title='Rich Text Area. Press ALT-0 for help.']
              iframe[title^='Rich Text Area']
           */
        WebElement iframeElm = driver.findElement(By.cssSelector("iframe[title^='Rich Text Area']"));
        driver.switchTo().frame(iframeElm);

        WebElement pTagInsideFrame = driver.findElement(By.tagName("p"));

        System.out.println("pTagInsideFrame.getText() = " + pTagInsideFrame.getText());

        // 2 ways to get out of the frame
        // jump one level out of the frame
//        driver.switchTo().parentFrame();
// jump all the way to the main content , this will get you out of any level deep inside the frame
driver.switchTo().defaultContent();
// click on the Home link on top left corner
driver.findElement(By.linkText("Home")).click();

        System.out.println("THE END");
    }

}
Optionally : Working with nested frame
A nested iframe is an iframe inside another iframe.

This is the practice page on nested iframe.

Top frame
contains 3 more frame inside
left frame
middle frame
right frame
Bottom frame
This video on canvas has showed that how you can simply work with nested frame by switchingTo and switching out of the frame to locate elements inside certain iframe.

Homework TestCase
Navigate to https://www.w3schools.com/html/tryit.asp?filename=tryhtml_default_default
Verify Header on the right with Text This is a Heading is Displayed
Verify paragraph right under above element with Text This is a paragraph is Displayed
Click on Run Button on menu bar
If you want to go for more, all try out page in this website are created with iframe.

so you can try to locate element under the frame by switching to it.