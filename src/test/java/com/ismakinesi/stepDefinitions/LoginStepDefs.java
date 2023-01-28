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

    @When("kullanici Youtube iconuna tiklar")
    public void kullaniciYoutubeIconunaTiklar() {
        BrowserUtilities.scrollToElement(loginPage.youtubeLink);
        BrowserUtilities.waitFor(3);
        BrowserUtilities.clickWithJS(loginPage.youtubeLink);
        BrowserUtilities.waitFor(5);

    }

    @Then("Kullanici Youtube sayfasinin acildigini dogrular")
    public void kullaniciYoutubeSayfasininAcildiginiDogrular() {

        //BrowserUtilities.switchToWindow("https://www.youtube.com/channel/UC1aN6ko8RMCHyPnKtmuCtgw");
        String currentTab = Driver.get().getWindowHandle();
        ArrayList<String> tabs = new ArrayList<>(Driver.get().getWindowHandles());
        Driver.get().switchTo().window(tabs.get(tabs.size() - 1));

        BrowserUtilities.waitForVisibility(loginPage.youtubeIcon,20);
        Assert.assertTrue( Driver.get().getTitle().contains("YouTube"));



    }
}
