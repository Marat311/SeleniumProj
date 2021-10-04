package com.HomeWork;

import com.cybertek.utility.BrowserUtil;
import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class practice1 extends TestBase {

    @Test
    public void test() {
        //1. navigate to http://practice.cybertekschool.com/dropdown and save current window handle into a variable.
        driver.get("http://practice.cybertekschool.com/dropdown");

//2. Click on last "dropdown" to show all "options" (not a select dropdown keep in mind)
        WebElement lastDropdown =  driver.findElement(By.id("dropdownMenuLink"));
        Actions actions = new Actions(driver);
        BrowserUtil.waitFor(1);

        //3. Hold down to (COMMAND on mac CONTROL on windows) and Click on Facebook Link then release it.
        //4. It will open the link in new tab
        //5. Click on the Dropdown Link again to open it.
        actions.moveToElement(lastDropdown).click().perform();
        WebElement facebook = driver.findElement(By.linkText("Facebook"));
        actions.keyDown(Keys.LEFT_CONTROL).pause(1000).click(facebook)
                .keyUp(Keys.LEFT_CONTROL).pause(1000).perform();
        BrowserUtil.waitFor(1);
        //6. Now Hold down to (COMMAND on mac CONTROL on windows) and Click on Amazon Link then release it.
        actions.moveToElement(lastDropdown).click().perform();
        WebElement amazon = driver.findElement(By.linkText("Amazon"));
        actions.keyDown(Keys.LEFT_CONTROL).pause(1000).click(amazon)
                .keyUp(Keys.LEFT_CONTROL).pause(1000).perform();
        BrowserUtil.waitFor(1);

        //7. It will open the link in another windows.
        actions.moveToElement(lastDropdown).click().perform();
        //8. Repeat the same process for Google
        WebElement google = driver.findElement(By.partialLinkText("Google"));
        actions.keyDown(Keys.LEFT_CONTROL).pause(1000).click(google)
                .keyUp(Keys.LEFT_CONTROL).pause(1000).perform();

        //8. Repeat the same process for Etsy
        actions.moveToElement(lastDropdown).click().perform();
        WebElement etsy = driver.findElement(By.linkText("Etsy"));
        actions.keyDown(Keys.LEFT_CONTROL).pause(1000).click(etsy)
                .keyUp(Keys.LEFT_CONTROL).pause(1000).perform();
        BrowserUtil.waitFor(1);

        //9. Now you have 4 "window"s , Loop through them using their handle, and print out the title.
        Set<String>allTabs = driver.getWindowHandles();

        for (String tab : allTabs) {
            System.out.println("tab = " + tab);
            driver.switchTo().window(tab);
            System.out.println("driver.getTitle() = " + driver.getTitle());


            if(driver.getTitle().contains("Amazon")){
                WebElement prime  = driver.findElement(By.id("nav-link-prime"));
                System.out.println("prime.getText() = " + prime.getText());
                actions.moveToElement(prime).perform();
                assertTrue(prime.isDisplayed());
                BrowserUtil.waitFor(1);
            }
            if(driver.getTitle().contains("Etsy")){
                WebElement email = driver.findElement(By.xpath("//input[@name='email_address']"));
                BrowserUtil.waitFor(2);
                JavascriptExecutor jse = (JavascriptExecutor) driver;
                jse.executeScript("arguments[0].scrollIntoView(true)" ,  email  );
                BrowserUtil.waitFor(1);
            }

            if(driver.getTitle().contains("Facebook")){
                driver.close();
                driver.switchTo().window("google");
                BrowserUtil.waitFor(1);
            }
        }
    }





    //9. Now you have 4 "window"s , Loop through them using their handle, and print out the title.
    //10. Optionally , if the title contains Facebook, Close the window|tab.
    //11. Optionally, if the title contains Amazon , Hover over to Prime from menu option (in between Best Sellers and Customer Service), it will show
    //"Try Prime" link , Verify it isDisplayed.
    //12. Optionally, if the title contains Etsy , Scroll until the Enter Your Email input box is in the view.
    //13. These exersize can be done separately instead of switching to the window, do your best judgement to do them together or separately.
}
