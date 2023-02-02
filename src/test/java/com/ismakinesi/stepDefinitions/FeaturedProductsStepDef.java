package com.ismakinesi.stepDefinitions;

import com.ismakinesi.pages.FeaturedProductsPage;
import com.ismakinesi.utilities.BrowserUtilities;
import com.ismakinesi.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class FeaturedProductsStepDef {

    FeaturedProductsPage featuredProductsPage = new FeaturedProductsPage();
    int enSonTeklif ;

    @When("Uye Ol veya GirisYap boxuna tiklar")
    public void uye_ol_veya_giris_yap_boxuna_tiklar() {
        BrowserUtilities.waitFor(5);
        featuredProductsPage.loginButton.click();
    }

    @When("e-mail bilgileri girilir")
    public void e_mail_bilgileri_girilir() {
        featuredProductsPage.emailButton.sendKeys("softwareengineer0090@gmail.com" + Keys.TAB);

    }

    @When("sifre bilgileri girilir")
    public void sifre_bilgileri_girilir() {
        featuredProductsPage.passwordButton.sendKeys("turkey0090");
        featuredProductsPage.submitGirisYapButton.click();

    }

    @When("Anasayfadaki Forkliftler boxina tiklar")
    public void anasayfadaki_forkliftler_boxina_tiklar() {
        BrowserUtilities.waitFor(5);
        featuredProductsPage.forkliftlerButton.click();

    }

    @When("En ustteki ilana tiklanir")
    public void en_ustteki_ilana_tiklanir() {
        BrowserUtilities.waitFor(7);
        featuredProductsPage.enUstIlan.click();
    }

    @When("Teklif Ver boxuna tiklanir")
    public void teklif_ver_boxuna_tiklanir() {
        BrowserUtilities.waitFor(5);


        ArrayList<String> pencereler = new ArrayList<>(Driver.get().getWindowHandles());
        Driver.get().switchTo().window(pencereler.get(1));

        BrowserUtilities.waitFor(5);

        //BrowserUtilities.clickWithJS(featuredProductsPage.teklifVerButton);

       featuredProductsPage.teklifVerButton.click();

        System.out.println(featuredProductsPage.enYuksekTeklifDeger.getText());

        BrowserUtilities.waitFor(2);


    }

    @When("Teklif verecegimiz ucret girilmeli")
    public void teklif_verecegimiz_ucret_girilmeli() {

        BrowserUtilities.waitFor(5);

        String highestBid = featuredProductsPage.enYuksekTeklif.getText();
        String lastBid = featuredProductsPage.bidConverter(highestBid, 1000);

        featuredProductsPage.teklifParaButton.sendKeys(lastBid);
    }

    @When("Devam butonuna basilir")
    public void devam_butonuna_basilir() {
        BrowserUtilities.waitFor(5);
        featuredProductsPage.devamButton.click();
    }

    @When("Teklifi Gonder boxuna tiklanir")
    public void teklifi_gonder_boxuna_tiklanir() {
        BrowserUtilities.waitFor(3);
        featuredProductsPage.teklifiGonderButton.click();
    }

    @When("Basariyla yapildi yazisini dogrula")
    public void basariyla_yapildi_yazisini_dogrula() {
        BrowserUtilities.waitFor(5);
        featuredProductsPage.teklifinizYapildiBox.isDisplayed();
    }

    @Then("Hemen Al butonuna tiklanir")
    public void hemen_al_butonuna_tiklanir() {
        BrowserUtilities.waitFor(5);
        featuredProductsPage.hemelAlBox.click();

    }

    @And("Anasayfadaki Ekskavatorler boxina tiklar")
    public void anasayfadakiEkskavatorlerBoxinaTiklar() {
        BrowserUtilities.waitFor(5);
        featuredProductsPage.ekskavatorlerBox.click();
    }

    @And("Anasayfadaki Kazici Yukleyici boxina tiklar")
    public void anasayfadakiKaziciYukleyiciBoxinaTiklar() {
        BrowserUtilities.waitFor(5);
        featuredProductsPage.kaziciYukleyiciBox.click();
    }

    @And("Anasayfadaki Yukleyiciler boxina tiklar")
    public void anasayfadakiYukleyicilerBoxinaTiklar() {
        BrowserUtilities.waitFor(7);
        featuredProductsPage.yukleyicilerBox.click();
    }

    @And("Anasayfadaki Personel Yuklelticiler boxina tiklar")
    public void anasayfadakiPersonelYuklelticilerBoxinaTiklar() {
        BrowserUtilities.waitFor(5);
        featuredProductsPage.personelYukselticiBox.click();
    }
    @And("Anasayfadaki Teleskopik Yuklelticiler boxina tiklar")
    public void anasayfadakiTeleskopikYuklelticilerBoxinaTiklar() {
        BrowserUtilities.waitFor(5);
        featuredProductsPage.teleskopikYukselticiBox.click();
    }
}
