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
    public WebElement uyeGirisi;

    @FindBy(css="[type='email']")
    public WebElement emailUye;

    @FindBy(css="[type='password']")
    public WebElement passwordUye;

    @FindBy(css="[type='submit']")
    public WebElement submitBtn;

    @FindBy(css=".loginAccountTitle:nth-child(1)")
    public WebElement hesabimBtn;














    @FindBy(css = ".twitter.float-left")
    public WebElement twitterLink;

    @FindBy(xpath = "(//a[@role='link'])[3]")
    public WebElement twitterIcon;
    @FindBy(css = ".facebook.float-left")
    public WebElement facebookLink;

    @FindBy(id = "ssrb_top_nav_start")
    public WebElement facebookIcon;



}
