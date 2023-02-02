package com.ismakinesi.pages;

import com.ismakinesi.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DestekmerkeziPage extends BasePage{

    @FindBy(xpath = "(//a[@href='/help'])[1]")
    public WebElement yardimMerkezi;

     @FindBy(xpath = "//h3[text()='Alıcıyım']")
    public WebElement aliciyimBtn;

     @FindBy(css="a[href='/help/111/#71']")
    public WebElement satinAlma;

    @FindBy(xpath = "/html/body/div/div/div/div/div[2]/div[1]/div/a[2]/h3\n" )
    public WebElement saticiyimBtn;

    @FindBy(xpath = "//a[@href='/help/59/#72']\n" )
    public WebElement hemenAl;

    @FindBy(xpath = "//div[contains(@class, 'searchBox')]\n" )
    public WebElement hemenAlic;


    @FindBy(css = "a[href='/help/3']")
    public WebElement tumunuGor;

    @FindBy(xpath = "//a[contains(@href, '/help/58/#72')]\n")
    public WebElement teklifOnay;

    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div/div[2]/div[2]/div[2]/div/div[2]/div[3]/ul/li[2]/a")
    public WebElement teslimatBelgesi;


    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div/div[2]/div[2]/div[2]/div/div[2]/div[3]/ul/li[4]/a")
    public WebElement nakliyeGumruk;

    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div/div[2]/div[2]/div[2]/div/div[2]/div[3]/ul/li[5]/a")
    public WebElement tumunuGor2;

    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div/div[2]/div[2]/div[1]/div/div[2]/div[3]/ul/li[4]/a")
    public WebElement responsable;

    }

