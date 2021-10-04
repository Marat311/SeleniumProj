package com.cybertek.tests.day9_Explicit_wait_singlton_properties;

import com.cybertek.utility.BrowserUtil;
import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;

import static com.cybertek.utility.WebOrderUtility1.*;
import static com.cybertek.utility.WebOrderUtility1.logout;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WebOrderTest1 extends TestBase {
@Test
    public void testLogin(){
    openWebOrderApp();
    String username = "Tester";
    login(username, "test");
    System.out.println("is at order page" + isAtOrderPage());
    //HW2.6
    verifyUserName(username);
        BrowserUtil.waitFor(2);
    }


    @Test
    public void check_Checkboxes_IsSelected() {
    openWebOrderApp();
    login();

        checkAll();


    }

    @Test
    public void check_Uncheck_boxesIsSelected() {
        openWebOrderApp();
        login();


        uncheckAll();

    }

    @Test
    public void wiew_All_Products(){
        openWebOrderApp();
        login();
        //HW2.7
        selectSideBarTab("View all products");

    }

    @Test
    public void getAllProducts(){
    openWebOrderApp();

    login();
        System.out.println("getAAllProducts().size() = " + getAAllProducts().size());
        System.out.println("getAAllProducts() = " + getAAllProducts());

    }

    @Test
    public void getAllProducts2(){
    openWebOrderApp();
    login();
        System.out.println("getUnitPriceFromForm(\"MyMoney\") = " + getUnitPriceFromForm("MyMoney"));
    }

    @Test
    public void test_Logout(){
    openWebOrderApp();
    login();
        logout();
    }


}
