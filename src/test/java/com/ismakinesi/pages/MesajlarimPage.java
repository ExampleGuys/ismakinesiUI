package com.ismakinesi.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MesajlarimPage extends BasePage {

    @FindBy(xpath = "//ul/li//*[text()='Mesajlarım']")
    public WebElement mesajlarim;

    @FindBy(xpath = "//ul/li//*[text()='Mesajlar']")
    public WebElement mesajlar;

    @FindBy(xpath = "//ul/li//*[text()='Bildirimler']")
    public WebElement bildirimler;

    @FindBy(xpath = "//h1[contains(text(),'Mesajlarım')]")
    public WebElement mesajlarimBasligi;
}
