package com.cybertek.utility;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * This class is meant to be super class
 * to provide driver set up and closing browser
 * for it's subclasses
 */
public abstract class TestBase {
    // we want only subclasses of TestBase have access to this.
    protected static WebDriver driver ;
    protected static WebDriverWait wait;
    // setting up all driver stuff here directly in @BeforeEach method
    @BeforeAll
    public static void setupWebDriver(){
        driver=Driver.getDriver();
        wait= new WebDriverWait(driver, 10);
    }


    @AfterAll
    public  static void closeBrowser(){
        driver.quit();
    }

    /**
     * Quitting the browser and setting the value of
     * WebDriver instance to null because you can re-use already quitted driver
     */


}

//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
// driver = WebDriverFactory.getDriver("chrome");

// This is how we can set maximum timeout for finding element
// in this example it will wait for 10 seconds
// if element is found in 1 second ,it will just move on without finishing 10 seconds
// Thread.sleep(100000) will always wait for 10 seconds no matter what.
//  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;