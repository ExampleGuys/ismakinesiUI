package com.ismakinesi.stepDefinitions;

import com.ismakinesi.pages.SearchBoxPage;
import com.ismakinesi.utilities.BrowserUtilities;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class SearchBoxStepDef {
    SearchBoxPage searchBoxPage = new SearchBoxPage();
    @When("ismakinesi.com'da ara butonuna tiklar")
    public void ismakinesi_com_da_ara_butonuna_tiklar() {
        BrowserUtilities.waitFor(5);
        BrowserUtilities.waitForClickability(searchBoxPage.searchBox,5);
    }

    @When("Aramak istenilen kelimeyi girer")
    public void aramak_istenilen_kelimeyi_girer() {
        searchBoxPage.searchBox.sendKeys("forklift"+ Keys.ENTER);
    }

    @Then("Aradigi kelimenin arandigini dogrular")
    public void aradigi_kelimenin_arandigini_dogrular() {
        searchBoxPage.forkliftTitle.isDisplayed();
    }


    @And("{string} girilir")
    public void girilir(String text) {
        searchBoxPage.searchBox.sendKeys(text,Keys.ENTER);
    }

    @Then("{string} bulundugunu dogrular")
    public void bulundugunuDogrular(String text) {
        Assert.assertEquals(searchBoxPage.forkliftTitle.getText(),text);

        Assert.assertEquals(searchBoxPage.kayitBulunamadi.getText(),"Kayıt bulunamadı");

        //negatif senaryo yazdim,yani bulamadigi kelimeler olumlu ve testi geciyor,
        // buldugu ve sayfanin acildigi sayfa da ! koyuyor.

    }
}