package com.cydeo.step_definitions;

import com.cydeo.pages.US36DurakSurveysPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Map;

public class US36SurveysDurakStepDefs {
    US36DurakSurveysPage surveysPage = new US36DurakSurveysPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);
    Actions actions = new Actions(Driver.getDriver());

    @Then("user clicks {string} option at the top bar of the home page")
    public void user_clicks_option_at_the_top_bar_of_the_home_page(String menuOption) {
        surveysPage.menuBar(menuOption);
    }

    @Then("user should be landing on {string} page")
    public void user_should_be_landing_on_page(String pageTitle) {
        wait.until(ExpectedConditions.titleContains(pageTitle));
        Assert.assertTrue(Driver.getDriver().getTitle().contains(pageTitle));
    }

    @Then("user clicks {string} button")
    public void user_clicks_button(String clickBtn) {
        surveysPage.clickBtn(clickBtn);
        BrowserUtils.sleep(2);
    }

    @Then("user enters generated Survey Title on upcoming window")
    public void user_enters_on_upcoming_window() {
        surveysPage.generateSurvey();
    }

    @Then("verify that {string} message appears under the survey form sheet")
    public void verify_that_message_appears_under_the_survey_form_sheet(String message) {
        Assert.assertEquals(message, surveysPage.surveyCreatedMessage.getText());
    }

    @And("user clicks listed buttons")
    public void userClicksAllCurrentButtonsOneByOne(DataTable dataTable) {
        if (dataTable.asLists().get(0).get(0).contains("Action")) {
            // Converting Maps
            List<Map<String, String>> actionVerificationTable = dataTable.asMaps();
            for (Map<String, String> each : actionVerificationTable) {
                System.out.println("Action: " + each.get("Action"));
                surveysPage.clickBtn(each.get("Action"));
                BrowserUtils.sleep(1);
                System.out.println("Verification: " + each.get("Verification"));
                surveysPage.verify(each.get("Verification"));
                BrowserUtils.sleep(1);
            }
        } else {
            //converting Lists
            List<List<String>> AVList = dataTable.asLists();
            for (List<String> row : AVList) {
                System.out.println("Action: " + row.get(0));
                surveysPage.clickBtn(row.get(0));
                BrowserUtils.sleep(1);

                System.out.println("Verification: " + row.get(1));
                surveysPage.verify(row.get(1));
                BrowserUtils.sleep(1);
            }
        }
    }

    @Then("verify that user should see created survey in Survey module")
    public void verifyThatUserShouldSeeCreatedSurveyInSurveyModule() {
        boolean isSurveyExist = surveysPage.isSurveyOnTheList(US36DurakSurveysPage.generatedSurveyTitle);
        Assert.assertTrue(isSurveyExist);

    }

    @Then("user delete generated survey on the list")
    public void deleteGeneratedSurvey() {
        surveysPage.eraseGeneratedSurvey();
    }

    @Given("user create a Survey")
    public void userCreateAGeneratedSurvey() {
        user_clicks_option_at_the_top_bar_of_the_home_page("Surveys");
        user_should_be_landing_on_page("Surveys");
        user_clicks_button("create");
        user_enters_on_upcoming_window();
        user_clicks_button("save");
        System.out.println("New Survey is created\nSurvey name: " + surveysPage.getGeneratedSurveyTitle());
    }
}
