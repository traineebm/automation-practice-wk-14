package com.automation.testsuite;

import com.automation.customlisteners.CustomListeners;
import com.automation.pages.*;
import com.automation.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import resources.testdata.TestData;

@Listeners(CustomListeners.class)
public class WomenCategoryPageTest extends TestBase {
    HomePage homePage;
    WomenCategoryPage womenCategoryPage;
    ProductPage productPage;

    @BeforeMethod (alwaysRun = true)
    public void inIt(){
        homePage = new HomePage();
        womenCategoryPage = new WomenCategoryPage();
        productPage = new ProductPage();
    }

    @Test(groups = {"sanity", "smoke", "regression"})
    public void verifyUserShouldNavigateToWomenCategoryPageSuccessfully(){
        homePage.clickOnWomenTab();
        womenCategoryPage.verifyWomenText("WOMWN");
    }

    @Test(groups = {"smoke", "regression"},dataProvider = "cart",dataProviderClass = TestData.class)
    public void verifyUserShouldAddProductToTheCartSuccessfully(String product, String qty, String
            size, String colour){
        homePage.clickOnWomenTab();
        womenCategoryPage.addProductToCart(product);
        productPage.changeQuantity(qty);
        productPage.selectSize(size);
        productPage.selectColour(colour);
        productPage.clickOnAddToCartBtn();
        productPage.verifyPopUpDisplayMsg("Product successfully added to your shopping cart");
        productPage.clickOnCloseBtn();
    }
}
