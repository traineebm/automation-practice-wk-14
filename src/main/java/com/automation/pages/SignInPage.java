package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class SignInPage extends Utility {

    public SignInPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "email")
    WebElement userNameField;

    @FindBy(id = "passwd")
    WebElement passwordField;

    @FindBy(id = "SubmitLogin")
    WebElement signInButton;

    @FindBy(id = "SubmitCreate")
    WebElement createAnAccountButton;

    @FindBy(xpath = "//h1[contains(text(),'Authentication')]")
    WebElement authenticationText;

    @FindBy(xpath = "//h3[contains(text(),'Create an account')]")
    WebElement createAnAccountText;

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]")
    WebElement errorMessageText;

    @FindBy(linkText = "Sign out")
    WebElement signOutLink;

    @FindBy(linkText = "Sign out")
    WebElement signOutLinkText;

    @FindBy(id = "email_create")
    WebElement emailAddressField;

    public void enterUsername(String username) {
        Reporter.log("Enter usernameField " + username + " to username field " + userNameField.toString() + "<br>");
        sendTextToElement(userNameField, username);
    }

    public void enterPassword(String password) {
        Reporter.log("Enter password " + password + " to password field " + passwordField.toString() + "<br>");
        sendTextToElement(passwordField, password);
    }

    public void clickOnSignInButton() {
        Reporter.log("Clicking on Sign In Button " + signInButton.toString() + "<br>");
        clickOnElement(signInButton);
    }

    public void clickOnCreateAnAccountButton() {
        Reporter.log("Clicking on Create An Account Button " + createAnAccountButton.toString() + "<br>");
        clickOnElement(createAnAccountButton);
    }

    public void verifyThatAuthenticationMessage(String text) {
        Reporter.log("Verifying Authentication Message " + authenticationText.toString() + "<br>");
        verifyThatTextIsDisplayed(authenticationText, text);
    }

    public void verifyCreateAnAccountText(String text) {
        Reporter.log("Verifying Create An Account Text " + createAnAccountText.toString() + "<br>");
        verifyThatTextIsDisplayed(createAnAccountText, text);
    }

    public void verifyTheErrorMessageText(String message) {
        Reporter.log("Verifying Error Message Text " + errorMessageText.toString() + "<br>");
        verifyThatTextIsDisplayed(errorMessageText, message);
    }

    public void verifyThatSignOutLinkIsDisplayed(String text) {
        Reporter.log("Verifying that SignOut Link Is Displayed Text " + signOutLinkText.toString() + "<br>");
        verifyThatTextIsDisplayed(signOutLinkText, text);
    }

    public void clickOnSignOutLink() {
        Reporter.log("Clicking on Sign Out Link " + signOutLink.toString() + "<br>");
        clickOnElement(signOutLink);
    }

    public void enterEmailAddress(String email) {
        Reporter.log("Enter Email address" + email + " to email field " + emailAddressField.toString() + "<br>");
        sendTextToElement(emailAddressField, email);
    }

}