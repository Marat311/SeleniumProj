package com.cybertek.tests.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElemensByClassName {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/");

        //identify this elemet using it's classattribute

        WebElement elm1 = driver.findElement(By.className("h1y"));
        System.out.println("elm1.getText() = " + elm1.getText());

        //identify first li element with name list-group-item
        WebElement elmLi = driver.findElement(By.className("list-group-item"));
        System.out.println("elmLi.getText() = " + elmLi.getText());

        //identify list of li elements with name list-group-item
        List<WebElement>allLiTagElements = driver.findElements(By.className("list-group-item"));
        System.out.println("allLiTagElements.size() = " + allLiTagElements.size());

        //iterate over all the elements and get the text

        for (WebElement element : allLiTagElements) {
            System.out.println("element.getText() = " + element.getText());
        }


        driver.quit();
    }
}
