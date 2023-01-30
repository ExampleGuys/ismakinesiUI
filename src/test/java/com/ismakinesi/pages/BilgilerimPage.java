package com.ismakinesi.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BilgilerimPage extends BasePage{

    @FindBy(xpath = "//ul/li//*[text()='Bilgilerim']")
    public WebElement bilgilerim;

    @FindBy(xpath = "//h1[contains(text(),'Bilgilerim')]")
    public WebElement bilgilerimBasligi;


}