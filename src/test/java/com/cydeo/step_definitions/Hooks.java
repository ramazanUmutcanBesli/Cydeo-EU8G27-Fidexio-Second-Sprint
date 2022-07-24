package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @After
    public void tearDownScenario(Scenario scenario){
        if (false){//  <---- scenario.isFailed()
            byte[] screenshot =((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png", scenario.getName());
        }
        Driver.closeDriver();
    }
    @AfterStep(value = "@takeSS")
    public void eachStepScreenShot(Scenario scenario){
        byte[] screenshot =((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot,"image/png", scenario.getName());
    }
}
