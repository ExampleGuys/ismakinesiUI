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

    @Then("Kullanici Mesajlarim butonuna tiklar ve dogrular")
    public void KullaniciMesajlarimButonunaTiklarVeDogrular() {
        BrowserUtilities.hover(mesajlarimPage.mesajlarimPage);
        BrowserUtilities.verifyElementDisplayed(mesajlarimPage.mesajlarimPage);
        BrowserUtilities.doubleClick(mesajlarimPage.mesajlarimPage);
        BrowserUtilities.waitFor(5);
    }
}

