package com.ismakinesi.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AdvertisementPage {
    // "Ucretsiz ilan ver" butonu
    @FindBy(xpath = "//span[contains(text(),'Ücretsiz İlan Ver')]")
    public WebElement freeAdvertButton;

    // "Arac Seri No" metin kutusu
    //@FindBy(xpath = "//div[@class='ant-row ant-form-item'][1]")
    @FindBy(id = "coordinated_serial_number")
    //@FindBy(css = "#coordinated_serial_number")
    public WebElement serialNumberTextBox;

    // "Kategori Secin" butonu
    @FindBy(xpath = "//div[@class='ant-row ant-form-item'][2]")
    public WebElement selectCategoryButton;

    // "Marka Secin" butonu
    @FindBy(xpath = "//div[@class='ant-row ant-form-item'][3]")
    public WebElement selectBrandButton;

    // "Model Secin" butonu
    @FindBy(xpath = "//div[@class='ant-row ant-form-item'][4]")
    public WebElement selectModelButton;

    // "Calisma Saatleri" metin kutusu
    @FindBy(xpath = "//div[@class='ant-row ant-form-item'][5]")
    public WebElement workingHoursTextButton;

    // "Yili Secin" butonu
    @FindBy(xpath = "//div[@class='ant-row ant-form-item'][6]")
    public WebElement selectYearButton;

    // "Durumu" butonu
    @FindBy(xpath = "//div[@class='ant-row ant-form-item'][7]")
    public WebElement statusButton;

    // "Servis Garantisi" Butonu
    @FindBy(xpath = "//div[@class='ant-row ant-form-item'][8]")
    public WebElement serviceWarrantyButton;

    // "Aciklama" metin kutusu
    @FindBy(xpath = "//div[@class='ant-row ant-form-item'][9]")
    public WebElement descriptionTextButton;

    // "Fotograf Ekle" Butonu
    @FindBy(className = "photoData")
    public WebElement addPhotoButton;

    // "Hemen Satin Al" check box
    @FindBy(xpath = "//div[@class='ant-row ant-form-item'][10]")
    public WebElement buyNowPriceCheckBox;

    // "Hemen Satin Al" metin kutusu
    @FindBy(xpath = "//div[@class='ant-row ant-form-item'][11]")
    public WebElement buyNowPriceTextBox;

    // "Hemen Satin Al" para birimi butonu
    @FindBy(xpath = "//div[@class='ant-row ant-form-item'][12]")
    public WebElement buyNowPriceCurrencyButton;

    // "Minimum Teklif Fiyati" check box
    @FindBy(xpath = "//div[@class='ant-row ant-form-item'][13]")
    public WebElement minOfferPriceCheckBox;

    // "Minimum Teklif Fiyati" metin kutusu
    @FindBy(xpath = "//div[@class='ant-row ant-form-item'][14]")
    public WebElement minOfferPriceTexBox;

    // "Minimum Teklif Fiyati" para birimi butonu
    @FindBy(xpath = "//div[@class='ant-row ant-form-item'][15]")
    public WebElement minOfferPriceCurrencyButton;

    // "Adres" check box
    @FindBy(xpath = "//div[@class='ant-row ant-form-item'][16]")
    public WebElement addressBox;

    // "Onaya Gonder" butonu
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement sendForApprovalButton;

    // Uyari mesaji
    @FindBy(xpath = "//span[contains(text(),'Lütfen zorunlu alanları kontrol edin.')]")
    public WebElement warningMessageText;

    // yeni ilan geri tusu butonu
    @FindBy(xpath = "//i[@xpath='1']")
    public WebElement newAdBackspaceButton;

    // "support@machinerymarket.com" linki
    @FindBy(xpath = "//a[contains(text(),'.com')]")
    public WebElement SupportMachineryMarketMailLink;

    // kayitli herhangi bir adres (list)
    @FindBy(xpath = "//span[@class='click']")
    public List<WebElement> randomUserAddress;

    // kayitli herhangi kategory (list)
    @FindBy(xpath = "//*/ul/li/span")
    public List<WebElement>  randomSelectCategory;

    // kayitli herhangi marka (list)
    @FindBy(xpath = "")
    public List<WebElement>  randomSelectBrand;

    // kayitli herhangi model (list)
    @FindBy(xpath = "")
    public List<WebElement>  randomSelectModel;








}
