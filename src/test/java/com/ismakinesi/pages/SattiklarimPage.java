package com.ismakinesi.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SattiklarimPage extends BasePage {

    @FindBy(xpath = "//ul/li//*[text()='Sattıklarım']")
    public WebElement sattiklarimPage;

    @FindBy(xpath = "//ul/li//*[text()='Yayındaki İlanlar']")
    public WebElement yayindakiIlanlar;

    @FindBy(xpath = "//*[@id=\"__layout\"]//li/a[text()='Sattıklarım']")
    public WebElement sattiklarim;


}
