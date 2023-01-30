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

    @Then("Kullanici Mesajlarim butonuna tiklandigini dogrular")
    public void KullaniciMesajlarimButonunaTiklandigiDogrular() {
        BrowserUtilities.hover(mesajlarimPage.mesajlarim);
        BrowserUtilities.verifyElementDisplayed(mesajlarimPage.mesajlarim);
        BrowserUtilities.doubleClick(mesajlarimPage.mesajlarim);
        BrowserUtilities.waitFor(5);
    }

    @Then("Kullanici Mesajlar ve Bildirimler butonlarinin calistigini dogrular ve tiklar")
    public void kullanici_mesajlar_ve_bildirimler_butonlarinin_calistigini_dogrular_ve_tiklar() {
        BrowserUtilities.hover(mesajlarimPage.mesajlarim);
        BrowserUtilities.doubleClick(mesajlarimPage.mesajlarim);
        BrowserUtilities.waitFor(3);

        BrowserUtilities.hover(mesajlarimPage.mesajlar);
        BrowserUtilities.verifyElementClickable(mesajlarimPage.mesajlar);
        BrowserUtilities.doubleClick(mesajlarimPage.mesajlar);
        BrowserUtilities.waitFor(3);

        BrowserUtilities.hover(mesajlarimPage.bildirimler);
        BrowserUtilities.verifyElementClickable(mesajlarimPage.bildirimler);
        BrowserUtilities.doubleClick(mesajlarimPage.bildirimler);
        BrowserUtilities.waitFor(3);
    }

}

