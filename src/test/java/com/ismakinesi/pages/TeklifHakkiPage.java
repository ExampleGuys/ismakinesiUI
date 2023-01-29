package com.ismakinesi.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TeklifHakkiPage extends BasePage {

    @FindBy(xpath = "//a[contains(text(),'Teklif Haklarım')]")
    public WebElement teklifHaklarim;

    @FindBy(xpath = "//a[contains(text(),'Aktif')]")
    public WebElement aktifBtn;

    @FindBy(xpath = "(//span[.='Kullanılabilir'])[1]")
    public WebElement kullanTek;

    @FindBy(xpath = "//a[contains(text(),'Süresi Bitenler')]")
    public WebElement suresiBitenler;

    @FindBy(xpath = "//span[.='Ödemede Kullanıldı'][1]")
    public WebElement odemedeKullanildi;

    @FindBy(css="a[href='/profile/payment/preview?type=1']")
    public WebElement teklifHakkiAl;

    @FindBy(css="h2[class='title-main']")
    public WebElement tekHakPage;

    @FindBy(xpath = "(//p[text()='Avantaj'])[1]")
    public WebElement avantajPacket;

    @FindBy(css="a[href='/profile/payment/pay?type=1&duration=long&quantity=5']")
    public WebElement tekAlButton;

}
