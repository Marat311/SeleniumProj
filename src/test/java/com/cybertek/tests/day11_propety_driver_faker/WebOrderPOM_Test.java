package com.cybertek.tests.day11_propety_driver_faker;

import com.cybertek.pages.WAllOrderPage;
import com.cybertek.pages.WCommonArea;
import com.cybertek.pages.WLoginPage;

import com.cybertek.utility.BrowserUtil;
import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WebOrderPOM_Test extends TestBase {


    @Test
    public void testWithPOM_for_login(){


        WLoginPage loginPage = new WLoginPage();

        loginPage.goTo();

//        loginPage.userNameField.sendKeys("Tester");
//        loginPage.passwordField.sendKeys("test");
//        loginPage.loginButton.click();
        loginPage.login("BLA" ,"test");

        assertTrue ( loginPage.loginErrorMsgPresent()  );


        BrowserUtil.waitFor(4);

    }

    @Test
    public void testAllOrderPage(){

        WLoginPage loginPage = new WLoginPage();
        loginPage.goTo();
        loginPage.login("Tester","test");
        // --- here we logged in

        // now we are at all order page
        WAllOrderPage allOrderPage = new WAllOrderPage();
        // assert the header element is displayed
        assertTrue( allOrderPage.header.isDisplayed()  );

        allOrderPage.checkAllButton.click();
        BrowserUtil.waitFor(2);

        allOrderPage.unCheckAllButton.click();
        BrowserUtil.waitFor(2);

        // print out the size of headerCells
        System.out.println("allOrderPage.headerCells.size() = "
                + allOrderPage.headerCells.size());
        assertEquals(13, allOrderPage.headerCells.size() );

    }


    @Test
    public void testCommonArea(){
       WLoginPage loginPage = new WLoginPage();
       loginPage.goTo();
       loginPage.login("Tester", "test");

        WCommonArea area = new WCommonArea();

        area.orderTab.click();
        BrowserUtil.waitFor(1);

        area.viewAllOrderTab.click();
        BrowserUtil.waitFor(1);

        area.viewAllProductTab.click();
        BrowserUtil.waitFor(1);

        area.logoutLink.click();
        BrowserUtil.waitFor(1);
    }

    @Test
    public void checkAllHeaders(){
        WLoginPage loginPage = new WLoginPage();
        loginPage.goTo();
        loginPage.login("Tester", "test");

        WAllOrderPage allOrderPage = new WAllOrderPage();

        System.out.println("allOrderPage.header.getText() = " + allOrderPage.header.getText());

        allOrderPage.checkAllButton.click();
     //   BrowserUtil.waitFor(2);

        allOrderPage.unCheckAllButton.click();
     //   BrowserUtil.waitFor(2);

        System.out.println("allOrderPage.headerCells.size() = " + allOrderPage.headerCells.size());
        int num = 1;
        for (WebElement cell : allOrderPage.headerCells) {

        System.out.println("cell.getText("+num+") = " + cell.getText());
         num++;
        }


        System.out.println("allOrderPage.allHeaderCell() = " + allOrderPage.allHeaderCell());
        BrowserUtil.waitFor(1);
    }


}