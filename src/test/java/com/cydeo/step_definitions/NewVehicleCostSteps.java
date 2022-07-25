package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.pages.NewVehicleCostPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewVehicleCostSteps {

    BasePage basePage = new BasePage();
    NewVehicleCostPage vehiclePage = new NewVehicleCostPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);


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

    @When("user clicks Create button")
    public void user_clicks_create_button() {
        vehiclePage.createBtn.click();
    }
    @Then("User should see {string} header and {string}, {string}, {string}, {string}, {string} options correctly in the middle of the page")
    public void user_should_see_header_and_options_correctly_in_the_middle_of_the_page(String expCostDetails, String expVehicle, String expType, String expTotPrice, String expCostDesc, String expDate) {
        BrowserUtils.sleep(3);
        Assert.assertEquals(expCostDetails, vehiclePage.costDetailsTxt.getText());
        Assert.assertEquals(expVehicle, vehiclePage.vehicleTxt.getText());
        Assert.assertEquals(expType, vehiclePage.typeTxt.getText());
        Assert.assertEquals(expTotPrice, vehiclePage.totPriceTxt.getText());
        Assert.assertEquals(expCostDesc, vehiclePage.costDescTxt.getText());
        Assert.assertEquals(expDate, vehiclePage.dateTxt.getText());
    }

    @Then("User should be able to select a vehicle {string} from Vehicle dropdown")
    public void user_should_be_able_to_select_a_vehicle_from_vehicle_dropdown(String vehicleName) {

        System.out.println("vehicleName = " + vehicleName);
        BrowserUtils.sleep(2);
        vehiclePage.vehicleInput.click();

        Assert.assertEquals(vehicleName, Driver.getDriver().findElement(By.xpath("//a[.='"+vehicleName+"']")).getText());
        Driver.getDriver().findElement(By.xpath("//a[.='"+vehicleName+"']")).click();
    }

    @Then("User should be able to select a type of cost {string} from Type dropdown")
    public void user_should_be_able_to_select_a_type_of_cost_from_type_dropdown(String costType) {

        System.out.println("costType = " + costType);
        BrowserUtils.sleep(2);
        vehiclePage.typeInput.click();

        Assert.assertEquals(costType, Driver.getDriver().findElement(By.xpath("//a[.='"+costType+"']")).getText());
        Driver.getDriver().findElement(By.xpath("//a[.='"+costType+"']")).click();
    }

    @Then("User should be able to select a date {string} from Calendar")
    public void user_should_be_able_to_select_a_date_from_calendar(String date) {

        vehiclePage.calendarInput.sendKeys(date);
        Assert.assertTrue(vehiclePage.calendarInput.isDisplayed());
    }

    @And("user selects a vehicle {string} and a type of cost")
    public void user_selects_a_vehicle_and_a_type_of_cost(String carBrand) {
        BrowserUtils.sleep(2);
        vehiclePage.vehicleInput.click();

        if (vehiclePage.vehicleSelect.getText().contains(carBrand)){
            vehiclePage.vehicleSelect.click();
        }else if (vehiclePage.vehicle2Select.getText().contains(carBrand)){
            vehiclePage.vehicle2Select.click();
        }else if (vehiclePage.vehicle3Select.getText().contains(carBrand)){
            vehiclePage.vehicle3Select.click();
        }else if (vehiclePage.vehicle4Select.getText().contains(carBrand)){
            vehiclePage.vehicle4Select.click();
        }

        vehiclePage.typeInput.click();
        vehiclePage.typeSelect.click();
    }
    @When("user enters the numeric characters {string} into the Total Price box")
    public void user_enters_the_numeric_characters_into_the_total_price_box(String numerics) {
        vehiclePage.totPriceInput.clear();
        vehiclePage.totPriceInput.sendKeys(numerics);
    }
    @Then("User should be able to successfully save a cost for the vehicle {string}")
    public void user_should_be_able_to_successfully_save_a_cost_for_the_vehicle(String carBrand) {

        vehiclePage.saveBtn.click();
        BrowserUtils.sleep(2);
        /*
        The appearance of the vehicle's name as a header means
        that a new vehicle cost has been saved.
        Btw we also check that it is written correctly.
         */
        Assert.assertTrue(vehiclePage.vehicleAfterSave.getText().contains(carBrand));
        System.out.println("vehicleNameHeader = " + vehiclePage.vehicleNameHeader.getText());
        Assert.assertEquals(vehiclePage.vehicleNameHeader.getText(), vehiclePage.vehicleAfterSave.getText());
    }

    @When("user enters the non numeric characters {string} into the Total Price box")
    public void user_enters_the_non_numeric_characters_into_the_total_price_box(String non_numerics) {
        vehiclePage.totPriceInput.clear();
        vehiclePage.totPriceInput.sendKeys(non_numerics);
    }
    @Then("User should see {string} error message after saving")
    public void user_should_see_error_message_after_saving(String errorMessage) {

        vehiclePage.saveBtn.click();

        wait.until(ExpectedConditions.visibilityOf(vehiclePage.invalidMessage));
        System.out.println("expectedErrorMessage = " + errorMessage);
        System.out.println("actualErrorMessage = " + vehiclePage.invalidMessage.getText());

        Assert.assertEquals(errorMessage, vehiclePage.invalidMessage.getText());
    }

    @And("user enters total price {string} and selects a date {string}")
    public void user_enters_total_price_and_selects_a_date(String price, String date) {
        vehiclePage.totPriceInput.clear();
        vehiclePage.totPriceInput.sendKeys(price);
        vehiclePage.calendarInput.sendKeys(date);
    }
    @When("user clicks Save button")
    public void user_clicks_save_button() {
        BrowserUtils.sleep(2);
        vehiclePage.saveBtn.click();
    }
    @Then("User should see the new vehicle {string} cost at the top of the list as dated {string}")
    public void user_should_see_the_new_vehicle_cost_option_at_the_top_of_the_home_page(String carBrand, String date) {
        vehiclePage.vehicleCostOpt.click();

        WebElement groupName = Driver.getDriver().findElement(By.xpath("//*[contains(.,'"+carBrand+"')]/th"));
        groupName.click();
        BrowserUtils.sleep(3);

        vehiclePage.dateTab.click();
        BrowserUtils.sleep(3);

        Assert.assertEquals(date, vehiclePage.dateToVerify.getText());


    }

}
