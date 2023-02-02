package com.ismakinesi.stepDefinitions;

import com.ismakinesi.pages.DestekmerkeziPage;
import com.ismakinesi.utilities.BrowserUtilities;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SaticiyimStepDef {

    DestekmerkeziPage destekmerkeziPage = new DestekmerkeziPage();

   // @Given("Kullanici Yardim Merkezine Git buttonuna tiklar")
   // public void kullanici_yardim_merkezine_git_buttonuna_tiklar() {
     //   BrowserUtilities.scrollToElement(destekmerkeziPage.yardimMerkezi);
      //  BrowserUtilities.clickWithJS(destekmerkeziPage.yardimMerkezi);
       // BrowserUtilities.waitFor(5);

   // }

    @And("kullanici sayfadakı saticiyim buttonuna tıklar")
    public void kullaniciSayfadakıSaticiyimButtonunaTıklar() {
BrowserUtilities.scrollToElement(destekmerkeziPage.saticiyimBtn);
BrowserUtilities.hover(destekmerkeziPage.saticiyimBtn);

//BrowserUtilities.scrollToElement(destekmerkeziPage.yardimMerkezi);
       destekmerkeziPage.saticiyimBtn.click();
        BrowserUtilities.waitFor(3);

    }


    @Then("kullanici {string} yazısını gorur")
    public void kullaniciYazısınıGorur(String arg0) {

        Assert.assertTrue(destekmerkeziPage.saticiyimBtn.isDisplayed());
        BrowserUtilities.waitFor(3);


    }

    @Then("kullanici {string} tiklanabilir oldugunu dogrular")
    public void kullaniciTiklanabilirOldugunuDogrular(String arg0) {

        Assert.assertTrue(destekmerkeziPage.saticiyimBtn.isEnabled());
        BrowserUtilities.waitFor(3);
    }
    @And("kullanici saticiyim butonuna tiklar")
    public void kullaniciSaticiyimButonunaTiklar() {

        BrowserUtilities.hover(destekmerkeziPage.saticiyimBtn);
        destekmerkeziPage.saticiyimBtn.click();
    }

    @Then("kullanici Hemen al ve teklif sistemi nedir? tiklar gorur")
    public void kullaniciHemenAlVeTeklifSistemiNedirTiklarGorur() {
        BrowserUtilities.clickWithJS(destekmerkeziPage.hemenAl);
        Assert.assertTrue(destekmerkeziPage.hemenAlic.isDisplayed());

    }
}