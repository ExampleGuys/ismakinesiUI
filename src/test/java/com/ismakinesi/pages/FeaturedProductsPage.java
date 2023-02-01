package com.ismakinesi.pages;

import com.ismakinesi.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FeaturedProductsPage extends BasePage {


    @FindBy(xpath = "//*[@class='BtnLogin']")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@type='email']")
    public WebElement emailButton;

    @FindBy(xpath = "//*[@type='password']")
    public WebElement passwordButton;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement submitGirisYapButton;

    @FindBy(xpath = "(//*[@class='wt-horizontal-center'])[1]")
    public WebElement forkliftlerButton;

    @FindBy(xpath = "(//*[@class='col-lg-4 col-xl-3 col-md-4 col-sm-4 col-6'])[1]")
    public WebElement enUstIlan;

    @FindBy(xpath = "(//*[@class='right'])[1]")
    public WebElement teklifVerButton;

    // @FindBy(xpath = "(//input[@type='text'])[2]")
    @FindBy(css = ".form-control")
    public WebElement teklifParaButton;


    @FindBy(xpath = "//*[@class='btnStyle_1']")
    public WebElement devamButton;

    @FindBy(xpath = "//*[@class='btnStyle_1 p-left']")
    public WebElement teklifiGonderButton;

    @FindBy(xpath = "//*[@class='productDetailRight notificationDetail notification-sales']")
    public WebElement teklifinizYapildiBox;

    @FindBy(xpath = "//*[@class='btnStyle_4']")
    public WebElement hemelAlBox;


    //    @FindBy(xpath = "//span[text()='En Yüksek Teklif']")
    @FindBy(xpath = "//div[contains(@class, 'ant-modal-body')]//li[1]/span[2]")
    public WebElement enYuksekTeklif;

    @FindBy(xpath = "(//span[@class='value'])[1]")
    public WebElement enYuksekTeklifDeger;

    @FindBy(xpath = "(//span[contains(text(),\"EUR\")])[8]")
    public WebElement enYuksekTeklifDegerContains;

    @FindBy(xpath = "(//span[contains(text(),\"EUR\") and @class='value'])[2]")
    public WebElement enYuksekTeklifDegerContainsAndClass;

    @FindBy(xpath = "(//span[@class='value'])[3]")
    public WebElement enYuksekTeklifBox;

    @FindBy(xpath = "(//*[@class='wt-horizontal-center'])[2]")
    public WebElement ekskavatorlerBox;

    @FindBy(xpath = "(//*[@class='wt-horizontal-center'])[3]")
    public WebElement kaziciYukleyiciBox;

    @FindBy(xpath = "(//*[@class='wt-horizontal-center'])[4]")
    public WebElement yukleyicilerBox;

    public static String bidConverter(String highestBidParameter, int topParams) {
        //sondaki USD ifadesini siler
        highestBidParameter = highestBidParameter.replace(" USD", "");
        //sondaki EUR ifadesini siler
        highestBidParameter = highestBidParameter.replace(" EUR", "");
        //sayıları arasındaki virgülü siler
        highestBidParameter = highestBidParameter.replace(",", "");

        int newBid = stringToInteger(highestBidParameter, topParams);

        // Int ifadeyi stringe çevirir.
        String newBidString = String.valueOf(newBid);

        return newBidString;
    }

    public static int stringToInteger(String parameter, int params) {
        int i = Integer.parseInt(parameter) + params;
        return i;
    }

}