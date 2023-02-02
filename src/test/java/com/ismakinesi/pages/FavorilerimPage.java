package com.ismakinesi.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FavorilerimPage extends BasePage {

    @FindBy(xpath = "//ul/li//*[text()='Favorilerim']")
    public WebElement favorilerim;

    @FindBy(xpath = "//a[@href='/item/943/2007-jcb-3cx?close=false']")
    public WebElement favoriUrun;

    @FindBy(xpath = "//div[@class='productDetailRight']")
    public WebElement favoriUrununSayfasi;
}
