package com.ismakinesi.stepDefinitions;


import com.google.common.base.Verify;
import com.google.common.base.VerifyException;
import com.ismakinesi.pages.SattiklarimPage;
import com.ismakinesi.pages.LoginPage;
import com.ismakinesi.utilities.BrowserUtilities;
import com.ismakinesi.utilities.ConfigurationReader;
import com.ismakinesi.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SattiklarimStepDef {

    SattiklarimPage sattiklarimPage = new SattiklarimPage();
    LoginPage loginPage = new LoginPage();

    @When("Kullanici uye olarak giris yapar")
    public void kullaniciUyeOlarakGirisYapar() {
        BrowserUtilities.waitForClickability(loginPage.loginOrBeMemberButton, 10);
        sattiklarimPage.loginOrBeMemberButton.click();
        BrowserUtilities.waitFor(5);
        Assert.assertEquals("Üye Girişi", loginPage.uyeGirisi.getText());
        loginPage.emailUye.sendKeys(ConfigurationReader.get("email"));
        loginPage.passwordUye.sendKeys(ConfigurationReader.get("password"));
        loginPage.submitBtn.click();
    }

    @When("Kullanici Hesabim buttonuna tiklar")
    public void kullanici_hesabim_buttonuna_tiklar() {
        loginPage.hesabimBtn.click();
        BrowserUtilities.waitFor(3);
    }

    @And("Kullanici Sattiklarim butonuna tiklar")
    public void kullaniciSattiklarimButonunaTiklar() {
        BrowserUtilities.hover(sattiklarimPage.sattiklarim);
        BrowserUtilities.doubleClick(sattiklarimPage.sattiklarim);
        BrowserUtilities.waitFor(5);
    }

    @Then("kullanici Sattiklarim butonuna tiklandigini dogrular")
    public void kullaniciSattiklarimButonunaTiklandiginiDogrular() {
        BrowserUtilities.verifyElementClickable(sattiklarimPage.sattiklarim);
    }

    /*@Then("kullanici Sattiklarim butonuna tiklar")
    public void kullanici_aldiklarima_tiklar() {
        BrowserUtilities.hover(sattiklarimPage.sattiklarim);
        BrowserUtilities.doubleClick(sattiklarimPage.sattiklarim);
        BrowserUtilities.waitFor(5);

    }
*/

}



