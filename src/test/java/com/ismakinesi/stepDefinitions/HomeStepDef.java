package com.ismakinesi.stepDefinitions;
import com.ismakinesi.pages.AldiklarimPage;
import com.ismakinesi.pages.HomePage;
import com.ismakinesi.pages.*;
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

public class HomeStepDef{
    HomePage homePage = new HomePage();


    @When("Forkliftler'e tiklar")
    public void forkliftler_e_tiklar() {
        BrowserUtilities.hover(homePage.forkliftler);
        homePage.forkliftler.click();
        BrowserUtilities.waitFor(3);

    }

    @When("Tum Filtreler e tiklar")
    public void tum_filtreler_e_tiklar() {
        BrowserUtilities.hover(homePage.allFilters);
        homePage.allFilters.click();
        BrowserUtilities.waitFor(3);

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

    @When("Ekskavatorler e tiklar")
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


    @And("Kullanici kategori olarak Lastik Tekerlekli Ekskavator Radio buttonunu secer")
    public void kullaniciKategoriOlarakLastikTekerlekliEkskavatorRadioButtonunuSecer() {
        homePage.radioLastikTekerEkskavator.click();
        BrowserUtilities.waitFor(4);

    }

    @And("Kullanici Marka olarak Volvo Radio buttonunu secer.")
    public void kullaniciMarkaOlarakVolvoRadioButtonunuSecer() {
        homePage.radioVolvoMarka.click();
        BrowserUtilities.waitFor(4);

    }

    @When("Kazici Yukleyici e tiklar")
    public void kaziciYukleyiciETiklar() {
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

    @And("Kullanici Marka olarak New Holland Radio buttonunu secer.")
    public void kullaniciMarkaOlarakNewHollandRadioButtonunuSecer() {
        homePage.radioNewHollnand.click();
        BrowserUtilities.waitFor(4);
    }

    @When("Yukleyiciler e tiklar")
    public void yukleyicilerETiklar() {
        homePage.loader.click();
        BrowserUtilities.waitFor(4);

    }



    @And("Kullanici kategori olarak Lastik Tekerlekli Yukleyici Radio buttonunu secer")
    public void kullaniciKategoriOlarakLastikTekerlekliYukleyiciRadioButtonunuSecer() {
        homePage.wheelLoader.click();
        BrowserUtilities.waitFor(4);
    }

    @When("Yukleyici e tiklar")
    public void yukleyiciETiklar() {
        homePage.loader.click();
        BrowserUtilities.waitFor(4);
    }

    @And("Kullanici Marka olarak Genie Radio buttonunu secer.")
    public void kullaniciMarkaOlarakGenieRadioButtonunuSecer() {
        homePage.genie.click();
        BrowserUtilities.waitFor(4);
    }

    @And("Kullanici kategori olarak Akulu Makasli Platform Radio buttonunu secer")
    public void kullaniciKategoriOlarakAkuluMakasliPlatformRadioButtonunuSecer() {
        homePage.batteryPoweredScissorLift.click();
        BrowserUtilities.waitFor(4);
    }

    @When("Personel Yukselticiler e tiklar")
    public void personelYukselticilerETiklar() {
        homePage.staffBoosters.click();
        BrowserUtilities.waitFor(4);
    }

    @And("Kullanici kategori olarak Dizel akulu platform Radio buttonunu secer")
    public void kullaniciKategoriOlarakDizelAkuluPlatformRadioButtonunuSecer() {
        homePage.dieselScissorLift.click();
        BrowserUtilities.waitFor(4);
    }

    @And("Kullanici Marka olarak Skyjack Radio buttonunu secer.")
    public void kullaniciMarkaOlarakSkyjackRadioButtonunuSecer() {
        homePage.skyjack.click();
        BrowserUtilities.waitFor(4);
    }

    @When("Teleskopik Yukleyici e tiklar")
    public void teleskopikYukleyiciETiklar() {
        homePage.telescopicLoader.click();
        BrowserUtilities.waitFor(4);
    }

    @And("Kullanici Marka olarak Bobcat Radio buttonunu secer.")
    public void kullaniciMarkaOlarakBobcatRadioButtonunuSecer() {
        homePage.bobcat.click();
        BrowserUtilities.waitFor(4);
    }

    @And("Kullanici kategori olarak Paletli Yukleyici Radio buttonunu secer.")
    public void kullaniciKategoriOlarakPaletliYukleyiciRadioButtonunuSecer() {
        homePage.trackLoader.click();
        BrowserUtilities.waitFor(4);
    }

    @Given("Logoya tiklar")
    public void logoyaTiklar() {
        homePage.logo.click();
        BrowserUtilities.waitFor(4);
    }

    @Then("Kullanici Sinirli Servis Garantisi basligini dogrular")
    public void kullaniciSinirliServisGarantisiBasliginiDogrular() {
        System.out.println("homePage.limitedService.getText() = " + homePage.limitedService.getText());
    }

    @Then("Uretim Yili basligini dogrular")
    public void uretimYiliBasliginiDogrular() {
        System.out.println("homePage.yearOfProduction.getText() = " + homePage.yearOfProduction.getText());
    }

    @Then("Calisma Saati basligini dogrular")
    public void calismaSaatiBasliginiDogrular() {
        System.out.println("homePage.studyTime.getText() = " + homePage.studyTime.getText());
    }
}
