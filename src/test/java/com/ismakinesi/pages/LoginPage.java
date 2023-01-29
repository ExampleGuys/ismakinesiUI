package com.ismakinesi.pages;

import com.ismakinesi.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }
    @FindBy(xpath ="//h3[text()='Üye Girişi']")
    public WebElement uyeGirisi; //Uye Grisi texti

    @FindBy(css="[type='email']")
    public WebElement emailUye; //mail text box

    @FindBy(css="[type='password']")
    public WebElement passwordUye; //password text box

    @FindBy(css="[type='submit']")
    public WebElement submitBtn; // giris yap butonu

    @FindBy(css=".loginAccountTitle:nth-child(1)")
    public WebElement hesabimBtn; // uye ol veya giris yap butonu







    @FindBy(css = ".twitter.float-left")
    public WebElement twitterLink;

    @FindBy(xpath = "(//a[@role='link'])[3]")
    public WebElement twitterIcon;






    @FindBy(xpath = "//button[@class='BtnLogin']")
    public WebElement uyeOlVeyaGirisYapButonu;

    @FindBy(xpath = "//*[text()='Lütfen bu alanları doldurun: password']")
    public WebElement passwordIcinUyariTexti;



}
