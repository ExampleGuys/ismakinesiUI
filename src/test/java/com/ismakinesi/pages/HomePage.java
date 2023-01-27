package com.ismakinesi.pages;

import com.ismakinesi.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.get(),this);
    }
//***Locate başlama ****Engin Akgül tarafından hazırlanan "Tüm Filtreler ve Ana Sayfa Locate leridir.
    //****Tüm Filitreler***

    @FindBy(xpath = "//div[@class='filter']")
    public WebElement All_filters;

    @FindBy(xpath = "//h3[.='Kategori']")
    public WebElement Category;


    @FindBy(xpath = "//*[@id='content']/div/div[1]/input")
    public WebElement Search_input;

    @FindBy(xpath = "//h3[.='Marka'']")
    public WebElement brand;

    @FindBy(xpath = "//h3[.='Sınırlı Servis Garantisi']")
    public WebElement Limited_Service;

    @FindBy(xpath = "//h3[.='Üretim Yılı']")
    public WebElement year_Of_Production ;

    @FindBy(xpath = "//h3[.='Çalışma Saati']")
    public WebElement study_time;

    @FindBy(xpath = "//h3[.='Fiyat']")
    public WebElement price;

    @FindBy(xpath = "//a[contains(text(),'Son ilanlar')]")
    public WebElement end_listings;


    @FindBy(xpath = "//a[contains(text(),'Son görüntülenenler')]")
    public WebElement end_viewed;

    @FindBy(xpath = "//a[contains(text(),'Paletli Ekskavatör')]")
    public WebElement Crawler_Excavator;


    @FindBy(xpath = "//a[contains(text(),'Lastik Tekerlekli Yükleyici')]")
    public WebElement Wheel_Loader;

    @FindBy(xpath = "//a[contains(text(),'Akülü Forklift')]")
    public WebElement Battery_Forklift;

    @FindBy(xpath = "//a[contains(text(),'Kazıcı Yükleyici')]")
    public WebElement Backhoe_Loader;

    @FindBy(xpath = "//a[contains(text(),'Mini Ekskavatör (<12t)')]")
    public WebElement Mini_Excavator;



    @FindBy(xpath = "//*[text()='Dizel Forklift']")
    public WebElement Radio_Dizel_Forklift;

    @FindBy(xpath = "//*[text()='Cesab']")
    public WebElement Radio_Cesab_Marka;

    @FindBy(xpath = "//span[contains(text(),'6 Aylık')]")
    public WebElement Radio_servic_Select;

    @FindBy(xpath = "//input[@fdprocessedid='67uoj']")
    public WebElement Min_year_of;

    @FindBy(xpath = "//input[@fdprocessedid='79rmwj']")
    public WebElement Max_year_of;

    @FindBy(xpath = "//input[@fdprocessedid='2l5zxm']")
    public WebElement min_working_hour;

    @FindBy(xpath = "//input[@fdprocessedid='glkf1e']")
    public WebElement max_working_hour;

    @FindBy(xpath = "//input[@fdprocessedid='juheoo']")
    public WebElement min_price;

    @FindBy(xpath = "//input[@fdprocessedid='m0qkvb']")
    public WebElement max_price;


//***Locate bitiş ****Engin Akgül tarafından hazırlanan "Tüm Filtreler ve Ana Sayfa Locate leridir.


}
