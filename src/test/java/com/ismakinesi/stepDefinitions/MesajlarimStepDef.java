package com.ismakinesi.stepDefinitions;

import com.ismakinesi.pages.LoginPage;
import com.ismakinesi.pages.MesajlarimPage;
import com.ismakinesi.utilities.BrowserUtilities;
import com.ismakinesi.utilities.ConfigurationReader;
import com.ismakinesi.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MesajlarimStepDef {

    MesajlarimPage mesajlarimPage = new MesajlarimPage();

    LoginPage loginPage = new LoginPage();

    /*@When("Kullanici uye olarak giris yapar")
    public void kullaniciUyeOlarakGirisYapar() {
        BrowserUtilities.waitForClickability(loginPage.loginOrBeMemberButton, 10);
        mesajlarimPage.loginOrBeMemberButton.click();
        BrowserUtilities.waitFor(5);
        Assert.assertEquals("Üye Girişi", loginPage.uyeGirisi.getText());
        loginPage.emailUye.sendKeys(ConfigurationReader.get("email"));
        loginPage.passwordUye.sendKeys(ConfigurationReader.get("password"));
        loginPage.submitBtn.click();
    }

    @When("Kullanici Hesabim butonuna tiklar")
    public void kullaniciHesabimButonunaTiklar(){
        BrowserUtilities.hover(mesajlarimPage.mesajlarimPage);
        BrowserUtilities.doubleClick(mesajlarimPage.mesajlarimPage);
        BrowserUtilities.waitFor(5);
    }
*/
    @Then("Kullanici Mesajlarim butonuna tiklar ve dogrular")
    public void KullaniciMesajlarimButonunaTiklarVeDogrular() {
        BrowserUtilities.hover(mesajlarimPage.mesajlarimPage);
        BrowserUtilities.verifyElementDisplayed(mesajlarimPage.mesajlarimPage);
        BrowserUtilities.doubleClick(mesajlarimPage.mesajlarimPage);
        BrowserUtilities.waitFor(5);
    }
/*
    @Then("Kullanici Mesajlarim butonuna tiklandigini dogrular")
    public void kullaniciSattiklarimButonunaTiklandiginiDogrular() {
        BrowserUtilities.verifyElementClickable(mesajlarimPage.mesajlarimPage);
        }

 */
    }

