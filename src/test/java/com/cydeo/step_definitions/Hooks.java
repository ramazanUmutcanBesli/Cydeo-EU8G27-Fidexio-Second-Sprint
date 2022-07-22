package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import org.junit.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @After
    public void tearDownScenario(){
        Driver.closeDriver();
    }
    @AfterStep(value = "@dont_run")
    public void eachStepScreenShot(Scenario scenario){
        byte[] screenshot =((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot,"image/png", scenario.getName());
    }
}
