package com.ismakinesi.stepDefinitions;

import com.ismakinesi.pages.FavorilerimPage;
import com.ismakinesi.utilities.BrowserUtilities;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class FavorilerimStepDef {

    FavorilerimPage favorilerimPage = new FavorilerimPage();

    @And("Kullanici Favorilerim butonuna tiklar")
    public void kullaniciFavorilerimButonunaTiklar() {
        favorilerimPage.favorilerim.click();
        BrowserUtilities.waitFor(3);
    }

    @And("Kullanici Favori olarak secilen urunlere tiklar")
    public void kullaniciFavoriOlarakSecilenUrunlereTiklar() {
        favorilerimPage.favoriUrun.click();
        BrowserUtilities.waitFor(3);
    }

    @Then("Kullanici urun bilgileri sayfasina gider")
    public void kullaniciUrunBilgileriSayfasinaGider() {
        System.out.println("favorilerimPage.favoriUrununSayfasi.getText() = " + favorilerimPage.favoriUrununSayfasi.getText());
    }

    @Then("Kullanici Favori olarak secilen urunleri gorur")
    public void kullaniciFavoriOlarakSecilenUrunleriGorur() {
        System.out.println("favorilerimPage.favoriUrunIkı.getText() = " + favorilerimPage.favoriUrunIki.getText());
    }
}
