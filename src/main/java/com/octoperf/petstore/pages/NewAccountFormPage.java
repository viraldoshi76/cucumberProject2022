package com.octoperf.petstore.pages;

import com.octoperf.petstore.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.lang.ref.SoftReference;

public class NewAccountFormPage extends Utility {

    private static final Logger log = LogManager.getLogger(NewAccountFormPage.class.getName());

    @FindBy(xpath = "//h3[contains(text(),'User Information')]")
    WebElement _userInformationText;

    @FindBy(xpath = "//input[@name='username']")
    WebElement enterUserId;

    @FindBy(xpath = "//input[@name='password']")
    WebElement enterNewPassword;

    @FindBy(xpath = "//input[@name='repeatedPassword']")
    WebElement enterRepeatPassword;

    @FindBy(xpath = "//input[@name='account.firstName']")
    WebElement enterFirstName;

    @FindBy(xpath = "//input[@name='account.lastName']")
    WebElement enterLastName;

    @FindBy(xpath = "//input[@name='account.email']")
    WebElement enterEmail;

    @FindBy(xpath = "//input[@name='account.phone']")
    WebElement enterPhone;

    @FindBy(xpath = "//input[@name='account.address1']")
    WebElement enterAddress1;

    @FindBy(xpath = "//input[@name='account.address2']")
    WebElement enterAddress2;

    @FindBy(xpath = "//input[@name='account.city']")
    WebElement enterCity;

    @FindBy(xpath = "//input[@name='account.state']")
    WebElement enterState;

    @FindBy(xpath = "//input[@name='account.zip']")
    WebElement enterZip;

    @FindBy(xpath = "//input[@name='account.country']")
    WebElement enterCountry;

    @FindBy(xpath = "//select[@name='account.languagePreference']")
    WebElement selectLanguage;

    @FindBy(xpath = "//select[@name='account.favouriteCategoryId']")
    WebElement selectCategory;

    @FindBy(xpath = "//input[@name='account.listOption']")
    WebElement checkMyList;

    @FindBy(xpath = "//input[@name='account.bannerOption']")
    WebElement checkMyBanner;

    @FindBy(xpath = "//input[@name='account.bannerOption']")
    WebElement clickOnSaveAccountInformationButton;


   public String gettingUserInformationText(){
        log.info("getting user information text"+ _userInformationText.toString());
        return getTextFromElement(_userInformationText);

    }

    public void enterUserId(String userId) throws InterruptedException {
       Thread.sleep(2000);
        sendTextToElement(enterUserId,userId);
        log.info("enter user id "+enterUserId.toString());

    }

    public void enterNewPassword(String psswd) throws InterruptedException {
        Thread.sleep(2000);
       sendTextToElement(enterNewPassword,psswd);
       log.info("enering password"+ enterNewPassword.toString());
    }

    public void enterRepeatPassword(String repeatPassd) throws InterruptedException {
        Thread.sleep(2000);
        sendTextToElement(enterRepeatPassword,repeatPassd);
        log.info("entering repeat password"+ enterRepeatPassword.toString());
    }

    public void enterFirstNmae(String firstName){
       sendTextToElement(enterFirstName,firstName);
       log.info("entering first name"+ enterFirstName.toString());
    }

    public void enterLastName(String lastName){
       sendTextToElement(enterLastName,lastName);
       log.info("entering last name"+ enterLastName.toString());
    }

    public void enterEmailAddress(String email){
       sendTextToElement(enterEmail,email);
       log.info("enter email address"+ enterEmail.toString());
    }

    public void enterPhoneNumber(String phone){
       sendTextToElement(enterPhone,phone);
       log.info("enter phone number" + enterPhone.toString());
    }

    public void enterAddres1(String address1){
       sendTextToElement(enterAddress1,address1);
       log.info("enter address first line" + enterAddress1.toString());
    }

    public void enterAddress2(String address2){
       sendTextToElement(enterAddress2,address2);
       log.info("enter address second line" + enterAddress2.toString());
    }

    public void enterCityName(String city){
       sendTextToElement(enterCity,city);
       log.info("enter ciy name" + enterCity.toString());
    }

    public void enterStateName(String state){
       sendTextToElement(enterState,state);
       log.info("enter state name" + enterState.toString());
    }

    public void enterZipCode(String zipCode){
       sendTextToElement(enterZip,zipCode);
       log.info("enter Zip code"+ enterZip.toString() );
    }

    public void enterCountryName(String country){
       sendTextToElement(enterCountry,country);
       log.info("enter country name" + enterCountry.toString());
    }

    public void selectLanguageFromDropDownList(String languagePreference){

       selectByVisibleTextFromDropDown(selectLanguage,languagePreference);
       log.info("select language from drop down list" + selectLanguage.toString());
    }

    public void selectCategoryFromDropDownList(String favouriteCategory){
       selectByVisibleTextFromDropDown(selectCategory,favouriteCategory);
       log.info("select category from drop down list" + selectCategory.toString());
    }

    public void enableMyListOption(){
       clickOnElement(checkMyList);
       log.info("check box to enable my list option" + checkMyList.toString());
    }

    public void enableMyBannerOption(){
       clickOnElement(checkMyBanner);
       log.info("check box to enable my banner option" + checkMyBanner.toString());
    }

    public void clickOnSaveAccountInformationButton(){
       clickOnElement(clickOnSaveAccountInformationButton);
       log.info("click on save account information button" + clickOnSaveAccountInformationButton.toString());
    }



}
