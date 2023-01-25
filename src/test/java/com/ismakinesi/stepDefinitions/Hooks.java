package com.ismakinesi.stepDefinitions;

import com.ismakinesi.utilities.Driver;
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
        Driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Driver.get().manage().window().maximize();
        System.out.println(scenario.getName());
    }

    @AfterStep
    public void step(Scenario scenario) {
        System.out.println("Step is " + scenario.getStatus());

    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshot");

        }
        System.out.println("Scenario is " + scenario.getStatus());
        Driver.closeDriver();

    }


}
