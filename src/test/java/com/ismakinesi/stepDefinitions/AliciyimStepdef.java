package com.ismakinesi.stepDefinitions;

import com.ismakinesi.pages.DestekmerkeziPage;
import com.ismakinesi.utilities.BrowserUtilities;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AliciyimStepdef {

    DestekmerkeziPage destekmerkeziPage = new DestekmerkeziPage();

    @When("Kullanici Yardim Merkezine Git buttonuna tiklar")
    public void kullanici_yardim_merkezine_git_buttonuna_tiklar() {
        BrowserUtilities.scrollToElement(destekmerkeziPage.yardimMerkezi);
        BrowserUtilities.clickWithJS(destekmerkeziPage.yardimMerkezi);
        BrowserUtilities.waitFor(5);

    }
    @When("Kullanici  Aliciyim buttonuna tiklar")
    public void kullanici_aliciyim_buttonuna_tiklar() {
        BrowserUtilities.clickWithJS(destekmerkeziPage.aliciyimBtn);
        BrowserUtilities.waitFor(5);

    }

    @Then("Kullanici What is a pickup document? tiklar gorur")
    public void kullanici_what_is_a_pickup_document_tiklar_gorur() {

        Assert.assertTrue(destekmerkeziPage.satinAlma.isDisplayed());
        BrowserUtilities.waitFor(2);
        Assert.assertTrue(destekmerkeziPage.satinAlma.isEnabled());

    }
}
