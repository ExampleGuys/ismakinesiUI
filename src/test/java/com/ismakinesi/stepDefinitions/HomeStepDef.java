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



public class HomeStepDef {
    HomePage homePage = new HomePage();


    @When("Forkliftler'e tıklar")
    public void forkliftler_e_tıklar() {
        BrowserUtilities.hover(homePage.forklift);
        homePage.forklift.click();

    }

    @When("Tüm Filtreler e tıklar")
    public void tüm_filtreler_e_tıklar() {
        BrowserUtilities.hover(homePage.All_filters);
        homePage.All_filters.click();

    }

    @Then("{string} başlığını doğrular")
    public void başlığını_doğrular(String string) {
        WebElement element=Driver.get().findElement(By.xpath("//h3[.='Kategori']"));
        Assert.assertTrue("Kategori Yazısı Doğrulanmadı",homePage.Category.isEnabled());
        System.out.println(element.getText());

    }

}
