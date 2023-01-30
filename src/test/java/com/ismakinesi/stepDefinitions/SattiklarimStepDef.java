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
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import io.cucumber.datatable.DataTable;

import java.util.List;

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
        BrowserUtilities.hover(sattiklarimPage.sattiklarimPage);
        BrowserUtilities.doubleClick(sattiklarimPage.sattiklarimPage);
        BrowserUtilities.waitFor(5);
    }

    @Then("Kullanici Sattiklarim butonuna tiklandigini dogrular")
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
    @Then("Kullanici Yayindaki İlanlar, Sattiklarim ve Yayinda Olmayanlar başlıklarını görünürlüğünü ve tıklanabilirliğini doğrular")
    public void kullaniciYayindakiIlanlarSattiklarimVeYayindaOlmayanlarBasliklariniGorunurluguVeTiklanabilirliginiDogrular(DataTable dataTable) {
        List<String> labels = dataTable.column(0);

        for (String label : labels) {
            WebElement element = Driver.get().findElement(By.xpath("//a[.='" + label + "']"));

            Assert.assertTrue(element.isDisplayed());
            System.out.println(element.getText());
            BrowserUtilities.hover(element);
            BrowserUtilities.doubleClick(element);
            BrowserUtilities.waitFor(5);
            BrowserUtilities.verifyElementClickable(element);
        }

    }

}



