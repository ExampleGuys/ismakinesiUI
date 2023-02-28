package com.ismakinesi.stepDefinitions;

import com.beust.ah.A;
import com.ismakinesi.pages.FooterPage;
import com.ismakinesi.utilities.BrowserUtilities;
import com.ismakinesi.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HakkimizdaStepDef {

    FooterPage footerPage = new FooterPage();
    Random random=new Random();



    @When("Kullanici hakkimizda yazisinin oldugu gorulur")
    public void kullanici_hakkimizda_yazisinin_oldugu_gorulur() {
        //js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        //footerPage.ismakinesicomHakkindaButton.isEnabled();
        // Assert.assertTrue(footerPage.HakkimizdaText.isDisplayed());
        BrowserUtilities.scrollToElement(footerPage.ismakinesicomHakkindaButton);
        BrowserUtilities.waitFor(3);
        // Assert.assertTrue(footerPage.HakkimizdaText.isDisplayed());

    }


    @When("Kullanici ismakinesi.com Hakkinda yazisina tiklar")
    public void kullanici_ismakinesi_com_hakkinda_yazisina_tiklar() {
        //footerPage.ismakinesicomHakkindaButton.click();
        BrowserUtilities.clickWithJS(footerPage.ismakinesicomHakkindaButton);

    }

    @Then("Kullanici acilan sayfada hakkimizda kisminin oldugunu dogrular")
    public void kullanici_acilan_sayfada_hakkimizda_kisminin_oldugunu_dogrular() throws InterruptedException {
        BrowserUtilities.waitFor(3);
        Assert.assertTrue(footerPage.HakkimizdaicYazitext.isDisplayed());

    }


    @And("Kullanici Kariyer butonuna tiklar")
    public void kullaniciKariyerButonunaTiklar() {
        //footerPage.KariyerButton.click();
        BrowserUtilities.clickWithJS(footerPage.KariyerButton);

    }

    @Then("{string} sayfasina gittigi dogrulanir")
    public void sayfasinaGittigiDogrulanir(String arg0) {
        List<String> windowList = new ArrayList<String>(Driver.get().getWindowHandles());
        Driver.get().switchTo().window(windowList.get(1));
        Assert.assertTrue(Driver.get().getCurrentUrl().contains(arg0));


    }

    @When("Kullanici Kullanici sozlesmesi butonuna tiklar")
    public void kullanici_kullanici_sozlesmesi_butonuna_tiklar() {
        BrowserUtilities.clickWithJS(footerPage.KullaniciSozlesmesiButton);

    }

    @Then("Acilan sayfada Mesafeli Satis Sozlesmesi oldugu dogrulanmali")
    public void acilan_sayfada_mesafeli_satis_sozlesmesi_oldugu_dogrulanmali() {
        {
            Assert.assertTrue(footerPage.MesafeliSatsozlesmesiText.isDisplayed());

        }
    }

    @And("Kullanici Gizlilik Merkezi butonuna tiklar")
    public void kullaniciGizlilikMerkeziButonunaTiklar() {
        BrowserUtilities.clickWithJS(footerPage.GizlilikMerkeziButton);

    }



    @And("Kullanici Teklif sistemi butonuna tiklar")
    public void kullaniciTeklifSistemiButonunaTiklar() {
    BrowserUtilities.clickWithJS(footerPage.TeklifSistemiButton);
    BrowserUtilities.waitFor(2);

    }



    @Then("acilan sayfada Teklif Hakki Planlari  sayfasinin oldugu dogrulanir")
    public void acilanSayfadaTeklifHakkiPlanlariSayfasininOlduguDogrulanir() {
        Assert.assertTrue(footerPage.TeklifSistemidegistir.isDisplayed());


    }

    @And("Kullanici Sinirli Servis Garantisi butonuna tiklar")
    public void kullaniciSinirliServisGarantisiButonunaTiklar() {
        BrowserUtilities.clickWithJS(footerPage.SinirliServisGarantisiButton);
    }

    @Then("acilan sayfada Sinirli Servis Garantili is ve tarim makinelerini ismakinesi.com dan satin alin sayfasinin oldugu dogrulanir")
    public void acilanSayfadaSinirliServisGarantiliIsVeTarimMakineleriniIsmakinesiComDanSatinAlinSayfasininOlduguDogrulanir() {
        Assert.assertTrue(footerPage.SiniliservisIckisim.isDisplayed());
        BrowserUtilities.waitFor(2);
    }

    @And("Kullanici Nasil Satarim butonuna tiklar")
    public void kullaniciNasilSatarimButonunaTiklar() {
        BrowserUtilities.clickWithJS(footerPage.NasilSatarimButton);
        BrowserUtilities.waitFor(2);
    }

    @Then("acilan sayfada Nasil Satarim  sayfasinin oldugu dogrulanir")
    public void acilanSayfadaNasilSatarimSayfasininOlduguDogrulanir() {
        Assert.assertTrue(footerPage.NasilsatarimIckisime.isDisplayed());


    }

    @And("Kullanici Nasil Alirim butonuna tiklar")
    public void kullaniciNasilAlirimButonunaTiklar() {
        BrowserUtilities.clickWithJS(footerPage.NasilAlirim);
        BrowserUtilities.waitFor(2);

    }

    @Then("acilan sayfada Nasil Alirim sayfasinin oldugu dogrulanir")
    public void acilanSayfadaNasilAlirimSayfasininOlduguDogrulanir() {
        Assert.assertTrue(footerPage.NasilalirimIckisime.isDisplayed());
        BrowserUtilities.waitFor(2);

    }

    @And("Kullanici Sik sorulan sorular butonuna tiklar")
    public void kullaniciSikSorulanSorularButonunaTiklar() {
        BrowserUtilities.clickWithJS(footerPage.SikSorulanSorularButton);

    }

    @Then("acilan sayfada Cozum Merkezi sayfasinin oldugu dogrulanir")
    public void acilanSayfadaCozumMerkeziSayfasininOlduguDogrulanir() {
        Assert.assertTrue(footerPage.SikSorulansorularIcKisim.isDisplayed());
        BrowserUtilities.waitFor(2);
    }

    @And("Kullanici Destek merkezi butonuna tiklar")
    public void kullaniciDestekMerkeziButonunaTiklar() {
        BrowserUtilities.clickWithJS(footerPage.DestekMerkeziButton);

    }

    @Then("acilan sayfada Destek merkezi sayfasinin oldugu dogrulanir")
    public void acilanSayfadaDestekMerkeziSayfasininOlduguDogrulanir() {
        Assert.assertTrue(footerPage.DestekMerkeziIc.isDisplayed());
    }

    @And("Kullanici Bize Ulasin butonuna tiklar")
    public void kullaniciBizeUlasinButonunaTiklar() {
        BrowserUtilities.clickWithJS(footerPage.BizeUlasinButton);
        BrowserUtilities.waitFor(2);
    }

    @And("acilan sayfada Adiniz Soyadiniz kismi doldurulur")
    public void acilanSayfadaAdinizSoyadinizKismiDoldurulur() {
        footerPage.AdinizSoyadiniz.sendKeys("Muhammed Dagli");
        BrowserUtilities.waitFor(2);
        
    }

    @And("acilan sayfada E-Mail kismi doldurulur")
    public void acilanSayfadaEMailKismiDoldurulur() {
        footerPage.Email.sendKeys("muhammeddagli@gmail.com");
        BrowserUtilities.waitFor(2);
    }

    @And("acilan sayfada Telefon numaraniz kismi doldurulur")
    public void acilanSayfadaTelefonNumaranizKismiDoldurulur() {
        footerPage.TelNumber.sendKeys("05446303982");
        BrowserUtilities.waitFor(2);
    }

    @And("acilan sayfada Firma adi kismi doldurulur")
    public void acilanSayfadaFirmaAdiKismiDoldurulur() {
        footerPage.Company.sendKeys("test techno");
        BrowserUtilities.waitFor(2);
    }

    @And("acilan sayfada Ulke kismi doldurulur")
    public void acilanSayfadaUlkeKismiDoldurulur() {
        footerPage.Country.sendKeys("turkey");
        BrowserUtilities.waitFor(2);
    }

    @And("acilan sayfada Mesajiniz kismi doldurulur")
    public void acilanSayfadaMesajinizKismiDoldurulur() {
        footerPage.Message.sendKeys("test test test");
        BrowserUtilities.waitFor(2);

    }

    @Then("Gonder butonuna tiklanir")
    public void gonderButonunaTiklanir() {
        BrowserUtilities.clickWithJS(footerPage.Gonder);
        BrowserUtilities.waitFor(2);


    }

    @Then("acilan sayfada Gizlilik Sozlesmesi oldugu dogrulanir")
    public void acilanSayfadaGizlilikSozlesmesiOlduguDogrulanir() {
        Assert.assertTrue(footerPage.GizlilikZleMesiickisim.isDisplayed());

    }

    @When("Kullanici Son Ilanlar bolmesindeki bir ilana tiklar")
    public void kullaniciSonIlanlarBolmesindekiBirIlanaTiklar() {
        BrowserUtilities.clickWithJS(footerPage.ilan);
        BrowserUtilities.waitFor(2);
    }

    @And("Kullanici Teklif Ver butonuna tiklar")
    public void kullaniciTeklifVerButonunaTiklar() {
        BrowserUtilities.switchToWindow("2018 Caterpillar 930M");
        footerPage.teklifVer.click();
        BrowserUtilities.waitFor(2);
    }

    @Then("Giris Yap sayfasi acilir")
    public void girisYapSayfasiAcilir() {
        Assert.assertEquals("Giriş Yap", footerPage.oturumAc.getText());
        BrowserUtilities.waitFor(2);
    }
}

