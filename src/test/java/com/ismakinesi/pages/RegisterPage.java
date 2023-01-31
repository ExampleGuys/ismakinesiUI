package com.ismakinesi.pages;

import com.ismakinesi.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends BasePage {

    public RegisterPage() {
        PageFactory.initElements(Driver.get(), this);
    }


    @FindBy(xpath = "(//*[contains(text(),'Üye Ol')])[2]")
    public WebElement UyeOlLinki;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement registerFullName;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement registerEmail;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement registerPassword;

    @FindBy(xpath = "//input[@name='phone']")
    public WebElement registerPhone;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement registerUyeOlButonu;

    @FindBy(xpath = "(//body/div/div/div/div/div/div)[5]")
    public WebElement telefonDogrulamaTexti;

}
