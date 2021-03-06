package com.cybertek.pages;

import com.cybertek.utility.ConfigReader;
import com.cybertek.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePage {

    @FindBy(name="q")
    private WebElement searchBox ;

    @FindBy(name="btnK")
    private WebElement searchBtn ;

    public GoogleHomePage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    /**
     * navigate to google homepage
     */
    public void goTo(){
//        Driver.getDriver().get(  "https://google.com"     );
        Driver.getDriver().get( ConfigReader.read("google.url" )    );
    }

    /**
     * Search on google homepage
     * @param keyword keyword you want to search on google
     */
    public void searchKeyword( String keyword  ){

        this.searchBox.sendKeys(  keyword  );
        this.searchBtn.click();

    }


}