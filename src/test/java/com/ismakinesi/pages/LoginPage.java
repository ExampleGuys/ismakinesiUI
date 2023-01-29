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













    @FindBy(css = ".instagram.float-left")
    public WebElement instagramLink;

    @FindBy(xpath = "(//button[@type='button'])[1]")
    public WebElement followButtonOnInstagramAccount;

















}
