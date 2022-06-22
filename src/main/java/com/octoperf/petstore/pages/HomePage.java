package com.octoperf.petstore.pages;

import com.octoperf.petstore.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(xpath = "//a[contains(text(),'Enter the Store')]")
    WebElement clickOnEnterTheStore;

    public void clickOnEnterTheStoreLink(){

    clickOnElement(clickOnEnterTheStore);
    log.info("clicking on enter the store "+ clickOnEnterTheStore.toString());
    }


}
