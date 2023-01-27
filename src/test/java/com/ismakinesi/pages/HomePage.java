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
    @FindBy(xpath = "//div[contains(@style, 'eda')]")
    public WebElement forklift;

    @FindBy(xpath = "//button[contains(@class, 'bottom')]")
    public WebElement allFilters;

    @FindBy(xpath = "//h3[.='Kategori']")
    public WebElement category;

    @FindBy(xpath = "//*[@id='content']/div/div[1]/input")
    public WebElement searchİnput;

    @FindBy(xpath = "//*[text()='Dizel Forklift']")
    public WebElement radioDizelforklift;

    @FindBy(xpath = "//*[text()='Cesab']")
    public WebElement radioCesabmarka;

    @FindBy(xpath = "//span[contains(text(),'6 Aylık')]")
    public WebElement radioServicselect;

    @FindBy(xpath = "//input[@fdprocessedid='67uoj']")
    public WebElement minYearof;

    @FindBy(xpath = "//input[@fdprocessedid='79rmwj']")
    public WebElement maxYearof;

    @FindBy(xpath = "//input[@fdprocessedid='2l5zxm']")
    public WebElement minWorkinghour;

    @FindBy(xpath = "//input[@fdprocessedid='glkf1e']")
    public WebElement maxWorkinghour;

    @FindBy(xpath = "//input[@fdprocessedid='juheoo']")
    public WebElement minPrice;

    @FindBy(xpath = "//input[@fdprocessedid='m0qkvb']")
    public WebElement maxPrice;


    @FindBy(xpath = "//h3[.='Marka'']")
    public WebElement brand;

    @FindBy(xpath = "//h3[.='Sınırlı Servis Garantisi']")
    public WebElement limitedService;

    @FindBy(xpath = "//h3[.='Üretim Yılı']")
    public WebElement yearOfproduction;

    @FindBy(xpath = "//h3[.='Çalışma Saati']")
    public WebElement studyTime;

    @FindBy(xpath = "//h3[.='Fiyat']")
    public WebElement price;

    //***Ana Sayfa Locate***///
    @FindBy(xpath = "//a[contains(text(),'Son ilanlar')]")
    public WebElement endListings;


    @FindBy(xpath = "//a[contains(text(),'Son görüntülenenler')]")
    public WebElement endViewed;

    @FindBy(xpath = "//a[contains(text(),'Paletli Ekskavatör')]")
    public WebElement crawlerExcavator;


    @FindBy(xpath = "//a[contains(text(),'Lastik Tekerlekli Yükleyici')]")
    public WebElement wheelLoader;

    @FindBy(xpath = "//a[contains(text(),'Akülü Forklift')]")
    public WebElement batteryForklift;

    @FindBy(xpath = "//a[contains(text(),'Kazıcı Yükleyici')]")
    public WebElement backhoeLoader;

    @FindBy(xpath = "//a[contains(text(),'Mini Ekskavatör (<12t)')]")
    public WebElement miniExcavator;


//***Locate bitiş ****Engin Akgül tarafından hazırlanan "Tüm Filtreler ve Ana Sayfa Locate leridir.


}
