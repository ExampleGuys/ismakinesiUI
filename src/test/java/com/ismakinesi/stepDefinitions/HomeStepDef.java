package com.ismakinesi.stepDefinitions;

import com.ismakinesi.pages.AldiklarimPage;
import com.ismakinesi.pages.HomePage;
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


public class HomeStepDef {
    HomePage homePage = new HomePage();


    @When("Forkliftler'e tıklar")
    public void forkliftler_e_tıklar() {
        BrowserUtilities.hover(homePage.forklift);
        homePage.forklift.click();

    }

    @When("Tüm Filtreler e tıklar")
    public void tüm_filtreler_e_tıklar() {
        BrowserUtilities.hover(homePage.allFilters);
        homePage.allFilters.click();

    }

    @Then("{string} başlığını doğrular")
    public void başlığını_doğrular(String string) {
        WebElement element=Driver.get().findElement(By.xpath("//h3[.='Kategori']"));
        Assert.assertTrue("Kategori Yazısı Doğrulanmadı",homePage.category.isEnabled());


    }

    @Then("Katagori  serch box doğrulanmalı")
    public void katagoriSerchBoxDoğrulanmalı() {
        Assert.assertTrue("Kategori Yazısı Doğrulanmadı",homePage.searchİnput.isEnabled());


    }

    @Then("Katagori  serch box a model yılı girer")
    public void katagoriSerchBoxAModelYılıGirer() {
        BrowserUtilities.waitFor(3);
        homePage.searchİnput.sendKeys("2000");
        BrowserUtilities.waitFor(1);
    }

    @When("Katagori  serch box a model adı girer")
    public void katagoriSerchBoxAModelAdıGirer() {
        BrowserUtilities.waitFor(4);
        homePage.searchİnput.sendKeys("Lastik Tekerlekli Yükleyici");
        BrowserUtilities.waitFor(4);
    }

    @Then("Marka,Sınırlı Servis Garantisi,üretim Yılı,Çalışma Saati ve Fiyat başlığını kullanıcı doğrular")
    public void markaSınırlıServisGarantisiÜretimYılıÇalışmaSaatiVeFiyatBaşlığınıKullanıcıDoğrular(DataTable dataTable) {

        List<String> labels = dataTable.column(0);
        for (String label : labels) {
            WebElement element = Driver.get().findElement(By.xpath("//h3[.='" + label + "']"));

            Assert.assertTrue(element.isDisplayed());
            System.out.println(element.getText());

        }

    }
}
