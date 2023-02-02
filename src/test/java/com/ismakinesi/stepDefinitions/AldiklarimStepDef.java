package com.ismakinesi.stepDefinitions;

import com.ismakinesi.pages.AldiklarimPage;
import com.ismakinesi.pages.LoginPage;
import com.ismakinesi.utilities.BrowserUtilities;
import com.ismakinesi.utilities.ConfigurationReader;
import com.ismakinesi.utilities.Driver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.junit.platform.commons.function.Try;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AldiklarimStepDef {
    AldiklarimPage aldiklarimPage = new AldiklarimPage();
    LoginPage loginPage = new LoginPage();

    @When("kullanici uye olarak giris yapar")
    public void kullaniciUyeOlarakGirisYapar() {
        BrowserUtilities.waitForClickability(loginPage.loginOrBeMemberButton, 30);
        aldiklarimPage.loginOrBeMemberButton.click();
        BrowserUtilities.waitFor(5);
        Assert.assertEquals("Üye Girişi", loginPage.uyeGirisi.getText());
        loginPage.emailUye.sendKeys(ConfigurationReader.get("email"));
        loginPage.passwordUye.sendKeys(ConfigurationReader.get("password"));
        loginPage.submitBtn.click();
    }

    @When("kullanici Hesabim buttonuna tiklar")
    public void kullanici_hesabim_buttonuna_tiklar() {
        loginPage.hesabimBtn.click();
        BrowserUtilities.waitFor(3);

    }

    @When("kullanici Aldiklarima tiklar")
    public void kullanici_aldiklarima_tiklar() {
        BrowserUtilities.hover(aldiklarimPage.aldiklarim);
        BrowserUtilities.doubleClick(aldiklarimPage.aldiklarim);


    }

    @Then("Aldiklarim sayfasi acilir")
    public void aldiklarim_sayfasi_acilir() {
        BrowserUtilities.waitForVisibility(aldiklarimPage.aldikPage,30);
        Assert.assertEquals("Aldıklarım", Driver.get().getTitle());
    }

    @Then("Aldiklarim, Tekliflerim,Teklif Haklarim basliklari visible olur")
    public void aldiklarimTekliflerimTeklifHaklarimBasliklariVisibleOlur(DataTable dataTable) {
        List<String> labels = dataTable.column(0);

        for (String label : labels) {
            WebElement element = Driver.get().findElement(By.xpath("//a[.='" + label + "']"));

            Assert.assertTrue(element.isDisplayed());
            System.out.println(element.getText());

        }


    }

    @Then("kullanici onceden almis oldugu urunleri gorur")
    public void kullaniciOncedenAlmisOlduguUrunleriGorur() {
        try {
            BrowserUtilities.doubleClick(aldiklarimPage.photosAl);
            BrowserUtilities.waitForVisibility(aldiklarimPage.alinanArac,5);
            String alMakine = aldiklarimPage.alinanArac.getText();
            Assert.assertEquals("SATILDI", alMakine);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}