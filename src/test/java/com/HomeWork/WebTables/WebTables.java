package com.HomeWork.WebTables;

import com.HomeWork.test_Util.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WebTables extends TestBase {

    @Test
    public void testWebTable(){
        driver.get("http://practice.cybertekschool.com/tables");

        //locate specific sell in table directly
        WebElement cell42 = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[4]/td[2]"));
        System.out.println(cell42.getText());

        //locate name in cell
        WebElement cellTim = driver.findElement(By.xpath("//table[@id='table1']//td[text()='Tim']"));
        System.out.println("cellTim.getText() = " + cellTim.getText());

        //locate all cell
        List<WebElement>allrows = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr[4]/td"));
        for (WebElement element : allrows) {
            System.out.println("element.getText() = " + element.getText());
        }


    }
}
