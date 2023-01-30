package com.ismakinesi.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DestekmerkeziPage extends BasePage {

    @FindBy(xpath = "(//a[@href='/help'])[1]")
    public WebElement yardimMerkezi;

    @FindBy(xpath = "//h3[text()='Alıcıyım']")
    public WebElement aliciyimBtn;

    @FindBy(css = "a[href='/help/111/#71']")
    public WebElement satinAlma;

    @FindBy(css = "a[href='/help/3']")
    public WebElement tumunuGor;

}

