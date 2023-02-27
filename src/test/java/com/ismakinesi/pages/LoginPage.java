package com.ismakinesi.pages;

import com.ismakinesi.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//h3[text()='Üye Girişi']")
    public WebElement uyeGirisi; //Uye Grisi texti
    @FindBy(css = "[type='email']")
    public WebElement emailUye; //mail text box
    @FindBy(css = "[type='password']")
    public WebElement passwordUye; //password text box
    @FindBy(css = "[type='submit']")
    public WebElement submitBtn; // giris yap butonu
    @FindBy(xpath = "//span[text()='Hesabım']")
    public WebElement hesabimBtn; // uye ol veya giris yap butonu
    @FindBy(css = ".youtube.float-left")
    public WebElement youtubeLink;
    @FindBy(xpath = "//*[@id='logo-icon'][1]")
    public WebElement youtubeIcon;
    @FindBy(css = ".twitter.float-left")
    public WebElement twitterLink;
    @FindBy(xpath = "(//a[@role='link'])[3]")
    public WebElement twitterIcon;
    @FindBy(css = ".facebook.float-left")
    public WebElement facebookLink;
    @FindBy(id = "ssrb_top_nav_start")
    public WebElement facebookIcon;
    @FindBy(xpath = "//button[@class='BtnLogin']")
    public WebElement uyeOlVeyaGirisYapButonu;
    @FindBy(xpath = "//*[text()='Lütfen bu alanları doldurun: password']")
    public WebElement passwordIcinUyariTexti;
    @FindBy(css = ".instagram.float-left")
    public WebElement instagramLink;
    @FindBy(xpath = "(//button[@type='button'])[1]")
    public WebElement followButtonOnInstagramAccount;
    @FindBy(xpath = "//*[text()='Geçersiz giriş.']")
    public WebElement invalidPasswordIcinUyariTexti;

    @FindBy(css = "div[title*='Login']")
    public WebElement loginSekmesi;

    @FindBy(css = "div[class*='ant-message-notice-content']")
    public WebElement sifreUyari;

    @FindBy(css = "div>p>button")
    public WebElement uyeOl;

    @FindBy(css = "button[type='submit']")
    public WebElement uyeOlSubmit;

    @FindBy(css = "input[name*='pa']")
    public WebElement sifre;

    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }

}
