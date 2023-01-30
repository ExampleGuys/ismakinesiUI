package com.ismakinesi.stepDefinitions;

import com.ismakinesi.pages.BilgilerimPage;
import com.ismakinesi.pages.MesajlarimPage;
import com.ismakinesi.utilities.BrowserUtilities;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class BilgilerimStepDef {

    BilgilerimPage bilgilerimPage = new BilgilerimPage();

    @And("Kullanici Bilgilerim butonuna tiklar")
    public void kullaniciBilgilerimButonuaTiklar() {
        BrowserUtilities.hover(bilgilerimPage.bilgilerim);
        BrowserUtilities.doubleClick(bilgilerimPage.bilgilerim);
        BrowserUtilities.waitFor(5);
    }


    @Then("Kullanici Bilgilerim butonuna tiklandigini dogrular")
    public void kullaniciBilgilerimButonunaTiklandiginiDogrular() {
        Assert.assertEquals("Bilgilerim", bilgilerimPage.bilgilerimBasligi.getText());
        System.out.println(bilgilerimPage.bilgilerimBasligi.getText());
    }

    @Then("Kullanici Mesajlar ve Bildirimler butonlarina tiklar")
    public void kullaniciMesajlarVeBildirimlerButonlarinaTiklar() {

    }

    @Then("Kullanici Kullanıcı Kişisel Bilgilerim, Adreslerim, Firma Bilgilerim, Banka Bilgilerim, Şifre Değiştir butonlarına tıklar")
    public void kullaniciKullanıcıKişiselBilgilerimAdreslerimFirmaBilgilerimBankaBilgilerimŞifreDeğiştirButonlarınaTıklar() {
        bilgilerimPage.kisiselBilgilerim.click();
        BrowserUtilities.waitFor(3);
        bilgilerimPage.adreslerim.click();
        BrowserUtilities.waitFor(3);
        bilgilerimPage.firmaBilgilerim.click();
        BrowserUtilities.waitFor(3);
        bilgilerimPage.bankaBilgilerim.click();
        BrowserUtilities.waitFor(3);
        bilgilerimPage.sifreDegistir.click();
        BrowserUtilities.waitFor(3);
    }
}
