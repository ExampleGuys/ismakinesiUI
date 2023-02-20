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

    @FindBy(xpath = "//div[@class=\"address-edit\"]")
    public WebElement adresDuzenle;

    @FindBy(xpath = "//a[@class=\"dataAddBox right\"]")
    public WebElement yeniAdres;

    @FindBy(xpath = "//button[@aria-label=\"Close\"]")
    public WebElement kapat;

    @FindBy(xpath = "//*[@placeholder=\"Eski Şifre\"]")
    public WebElement eskiSifre;

    @FindBy(xpath = "//*[@placeholder=\"Yeni Şifre\"]")
    public WebElement yeniSifre;

    @FindBy(xpath = "//*[@placeholder=\"Yeni Şifre (Tekrar)\"]")
    public WebElement yeniSifreTekrar;

    @FindBy(xpath = "//*[@type=\"submit\"]")
    public WebElement sifremiDegistir;

    @FindBy(xpath = "//span/a[@href='javascript:void(0)']")
    public WebElement eMailAdresiniOnayla;

    @FindBy(xpath = "//input[@placeholder=\"Adres Adı\"]")
    public WebElement adresAdi;

    @FindBy(xpath = "//input[@placeholder=\"Adres\"]")
    public WebElement adres;

    @FindBy(xpath = "//a[@class=\"dataRemoveBtn\"]")
    public WebElement kaliciOlarakSil;

    @FindBy(xpath = "//button[@class=\"ant-btn ant-btn-buttonStyle1\"]")
    public WebElement kaydet;

    @FindBy(xpath = "//*[@class=\"ant-btn\"]")
    public WebElement iptal;

    @FindBy(xpath = "//*[@class=\"h180 address-item\"]")
    public WebElement firmaBilgisi;

    @FindBy(xpath = "//*[@id=\"coordinated_title\"]")
    public WebElement firmaAdi;

    @FindBy(xpath = "//*[@id=\"coordinated_company_id\"]/div")
    public WebElement firmaSec;

    @FindBy(xpath = "//li[@class=\"ant-select-dropdown-menu-item ant-select-dropdown-menu-item-active\"]")
    public WebElement firmaDropdown;

    @FindBy(xpath = "//*[@id=\"coordinated_currency_code\"]")
    public WebElement paraBirimiSec;

    @FindBy(xpath = "//input[@placeholder=\"Banka Adı\"]")
    public WebElement bankaAdi;

    @FindBy(xpath = "//input[@placeholder=\"Iban\"]")
    public WebElement iban;

    @FindBy(xpath = "//input[@placeholder=\"Swift Kodu\"]")
    public WebElement swiftKodu;

    @FindBy(xpath = "//textarea[@placeholder=\"Adres\"]")
    public WebElement bankaBilgisiAdres;

    @FindBy(xpath = "//textarea[@placeholder=\"Not\"]")
    public WebElement not;

    @FindBy(xpath = "//input[@placeholder=\"Country code\"]")
    public WebElement ulkeKodu;

    @FindBy(xpath = "//div/button/div[2]")
    public WebElement ulke;
}