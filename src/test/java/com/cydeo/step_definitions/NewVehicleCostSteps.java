package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.pages.NewVehicleCostPage;
import com.cydeo.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class NewVehicleCostSteps {

    BasePage basePage = new BasePage();
    NewVehicleCostPage vehiclePage = new NewVehicleCostPage();


    @Then("User should see {string} option at the top of the home page")
    public void user_should_see_option_at_the_top_of_the_home_page(String fleetTxt) {
        BrowserUtils.sleep(1);
        Assert.assertEquals(fleetTxt, vehiclePage.fleetBtn.getText());
    }
    @And("User should be able to click on Fleet option")
    public void user_should_be_able_to_click_on_fleet_option() {
        vehiclePage.fleetBtn.click();
        Assert.assertTrue(vehiclePage.imageAfterClickFleet.isDisplayed());
        BrowserUtils.sleep(1);
    }





}
