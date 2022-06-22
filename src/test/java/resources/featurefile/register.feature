Feature: User should able to register new account
  As a user I should be register my new account


  Background: User should navigate to new account form page
    Given I am on Homepage
    When I click on Enter the Store
    And  I should be able to see "Sign In" link
    And I click on Sign in Tab
    And I am on login page
    And I should be able to see "Register Now!" link text
    And I click on Register Now Tab
    And I am on new Account form page
    Then I should be able to see "User Information"

  @Regression
  Scenario Outline: User should register new account successfully
    Given I am on new Account form page
    When I enter "<UserId>" into User Id field
    And I enter "<new password>" into password Id field
    And I enter "<Repeat password>" into Repeat pssword field
    And I enter "<First Name>" into First Name field
    And I enter "<Last Name>" into Last Name field
    And I enter "<Email>" into Email field
    And I enter "<Phone>" into phone field
    And I enter "<Address1>" into Address one field
    And I enter "<Address2>" into Address two field
    And I enter "<City>" into City field
    And I enter "<State>" into State field
    And I enter "<Zip>" into Zip field
    And I enter "<Country>" into Country field
    And I Select "<Language preference>" from the language preference list
    And I Select "<Favourite Category>" from the favourite category list
    And I check Enable MyList box
    And I check Enable MyBanner box
    And I Click on Save Account Information Button
    Then I should be able to navigate to action page with "Sign In" link
    And I click on Sign in Tab
    And I should be able to navigate to signIn page
    And I clear UserName field
    And I enter "<UserName>" into UserName field
    And I clear Password field
    And I enter "<Password>" into Password field
    And I Clik on Login button
    And I should be able to see "My Account" on acionPage
    Examples:
      | UserId  | new password | Repeat password | First Name | Last Name | Email             | Phone      | Address1     | Address2    | City       | State        | Zip      | Country | Language preference | Favourite Category | UserName | Password    |
      | 52521008 | primetime10  | primetime10     | asdfgh     | etryhdggg | akfaddr@yahoo.com | 2321546421 | 12 shanelane | potters bar | birmingham | westmidlands | b34 25uy | England | japanese            | REPTILES           | 52521004 | primetime10 |

