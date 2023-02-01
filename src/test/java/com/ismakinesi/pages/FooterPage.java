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

    @FindBy(xpath = "//a[contains(@href, '/profile/payment/preview?type=1')]")
    public WebElement TeklifSistemiButton;

    @FindBy(xpath = "//a[contains(@href, '/page/39/sinirli-servis-garantisi')]")
    public WebElement SinirliServisGarantisiButton;

    @FindBy(xpath = "//a[contains(@href, 'contact')]")
    public WebElement BizeUlasinButton;

    @FindBy(xpath = "(//a[@href='/help'])[2]")
    public WebElement DestekMerkeziButton;

    @FindBy(xpath = "//a[contains(@href, '/help/1#99-73')]")
    public WebElement SikSorulanSorularButton;

    @FindBy(xpath = "//h1[@class='container']")
    public WebElement MesafeliSatsozlesmesiText;

    @FindBy(xpath = "//h1[@class='container']")
    public WebElement GizlilikZleMesiickisim;

    @FindBy(xpath = "//a[contains(@href, 'preview')]")
    public WebElement TeklifSistemidegistir;

    @FindBy(xpath = "//img[contains(@src, 'servis')]")
    public WebElement SiniliservisIckisim;

    @FindBy(xpath = "//div[contains(@class, 'col-lg-12')]")
    public WebElement NasilsatarimIckisime;

    @FindBy(xpath = "//div[contains(@class, 'col-lg-12')]")
    public WebElement NasilalirimIckisime;

    @FindBy(xpath = "//h1")
    public WebElement SikSorulansorularIcKisim;

    @FindBy(xpath = "//h1[contains(@style, '0px;')]")
    public WebElement DestekMerkeziIc;

    @FindBy(css = "input[id*='name']")
    public WebElement AdinizSoyadiniz;

    @FindBy(css = "input[id*='email']")
    public WebElement Email;

    @FindBy(css = "input[id*='number']")
    public WebElement TelNumber;

    @FindBy(css = "input[id*='company']")
    public WebElement Company;

    @FindBy(css = "input[id='coordinated_country']")
    public WebElement Country;

    @FindBy(css = "textarea[id*='message']")
    public WebElement Message;

    @FindBy(css = "button[type='submit']")
    public WebElement Gonder;
    
    




    
    
    
    
}

