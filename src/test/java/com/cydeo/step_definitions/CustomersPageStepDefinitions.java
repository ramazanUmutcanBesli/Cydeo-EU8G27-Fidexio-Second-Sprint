package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.pages.CustomersPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.*;


public class CustomersPageStepDefinitions {
    BasePage bP =new BasePage();
    CustomersPage cP =new CustomersPage();
    WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);
    @When("sales Manager click Sales button")
    public void sales_manager_click_sales_button() {
        bP.salesButton.click();
    }
    @When("sales Manager click Customers button")
    public void sales_manager_click_customers_button() {
        cP.customersButton.click();
        wait.until(ExpectedConditions.titleIs("Customers - Odoo"));
    }
    @When("sales Manager click create button")
    public void sales_manager_click_create_button() {
        cP.createButton.click();
    }
    @Then("sales Manager should see Individual was automatically selected")
    public void sales_manager_should_see_individual_was_automatically_selected() {
        assertTrue(cP.individualbutton.isSelected());
    }
    @When("sales Manager click Company Button")
    public void sales_manager_click_company_button() {
        cP.companyButton.click();
    }
    @Then("sales Manager should see Company is selected")
    public void sales_manager_should_see_company_is_selected() {
        assertTrue(cP.companyButton.isEnabled());
    }
    @When("sales Manager click Internal Notes")
    public void sales_manager_click_internal_notes() {
        cP.internalNotesButton.click();
    }
    @Then("sales Manager should see Internal Notes can be selected")
    public void sales_manager_should_see_internal_notes_can_be_selected() {
        assertTrue(cP.internalNotesButton.isEnabled());
    }
    @When("sales Manager click Sales & Purchases")
    public void sales_manager_click_sales_purchases() {
        cP.salesPurchasesButton.click();
    }
    @Then("sales Manager should see Sales & Purchases can be selected")
    public void sales_manager_should_see_sales_purchases_can_be_selected() {
        assertTrue(cP.salesPurchasesButton.isEnabled());
    }
    @When("sales Manager click Invoicing")
    public void sales_manager_click_invoicing() {
        cP.invoicingButton.click();
    }
    @Then("sales Manager should see Invoicing can be selected")
    public void sales_manager_should_see_invoicing_can_be_selected() {
        assertTrue(cP.invoicingButton.isEnabled());
    }
    @When("sales Manager click Company select button")
    public void sales_manager_click_company_select_button() {
        cP.individualbutton.click();
        wait.until(ExpectedConditions.invisibilityOf(cP.companySelectButton));


    }
    @Then("sales Manager should see Company select button can be writtable")
    public void sales_manager_should_see_company_select_button_can_be_writtable() {
        cP.companySelectButton.click();
        cP.companySelectButton2.click();

    }
    @When("sales Manager click Address Type select button")
    public void sales_manager_click_state_select_button() {
        Select addressTypeSelection=new Select(cP.addressTypeDropdown);
        addressTypeSelection.selectByValue(ConfigurationReader.getProperty("create.customers.sales.functionality.value"));


    }
    @Then("sales Manager should see Address Type can be selected")
    public void sales_manager_should_see_state_dropdown_select_button_can_be_writtable() {
        assertEquals(ConfigurationReader.getProperty
                ("create.customers.sales.functionality.value")
                ,cP.addressTypeDropdown.getAttribute("value"));
    }
    @When("sales Manager click TIN Tags")
    public void sales_manager_click_country_select_button() {
        cP.tinTagsSelectButton.click();
        cP.tinTagsSelectButton2.click();
        wait.until(ExpectedConditions.elementToBeClickable(cP.titleButton));
    }

    @When("sales Manager click Title select Button")
    public void sales_manager_click_title_select_button() {
        cP.titleButton.click();
        cP.titleButton2.click();
    }
    @Then("sales Manager should see Title select button can be writtable")
    public void sales_manager_should_see_title_select_button_can_be_writtable() {
        assertTrue(cP.titleButton2.isEnabled());
    }
    @When("sales Manager click Language select Button")
    public void sales_manager_click_language_select_button() {
        Select languageDropdown=new Select(cP.languageDropdown);
        languageDropdown.selectByIndex(1);
    }
    @Then("sales Manager should see English can be selected")
    public void sales_manager_should_see_english_can_be_selected() {
        assertEquals("English",cP.languageDropdown.getText());

    }




    // Test Case 2

    @When("sales Manager select individual type of customer")
    public void sales_manager_select_individual_type_of_customer() {
        cP.individualbutton.click();
    }
    @When("sales Manager write customers' name")
    public void sales_manager_write_customers_name() {
        cP.nameInputBox.sendKeys(ConfigurationReader.getProperty("create.customers.sales.functionality.customer.name"));
    }
    @When("sales Manager select customers' company")
    public void sales_manager_select_customers_company() {
        cP.companySelectButton.click();
        cP.companySelectButton2.click();
    }
    @When("sales Manager select Address Type")
    public void sales_manager_select_address_type() {
        Select addressTypeSelection=new Select(cP.addressTypeDropdown);
        addressTypeSelection.selectByValue(ConfigurationReader.getProperty("create.customers.sales.functionality.value"));
    }
    @When("sales Manager write customers' Address")
    public void sales_manager_write_customers_address() {
        cP.streetInputBox.sendKeys(ConfigurationReader.getProperty("create.customers.sales.functionality.customer.street"));
        cP.street2InputBox.sendKeys(ConfigurationReader.getProperty("create.customers.sales.functionality.customer.street2"));
        cP.cityInputBox.sendKeys(ConfigurationReader.getProperty("create.customers.sales.functionality.customer.city"));
        cP.stateInputBox.click();
        cP.state2InputBox.click();
        cP.zipInputBox.sendKeys(ConfigurationReader.getProperty("create.customers.sales.functionality.customer.zip"));
    }
    @When("sales Manager select customers' country")
    public void sales_manager_select_customers_country() {
        cP.countrySelect.click();
        cP.countrySelect2.click();
    }
    @When("sales Manager select TIN Tags")
    public void sales_manager_select_tin_tags() {
        cP.tinTagsSelectButton.click();
        cP.tinTagsSelectButton2.click();
    }
    @When("sales Manager write customers' Job Position")
    public void sales_manager_write_customers_job_position() {
        cP.jobPosition.sendKeys(ConfigurationReader.getProperty("create.customers.sales.functionality.customer.job.position"));
    }
    @When("sales Manager write customers' phone")
    public void sales_manager_write_customers_phone() {
        cP.phoneInputBox.sendKeys(ConfigurationReader.getProperty("create.customers.sales.functionality.customer.phone"));
    }
    @When("sales Manager write customers' Mobile phone")
    public void sales_manager_write_customers_mobile_phone() {
        cP.mobileInputBox.sendKeys(ConfigurationReader.getProperty("create.customers.sales.functionality.customer.mobile"));
    }
    @When("sales Manager write customers' Email")
    public void sales_manager_write_customers_email() {
        cP.emailInputBox.sendKeys(ConfigurationReader.getProperty("create.customers.sales.functionality.customer.eMail"));
    }
    @When("sales Manager write customers' Website")
    public void sales_manager_write_customers_website() {
        cP.websiteInputBox.sendKeys(ConfigurationReader.getProperty("create.customers.sales.functionality.customer.website"));
    }
    @When("sales Manager write customers' Title")
    public void sales_manager_write_customers_title() {
        cP.titleButton.click();
        cP.titleButton2.click();
    }
    @When("sales Manager write customers' Language")
    public void sales_manager_write_customers_language() {
        Select languageDropdown=new Select(cP.languageDropdown);
        languageDropdown.selectByIndex(1);
    }
    @When("sales Manager click save button")
    public void sales_manager_click_save_button() {
        cP.saveButton.click();
    }
    @Then("sales Manager should see created Customer")
    public void sales_manager_should_see_created_customer() {

        assertEquals(ConfigurationReader.getProperty("create.customers.sales.functionality.address.type"),cP.addressTypeVerification.getText());
        assertEquals(ConfigurationReader.getProperty("create.customers.sales.functionality.customer.name"),cP.nameVerification.getText());
    }



}
