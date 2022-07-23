package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginPageStepDefiniton {
    LoginPage loginPage=new LoginPage();
    BasePage basePage=new BasePage();
    @Given("user is on the login page of fidexio page")
    public void user_is_on_the_login_page_of_fidexio_page() {
        //Driver.getDriver().get("https://app.fidexio.com/");
        Driver.getDriver().get(ConfigurationReader.getProperty("login.page.url"));
    }
    @When("user enters username {string}")
    public void user_enters_username(String string) {
        loginPage.emailInputBox.sendKeys(string);
    }
    @When("user enters password {string}")
    public void user_enters_password(String string) {
        loginPage.passwordInputBox.sendKeys(string);
    }
    @When("user clicks to login button")
    public void user_clicks_to_login_button() {
        loginPage.loginButton.click();
    }
    @Then("user sees {string} in the title")
    public void user_sees_in_the_title(String string) {
        String expectedResult=basePage.userNameVerifyButton.getText();
        System.out.println(expectedResult);
        Assert.assertEquals(expectedResult,string);
    }

}
