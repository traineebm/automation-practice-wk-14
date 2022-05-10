package com.automation.testsuite;

import com.automation.customlisteners.CustomListeners;
import com.automation.pages.HomePage;
import com.automation.pages.SignInPage;
import com.automation.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import resources.testdata.TestData;

@Listeners(CustomListeners.class)
public class SignPageTest extends TestBase {

    HomePage homePage;
    SignInPage signInPage;

    @BeforeMethod (alwaysRun = true)
    public void inIt(){
        homePage = new HomePage();
        signInPage = new SignInPage();
    }

    @Test (groups = {"sanity","smoke","regression"})
    public void userShouldNavigateToSignInPageSuccessFully(){
        homePage.clickOnSignInLink();
        signInPage.verifyThatAuthenticationMessage("AUTHENTICATION");
    }

    @Test(groups = {"smoke","regression"},dataProvider = "invalid credentials",dataProviderClass = TestData.class)
    public void verifyTheErrorMessageWithInValidCredentials(String username, String password,
                                                            String message){
        homePage.clickOnSignInLink();
        signInPage.enterUsername(username);
        signInPage.enterPassword(password);
        signInPage.clickOnSignInButton();
        signInPage.verifyTheErrorMessageText(message);
    }

    @Test (groups = {"regression"})
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials(){
        homePage.clickOnSignInLink();
        signInPage.enterUsername("Samantha007@gmail.com");
        signInPage.enterPassword("Asdfg909");
        signInPage.clickOnSignInButton();
       signInPage.verifyThatSignOutLinkIsDisplayed("Sign out");
    }

    @Test (groups = {"regression"})
    public void verifyThatUserShouldLogOutSuccessFully(){
        homePage.clickOnSignInLink();
        signInPage.enterUsername("Samantha007@gmail.com");
        signInPage.enterPassword("Asdfg909");
        signInPage.clickOnSignInButton();
        signInPage.clickOnSignOutLink();
        homePage.verifyThatSignInLinkIsDisplayed("Sign in");
    }

}
