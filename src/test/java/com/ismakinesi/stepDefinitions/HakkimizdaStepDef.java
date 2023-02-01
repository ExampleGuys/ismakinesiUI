package com.ismakinesi.stepDefinitions;

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

public class HakkimizdaStepDef {

    FooterPage footerPage = new FooterPage();

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

    @Then("acilan sayfada Gizlilik Sözleşmesi oldugu dogrulanir")
    public void acilanSayfadaGizlilikSözleşmesiOlduguDogrulanir() {

        Assert.assertTrue(footerPage.GizlilikZleMesiickisim.isDisplayed());



    }
}

