package com.cydeo.step_definitions;

import com.cydeo.pages.FidexioCalendarPage;
import com.cydeo.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class CalendarStepDefinitions {
    FidexioCalendarPage fidexio43=new FidexioCalendarPage();



    

    @And("user clicks the Calendar button")
    public void userClicksTheCalendarButton() {
        fidexio43.calendarButton.click();

    }

    @And("user see Calender Page")
    public void userSeeCalenderPage() {
    }

    @And("user is clicks on the Day button")
    public void userIsClicksOnTheDayButton() {
        fidexio43.dayButton.click();
        BrowserUtils.sleep(1);
    }

    @Then("user see text at the top of the page {string}")
    public void userSeeTextAtTheTopOfThePage(String expectedName) {
        BrowserUtils.sleep(2);
        String actualName=fidexio43.wBox.getText();
        Assert.assertEquals(expectedName,actualName);
    }

    @And("user is clicks on the Week button")
    public void userIsClicksOnTheWeekButton() {
        BrowserUtils.sleep(1);
        fidexio43.weekButton.click();
    }

    @And("user is clicks on the Month button")
    public void userIsClicksOnTheMonthButton() {
        BrowserUtils.sleep(2);
        fidexio43.monthButton.click();
    }

    @And("user is clicks the Daily time box")
    public void userIsClicksTheDailyTimeBox() {
        BrowserUtils.sleep(2);
        fidexio43.dailyCalendar.click();
    }

    @And("user is enters the{string}")
    public void userIsEntersThe(String string) {
        fidexio43.inputDay.sendKeys(string);

    }

    @Then("user creat any issue in Montly time box")
    public void userCreatanyissueinMontlytimebox() {
        BrowserUtils.sleep(1);
        BrowserUtils.sleep(1);
        fidexio43.monthCreateButton.click();

    }

    @And("user is clicks the Weekly time box")
    public void userIsClicksTheWeeklyTimeBox() {
        BrowserUtils.sleep(2);
        fidexio43.weeklyCalendar.click();

    }

    @And("user is clicks the Monthly time box")
    public void userIsClicksTheMonthlyTimeBox() {
        BrowserUtils.sleep(2);
        fidexio43.monthlyCalendar.click();
    }

    @Then("user edit a created event")
    public void userEditACreatedEvent() {
    }

    @Given("user see {string} on main board")
    public void userSeeOnMainBoard(String string) {
        BrowserUtils.sleep(2);
        String actualName=fidexio43.inbox.getText();
        Assert.assertEquals(string,actualName);
    }

    @And("user see {string} on Calender Page")
    public void userSeeOnCalenderPage(String expectedName) {
        BrowserUtils.sleep(2);
        String actualName=fidexio43.allDay.getText();
        Assert.assertEquals(expectedName,actualName);
    }
    @And("posmanager see {string} on Calender Page")
    public void posmanagerSeeOnCalenderPage(String expectedName) {

        BrowserUtils.sleep(2);
        String actualName=fidexio43.w31.getText();
        Assert.assertEquals(expectedName,actualName);
    }

    @And("user is clicks on the Log out button")
    public void userIsClicksOnTheLogOutButton() {
       BrowserUtils.sleep(2);
        fidexio43.logoutButton.click();
    }

    @And("user is enters the{string} in weekly time box")
    public void userIsEntersTheInWeeklyTimeBox(String string) {
        fidexio43.inputWeeek.sendKeys(string);
        BrowserUtils.sleep(1);

    }

    @And("user is enters the{string} in Montly time box")
    public void userIsEntersTheInMontlyTimeBox(String string) {
        BrowserUtils.sleep(1);
        fidexio43.inputMonth.sendKeys(string);
        BrowserUtils.sleep(1);
    }


    @And("user is enters the{string} in Daily time box")
    public void userIsEntersTheInDailyTimeBox(String string) {
        fidexio43.dailyInput.sendKeys(string);
    }

    @And("user clicks the Date button")
    public void userClicksTheDateButton() {
        BrowserUtils.sleep(1);
        fidexio43.date.click();
    }

    @Then("user creat any issue in Daily box")
    public void userCreatAnyIssueInDailyBox() {

        BrowserUtils.sleep(1);
        fidexio43.dailyCreate.click();
    }

    @Then("user creat any issue in Weekly time box")
    public void userCreatAnyIssueInWeeklyTimeBox() {
        fidexio43.weeklyCreate.click();
    }
}
