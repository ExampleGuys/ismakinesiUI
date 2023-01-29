package com.ismakinesi.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SattiklarimPage extends BasePage{

    //@FindBy(css="i[class='fal fa-ballot-check']")
    @FindBy(xpath="//ul/li//*[text()='Sattıklarım']")
    public WebElement sattiklarim;

}
