package com.ismakinesi.pages;

import com.ismakinesi.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FooterPage {

    public FooterPage() {
        PageFactory.initElements(Driver.get(), this);
    }




    @FindBy(xpath = "//a[contains(@href, '/page/1/hakkimizda')]")
    public WebElement ismakinesicomHakkindaButton;



    @FindBy(css = "span[title='Hakkımızda']")
    public WebElement HakkimizdaText;

    @FindBy(xpath = "//h1[@class='container']")
    public WebElement HakkimizdaicYazitext;

    @FindBy(xpath = "//a[contains(@href, 'machinerymarket')]")
    public WebElement KariyerButton;

    @FindBy(xpath = "//a[contains(@href, '/page/6/mesafeli-satis-sozlesmesi')]")
    public WebElement KullaniciSozlesmesiButton;

    @FindBy(xpath = "//a[contains(@href, 'gizlilik')]")
    public WebElement GizlilikMerkeziButton;

    @FindBy(xpath = "//a[contains(@href, 'satarim')]")
    public WebElement NasilSatarimButton;

    @FindBy(xpath = "//a[contains(@href, 'alirim')]")
    public WebElement NasilAlirim;

    @FindBy(xpath = "//a[contains(@href, 'teklif')]")
    public WebElement TeklifSistemiButton;

    @FindBy(xpath = "//a[contains(@href, '/page/39/sinirli-servis-garantisi')]")
    public WebElement SinirliServisGarantisiButton;

    @FindBy(xpath = "//a[contains(@href, 'contact')]")
    public WebElement BizeUlasinButton;

    @FindBy(xpath = "(//a[@href='/help'])[2]")
    public WebElement DestekMerkeziButton;

    @FindBy(xpath = "//a[contains(@href, '/help/1#99-73')]")
    public WebElement SikSorulanSorularButton;


}

