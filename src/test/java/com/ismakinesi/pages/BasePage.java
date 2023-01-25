package com.ismakinesi.pages;

import com.ismakinesi.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {


    @FindBy(css = "#btn-login>.BtnLogin")
    public WebElement loginOrBeMemberButton;




    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

}
