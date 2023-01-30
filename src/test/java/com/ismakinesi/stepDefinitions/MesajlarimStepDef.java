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

import java.util.List;

public class MesajlarimStepDef {

    MesajlarimPage mesajlarimPage = new MesajlarimPage();

    LoginPage loginPage = new LoginPage();

    @And("Kullanici Mesajlarim butonua tiklar")
    public void kullaniciMesajlarimButonuaTiklar() {
        BrowserUtilities.hover(mesajlarimPage.mesajlarim);
        BrowserUtilities.doubleClick(mesajlarimPage.mesajlarim);
        BrowserUtilities.waitFor(5);
    }

    @Then("Kullanici Mesajlarim butonuna tiklandigini dogrular")
    public void kullaniciMesajlarimButonunaTiklandiginiDogrular() {
        Assert.assertEquals("Mesajlarım", mesajlarimPage.mesajlarimBasligi.getText());
    }

    @Then("Kullanici Mesajlar ve Bildirimler butonlarinin calistigini dogrular ve tiklar")
    public void kullanici_mesajlar_ve_bildirimler_butonlarinin_calistigini_dogrular_ve_tiklar() {

        BrowserUtilities.hover(mesajlarimPage.mesajlar);
        mesajlarimPage.mesajlar.click();
        BrowserUtilities.waitFor(3);

        BrowserUtilities.hover(mesajlarimPage.bildirimler);
        mesajlarimPage.bildirimler.click();
        BrowserUtilities.waitFor(3);

    }


}

