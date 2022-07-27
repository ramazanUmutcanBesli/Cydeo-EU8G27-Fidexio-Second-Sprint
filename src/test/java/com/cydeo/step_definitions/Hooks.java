package com.cydeo.step_definitions;

import com.cydeo.pages.US36DurakSurveysPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @After(order = 1)
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

    /**
     * This method deletes the created Survey in order to clean Test Space
     * This method can be triggered by tag and before tearDownScenario
     */
    @After(value = "@clearTestData_US-36-durak",order = 2)
    public void clearTestData(){
        System.out.println("clearing Test data...");
        US36DurakSurveysPage surveysPage = new US36DurakSurveysPage();
        surveysPage.menuBar("Surveys");
        surveysPage.eraseGeneratedSurvey();
    }
}
