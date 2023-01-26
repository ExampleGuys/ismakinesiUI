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

public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();

    @Given("Kullanici ismakinesi.com adresine gider")
    public void kullaniciIsmakinesiComAdresineGider() {
        String url = ConfigurationReader.get("prod_url");
        Driver.get().get(url);
    }

    @When("kullanici Uye Ol Veya Giris Yapa tiklar")
    public void kullaniciUyeOlVeyaGirisYapaTiklar() {
        BrowserUtilities.waitForClickability(loginPage.loginOrBeMemberButton,30);
        loginPage.loginOrBeMemberButton.click();
        BrowserUtilities.waitFor(5);
    }


    @Then("Uye Girisi sayfasi acilir")
    public void uyeGirisiSayfasiAcilir() {
        Assert.assertEquals("Uye Girisi",loginPage.uyeGirisi.getText());


    }

    @When("kullanici valid email adresi yazar")
    public void kullaniciValidEmailAdresiYazar() {

    }

    @And("kullanici valid sifre yazar")
    public void kullaniciValidSifreYazar() {

    }

    @And("kullanici Giris Yap'a tiklar")
    public void kullaniciGirisYapATiklar() {

    }

    @Then("kullanici siteye giris yapar")
    public void kullaniciSiteyeGirisYapar() {
    }
}
