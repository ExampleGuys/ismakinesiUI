package com.ismakinesi.stepDefinitions;

import com.ismakinesi.pages.TeklifHakkiPage;
import com.ismakinesi.utilities.BrowserUtilities;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class YeniFirmaStepDef {
    TeklifHakkiPage teklifHakkiPage = new TeklifHakkiPage();

    @Then("yeni firma iconu gorulebilir")
    public void yeniFirmaIconuGorulebilir() {
        BrowserUtilities.waitFor(5);
        Assert.assertTrue(teklifHakkiPage.yeniFirmaBtn.isDisplayed());
    }

    @Then("yeni firma iconuna tiklanabilir")
    public void yeniFirmaIconunaTiklanabilir() {
        Assert.assertTrue(teklifHakkiPage.yeniFirmaBtn.isEnabled());
    }
}

