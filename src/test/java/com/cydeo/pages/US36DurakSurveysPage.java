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

    @FindBy()
    public WebElement saveBtn;

    @FindBy()
    public WebElement createBtn;

    @FindBy()
    public WebElement importBtn;

    @FindBy()
    public WebElement plusBtn;

    @FindBy()
    public WebElement threeDot_OnRightTopOfCreatedSurvey;

    @FindBy()
    public WebElement editBtn;

    @FindBy()
    public WebElement testSurveyBtn;

    @FindBy()
    public WebElement printSurveyBtn;

    @FindBy()
    public WebElement shareAndInviteByEmailBtn;

    @FindBy()
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
