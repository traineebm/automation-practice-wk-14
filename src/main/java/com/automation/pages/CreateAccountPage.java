package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class CreateAccountPage extends Utility {

    public CreateAccountPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='radio']")
    WebElement radioButton;

    @FindBy(id = "customer_firstname")
    WebElement firstName;

    @FindBy(id = "customer_lastname")
    WebElement lastName;

    @FindBy(id = "email")
    WebElement emailId;

    @FindBy(id = "passwd")
    WebElement passwordDetails;

    @FindBy(id = "firstname")
    WebElement yourAddressFirstName;

    @FindBy(id = "lastname")
    WebElement yourAddressLastName;

    @FindBy(id = "address1")
    WebElement yourAddressLine1;

    @FindBy(id = "city")
    WebElement yourAddressCity;

    @FindBy(xpath = "//select[@id='id_state']")
    WebElement yourAddressState;

    @FindBy(id = "postcode")
    WebElement yourAddressPostalCode;

    @FindBy(id = "id_country")
    WebElement yourAddressCountry;

    @FindBy(id = "phone_mobile")
    WebElement mobilePhoneNumber;

    @FindBy(id = "submitAccount")
    WebElement registerButton;

    @FindBy(xpath = "//h1[contains(text(),'My account')]")
    WebElement myAccountText;



    public void enterFirstName(String firstname){
        Reporter.log("Entering first name in firstNameBox" + firstName.toString() + "<br>");
        sendTextToElement(firstName, firstname);
    }

    public void enterLastName(String lastname){
        Reporter.log("Entering last name in lastNameBox" + lastName.toString() + "<br>");
        sendTextToElement(lastName, lastname);
    }

    public void enterEmailId(String email){
        Reporter.log("Entering email in emailAddressBox" + emailId.toString() + "<br>");
        sendTextToElement(emailId, email);
    }

    public void enterPassword(String password){
        Reporter.log("Entering password in passwordBox" + passwordDetails.toString() + "<br>");
        sendTextToElement(passwordDetails, password);
    }

    public void clickOnRadioButton(){
        Reporter.log("Clicking on radio button" + radioButton.toString() + "<br>");
        clickOnElement(radioButton);
    }

    public void enterFirstNameOnYourAddressDetails(String name){
        Reporter.log("Entering first name in address details text box " + yourAddressFirstName.toString() + "<br>");
        sendTextToElement(yourAddressFirstName, name);
    }

    public void enterLastNameOnYourAddressDetails(String name){
        Reporter.log("Entering last name in address details text box " + yourAddressLastName.toString() + "<br>");
        sendTextToElement(yourAddressLastName, name);
    }

    public void enterYourAddressDetails(String address){
        Reporter.log("Entering address details in text box " + yourAddressLine1.toString() + "<br>");
        sendTextToElement(yourAddressLine1, address);
    }

    public void enterYourCityDetails(String cityname){
        Reporter.log("Entering city name in address details text box " + yourAddressCity.toString() + "<br>");
        sendTextToElement(yourAddressCity, cityname);
    }

    public void selectYourStateDetailsFromDropDown(String statename){
        Reporter.log("Select state name in address details text box " + yourAddressState.toString() + "<br>");
        selectByVisibleTextFromDropDown(yourAddressState, statename);
    }

    public void enterYourPostalCodeDetails(String postcode){
        Reporter.log("Entering postal code in address details text box " + yourAddressPostalCode.toString() + "<br>");
        sendTextToElement(yourAddressPostalCode, postcode);
    }

    public void selectYourCountryDetailsFromDropDown(String country){
        Reporter.log("Select country name in address details text box " + yourAddressCountry.toString() + "<br>");
        selectByVisibleTextFromDropDown(yourAddressCountry, country);
    }

    public void enterMobilePhoneNumber(String number){
        Reporter.log("Entering mobile number details text box " + mobilePhoneNumber.toString() + "<br>");
        sendTextToElement(mobilePhoneNumber, number);
    }

    public void clickOnRegisterButton(){
        Reporter.log("Clicking on register button " + registerButton.toString() + "<br>");
        clickOnElement(registerButton);
    }

    public void verifyMyAccountText(String text){
        Reporter.log("Verifying my account text is displayed " + myAccountText.toString() + "<br>");
        verifyThatTextIsDisplayed(myAccountText, text);
    }

}
