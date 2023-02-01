package com.ismakinesi.stepDefinitions;

import com.ismakinesi.pages.BasePage;
import com.ismakinesi.pages.ForkliftsPage;
import com.ismakinesi.utilities.BrowserUtilities;
import io.cucumber.java.en.And;

public class TeklifVerme extends BasePage {
    ForkliftsPage forkliftsPage = new ForkliftsPage();

    @And("forkliftlere gider")
    public void forkliftlereGider() {
        // BrowserUtilities.waitFor(10);
        BrowserUtilities.waitForClickability(forkliftsPage.forklifts, 30);
        forkliftsPage.forklifts.click();
        BrowserUtilities.waitFor(2);
    }

    @And("son ilanlardan birine girer")
    public void sonIlanlardanBirineGirer() {
        // WebElement setRandomVehicle = forkliftsPage.setLinkVehicle();
        // BrowserUtilities.waitForClickability(setRandomVehicle,30);
        BrowserUtilities.waitForClickability(forkliftsPage.linkCaterpillarAtacamaEur, 30);
        forkliftsPage.linkCaterpillarAtacamaEur.click();
        BrowserUtilities.waitFor(2);
    }

    @And("teklif ver butona tiklar")
    public void teklifVerButonaTiklar() {
        BrowserUtilities.waitFor(5);
        BrowserUtilities.switchToWindow("2017 Caterpillar DP70NM");
        BrowserUtilities.waitForClickability(forkliftsPage.buttonTeklifVer, 30);
        forkliftsPage.buttonTeklifVer.click();
        BrowserUtilities.waitFor(2);
    }

    @And("yeni bir teklif verir")
    public void yeniBirTeklifVerir() {
        String highestBid = forkliftsPage.highestBid.getText();
        System.out.println("highestBid = " + highestBid);

        forkliftsPage.inputTeklif.sendKeys(forkliftsPage.bidConverter(highestBid));

        BrowserUtilities.waitFor(2);
        forkliftsPage.buttonDevam.click();
        BrowserUtilities.waitFor(10);
    }
}
