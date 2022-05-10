package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ProductPage extends Utility {

    public ProductPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "quantity_wanted")
    WebElement quantity;

    @FindBy(id = "group_1")
    WebElement size;

    @FindBy(className = "attribute_list")
    WebElement colour;

    @FindBy(xpath = "//button[@name='Submit']")
    WebElement addToCartButton;

    @FindBy(xpath = "//h2[normalize-space()='Product successfully added to your shopping cart']")
    WebElement popUpDisplay;

    @FindBy(xpath = "//span[@title='Close window']")
    WebElement closeButton;


    public void clickOnCloseBtn() {
        Reporter.log("Clicking on Close Button" + closeButton.toString() + "<br>");
        clickOnElement(closeButton);
    }

    public void verifyPopUpDisplayMsg(String text) {
        Reporter.log("verifying pop up display message" + popUpDisplay.toString() + "<br>");
        verifyThatTextIsDisplayed(popUpDisplay, text);
    }

    public void clickOnAddToCartBtn() {
        Reporter.log("Clicking on Add To Cart Button" + addToCartButton.toString() + "<br>");
        clickOnElement(addToCartButton);
    }

    public void selectColour(String color) {
        Reporter.log("Clicking on Colour option" + colour.toString() + "<br>");
        clickOnElement(colour);
    }

    public void selectSize(String text) {
        Reporter.log("Selecting size" + size.toString() + "<br>");
        selectByVisibleTextFromDropDown(size, text);
    }

    public void changeQuantity(String num) {
        sendTextToElement(quantity, Keys.BACK_SPACE + num);
    }
}
