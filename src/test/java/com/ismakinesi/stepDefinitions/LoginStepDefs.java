package com.ismakinesi.stepDefinitions;

import com.ismakinesi.pages.LoginPage;
import com.ismakinesi.utilities.BrowserUtilities;
import com.ismakinesi.utilities.ConfigurationReader;
import com.ismakinesi.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;

public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();

    @Given("Kullanici ismakinesi.com adresine gider")
    public void kullaniciIsmakinesiComAdresineGider() {
        String url = ConfigurationReader.get("prod_url");
        Driver.get().get(url);
    }

    @When("kullanici Uye Ol Veya Giris Yapa tiklar")
    public void kullaniciUyeOlVeyaGirisYapaTiklar() {
        BrowserUtilities.waitForClickability(loginPage.loginOrBeMemberButton, 30);
        loginPage.loginOrBeMemberButton.click();
        BrowserUtilities.waitFor(5);
    }

    @Then("Uye Girisi sayfasi acilir")
    public void uyeGirisiSayfasiAcilir() {

    }

    @When("kullanici valid email adresi yazar")
    public void kullaniciValidEmailAdresiYazar() {
        loginPage.emailUye.sendKeys(ConfigurationReader.get("email"));
    }

    @And("kullanici valid sifre yazar")
    public void kullaniciValidSifreYazar() {
        loginPage.passwordUye.sendKeys(ConfigurationReader.get("password"));
    }

    @And("kullanici Giris Yap'a tiklar")
    public void kullaniciGirisYapATiklar() {
        loginPage.submitBtn.click();
    }

    @Then("kullanici siteye giris yapar")
    public void kullaniciSiteyeGirisYapar() {
    }

    @When("kullanici Youtube iconuna tiklar")
    public void kullaniciYoutubeIconunaTiklar() {
        BrowserUtilities.scrollToElement(loginPage.youtubeLink);
        BrowserUtilities.waitFor(3);
        BrowserUtilities.clickWithJS(loginPage.youtubeLink);
        BrowserUtilities.waitFor(5);
    }

    @When("kullanici  instagram iconuna tiklar")
    public void kullanici_instagram_iconuna_tiklar() {
        BrowserUtilities.clickWithJS(loginPage.instagramLink);

    }

    @Then("Instagram sayfasi acildigini dogrular")
    public void instagram_sayfasi_acildigini_dogrular() {

        ArrayList<String> tabs = new ArrayList<>(Driver.get().getWindowHandles());
        Driver.get().switchTo().window(tabs.get(tabs.size() - 1));
        BrowserUtilities.waitForVisibility(loginPage.followButtonOnInstagramAccount, 10);
        System.out.println(Driver.get().getTitle());
        Assert.assertTrue(Driver.get().getTitle().contains("Instagram"));
    }


    @Then("Twitter sayfasi acildigini dogrular")
    public void twitter_sayfasi_acildigini_dogrular() {
    }

    @Then("Kullanici Youtube sayfasinin acildigini dogrular")
    public void kullaniciYoutubeSayfasininAcildiginiDogrular() {

        String currentTab = Driver.get().getWindowHandle();
        ArrayList<String> tabs = new ArrayList<>(Driver.get().getWindowHandles());
        Driver.get().switchTo().window(tabs.get(tabs.size() - 1));

        BrowserUtilities.waitForVisibility(loginPage.youtubeIcon, 20);
        Assert.assertTrue(Driver.get().getTitle().contains("YouTube"));
//        BrowserUtilities.waitForVisibility(loginPage.twitterIcon, 10); ////
//        Assert.assertTrue(Driver.get().getTitle().contains("Twitter")); ////

    }


    @When("kullanici Uye Ol Veya Giris Yap'a tiklar")
    public void kullanici_uye_ol_veya_giris_yap_a_tiklar() {
        loginPage.uyeOlVeyaGirisYapButonu.click();


    }


    @When("kullanici facebook iconuna tiklar")
    public void kullanici_facebook_iconuna_tiklar() {
        BrowserUtilities.clickWithJS(loginPage.facebookLink);

    }

    @Then("facebook sayfasi acildigini dogrular")
    public void facebook_sayfasi_acildigini_dogrular() {
        ArrayList<String> tabs = new ArrayList<>(Driver.get().getWindowHandles());
        Driver.get().switchTo().window(tabs.get(tabs.size() - 1));
        BrowserUtilities.waitFor(5);
        Assert.assertTrue(Driver.get().getTitle().contains("Facebook"));

    }

    @Then("kullanici siteye giris yaptigini dogrular")
    public void kullanici_siteye_giris_yaptigini_dogrular() {
        Assert.assertTrue(loginPage.hesabimBtn.isDisplayed());

    }

    @Then("kullanici siteye giris yapamadigini dogrular")
    public void kullaniciSiteyeGirisYapamadiginiDogrular() {
        BrowserUtilities.waitForVisibility(loginPage.passwordIcinUyariTexti, 10);
        Assert.assertTrue(loginPage.passwordIcinUyariTexti.isDisplayed());

    }

    @When("kullanici Twitter iconuna tiklar")
    public void kullaniciTwitterIconunaTiklar() {
        BrowserUtilities.clickWithJS(loginPage.twitterLink);
    }


    @And("kullanici {string} sifre yazar")
    public void kullaniciSifreYazar(String invalid) {
        loginPage.passwordUye.sendKeys(invalid);
    }

    @Then("kullanici invalid sifre ile siteye giris yapamadigini dogrular")
    public void kullaniciInvalidSifreIleSiteyeGirisYapamadiginiDogrular() {
        BrowserUtilities.waitForVisibility(loginPage.invalidPasswordIcinUyariTexti, 10);
        Assert.assertTrue(loginPage.invalidPasswordIcinUyariTexti.isDisplayed());
    }

    @When("kullanici {string} mail yazar")
    public void kullaniciMailYazar(String invalid) {
        loginPage.emailUye.sendKeys(invalid);
    }

    @Then("Kullanici invalid email giris yapamadigini dogrular")
    public void kullaniciInvalidEmailGirisYapamadiginiDogrular() {
        BrowserUtilities.waitForVisibility(loginPage.invalidPasswordIcinUyariTexti, 10);
        Assert.assertTrue(loginPage.invalidPasswordIcinUyariTexti.isDisplayed());

    }


    @Then("Kullanici Uye Ol Veya Giris Yap sekmesindeyken sayfanin herhangi bir yerine tiklar")
    public void kullaniciUyeOlVeyaGirisYapSekmesindeykenSayfaninHerhangiBirYerineTiklar() {
        BrowserUtilities.hover(loginPage.loginSekmesi);
        BrowserUtilities.doubleClick(loginPage.loginSekmesi);
        BrowserUtilities.waitFor(5);
    }

    @And("Kullanici Giris Yap sekmesindeki Uye Ol’a tiklar")
    public void kullaniciGirisYapSekmesindekiUyeOlATiklar() {
        loginPage.uyeOl.click();
        BrowserUtilities.waitFor(2);
    }

    @And("kullanici eksik sifre yazar")
    public void kullaniciEksikSifreYazar() {
        loginPage.sifre.sendKeys("test123");
    }

    @Then("Sifre en az 8 karekter olmalidir mesaji geldigini dogrular")
    public void mesajiGeldiginiDogrular() {
        Assert.assertEquals("Şifre değeri en az 8 karakter uzunluğunda olmalıdır.", loginPage.sifreUyari.getText());
    }

    @And("Kullanici Uye Ol'a tiklar")
    public void kullaniciUyeOlATiklar() {
        loginPage.uyeOlSubmit.click();
        BrowserUtilities.waitFor(2);
    }
}
