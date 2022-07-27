//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.cydeo.step_definitions;

import com.cydeo.pages.CalendarPage;
import com.cydeo.utilities.BrowserUtils;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class calendarStepDef {
    CalendarPage calendarPage = new CalendarPage();

    public calendarStepDef() {
    }

    @And("user clicks the calendar button")
    public void userClicksThecalendarButton() {
        BrowserUtils.sleep(2);
        this.calendarPage.calendarButton.click();
    }

    @Given("user pick month, day and time")
    public void userPickMonthDayAndTime(DataTable dataTable) {
        BrowserUtils.sleep(1);
        this.calendarPage.dayButton.click();
        BrowserUtils.sleep(2);
        List<List<String>> rows = dataTable.asLists(String.class);
        String month = (String)((List)rows.get(0)).get(0);
        System.out.println("Month: " + month);
        String day = (String)((List)rows.get(0)).get(1);
        System.out.println("Day: " + day);
        this.calendarPage.pickMonth(month);
        this.calendarPage.pickDay(Integer.parseInt(day));
    }

    @Given("user a pick month, day and time")
    public void useraPickMonthDayAndTime(DataTable dataTable) {
        BrowserUtils.sleep(2);
        List<List<String>> rows = dataTable.asLists(String.class);
        String month = (String)((List)rows.get(0)).get(0);
        System.out.println("Month: " + month);
        String day = (String)((List)rows.get(0)).get(1);
        System.out.println("Day: " + day);
        String hour = (String)((List)rows.get(0)).get(2);
        System.out.println("Hour: " + hour);
        this.calendarPage.pickMonth(month);
        this.calendarPage.pickDay(Integer.parseInt(day));
        this.calendarPage.pickHour(hour);
    }

    @And("user create a Schedule name as {string}")
    public void userCreateAScheduleNameAs(String meetingSummary) {
        BrowserUtils.sleep(2);
        this.calendarPage.summaryInput.sendKeys(new CharSequence[]{meetingSummary + Keys.ENTER});
    }

    @And("user clicks the Calendar button")
    public void userClicksTheCalendarButton() {
        BrowserUtils.sleep(2);
        this.calendarPage.calendarButton.click();
    }

    @Given("user see {string} on main board")
    public void userSeeOnMainBoard(String string) {
        BrowserUtils.sleep(4);
        String actualName = this.calendarPage.markallread.getText();
        Assert.assertEquals(string, actualName);
    }

    @And("user is clicks on the Log out button")
    public void userIsClicksOnTheLogOutButton() {
        BrowserUtils.sleep(2);
        this.calendarPage.posmanager.click();
        this.calendarPage.logoutcalendarButton.click();
        BrowserUtils.sleep(1);
    }

    @And("user see {string} on Calendar Page")
    public void userSeeOnCalendarPage(String expectedName) {
        String actualName = this.calendarPage.attendees.getText();
        Assert.assertEquals(expectedName, actualName);
    }

    @And("user is clicks on the Day button")
    public void userIsClicksOnTheDayButton() {
        BrowserUtils.sleep(2);
        this.calendarPage.dayButton.click();
    }

    @Then("posmanager see {string} on calendar Page")
    public void posmanagerSeeOncalendarPage(String expectedName) {
        BrowserUtils.sleep(2);
        String actualName = this.calendarPage.sunday.getText();
        Assert.assertEquals(expectedName, actualName);
    }

    @And("user is clicks on the Week button")
    public void userIsClicksOnTheWeekButton() {
        BrowserUtils.sleep(1);
        this.calendarPage.weekButton.click();
    }

    @Then("as a posmanager see {string} on calendar Page")
    public void asAPosmanagerSeeOncalendarPage(String expectedName) {
        BrowserUtils.sleep(2);
        String actualName = this.calendarPage.attendees.getText();
        Assert.assertEquals(expectedName, actualName);
    }

    @And("user is clicks on the Month button")
    public void userIsClicksOnTheMonthButton() {
        BrowserUtils.sleep(2);
        this.calendarPage.monthButton.click();
    }

    @And("user creat {string} in Daily time box")
    public void userCreatInDailyTimeBox(String string) {
        BrowserUtils.sleep(2);
    }

    @Then("user edit a created event")
    public void userEditACreatedEvent() {
        BrowserUtils.sleep(1);
        System.out.println("user edit a created event");
    }

    @And("user see a {string} on Calendar Page")
    public void userSeeaOnCalendarPage(String expectedName) {
        String actualName = this.calendarPage.responsible.getText();
        Assert.assertEquals(expectedName, actualName);
    }
}
