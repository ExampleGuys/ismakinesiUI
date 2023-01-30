package com.ismakinesi.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SattiklarimPage extends BasePage {

    //@FindBy(css="i[class='fal fa-ballot-check']")
    @FindBy(xpath = "//ul/li//*[text()='Sattıklarım']")
    public WebElement sattiklarimPage;

    @FindBy(xpath = "//ul/li//*[text()='Yayındaki İlanlar']")
    public WebElement yayindakiIlanlar;

    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div/div/ul/li[2]/a")
    public WebElement sattiklarim;


}
