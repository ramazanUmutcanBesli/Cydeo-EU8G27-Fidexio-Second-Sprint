package com.cydeo.step_definitions;

import com.cydeo.pages.US36DurakSurveysPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Locale;

public class US36SurveysDurakStepDefs {
    US36DurakSurveysPage surveysPage = new US36DurakSurveysPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);

    Actions actions = new Actions(Driver.getDriver());

    @Test

    public void test(){}

    @Then("user clicks {string} option at the top bar of the home page")
    public void user_clicks_option_at_the_top_bar_of_the_home_page(String menuOption) {
        surveysPage.menuBar(menuOption);
    }

    @Then("user should be landing on {string} page")
    public void user_should_be_landing_on_page(String pageTitle) {
        //BrowserUtils.sleep(3);
        wait.until(ExpectedConditions.titleContains(pageTitle));
        Assert.assertTrue(Driver.getDriver().getTitle().contains(pageTitle));
    }

    @Then("user clicks {string} button")
    public void user_clicks_button_top_left_side_of_the_page(String clickBtn) {
        surveysPage.clickBtn(clickBtn);
    }

    @Then("user enters Survey Title as {string} on upcoming window")
    public void user_enters_on_upcoming_window(String userEntersValue) {
        surveysPage.surveyTitle.click();
        BrowserUtils.sleep(1);
        surveysPage.surveyTitle.sendKeys(userEntersValue);
        System.out.println(surveysPage.surveyTitle.getText());
    }

    @Then("verify that {string} message appears under the survey form sheet")
    public void verify_that_message_appears_under_the_survey_form_sheet(String string) {
        Assert.assertEquals("Survey created", surveysPage.surveyCreatedMessage.getText());
    }
}
