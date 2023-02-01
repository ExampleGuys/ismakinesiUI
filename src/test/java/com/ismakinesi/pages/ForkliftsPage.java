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

    public WebElement setLinkVehicle() {
        Random rn = new Random();
        int number = rn.nextInt(12) + 4;
        String xpath = "(//div[@class='item']//a)[" + number + "]";
        //BrowserUtilities.scrollToElement((WebElement) By.xpath(xpath));
        return Driver.get().findElement(By.xpath(xpath));
    }

    public String bidConverter(String highestBidParameter) {

        highestBidParameter = highestBidParameter.replace(" USD", "");
        highestBidParameter = highestBidParameter.replace(" EUR", "");
        highestBidParameter = highestBidParameter.replace(",", "");
        System.out.println("highestBidParameter = " + highestBidParameter);
        int newBid = stringToInteger(highestBidParameter);
        String newBidString = String.valueOf(newBid);

        return newBidString;
    }

    public int stringToInteger(String parameter) {
        int i = Integer.parseInt(parameter) + 100;
        return i;
    }
}
