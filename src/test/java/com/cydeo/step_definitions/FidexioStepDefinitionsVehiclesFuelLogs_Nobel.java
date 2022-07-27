package com.cydeo.step_definitions;


import com.cydeo.pages.FidexioPage_Nobel;
import com.cydeo.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class FidexioStepDefinitionsVehiclesFuelLogs_Nobel {

    FidexioPage_Nobel fidexioPage = new FidexioPage_Nobel();

    @And("user hits the Vehicles Fuel Logs")
    public void userHitsTheVehiclesFuelLogs() {

        fidexioPage.vehiclesFuelLogsButton.click();

        BrowserUtils.sleep(2);
    }



    @And("user hits the Create Button")
    public void userHitsTheCreateButton() {

        fidexioPage.createButton.click();
    }


    @And("user enters vehicle informations")
    public void userEntersVehicleInformations() {
        fidexioPage.vehicleDetailsButton.sendKeys("Bmw");

        BrowserUtils.sleep(2);

        fidexioPage.vehicleDetailsButton.sendKeys(Keys.ENTER);

        fidexioPage.literDetailButton.clear();

        fidexioPage.literDetailButton.sendKeys("38");

        fidexioPage.pricePerLiterBox.clear();

        fidexioPage.pricePerLiterBox.sendKeys("1"+Keys.ENTER);

        BrowserUtils.sleep(2);

        fidexioPage.saveVehicleButton.click();

        BrowserUtils.sleep(2);



    }

    @Then("user saves the datas successfully")
    public void userSavesTheDatasSuccessfully() {

        Assert.assertTrue(fidexioPage.editButton.isDisplayed());
    }
}