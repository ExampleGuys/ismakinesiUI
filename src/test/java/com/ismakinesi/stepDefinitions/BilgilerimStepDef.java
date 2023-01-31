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

    @Then("Kullanici Adiniz, E-Postaniz, Telefon Numarasi metin kutularına tiklar karakter siler ve karakter girer")
    public void kullaniciAdinizEPostanizTelefonNumarasiMetinKutularınaTiklarKarakterSilerVeKarakterGirer() {
        bilgilerimPage.adiniz.click();
        BrowserUtilities.cleanTextInBox(bilgilerimPage.adiniz);
        bilgilerimPage.adiniz.sendKeys("softwareengineer");
        BrowserUtilities.waitFor(2);

        bilgilerimPage.ePosta.click();
        BrowserUtilities.cleanTextInBox(bilgilerimPage.ePosta);
        bilgilerimPage.ePosta.sendKeys("softwareengineer0090@gmail.com");
        BrowserUtilities.waitFor(2);

        bilgilerimPage.telefonNumarasi.click();
        BrowserUtilities.cleanTextInBox(bilgilerimPage.telefonNumarasi);
        bilgilerimPage.telefonNumarasi.sendKeys("552 660 69 22");
        BrowserUtilities.waitFor(2);
    }
}
