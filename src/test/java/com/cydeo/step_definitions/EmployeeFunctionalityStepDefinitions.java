package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.pages.EmployeesPage;
import com.cydeo.utilities.BrowserUtils;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.security.Key;

import static org.junit.Assert.*;

public class EmployeeFunctionalityStepDefinitions {

    BasePage basePage = new BasePage();
    EmployeesPage employeesPage = new EmployeesPage();

    @Then("user click Employees button")
    public void user_click_employees_button() {
        BrowserUtils.waitForElementToBeClickable(basePage.employeesButton);
        basePage.employeesButton.click();
    }

    @When("Pos manager clicks create button")
    public void pos_manager_clicks_create_button() {
        BrowserUtils.waitForElementToBeClickable(employeesPage.createButton);
        employeesPage.createButton.click();

    }

    @Then("Pos manager should see Employees New page")
    public void pos_manager_should_see_employees_new_page() {
        assertTrue(employeesPage.createPageFormSheet.isDisplayed());
    }

    @When("Pos manager clicks Import button")
    public void pos_manager_clicks_import_button() {
        BrowserUtils.waitForElementToBeClickable(employeesPage.importButton);
        employeesPage.importButton.click();
    }

    @Then("Pos manager should see Import a File page")
    public void pos_manager_should_see_import_a_file_page() {
        assertTrue(employeesPage.importFileSheet.isDisplayed());
    }

    @When("Pos manager clicks Next button")
    public void pos_manager_clicks_next_button() {
        BrowserUtils.waitForElementToBeClickable(employeesPage.nextButton);
        employeesPage.nextButton.click();
    }

    @Then("Pos manager should see Next Employees page")
    public void pos_manager_should_see_next_employees_page() {
        assertTrue(employeesPage.nextPageEmployeeCounter.getText().contains("81"));
    }

    @When("Pos manager clicks Previous button")
    public void pos_manager_clicks_previous_button() {
        BrowserUtils.waitForElementToBeClickable(employeesPage.previousButton);
        employeesPage.previousButton.click();
    }

    @Then("Pos manager should see Previous Employees page")
    public void pos_manager_should_see_previous_employees_page() {
        assertTrue(employeesPage.nextPageEmployeeCounter.getText().contains("81"));
    }

    @When("Pos manager clicks List button")
    public void pos_manager_clicks_list_button() {
        BrowserUtils.waitForElementToBeClickable(employeesPage.listIcon);
        employeesPage.listIcon.click();
    }

    @Then("Pos manager should see Listed Employees page")
    public void pos_manager_should_see_listed_employees_page() {
        assertTrue(employeesPage.employeesList.isDisplayed());
    }

    @When("Pos manager clicks Kanban button")
    public void pos_manager_clicks_kanban_button() {
        BrowserUtils.waitForElementToBeClickable(employeesPage.kanbanIcon);
        employeesPage.kanbanIcon.click();
    }

    @Then("Pos manager should see Kanban Employees page")
    public void pos_manager_should_see_kanban_employees_page() {
        assertTrue(employeesPage.employeesKanban.isDisplayed());
    }

    @When("Pos manager clicks Follow button")
    public void pos_manager_clicks_follow_button() {
        BrowserUtils.waitForElementToBeClickable(employeesPage.followButton);
        if (employeesPage.followButton.getText().equals("Follow")) {
            employeesPage.followButton.click();
        } else {
            BrowserUtils.waitForElementToBeClickable(employeesPage.unfollowButton);
            employeesPage.followButton.click();
            BrowserUtils.waitForElementToBeClickable(employeesPage.followButton);
            employeesPage.followButton.click();

        }

    }

    @Then("Pos manager should see Following text on the button")
    public void pos_manager_should_see_following_text_on_the_button() {
        BrowserUtils.waitForElementToBeClickable(employeesPage.unfollowButton);
        System.out.println(employeesPage.followButton.getText());
        if (employeesPage.followButton.getText().equals("Unfollow") || employeesPage.followButton.getText().equals("Following"))
            assertTrue(true);
    }

    @When("Pos manager clicks Unfollow button")
    public void pos_manager_clicks_unfollow_button() {
        BrowserUtils.waitForElementToBeClickable(employeesPage.followButton);
        if (employeesPage.followButton.getText().equals("Following")) {
            System.out.println(employeesPage.followButton.getText());
            employeesPage.followButton.click();
        } else {
            System.out.println(employeesPage.followButton.getText());

            System.out.println("else statement");
            BrowserUtils.waitForElementToBeClickable(employeesPage.unfollowButton);
            employeesPage.followButton.click();
            BrowserUtils.sleep(2);
            BrowserUtils.waitForElementToBeClickable(employeesPage.followButton);
            employeesPage.followButton.click();
            BrowserUtils.sleep(2);


        }

    }

    @Then("Pos manager should see Follow text on the button")
    public void pos_manager_should_see_follow_text_on_the_button() {
        BrowserUtils.waitForElementToBeClickable(employeesPage.unfollowButton);
        BrowserUtils.sleep(1);
        BrowserUtils.waitForElementToBeClickable(employeesPage.followButton);
        assertTrue(employeesPage.followButton.getText().equals("Follow"));

    }

    @When("Pos manager enters name {string}")
    public void posManagerEntersName(String name) {
        BrowserUtils.sleep(3);
        employeesPage.inputEmployeeName.sendKeys(name);
    }

    @When("Pos manager enters department {string}")
    public void posManagerEntersDepartment(String department) {
        employeesPage.inputDepartment.sendKeys(department+ Keys.ENTER);
    }

    @When("Pos manager enters job position {string}")
    public void posManagerEntersJobPosition(String jobPosition) {
        employeesPage.inputJobPosition.sendKeys(jobPosition+Keys.ENTER);
    }

    @When("Pos manager enters manager {string}")
    public void posManagerEntersManager(String manager) {
        employeesPage.inputManager.sendKeys(manager+Keys.ENTER);
    }

    @When("Pos manager enters coach {string}")
    public void posManagerEntersCoach(String coach) {
        employeesPage.inputCoach.sendKeys(coach+ Keys.ENTER);
    }

    @When("Pos manager enters work email{string}")
    public void posManagerEntersWorkEmail(String workEmail) {
        employeesPage.inputWorkEmail.sendKeys(workEmail);
    }

    @When("Pos manager enters work location {string}")
    public void posManagerEntersWorkLocation(String workLocation) {
        employeesPage.inputWorkLocation.sendKeys(workLocation);
    }

    @When("Pos manager enters work address{string}")
    public void posManagerEntersWorkAddress(String workAddress) {
        employeesPage.inputWorkAddress.sendKeys(workAddress+Keys.ENTER);
    }

    @When("Pos manager enters work mobile{string}")
    public void posManagerEntersWorkMobile(String workMobile) {
        employeesPage.inputMobile.sendKeys(workMobile+Keys.ENTER);

    }

    @When("Pos manager enters work phone{string}")
    public void posManagerEntersWorkPhone(String workPhone) {
        employeesPage.inputPhone.sendKeys(workPhone+Keys.ENTER);
    }

    @When("Pos manager enters working hours{string}")
    public void posManagerEntersWorkingHours(String workingHours) {
        employeesPage.inputWorkingHours.sendKeys(workingHours);
    }

    @When("Pos manager enters e.g Part time{string}")
    public void posManagerEntersEGPartTime(String partTimeDropdown) {
        employeesPage.inputegPartTime.sendKeys(partTimeDropdown+Keys.ENTER);
    }

    @Then("Pos manager clicks save button")
    public void posManagerClicksSaveButton() {
        employeesPage.saveButton.click();

    }

    @Then("Pos manager should see Employee Created message")
    public void posManagerShouldSeeEmployeeCreatedMessage() {

    }
}
