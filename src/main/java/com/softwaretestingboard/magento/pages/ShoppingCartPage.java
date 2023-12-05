package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

import javax.naming.Name;

public class ShoppingCartPage extends Utility  {
    By actualTextShoppingCart = By.xpath("//a[normalize-space()='shopping cart']");
    By productName = By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']");
    By size = By.xpath("//dd[contains(text(),'32')]");
    By colour = By.xpath("//dd[contains(text(),'Black')]");

    public String getActualText(){
        return getTextFromElement(actualTextShoppingCart);
    }
    public String getProductName(){
        return getTextFromElement(productName);
    }
    public int getSize(){
        return getNumberFromElement(size);
    }

    private int getNumberFromElement(By size) {
        return 0;
    }

    public String getColour(){

        return getTextFromElement(colour);
    }
    public String getName(){

        return getTextFromElement(Name);
    }
    public int getQuantity(){

        return getNumberFromElement(quantity);
    }
    public String getPrice(){

        return getTextFromElement(price);
    }
    public void changeQuantityTo5(String quantity){

        sendTextToElement(quantity);
    }
    public void updateShoppingCart(){

        clickOnElement(updateCart);
    }
    public String verifyProductPrice(){

        return getTextFromElement(updatePrice);
    }

}
