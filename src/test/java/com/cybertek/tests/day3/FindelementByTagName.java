package com.cybertek.tests.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindelementByTagName {

    public static void main(String[] args) {


        /*
        Purple - tag name
        Orange - attribute name
        Blue - attribute value
        Black - text
         */

        //open the navigate to practic site
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/");

        WebElement firstLink = driver.findElement(By.tagName("a"));
        //lets get the text to findout
        System.out.println(firstLink.getText()); // Home
        System.out.println("firstLink.getTagName() = " + firstLink.getTagName()); //a

        //what if I want to find and store all elements with <a> tag --> findelements
        List<WebElement> list = driver.findElements(By.tagName("a"));
        System.out.println(list.size());

        //iterate over this list, get the text og the link and get attribute and print them out

        for (WebElement webElement : list) {
            System.out.println(webElement.getText());
            System.out.println("webElement.getAttribute(\"href\") = " + webElement.getAttribute("href"));
        }

        //get first element with <h1> tag and get the text out of it
        WebElement firstH1TagElem = driver.findElement(By.tagName("h1"));
        System.out.println("firstH1TagElem.getText(h1) = " + firstH1TagElem.getText());

        driver.quit();


    }
}
