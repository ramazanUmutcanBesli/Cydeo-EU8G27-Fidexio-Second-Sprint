package com.cydeo.step_definitions;

import com.cydeo.pages.US36DurakSurveysPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.util.Locale;

public class US36SurveysDurakStepDefs {
    US36DurakSurveysPage surveysPage = new US36DurakSurveysPage();

    @Then("user clicks {string} option at the top bar of the home page")
    public void user_clicks_option_at_the_top_bar_of_the_home_page(String menuBar) {
        switch (menuBar.toLowerCase()) {
            case "surveys":
                surveysPage.surveysButton.click();
                break;
        }
    }

    @Then("user should be landing on {string} page")
    public void user_should_be_landing_on_page(String pageTitle) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(pageTitle));
    }

    @Then("user clicks {string} button")
    public void user_clicks_button_top_left_side_of_the_page(String clickBtn) {
        switch (clickBtn.toLowerCase()) {
            case "create":
                surveysPage.createBtn.click();
                break;
            case "save":
                surveysPage.saveBtn.click();
                break;
            case "discard":
                surveysPage.discardBtn.click();
                break;
            case "design survey":
                surveysPage.designSurveyBtn.click();
                break;
            case "test survey":
                surveysPage.testSurveyBtn.click();
                break;
            case "print survey":
                surveysPage.printSurveyBtn.click();
                break;
            case "share and invite by email":
                surveysPage.shareAndInviteByEmailBtn.click();
                break;
            case "view results":
                surveysPage.viewResultsBtn.click();
                break;
        }

    }

    @Then("user enters {string} on upcoming window")
    public void user_enters_on_upcoming_window(String userEntersValue) {
        surveysPage.surveyTitle.sendKeys(userEntersValue);
    }

    @Then("verify that {string} message appears under the survey form sheet")
    public void verify_that_message_appears_under_the_survey_form_sheet(String string) {

    }
}
