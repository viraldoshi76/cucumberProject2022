package com.octoperf.petstore.pages;

import com.octoperf.petstore.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @FindBy(xpath = "//a[contains(text(),'Register Now!')]")
    WebElement _registerNowLinkText;

    @FindBy(xpath = "//input[@name='username']")
    WebElement _userNameField;

    @FindBy(xpath = "//input[@name='password']")
    WebElement _passwordField;

    @FindBy(xpath = "//input[@name='signon']")
    WebElement signOnButton;

    public String getRegisterNowText(){
        log.info("getting Register now text"+_registerNowLinkText.toString());
        return getTextFromElement(_registerNowLinkText);
    }

    public void clickOnRegisterNowTab(){
        clickOnElement(_registerNowLinkText);
        log.info("click on register now tab"+ _registerNowLinkText.toString());
    }

    public void clearUserNameField(){
        clearTextFromField(_userNameField);
        log.info("clear text from username field"+ _userNameField.toString());
    }

    public void enterUserName(String userName){
        sendTextToElement(_userNameField,userName);
        log.info("entering username into username field" + _userNameField.toString());
    }


    public void clearPasswordField(){
        clearTextFromField(_passwordField);
        log.info("clear text from password field "+ _passwordField.toString());
    }

    public void enterPasswordInToPasswordField(String passWord){
        sendTextToElement(_passwordField,passWord);
        log.info("enter password into password field"+ _passwordField.toString());
    }

    public void clickOnSingOnButton(){
        clickOnElement(signOnButton);
        log.info("click on signon button" + signOnButton.toString());
    }


}
