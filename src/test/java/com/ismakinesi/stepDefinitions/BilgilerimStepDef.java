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

    @Then("Kullanici Kisisel Bilgilerim, Adreslerim, Firma Bilgilerim, Banka Bilgilerim, Sifre Degistir butonlarina tiklar")
    public void kullaniciKisiselBilgilerimAdreslerimFirmaBilgilerimBankaBilgilerimSifreDegistirButonlarinaTiklar() {
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

    @Then("Kullanici Adiniz, E-Postaniz, Telefon Numarasi metin kutularina tiklar karakter siler ve karakter girer")
    public void kullaniciAdinizEPostanizTelefonNumarasiMetinKutularinaTiklarKarakterSilerVeKarakterGirer() {
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

    @And("Kullanici Adreslerim butonuna tiklar")
    public void kullaniciAdreslerimButonunaTiklar() {
        bilgilerimPage.adreslerim.click();
    }

    @Then("Kullanici Adres Duzenle ve Yeni Adres butonlarina tiklar ve dogrular")
    public void kullaniciAdresDuzenleVeYeniAdresButonlarinaTiklarVeDogrular() {
        bilgilerimPage.adresDuzenle.click();
        BrowserUtilities.waitFor(3);
        Assert.assertTrue(bilgilerimPage.adresDuzenle.isDisplayed());
        System.out.println("bilgilerimPage.adresDuzenle.isDisplayed() = " + bilgilerimPage.adresDuzenle.isDisplayed());
        bilgilerimPage.kapat.click();
        BrowserUtilities.waitFor(3);

        bilgilerimPage.yeniAdres.click();
        BrowserUtilities.waitFor(3);
        Assert.assertTrue(bilgilerimPage.yeniAdres.isDisplayed());
        System.out.println("bilgilerimPage.yeniAdres.isDisplayed() = " + bilgilerimPage.yeniAdres.isDisplayed());
        bilgilerimPage.kapat.click();
        BrowserUtilities.waitFor(3);
    }

    @And("Kullanici Firma Bilgilerim butonuna tiklar")
    public void kullaniciFirmaBilgilerimButonunaTiklar() {
        bilgilerimPage.firmaBilgilerim.click();
    }

    @Then("Kullanici Firma Duzenle ve Yeni Firma butonlarina tiklar ve dogrular")
    public void kullaniciFirmaDuzenleVeYeniFirmaButonlarinaTiklarVeDogrular() {
        bilgilerimPage.adresDuzenle.click();
        BrowserUtilities.waitFor(3);
        Assert.assertTrue(bilgilerimPage.adresDuzenle.isDisplayed());
        System.out.println("bilgilerimPage.firmaDuzenle.isDisplayed() = " + bilgilerimPage.adresDuzenle.isDisplayed());
        bilgilerimPage.kapat.click();
        BrowserUtilities.waitFor(3);

        bilgilerimPage.yeniAdres.click();
        BrowserUtilities.waitFor(3);
        Assert.assertTrue(bilgilerimPage.yeniAdres.isDisplayed());
        System.out.println("bilgilerimPage.yeniFirma.isDisplayed() = " + bilgilerimPage.yeniAdres.isDisplayed());
        bilgilerimPage.kapat.click();
        BrowserUtilities.waitFor(3);
    }

    @And("Kullanici Banka Bilgilerim butonuna tiklar")
    public void kullaniciBankaBilgilerimButonunaTiklar() {
        bilgilerimPage.bankaBilgilerim.click();
    }

    @Then("Kullanici Yeni Banka Bilgisi Ekle butonuna tiklar ve dogrular")
    public void kullaniciYeniBankaBilgisiEkleButonunaTiklarVeDogrular() {
        bilgilerimPage.yeniAdres.click();
        BrowserUtilities.waitFor(3);
        Assert.assertTrue(bilgilerimPage.yeniAdres.isDisplayed());
        System.out.println("bilgilerimPage.yeniBankaBilgisi.isDisplayed() = " + bilgilerimPage.yeniAdres.isDisplayed());
        bilgilerimPage.kapat.click();
        BrowserUtilities.waitFor(3);
    }

    @And("Kullanici Sifre Degistir butonuna tiklar")
    public void kullaniciSifreDegistirButonunaTiklar() {
        bilgilerimPage.sifreDegistir.click();
        BrowserUtilities.waitFor(2);
    }

    @Then("Kullanici Eski Sifre, Yeni Sifre ve Yeni Sifre \\(Tekrar) adli metin kutularina tiklar ve karakter girer")
    public void kullaniciEskiSifreYeniSifreVeYeniSifreTekrarAdliMetinKutularinaTiklarVeKarakterGirer() {
        bilgilerimPage.eskiSifre.click();
        bilgilerimPage.eskiSifre.sendKeys("turkey0090");
        BrowserUtilities.waitFor(2);

        bilgilerimPage.yeniSifre.click();
        bilgilerimPage.yeniSifre.sendKeys("testturkey0090");
        BrowserUtilities.waitFor(2);

        bilgilerimPage.yeniSifreTekrar.click();
        bilgilerimPage.yeniSifreTekrar.sendKeys("testturkey0090");
        BrowserUtilities.waitFor(2);
    }

    @Then("Kullanici Sifremi Degistir butonunu tiklar ve dogrular")
    public void kullaniciSifremiDegistirButonunuTiklarVeDogrular() {
        bilgilerimPage.sifremiDegistir.click();
        BrowserUtilities.waitFor(3);
    }

    @Then("Kullanici E-mail Adresini Onayla butonuna tiklar")
    public void kullaniciEMailAdresiniOnaylaButonunaTiklar() {
        bilgilerimPage.eMailAdresiniOnayla.click();
        BrowserUtilities.waitFor(3);
    }

    @Then("Kullanici Adres Adi, Ulke Adi, Sehir Adi, İlce Adi Adres ve Telefon Numarasi metin kutularina tiklar ve karakter girer")
    public void kullaniciAdresAdiUlkeAdiSehirAdiİlceAdiAdresVeTelefonNumarasiMetinKutularinaTiklarVeKarakterGirer() {
        bilgilerimPage.adresDuzenle.click();
        BrowserUtilities.waitFor(3);

        bilgilerimPage.adresAdi.click();
        BrowserUtilities.cleanTextInBox(bilgilerimPage.adresAdi);
        bilgilerimPage.adresAdi.sendKeys("Miller Leffler");

        bilgilerimPage.adres.click();
        BrowserUtilities.cleanTextInBox(bilgilerimPage.adres);
        bilgilerimPage.adres.sendKeys("753 Loria Rest, Lake Lee, SD 79461");

        bilgilerimPage.telefonNumarasi.click();
        BrowserUtilities.cleanTextInBox(bilgilerimPage.telefonNumarasi);
        bilgilerimPage.telefonNumarasi.sendKeys("49 801 3897485747");
    }

    @Then("Kullanici Kalici Olarak Sil butonu gorunmeli ve tiklanmalidir")
    public void kullaniciKaliciOlarakSilButonuGorunmeliVeTiklanmalidir() {
        bilgilerimPage.adresDuzenle.click();
        BrowserUtilities.waitFor(2);

        bilgilerimPage.kaliciOlarakSil.click();
        BrowserUtilities.waitFor(2);
        bilgilerimPage.iptal.click();
        BrowserUtilities.waitFor(2);

        bilgilerimPage.kaydet.click();
        BrowserUtilities.waitFor(2);

        bilgilerimPage.adresDuzenle.click();
        BrowserUtilities.waitFor(2);

        bilgilerimPage.kapat.click();
        BrowserUtilities.waitFor(2);
    }

    @Then("Kullanici Firma Bilgilerini gorur")
    public void kullaniciFirmaBilgileriniGorur() {
        BrowserUtilities.waitFor(3);
        System.out.println("bilgilerimPage.firmaBilgisi.getText() = " + bilgilerimPage.firmaBilgisi.getText());
    }

    @Then("Kullanici Firma adi, Adres ve Telefon Numarasi metin kutularina tiklar")
    public void kullaniciFirmaAdiAdresVeTelefonNumarasiMetinKutularinaTiklar() {
        bilgilerimPage.adresDuzenle.click();
        BrowserUtilities.waitFor(3);

        bilgilerimPage.firmaAdi.click();
        BrowserUtilities.waitFor(3);
        BrowserUtilities.cleanTextInBox(bilgilerimPage.firmaAdi);
        bilgilerimPage.firmaAdi.sendKeys("Berk İnşaat A:Ş:");

        bilgilerimPage.adres.click();
        BrowserUtilities.waitFor(3);
        BrowserUtilities.cleanTextInBox(bilgilerimPage.adres);
        bilgilerimPage.adres.sendKeys("Yeni Doğan Mahallesi  , Sancaktar Sokak No:1/15 Erdem Apt. Kat:7");

        bilgilerimPage.telefonNumarasi.click();
        BrowserUtilities.waitFor(3);
        BrowserUtilities.cleanTextInBox(bilgilerimPage.telefonNumarasi);
        bilgilerimPage.adres.sendKeys("90 551 655 96 38");
    }

    @Then("Kullanici Kalici olarak sil, Kaydet ve Kapat butonlarina tiklar")
    public void kullaniciKaliciOlarakSilKaydetVeKapatButonlarinaTiklar() {
        bilgilerimPage.adresDuzenle.click();
        BrowserUtilities.waitFor(2);

        bilgilerimPage.kaliciOlarakSil.click();
        BrowserUtilities.waitFor(2);

        bilgilerimPage.iptal.click();
        BrowserUtilities.waitFor(2);

        bilgilerimPage.kaydet.click();
        BrowserUtilities.waitFor(2);

        bilgilerimPage.adresDuzenle.click();
        BrowserUtilities.waitFor(2);

        bilgilerimPage.kapat.click();
        BrowserUtilities.waitFor(2);
    }
}
