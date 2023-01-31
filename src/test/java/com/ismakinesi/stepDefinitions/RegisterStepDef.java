package com.ismakinesi.stepDefinitions;

import com.github.javafaker.Faker;
import com.ismakinesi.pages.RegisterPage;
import com.ismakinesi.utilities.BrowserUtilities;
import com.ismakinesi.utilities.ConfigurationReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class RegisterStepDef {

    RegisterPage registerPage = new RegisterPage();
    Faker faker = new Faker();

    @When("kullanici Uye Ol'a tiklar")
    public void kullanici_uye_ol_a_tiklar() {
        registerPage.UyeOlLinki.click();

    }

    @And("kullanici adini soyadini yazar")
    public void kullaniciAdiniSoyadiniYazar() {
        registerPage.registerFullName.sendKeys(ConfigurationReader.get("newUserFullName"));

    }

    @And("kullanici emailini yazar")
    public void kullaniciEmailiniYazar() {
        registerPage.registerEmail.sendKeys(faker.internet().emailAddress());
    }

    @And("kullanici telefon numarasini yazar")
    public void kullaniciTelefonNumarasiniYazar() {
        registerPage.registerPhone.sendKeys(faker.name().fullName());
    }

    @And("kullanici sifre yazar")
    public void kullaniciSifreYazar() {
        registerPage.registerPassword.sendKeys(faker.internet().password());
    }

    @And("kullanici Register Uye Ol'a tiklar")
    public void kullaniciRegisterUyeOlATiklar() {
        registerPage.registerUyeOlButonu.click();
    }

    @Then("kullanici Telefon Kodu Dogrulama sayfasinin acildigini dogrular")
    public void kullaniciTelefonKoduDogrulamaSayfasininAcildiginiDogrular() {
        BrowserUtilities.waitForVisibility(registerPage.telefonDogrulamaTexti,10);
        Assert.assertTrue(registerPage.telefonDogrulamaTexti.isDisplayed());
    }
}
