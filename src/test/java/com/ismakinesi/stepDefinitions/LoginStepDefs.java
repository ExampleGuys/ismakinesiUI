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


    @When("kullanici Twitter iconuna tiklar")
    public void kullanici_twitter_iconuna_tiklar() {
        BrowserUtilities.clickWithJS(loginPage.twitterLink);

    }

    @Then("Twitter sayfasi acildigini dogrular")
    public void twitter_sayfasi_acildigini_dogrular() {


        //String currentTab = Driver.get().getWindowHandle();
        ArrayList<String> tabs = new ArrayList<>(Driver.get().getWindowHandles());
        Driver.get().switchTo().window(tabs.get(tabs.size() - 1));

        BrowserUtilities.waitForVisibility(loginPage.twitterIcon,10);

        Assert.assertTrue(Driver.get().getTitle().contains("Twitter"));



    }













































    @When("kullanici Uye Ol Veya Giris Yap'a tiklar")
    public void kullanici_uye_ol_veya_giris_yap_a_tiklar() {
        loginPage.uyeOlVeyaGirisYapButonu.click();

    }

    @Then("kullanici siteye giris yaptigini dogrular")
    public void kullanici_siteye_giris_yaptigini_dogrular() {
        Assert.assertTrue(loginPage.hesabimBtn.isDisplayed());

    }
}
