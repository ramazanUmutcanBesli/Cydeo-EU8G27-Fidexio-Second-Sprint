package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.pages.CustomersPage;
import com.cydeo.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static com.cydeo.utilities.BrowserUtils.*;
import static org.junit.Assert.*;


public class CustomersPageStepDefinitions {
    BasePage basePage =new BasePage();
    CustomersPage cP =new CustomersPage();
    @Given("sales Manager click Sales button on the Home Page")
    public void sales_manager_click_sales_button_on_the_home_page() {
        basePage.salesButton.click();


    }
    @Given("sales Manager click Customers button in Orders List")
    public void sales_manager_click_customers_button_in_orders_list() {
        cP.customersButton.click();
    }
    @When("sales Manager click create button")
    public void sales_manager_click_create_button() {
        cP.createButton.click();
    }
    @Then("sales Manager should see {string} in Page Title")
    public void sales_manager_should_see_in_page_title(String string) {
        verifyTitle(string);
    }



    @When("sales Manager click Individual Select button")
    public void sales_manager_click_individual_select_button() {
        cP.companyButton.click();
        cP.individualbutton.click();
    }
    @Then("sales Manager can should see individual button is selected")
    public void sales_manager_can_should_see_individual_button_is_selected() {
        assertTrue(cP.individualbutton.isSelected());
    }
}
