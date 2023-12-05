package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.PantsPage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import com.softwaretestingboard.magento.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenTest extends TestBase  {
    HomePage homePage = new HomePage();
    PantsPage pantsPage = new PantsPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppinCart() throws InterruptedException{
        Thread.sleep(2000);
    homePage.mouseHoverOnMenMenu();
        Thread.sleep(2000);
    homePage.mouseHoverOnBottoms();
        Thread.sleep(2000);
    homePage.mouseHoverOnPantsAndClick();
        Thread.sleep(2000);

   pantsPage.mouseHoverOnCronusYogaPant();
   pantsPage.clickOnSize32();
   pantsPage.clickOnBlackColour();
   pantsPage.clickOnAddToCart();
   Assert.assertEquals(pantsPage .getActualText(),"You added Cronus Yoga Pant to your shopping cart.","Text is not displayed");
   pantsPage.clickOnShoppingCartLink();
   Assert.assertEquals(shoppingCartPage.getActualText(),"Shopping Cart","Text is not displayed");
   Assert.assertEquals(shoppingCartPage.getProductName(),"Cronus Yoga Pant","Product name is not diaplayed" );
   Assert.assertEquals(shoppingCartPage.getSize(),32,"Size is not displayed");
   Assert.assertEquals(shoppingCartPage.getColour(),"Black","Colour is not displayed");
    }
   }


