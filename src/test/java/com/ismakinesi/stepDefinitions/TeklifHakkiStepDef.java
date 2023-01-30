package com.ismakinesi.stepDefinitions;

import com.ismakinesi.pages.TeklifHakkiPage;
import com.ismakinesi.utilities.BrowserUtilities;
import com.ismakinesi.utilities.ConfigurationReader;
import com.ismakinesi.utilities.Driver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class TeklifHakkiStepDef {
    Actions actions = new Actions(Driver.get());
    TeklifHakkiPage teklifHakkiPage = new TeklifHakkiPage();

    @When("kullanici bu sayfadaki Teklif Haklarim'a tiklar")
    public void kullaniciBuSayfadakiTeklifHaklarimATiklar() {
        BrowserUtilities.doubleClick(teklifHakkiPage.teklifHaklarim);
    }

    @Then("kullanici  Aktif, Suresi Bitenler, Teklif Hakki Satin Al basliklarini gorur")
    public void kullaniciAktifSuresiBitenlerTeklifHakkiSatinAlBasliklariniGorur(DataTable dataTable) {
        List<String> labels = dataTable.column(0);
        for (String label : labels) {
            WebElement element = Driver.get().findElement(By.xpath("//a[contains(text(),'" + label + "')]"));

            Assert.assertTrue(element.isDisplayed());
        }

    }


    @When("kullanici Aktif buttonuna tiklar")
    public void kullanici_aktif_buttonuna_tiklar() {
        BrowserUtilities.doubleClick(teklifHakkiPage.aktifBtn);
        BrowserUtilities.waitFor(3);
    }

    @Then("kullanici  kullanilabilir durumdaki teklif haklarini gorur")
    public void kullanici_kullanilabilir_durumdaki_teklif_haklarini_gorur() {
        Assert.assertEquals("Kullanılabilir", teklifHakkiPage.kullanTek.getText());

    }

    @And("kullanici Suresi bitenler'e tiklar")
    public void kullaniciSuresiBitenlerETiklar() {
        BrowserUtilities.doubleClick(teklifHakkiPage.suresiBitenler);
        BrowserUtilities.waitFor(3);


    }

    @Then("kullanici  suresi biten teklif haklarini gorur")
    public void kullaniciSuresiBitenTeklifHaklariniGorur() {
        Assert.assertEquals("Ödemede Kullanıldı", teklifHakkiPage.odemedeKullanildi.getText());

    }

    @And("kullanici Teklif Hakki Al'a tiklar")
    public void kullaniciTeklifHakkiAlATiklar() {
        BrowserUtilities.clickWithJS(teklifHakkiPage.teklifHakkiAl);
        BrowserUtilities.waitFor(3);


    }

    @Then("Teklif Hakki sayfasi acilir")
    public void teklifPanlariSayfasiAcilir() {
        Assert.assertTrue("Telif Hakki sayfasi acilmali", teklifHakkiPage.teklifHakkiPage.getText().contains("Teklif Hakkı"));
    }

    @When("kullanici Baslangic yada Avantaj teklif hakkini secer")
    public void kullanici_baslangic_yada_avantaj_teklif_hakkini_secer() {
        BrowserUtilities.waitFor(3);
        teklifHakkiPage.avantajPacket.click();

    }

    @When("kullanici Teklif Hakki Al buttonuna tiklar")
    public void kullanici_teklif_hakki_al_buttonuna_tiklar() {
        BrowserUtilities.hover(teklifHakkiPage.tekAlButton);
        teklifHakkiPage.tekAlButton.click();

    }

    @Then("{string} in gorunundugu sayfa acilir")
    public void in_gorunundugu_sayfa_acilir(String odemeYap) {
        Assert.assertEquals(odemeYap, teklifHakkiPage.odemeYapBtn.getText());

    }

    @When("kullanici Odeme Yap'a tiklar")
    public void kullaniciOdemeYapATiklar() {
        teklifHakkiPage.odemeYapBtn.click();
        BrowserUtilities.waitFor(3);
    }

    @When("kullanici kart sahibinin adini yazar")
    public void kullaniciKartSahibininAdiniYazar() {
        teklifHakkiPage.kartSahipAd.sendKeys("Joe Doe");
        BrowserUtilities.waitFor(3);
    }

    @And("kullanici kart numarsini yazar")
    public void kullaniciKartNumarsiniYazar() {
        //   Driver.get().switchTo().frame(0);
        //   Driver.get().switchTo().frame(teklifHakkiPage.iframe);



        teklifHakkiPage.kartNumarasi.sendKeys(ConfigurationReader.get("KartNumber"));
//        actions.sendKeys(Keys.NUMPAD4);
//        BrowserUtilities.waitFor(1);
//        actions.sendKeys(Keys.NUMPAD2);


    }

    @Then("aldiklarim sayfasi acilir")
    public void aldiklarimSayfasiAcilir() {
        Assert.assertEquals("Aldıklarım", teklifHakkiPage.aldiklarimPage.getText());
    }

    @Then("{string} mesaji cikar")
    public void mesajiCikar(String message) {
        BrowserUtilities.waitFor(5);
        Assert.assertEquals(message,teklifHakkiPage.tossMessage.getText());
    }
}