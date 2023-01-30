package com.ismakinesi.pages;

import com.ismakinesi.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.get(), this);
    }
//***Locate başlama ****Engin Akgül tarafından hazırlanan "Tüm Filtreler ve Ana Sayfa" Locate leridir.

    //****Tüm Filitreler***
    @FindBy(xpath = "//div[contains(@style, 'fd')]")
    public WebElement forklift;

    @FindBy(xpath = "//*[text()='Ekskavatörler']")
    public WebElement ekskavatorler;

    @FindBy(xpath = "//button[contains(@class, 'bottom')]")
    public WebElement allFilters;

    @FindBy(xpath = "//a[@class=\"logo tr mobile-none nuxt-link-exact-active nuxt-link-active\"]/img[@class=\"main-header-logo tr\"]")
    public WebElement logo;

    @FindBy(xpath = "//h3[.='Kategori']")
    public WebElement category;

    @FindBy(xpath = "//*[@id='content']/div/div[1]/input")
    public WebElement searchInput;

    @FindBy(xpath = "//*[text()='Dizel Forklift']")
    public WebElement radioDizelforklift;

    @FindBy(xpath = "//label[contains(text(),'Lastik Tekerlekli Ekskavatör')]")
    public WebElement radioLastikTekerEkskavator;

    @FindBy(xpath = "//*[text()='Caterpillar']")
    public WebElement radioCaterpillarMarka;
    @FindBy(xpath = "//*[text()='Case']")
    public WebElement radioCase;

    @FindBy(xpath = "//*[text()='Volvo']")
    public WebElement radioVolvoMarka;
    @FindBy(xpath = "//*[text()='New Holland']")
    public WebElement radioNewHollnand;


    @FindBy(xpath = "//span[contains(text(),'6 Aylık')]")
    public WebElement radioServicSelect;

    @FindBy(xpath = "(//input[@placeholder=\"Min.\"])[1]")
    public WebElement minYearOf;

    @FindBy(xpath = "(//input[@placeholder=\"Max.\"])[1]")
    public WebElement maxYearOf;

    @FindBy(xpath = "(//input[@placeholder=\"Min.\"])[2]")
    public WebElement minWorkingHour;

    @FindBy(xpath = "(//input[@placeholder=\"Max.\"])[2]")
    public WebElement maxWorkingHour;

    @FindBy(xpath = "(//input[@placeholder=\"Min.\"])[3]")
    public WebElement minPrice;

    @FindBy(xpath = "(//input[@placeholder=\"Max.\"])[3]")
    public WebElement maxPrice;


    @FindBy(xpath = "//h3[.='Marka']")
    public WebElement brand;

    @FindBy(xpath = "//h3[.='Sınırlı Servis Garantisi']")
    public WebElement limitedService;

    @FindBy(xpath = "//h3[.='Üretim Yılı']")
    public WebElement yearOfProduction;

    @FindBy(xpath = "//h3[.='Çalışma Saati']")
    public WebElement studyTime;

    @FindBy(xpath = "//h3[.='Fiyat']")
    public WebElement price;

    //***Ana Sayfa Locate***///
    @FindBy(xpath = "//a[contains(text(),'Son ilanlar')]")
    public WebElement endListings;


    @FindBy(xpath = "//a[contains(text(),'Son görüntülenenler')]")
    public WebElement endViewed;

    @FindBy(xpath = "//label[contains(text(),'Paletli Ekskavatör')]")
    public WebElement crawlerExcavator;

    //Paletli Yükleyici
    @FindBy(css = "input[value='41']")
    public WebElement trackLoader;

    //tek boşa tıklama için
    @FindBy(xpath = "//div[@class=\"ant-drawer-mask\"]")
    public WebElement bosaTikla;

    @FindBy(xpath = "//a[contains(text(),'Lastik Tekerlekli Yükleyici')]")
    public WebElement wheelLoader;

    @FindBy(xpath = "//a[contains(text(),'Akülü Forklift')]")
    public WebElement batteryForklift;

    @FindBy(xpath = "//div[contains(@style, 'da')]")
    public WebElement backhoeLoader;

    //yükleyici
    @FindBy(xpath = "//div[contains(@style, 'bf')]")
    public WebElement loader;

    @FindBy(xpath = "//button[@aria-label='Close']")
    public  WebElement filterClose;
    @FindBy(xpath = "//a[contains(text(),'Mini Ekskavatör (<12t)')]")
    public WebElement miniExcavator;


//***Locate bitiş ****Engin Akgül tarafından hazırlanan "Tüm Filtreler ve Ana Sayfa Locate leridir.


}
