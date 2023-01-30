package com.ismakinesi.stepDefinitions;

import com.ismakinesi.pages.BilgilerimPage;
import com.ismakinesi.pages.MesajlarimPage;
import com.ismakinesi.utilities.BrowserUtilities;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class BilgilerimStepDef {

    BilgilerimPage bilgilerimPage = new BilgilerimPage();

    @And("Kullanici Bilgilerim butonuna tiklar")
    public void kullaniciBilgilerimButonuaTiklar() {
        BrowserUtilities.hover(bilgilerimPage.bilgilerim);
        BrowserUtilities.doubleClick(bilgilerimPage.bilgilerim);
        BrowserUtilities.waitFor(5);
    }


    @Then("Kullanici Bilgilerim butonuna tiklandigini dogrular")
    public void kullaniciBilgilerimButonunaTiklandiginiDogrular() {
        Assert.assertEquals("Bilgilerim", bilgilerimPage.bilgilerimBasligi.getText());
        System.out.println(bilgilerimPage.bilgilerimBasligi.getText());
    }
}
