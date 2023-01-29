package com.ismakinesi.stepDefinitions;

import com.ismakinesi.pages.TeklifHakkiPage;
import com.ismakinesi.utilities.BrowserUtilities;
import com.ismakinesi.utilities.Driver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TeklifHakkiStepDef {
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
        Assert.assertEquals("Kullanılabilir",teklifHakkiPage.kullanTek.getText());

    }
    @And("kullanici Suresi bitenler'e tiklar")
    public void kullaniciSuresiBitenlerETiklar() {
        BrowserUtilities.doubleClick(teklifHakkiPage.suresiBitenler);
        BrowserUtilities.waitFor(3);


    }
    @Then("kullanici  suresi biten teklif haklarini gorur")
    public void kullaniciSuresiBitenTeklifHaklariniGorur() {
      Assert.assertEquals("Ödemede Kullanıldı",teklifHakkiPage.odemedeKullanildi.getText());

    }
    @And("kullanici Teklif Hakki Al'a tiklar")
    public void kullaniciTeklifHakkiAlATiklar() {
        BrowserUtilities.clickWithJS(teklifHakkiPage.teklifHakkiAl);
        BrowserUtilities.waitFor(3);

    }
    @Then("Teklif Hakki sayfasi acilir")
    public void teklifPanlariSayfasiAcilir() {
        Assert.assertTrue("Teklif Hakkı sayfasi acilmali",teklifHakkiPage.tekHakPage.getText().contains("Teklif Hakkı"));
    }

    @When("kullanici Baslangic yada Avantaj teklif hakkini secer")
    public void kullanici_baslangic_yada_avantaj_teklif_hakkini_secer() {
        BrowserUtilities.waitFor(3);
        teklifHakkiPage.avantajPacket.click();

    }

    @When("kullanici Teklif Hakki Al buttonuna tiklar")
    public void kullanici_teklif_hakki_al_buttonuna_tiklar() {
        teklifHakkiPage.tekAlButton.click();

    }

    @Then("{string} in gorunundugu sayfa acilir")
    public void in_gorunundugu_sayfa_acilir(String string) {


    }



}