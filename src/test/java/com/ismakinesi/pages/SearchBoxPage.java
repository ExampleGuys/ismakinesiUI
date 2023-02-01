package com.ismakinesi.pages;

import com.ismakinesi.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchBoxPage extends BasePage{


    @FindBy(xpath = "//*[@class='Search__input']")
    public WebElement searchBox;

    @FindBy(xpath = "(//*[@class='col-lg-6 title'])[1]")
    public WebElement forkliftTitle;

    @FindBy(xpath = "//div[@class='no_record']")
    public WebElement kayitBulunamadi;



}