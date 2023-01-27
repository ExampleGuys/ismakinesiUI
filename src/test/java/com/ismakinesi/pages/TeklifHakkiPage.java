package com.ismakinesi.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TeklifHakkiPage extends BasePage {

    @FindBy(xpath = "//a[contains(text(),'Teklif Haklarım')]")
    public WebElement teklifHaklarim;

}
