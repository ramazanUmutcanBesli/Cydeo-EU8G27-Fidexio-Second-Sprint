package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.pages.NewVehicleCostPage;
import com.cydeo.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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

    @When("user clicks Fleet option")
    public void user_clicks_fleet_option() {
        BrowserUtils.sleep(2);
        vehiclePage.fleetBtn.click();

    }
    /*
    @Then("User should see Vehicles options on the left side of the page respectively")
    public void user_should_see_vehicles_options_on_the_left_side_of_the_page_respectively(io.cucumber.datatable.DataTable dataTable) throws Throwable {
        List<String> vehiclesOptions = new ArrayList<>();
        vehiclesOptions.add(vehiclePage.vehiclesOpt.getText());
        vehiclesOptions.add(vehiclePage.vehiclesOdoOpt.getText());
        vehiclesOptions.add(vehiclePage.vehicleCostOpt.getText());
        vehiclesOptions.add(vehiclePage.vehiclesContOpt.getText());
        vehiclesOptions.add(vehiclePage.vehiclesFuelOpt.getText());
        vehiclesOptions.add(vehiclePage.vehiclesServOpt.getText());

        List<String> expectedOptions = dataTable.asList(String.class);

        System.out.println(vehiclesOptions);

        System.out.println(expectedOptions);

        Assert.assertEquals(expectedOptions, vehiclesOptions);
    }
     */
    @Then("User should see {string}, {string}, {string}, {string}, {string}, {string} options on the left side of the page")
    public void user_should_see_options_on_the_left_side_of_the_page(String option1, String option2, String option3, String option4, String option5, String option6) {
        BrowserUtils.sleep(2);
        Assert.assertEquals(option1,vehiclePage.vehiclesOpt.getText());
        Assert.assertEquals(option2,vehiclePage.vehiclesOdoOpt.getText());
        Assert.assertEquals(option3,vehiclePage.vehicleCostOpt.getText());
        Assert.assertEquals(option4,vehiclePage.vehiclesContOpt.getText());
        Assert.assertEquals(option5,vehiclePage.vehiclesFuelOpt.getText());
        Assert.assertEquals(option6,vehiclePage.vehiclesServOpt.getText());
    }

    @When("user clicks Vehicle Costs option on the left side of the page")
    public void user_clicks_vehicle_costs_option_on_the_left_side_of_the_page() {
        BrowserUtils.sleep(1);
        vehiclePage.vehicleCostOpt.click();
    }
    @Then("User should see {string} option text at the top of the page")
    public void user_should_see_option_text_at_the_top_of_the_page(String expectedText) {
        BrowserUtils.sleep(2);
        Assert.assertEquals(expectedText, vehiclePage.vehicleCostsText.getText());
    }






}
