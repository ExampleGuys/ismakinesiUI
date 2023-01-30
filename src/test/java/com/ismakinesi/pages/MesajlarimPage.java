package com.ismakinesi.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MesajlarimPage extends BasePage{

    @FindBy(xpath = "//ul/li//*[text()='Mesajlarım']")
    public WebElement mesajlarimPage;

}
