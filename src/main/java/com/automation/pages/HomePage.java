package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage extends Utility {

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Women")
    WebElement women;

    @FindBy(linkText = "Dresses")
    WebElement dresses;

    @FindBy(linkText = "T-shirts")
    WebElement tShirts;

    @FindBy(xpath = "//a[contains(text(),'Sign in')]")
    WebElement signInLink;

    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[1]/a[1]/img[1]")
    WebElement yourLogoText;

    @FindBy(xpath = "//a[contains(text(),'Sign in')]")
    WebElement signInLinkText;

    public void clickOnWomenTab(){
        Reporter.log("Click on Women Tab " + women.toString() + "<br>");
        clickOnElement(women);
    }

    public void clickOnDressesTab(){
        Reporter.log("Click on Dresses Tab " + dresses.toString() + "<br>");
        clickOnElement(dresses);
    }

    public void clickOnT_ShirtsTab(){
        Reporter.log("Click on T-shirts Tab " + tShirts.toString() + "<br>");
        clickOnElement(tShirts);
    }

    public void clickOnSignInLink(){
        Reporter.log("Clicking on Sign In Link " + signInLink.toString() + "<br>");
        clickOnElement(signInLink);
    }

    public void verifyThatSignInLinkIsDisplayed(String text){
        Reporter.log("Clicking on Sign In Link Text" + signInLinkText.toString() + "<br>");
        verifyThatTextIsDisplayed(signInLinkText, text);
    }
}
