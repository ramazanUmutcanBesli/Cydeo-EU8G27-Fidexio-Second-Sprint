package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US36DurakSurveysPage extends BasePage{
    public US36DurakSurveysPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='navbar-collapse collapse']/ul/li/a/span[contains(.,'Surveys')]")
    public WebElement surveysButton;

    @FindBy()
    public WebElement saveBtn;

    @FindBy(css = "button.o-kanban-button-new")
    public WebElement createBtn;

    @FindBy(css = "button.o_form_button_cancel")
    public WebElement discardBtn;

    @FindBy(css = "input[placeholder='Survey Title']")
    public WebElement surveyTitle;

    @FindBy()
    public WebElement importBtn;

    @FindBy()
    public WebElement plusBtn;

    @FindBy()
    public WebElement threeDot_OnRightTopOfCreatedSurvey;

    @FindBy()
    public WebElement editBtn;

    @FindBy(css = "div.o_statusbar_buttons>button:nth-of-type(1)")
    public WebElement designSurveyBtn;

    @FindBy(css = "div.o_statusbar_buttons>button:nth-of-type(2)")
    public WebElement testSurveyBtn;

    @FindBy(css = "div.o_statusbar_buttons>button:nth-of-type(3)")
    public WebElement printSurveyBtn;

    @FindBy(css = "div.o_statusbar_buttons>button:nth-of-type(4)")
    public WebElement shareAndInviteByEmailBtn;

    @FindBy(css = "div.o_statusbar_buttons>button:nth-of-type(5)")
    public WebElement viewResultsBtn;

    @FindBy()
    public WebElement attachmentsBtn;

    @FindBy()
    public WebElement actionDropDown;

    @FindBy()
    public WebElement timeSign_OnRightButtomOfCreatedSurvey;

    /**
    * This method will return true or false according to functionality of the selected button
    * This method get one method, which clicks the requested button
    * @param button   
    */

    public void clickOrcheckBtn(String button){
        
        switch(button){
            case "":
                this.editBtn.click();
                // if edit windows shows up than
                Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("edit"));
                break;
        }
    }


    /**
    * This mehtod is a overloading method, which also accepts a boolean parameter for make assertion
    * This method will return true or false according to functionality of the selected button
    * This method get two method, which select the requested button and assert its functionality
    * @param button 
    * @param checkBtn 
    */

    public void clickOrcheckBtn(String button, boolean checkBtn){
        
        switch(button){
            case "":
                this.editBtn.click();
                // if edit windows shows up than make assertion
                if(checkBtn){
                    Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("edit"));
                }
                break;
        }
    }






}
