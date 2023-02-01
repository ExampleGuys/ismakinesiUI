package com.ismakinesi.pages;

import com.ismakinesi.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Random;

public class ForkliftsPage extends BasePage {


    //@FindBy(xpath = "//div[contains(@style, 'cdf')]")
    @FindBy(xpath = "//a[contains(@href, 'forkliftler')]")
    public WebElement forklifts;

    @FindBy(xpath = "(//div[@class='item']//a)[6]")
    public WebElement linkCaterpillarAtacamaEur;

    @FindBy(xpath = "//button[contains(@class, 'btnStyle_3')]")
    public WebElement buttonTeklifVer;

    @FindBy(xpath = "//div[contains(@class, 'ant-modal-body')]//li[1]/span[2]")
    public WebElement highestBid;

    @FindBy(css = ".form-control")
    public WebElement inputTeklif;

    @FindBy(css = ".btnStyle_1")
    public WebElement buttonDevam;

    @FindBy(css = ".btnStyle_1.p-left")
    public WebElement buttonTeklifiGonder;


    /**
     * Ham teklif ücreti strin olarak alır @topParams kadar ekleme yapar ve string olarak @return eder.
     * @param highestBidParameter
     * @param topParams
     * @return
     */
    public String bidConverter(String highestBidParameter, int topParams) {
        //sondaki USD ifadesini siler
        highestBidParameter = highestBidParameter.replace(" USD", "");
        //sondaki EUR ifadesini siler
        highestBidParameter = highestBidParameter.replace(" EUR", "");
        //sayıları arasındaki virgülü siler
        highestBidParameter = highestBidParameter.replace(",", "");

        int newBid = stringToInteger(highestBidParameter,topParams);

        // Int ifadeyi stringe çevirir.
        String newBidString = String.valueOf(newBid);

        return newBidString;
    }

    /**
     * string bir ifadayi integer e çevirir ve @params kadar ekleme yaparak @return eder.
     * @param parameter
     * @param params
     * @return
     */
    public int stringToInteger(String parameter, int params) {
        int i = Integer.parseInt(parameter) + params;
        return i;
    }
}
