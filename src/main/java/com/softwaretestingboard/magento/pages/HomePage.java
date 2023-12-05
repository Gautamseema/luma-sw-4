package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By womenMenu = By.xpath("//span[normalize-space()='Women']");
    By Tops = By.xpath("//a[@id='ui-id-9']//span[contains(text(),'Tops')]") ;
    By Jackets = By.id("ui-id-11");
    By menMenu = By.xpath("//span[normalize-space()='Men']");
    By Bottoms = By.xpath("//a[@id='ui-id-18']//span[contains(text(),'Bottoms')]");
    By Pants = By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");
    By gearMenu = By.xpath("//span[normalize-space()='Gear']");
    By bags = By.xpath("//span[normalize-space()='Bags']");



    public void mouseHoverOnWomenMenu(){
        mouseHoverToElement(womenMenu );
    }
    public void mouseHoverOnTops(){
        mouseHoverToElement(Tops);
    }
    public void mouseHoverOnJacketsAndClick(){
        mouseHoverOnJacketsAndClick();
    }
    public void mouseHoverOnMenMenu(){
        mouseHoverToElement(menMenu);
    }
    public void mouseHoverOnBottoms(){
        mouseHoverToElement(Bottoms);
    }
    public void mouseHoverOnPantsAndClick(){
        mouseHoverToElementAndClick(Pants);
    }
    public void mouseHoverOnGearMenu(){
        mouseHoverToElement(gearMenu);
    }
    public void mouseHoverOnBagsAndClick(){
        mouseHoverToElementAndClick(bags);
    }
}
