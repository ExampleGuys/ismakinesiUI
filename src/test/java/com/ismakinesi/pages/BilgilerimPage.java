package com.ismakinesi.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BilgilerimPage extends BasePage {

    @FindBy(xpath = "//ul/li//*[text()='Bilgilerim']")
    public WebElement bilgilerim;

    @FindBy(xpath = "//h1[contains(text(),'Bilgilerim')]")
    public WebElement bilgilerimBasligi;

    @FindBy(xpath = "//ul/li//*[text()='Kişisel Bilgilerim']")
    public WebElement kisiselBilgilerim;

    @FindBy(xpath = "//ul/li//*[text()='Adreslerim']")
    public WebElement adreslerim;

    @FindBy(xpath = "//ul/li//*[text()='Firma Bilgilerim']")
    public WebElement firmaBilgilerim;

    @FindBy(xpath = "//ul/li//*[text()='Banka Bilgilerim']")
    public WebElement bankaBilgilerim;

    @FindBy(xpath = "//ul/li//*[text()='Şifre Değiştir']")
    public WebElement sifreDegistir;

    @FindBy(xpath = "//*[@placeholder=\"Adınız Soyadınız\"]")
    public WebElement adiniz;

    @FindBy(xpath = "//*[@placeholder=\"E-Mail Adresiniz\"]")
    public WebElement ePosta;

    @FindBy(xpath = "//*[@placeholder=\"Phone number\"]")
    public WebElement telefonNumarasi;

}