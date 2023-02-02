package com.ismakinesi.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TeklifHakkiPage extends BasePage {

    @FindBy(xpath = "//a[contains(text(),'Teklif Haklarım')]")
    public WebElement teklifHaklarim;

    @FindBy(xpath = "//a[text()='Aktif']")
    public WebElement aktifBtn;

    @FindBy(xpath = "(//span[.='Kullanılabilir'])[1]")
    public WebElement kullanTek;

    @FindBy(xpath = "//a[text()='Süresi Bitenler']")
    public WebElement suresiBitenler;

    @FindBy(xpath = "//span[.='Ödemede Kullanıldı'][1]")
    public WebElement odemedeKullanildi;

    @FindBy(css = "a[href='/profile/payment/preview?type=1']")
    public WebElement teklifHakkiAl;

    @FindBy(css = "h2[class='title-main']")
    public WebElement teklifHakkiPage;

    @FindBy(css = "[name='card_holder_name']")
    public WebElement kartSahipAd;

    @FindBy(xpath = "//iframe[contains(@title, 'ödeme')]")
    public WebElement kartNumarasi;

    @FindBy(id = "paymentBtn")
    public WebElement odemeYapBtn;

    @FindBy(xpath = "(//p[text()='Avantaj'])[1]")
    public WebElement avantajPacket;

    @FindBy(xpath = "(//a[text()='Teklif Hakkı Al'])[1]")
    public WebElement tekAlButton;

    @FindBy(xpath = "//h1[.='Aldıklarım']")
    public WebElement aldiklarimPage;

    @FindBy(xpath = "(//span[.='Kullanılabilir'])[1]")
    public WebElement kullanilabilir;

    @FindBy(css = ".float-end.text-center.totalAdCount")
    public WebElement tekHakSayisiIlk;

    @FindBy(xpath = "//p[contains(text(),'Berk')]")
   public WebElement firmaAdi;

}
