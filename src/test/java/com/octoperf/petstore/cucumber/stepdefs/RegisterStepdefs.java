package com.octoperf.petstore.cucumber.stepdefs;

import com.octoperf.petstore.pages.ActionPage;
import com.octoperf.petstore.pages.HomePage;
import com.octoperf.petstore.pages.LoginPage;
import com.octoperf.petstore.pages.NewAccountFormPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import sun.rmi.runtime.Log;

import java.awt.*;

public class RegisterStepdefs {
    @Given("^I am on Homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I click on Enter the Store$")
    public void iClickOnEnterTheStore() {
        new HomePage().clickOnEnterTheStoreLink();

    }

    @And("^I should be able to see \"([^\"]*)\" link$")
    public void iShouldBeAbleToSeeLink(String expectedTxt)  {
        String actualTxt = new ActionPage().getSigninText();
        Assert.assertEquals(actualTxt,expectedTxt);
    }

    @And("^I click on Sign in Tab$")
    public void iClickOnSignInTab() {
        new ActionPage().clickOnSiginTab();
    }

    @And("^I am on login page$")
    public void iAmOnLoginPage() {
    }

    @And("^I should be able to see \"([^\"]*)\" link text$")
    public void iShouldBeAbleToSeeLinkText(String expectedtxt)  {
        String actualtxt = new LoginPage().getRegisterNowText();
        Assert.assertEquals(actualtxt,expectedtxt);
    }


    @And("^I click on Register Now Tab$")
    public void iClickOnRegisterNowTab() {

        new LoginPage().clickOnRegisterNowTab();
    }

    @And("^I am on new Account form page$")
    public void iAmOnNewAccountFormPage() {
    }

    @Then("^I should be able to see \"([^\"]*)\"$")
    public void iShouldBeAbleToSee(String expectedTxt)  {
        String actualtxt = new NewAccountFormPage().gettingUserInformationText();
        Assert.assertEquals(actualtxt,expectedTxt);
    }


    @When("^I enter \"([^\"]*)\" into User Id field$")
    public void iEnterIntoUserIdField(String UserId) throws InterruptedException {
        new NewAccountFormPage().enterUserId(UserId);

    }

    @And("^I enter \"([^\"]*)\" into password Id field$")
    public void iEnterIntoPasswordIdField(String newPassword) throws InterruptedException {
        new NewAccountFormPage().enterNewPassword(newPassword);
    }

    @And("^I enter \"([^\"]*)\" into Repeat pssword field$")
    public void iEnterIntoRepeatPsswordField(String repeatPassword) throws InterruptedException {
        new NewAccountFormPage().enterRepeatPassword(repeatPassword);
    }

    @And("^I enter \"([^\"]*)\" into First Name field$")
    public void iEnterIntoFirstNameField(String firstName)  {
        new NewAccountFormPage().enterFirstNmae(firstName);
    }

    @And("^I enter \"([^\"]*)\" into Last Name field$")
    public void iEnterIntoLastNameField(String lastName)  {
        new NewAccountFormPage().enterLastName(lastName);

    }

    @And("^I enter \"([^\"]*)\" into Email field$")
    public void iEnterIntoEmailField(String email)  {
        new NewAccountFormPage().enterEmailAddress(email);
    }

    @And("^I enter \"([^\"]*)\" into phone field$")
    public void iEnterIntoPhoneField(String phone)  {
        new NewAccountFormPage().enterPhoneNumber(phone);
    }

    @And("^I enter \"([^\"]*)\" into Address two field$")
    public void iEnterIntoAddressTwoField(String address1)  {
        new NewAccountFormPage().enterAddres1(address1);
    }

    @And("^I enter \"([^\"]*)\" into Address one field$")
    public void iEnterIntoAddressOneField(String address2) {
        new NewAccountFormPage().enterAddress2(address2);
    }


    @And("^I enter \"([^\"]*)\" into City field$")
    public void iEnterIntoCityField(String city)  {
        new NewAccountFormPage().enterCityName(city);
    }

    @And("^I enter \"([^\"]*)\" into State field$")
    public void iEnterIntoStateField(String state)  {
        new NewAccountFormPage().enterStateName(state);
    }

    @And("^I enter \"([^\"]*)\" into Zip field$")
    public void iEnterIntoZipField(String zip)  {
        new NewAccountFormPage().enterZipCode(zip);
    }

    @And("^I enter \"([^\"]*)\" into Country field$")
    public void iEnterIntoCountryField(String country)  {
        new NewAccountFormPage().enterCountryName(country);
    }

    @And("^I Select \"([^\"]*)\" from the language preference list$")
    public void iSelectFromTheLanguagePreferenceList(String languagePreference) {
        new NewAccountFormPage().selectLanguageFromDropDownList(languagePreference);
    }

    @And("^I Select \"([^\"]*)\" from the favourite category list$")
    public void iSelectFromTheFavouriteCategoryList(String favouriteCategory) {
        new NewAccountFormPage().selectCategoryFromDropDownList(favouriteCategory);
    }



    @And("^I check Enable MyList box$")
    public void iCheckEnableMyListBox() {
        new NewAccountFormPage().enableMyListOption();
    }

    @And("^I check Enable MyBanner box$")
    public void iCheckEnableMyBannerBox() {
        new NewAccountFormPage().enableMyBannerOption();
    }

    @And("^I Click on Save Account Information Button$")
    public void iClickOnSaveAccountInformationButton() {
        new NewAccountFormPage().clickOnSaveAccountInformationButton();
    }

    @Then("^I should be able to navigate to action page with \"([^\"]*)\" link$")
    public void iShouldBeAbleToNavigateToActionPageWithLink(String expectedTxt)  {
        String actualtxt = new ActionPage().getSigninText();
        Assert.assertEquals(actualtxt,expectedTxt);
    }

    @And("^I should be able to navigate to signIn page$")
    public void iShouldBeAbleToNavigateToSignInPage() {
    }

    @And("^I clear UserName field$")
    public void iClearUserNameField() {
        new LoginPage().clearUserNameField();
    }

    @And("^I enter \"([^\"]*)\" into UserName field$")
    public void iEnterIntoUserNameField(String userName)  {
        new LoginPage().enterUserName(userName);
    }

    @And("^I clear Password field$")
    public void iClearPasswordField() {
        new LoginPage().clearPasswordField();
    }

    @And("^I enter \"([^\"]*)\" into Password field$")
    public void iEnterIntoPasswordField(String password)  {
        new LoginPage().enterPasswordInToPasswordField(password);
    }

    @And("^I Clik on Login button$")
    public void iClikOnLoginButton() {
        new LoginPage().clickOnSingOnButton();
    }

    @And("^I should be able to see \"([^\"]*)\" on acionPage$")
    public void iShouldBeAbleToSeeOnAcionPage(String expectedTxt)  {
        String actualTxt = new ActionPage().gettingTextFromMyAccount();
        Assert.assertEquals(actualTxt,expectedTxt);
    }



}
