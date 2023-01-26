package com.ismakinesi.pages;

import com.ismakinesi.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{
    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath ="//h3[text()='Üye Girişi']")
    public WebElement uyeGirisi;

}
