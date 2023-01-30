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


    @When("Forkliftler'e tiklar")
    public void forkliftler_e_tiklar() {
        BrowserUtilities.hover(homePage.forklift);
        homePage.forklift.click();

    }

    @When("Tum Filtreler e tiklar")
    public void tum_filtreler_e_tiklar() {
        BrowserUtilities.hover(homePage.allFilters);
        homePage.allFilters.click();

    }

    @Then("{string} basligini dogrular")
    public void basligini_dogrular(String string) {
        WebElement element = Driver.get().findElement(By.xpath("//h3[.='Kategori']"));
        Assert.assertTrue("Kategori Yazisi Dogrulanmadi", homePage.category.isEnabled());


    }

    @Then("Katagori  serch box dogrulanmali")
    public void katagoriSerchBoxDogrulanmali() {
        Assert.assertTrue("Kategori Yazisi Dogrulanmadi", homePage.searchInput.isEnabled());


    }

    @Then("Katagori  serch box a model yili girer")
    public void katagoriSerchBoxAModelYiliGirer() {
        BrowserUtilities.waitFor(3);
        homePage.searchInput.sendKeys("2000");
        BrowserUtilities.waitFor(1);
    }

    @When("Katagori  serch box a model adi girer")
    public void katagoriSerchBoxAModelAdiGirer() {
        BrowserUtilities.waitFor(4);
        homePage.searchInput.sendKeys("Lastik Tekerlekli Yükleyici");
        BrowserUtilities.waitFor(4);
    }

    @Then("Marka,Sinirli Servis Garantisi,uretim Yili,Calisma Saati ve Fiyat basligini kullanici dogrular")
    public void markaSinirliServisGarantisiUretimYiliCalismaSaatiVeFiyatBasliginiKullaniciDogrular(DataTable dataTable) {

        List<String> labels = dataTable.column(0);
        for (String label : labels) {
            WebElement element = Driver.get().findElement(By.xpath("//h3[.='" + label + "']"));

            Assert.assertTrue(element.isDisplayed());
            System.out.println(element.getText());

        }

    }

    @And("Kullanici kategori olarak Dizel Forklift Radio buttonunu secer")
    public void kullaniciKategoriOlarakDizelForkliftRadioButtonunuSecer() {
        BrowserUtilities.waitFor(3);
        homePage.radioDizelforklift.click();
        BrowserUtilities.waitFor(2);
    }

    @And("Kullanici Marka olarak Caterpillar Radio buttonunu secer.")
    public void kullaniciMarkaOlarakCaterpillarRadioButtonunuSecer() {
        homePage.radioCaterpillarMarka.click();
        BrowserUtilities.waitFor(3);

    }

    @Then("secilen ilanin filitrelendigini dogrular.")
    public void secilenIlaninFilitrelendiginiDogrular() {
        homePage.bosaTikla.click();
        BrowserUtilities.waitFor(5);
    }

    @And("Sinirli Servis Garantisi secer")
    public void sinirliServisGarantisiSecer() {
        homePage.radioServicSelect.click();
        BrowserUtilities.waitFor(4);
        BrowserUtilities.scrollToElement(homePage.radioServicSelect);
    }

    @And("Uretim yili araligi  girer")
    public void uretimYiliAraligiGirer() {
        homePage.minYearOf.sendKeys("2008");
        BrowserUtilities.waitFor(2);
        homePage.maxYearOf.sendKeys("2020");
        BrowserUtilities.waitFor(4);
    }

    @And("calisma saati araligi girer")
    public void calismaSaatiAraligiGirer() {
        homePage.minWorkingHour.sendKeys("100");
        BrowserUtilities.waitFor(3);
        homePage.maxWorkingHour.sendKeys("300");
        BrowserUtilities.waitFor(4);
    }

    @And("fiyat araligi girer")
    public void fiyatAraligiGirer() {
        homePage.minPrice.sendKeys("5000");
        BrowserUtilities.waitFor(4);
        homePage.maxPrice.sendKeys("50000");
        BrowserUtilities.waitFor(4
        );
    }

    @When("Ekskavatörler e tiklar")
    public void ekskavatorlerETiklar() {
        homePage.ekskavatorler.click();
        BrowserUtilities.waitFor(4);

    }

    @And("Kullanici kategori olarak Paletli Ekskavator Radio buttonunu secer")
    public void kullaniciKategoriOlarakPaletliEkskavatorRadioButtonunuSecer() {
        BrowserUtilities.waitFor(3);
        homePage.crawlerExcavator.click();
        BrowserUtilities.waitFor(4);

    }

    @When("Kullanici Radio Button kullanarak urun secer")
    public void kullaniciRadioButtonKullanarakUrunSecer() {
        homePage.radioDizelforklift.click();
        BrowserUtilities.waitFor(4);
        homePage.radioCaterpillarMarka.click();
    }


    @And("Kullanici kategori olarak Lastik Tekerlekli Ekskavatör Radio buttonunu secer")
    public void kullaniciKategoriOlarakLastikTekerlekliEkskavatörRadioButtonunuSecer() {
        homePage.radioLastikTekerEkskavator.click();
        BrowserUtilities.waitFor(4);

    }

    @And("Kullanici Marka olarak Volvo Radio buttonunu secer.")
    public void kullaniciMarkaOlarakVolvoRadioButtonunuSecer() {
        homePage.radioVolvoMarka.click();
        BrowserUtilities.waitFor(4);

    }

    @When("Kazici Yükleyici e tiklar")
    public void kaziciYükleyiciETiklar() {
        homePage.backhoeLoader.click();
        BrowserUtilities.waitFor(4);
    }

    @And("Kullanici Marka olarak Case Radio buttonunu secer.")
    public void kullaniciMarkaOlarakCaseRadioButtonunuSecer() {
        homePage.radioCase.click();
        BrowserUtilities.waitFor(4);
    }

    @When("Filter kapat")
    public void filterKapat() {
        homePage.filterClose.click();
        BrowserUtilities.waitFor(2);

    }

    @And("logo tiklar")
    public void logoTiklar() {
        homePage.logo.click();
        //BrowserUtilities.waitFor(4);
    }

    @And("Kullanici Marka olarak New Holland Radio buttonunu secer.")
    public void kullaniciMarkaOlarakNewHollandRadioButtonunuSecer() {
        homePage.radioNewHollnand.click();
        BrowserUtilities.waitFor(4);
    }

    @When("Yükleyiciler e tiklar")
    public void yükleyicilerETiklar() {
        homePage.loader.click();
        BrowserUtilities.waitFor(4);

    }

    @And("Kullanici kategori olarak Paletli Yükleyici Radio buttonunu secer")
    public void kullaniciKategoriOlarakPaletliYükleyiciRadioButtonunuSecer() {
        homePage.trackLoader.click();
        BrowserUtilities.waitFor(4);
    }

    @And("Kullanici kategori olarak Lastik Tekerlekli Yükleyici Radio buttonunu secer")
    public void kullaniciKategoriOlarakLastikTekerlekliYükleyiciRadioButtonunuSecer() {
        homePage.wheelLoader.click();
        BrowserUtilities.waitFor(4);
    }

    @When("Yükleyici e tiklar")
    public void yükleyiciETiklar() {
        homePage.loader.click();
        BrowserUtilities.waitFor(4);
    }
}
