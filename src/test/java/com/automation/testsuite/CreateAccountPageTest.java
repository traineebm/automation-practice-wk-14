package com.automation.testsuite;

import com.automation.customlisteners.CustomListeners;
import com.automation.pages.CreateAccountPage;
import com.automation.pages.HomePage;
import com.automation.pages.SignInPage;
import com.automation.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class CreateAccountPageTest extends TestBase {
    HomePage homePage;
    SignInPage signInPage;
    CreateAccountPage createAccountPage;

    @BeforeMethod (alwaysRun = true)
    public void inIt(){
        homePage = new HomePage();
        signInPage = new SignInPage();
        createAccountPage = new CreateAccountPage();
    }

    @Test(groups = {"sanity", "smoke", "regression"})
    public void verifyThatUserShouldCreateAccountSuccessfully(){
        homePage.clickOnSignInLink();
        signInPage.enterEmailAddress("Samantha89@gmail.com");
        signInPage.clickOnCreateAnAccountButton();
        createAccountPage.clickOnRadioButton();
        createAccountPage.enterFirstName("Samantha");
        createAccountPage.enterLastName("Ray");
        createAccountPage.enterPassword("Asdfg909");
        createAccountPage.enterYourAddressDetails("10 Newark Street");
        createAccountPage.enterYourCityDetails("New York");
        createAccountPage.selectYourStateDetailsFromDropDown("California");
        createAccountPage.enterYourPostalCodeDetails("10101");
        createAccountPage.selectYourCountryDetailsFromDropDown("United States");
        createAccountPage.enterMobilePhoneNumber("1234567890");
        createAccountPage.clickOnRegisterButton();
        createAccountPage.verifyMyAccountText("MY ACCOUNT");
    }
}
