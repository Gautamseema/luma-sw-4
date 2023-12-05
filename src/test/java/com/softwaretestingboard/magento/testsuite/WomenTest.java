package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.JacketsPage;
import com.softwaretestingboard.magento.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WomenTest extends TestBase {
    HomePage homePage = new HomePage();
    JacketsPage jacketsPage = new JacketsPage();

    @Test
    public void verifyTheSortByProductNameFilter() throws InterruptedException {
//Mouse Hover on Women Menu
        Thread.sleep(2000);
      homePage.mouseHoverOnWomenMenu();
        Thread.sleep(2000);
        homePage.mouseHoverOnTops();
      homePage.mouseHoverOnJacketsAndClick();
        Thread.sleep(2000);
      jacketsPage.selectProductNameFilter("Product Name");
      Assert.assertEquals(jacketsPage.getProductList1() , jacketsPage.getProductList2() );
    }

    @Test
    public void verifyTheSortByPriceFilter()throws InterruptedException{
        Thread.sleep(2000);
        homePage.mouseHoverOnWomenMenu();
        Thread.sleep(2000);
        homePage.mouseHoverOnTops();
        homePage.mouseHoverOnJacketsAndClick();
        Thread.sleep(2000);
        jacketsPage.selectProductNameFilter("Price");
        Assert.assertEquals(jacketsPage.getPriceList1() , jacketsPage.getPriceList2() );
    }


}
