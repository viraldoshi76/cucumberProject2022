package com.octoperf.petstore.pages;

import com.octoperf.petstore.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActionPage extends Utility {

    private static final Logger log = LogManager.getLogger(ActionPage.class.getName());

    @FindBy(xpath = "//a[contains(text(),'Sign In')]")
    WebElement _signInLinkText;

    @FindBy(xpath = "//a[contains(text(),'My Account')]")
    WebElement myAccountText;

    public String getSigninText(){
     log.info("getting text from link"+_signInLinkText.toString());
    return _signInLinkText.getText();
    }

    public void clickOnSiginTab(){
        clickOnElement(_signInLinkText);
        log.info("click on sign in tab"+_signInLinkText.toString());
    }

    public String gettingTextFromMyAccount(){
        log.info("getting text from my account to verify" + myAccountText.getText());
        return getTextFromElement(myAccountText);

    }








}
