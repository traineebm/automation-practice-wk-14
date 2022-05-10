package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class WomenCategoryPage extends Utility {

    public WomenCategoryPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[@class='category-name']")
    WebElement womenText;

    @FindBy(xpath = "//a[@class='product-name']")
    WebElement productsList;


    public void verifyWomenText(String text) {
        Reporter.log("Verifying women text " + womenText.toString() + "<br>");
        verifyThatTextIsDisplayed(womenText, text);
    }

    public void addProductToCart(String product) {
        Reporter.log("Adding product to cart " + productsList.toString() + "<br>");
        clickOnElement(productsList);
    }
}