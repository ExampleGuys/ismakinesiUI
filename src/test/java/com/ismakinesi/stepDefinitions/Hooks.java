package com.ismakinesi.stepDefinitions;

import com.ismakinesi.utilities.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.time.Duration;


public class Hooks {

    @Before
    public void setUp(Scenario scenario) {

//        Driver.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Driver.getDriver().manage().window().maximize();
        System.out.println(scenario.getName());
    }

    @AfterStep
    public void step(Scenario scenario) {
        System.out.println("Step is" + scenario.getStatus());

    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshot");

        }
        System.out.println("scenario is" + scenario.getStatus());
        Driver.closeDriver();

    }


}
