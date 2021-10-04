package com.cybertek.tests.day4_common_elements_xpath_css_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Intro {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http:/practice.cybertekschool.com/");

        //html/body/div/div[2]/
        //Xpath can be used to navigate through elemnts and attriutes in html documents

        //using above full xpath to identify the element and get the text
        WebElement headerSpan = driver.findElement(By.xpath("html/body/div/div[2]/div/div/div/h1/span"));
        System.out.println("headerSpan.getText() = " + headerSpan.getText());

        //using relative xpath
        //h1 /span : start looking for the element with h1 whoever parents or grandparents are
        //find the direct child  with span tag
        WebElement headerSpan2 = driver.findElement(By.xpath("//h1 /span"));
        System.out.println("headerSpan2.getText() = " + headerSpan2.getText());

        // providing attributes in xpath
        //  elementTag[@attributeName='attribute value']
        // if you have more than one
        //  elementTag[@attributeName='attribute value' and @attribute2Name ='attribute2 value' ]
        // you have option to provide index
        //   //someElement[indexGoesHere]
        // you can also provide use text() xpath function
        //  //elementTag[text()='some text value goes here']
        //input[@id='box1']
        //input[@name='checkbox1']
        //input[@name='checkbox1'  and @type='checkbox']
        //h3[ text() = 'Checkboxes' ]

        //click on checkboes link to go to checkbox page using xpath
        driver.findElement(By.xpath("//a[text()='Checkboxes']")).click();

        //identify header 1st checkbox
        WebElement header = driver.findElement(By.xpath(" //h3[ text() = 'Checkboxes' ]"));
        System.out.println("header.getText() = " + header.getText());

        WebElement firstCheckbox = driver.findElement(By.xpath("//input[@id='box1']"));
        System.out.println("firstCheckbox.isSelected() = " + firstCheckbox.isSelected());

driver.quit();
    }
}
