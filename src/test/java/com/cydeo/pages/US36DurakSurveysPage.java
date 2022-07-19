package com.cydeo.pages;

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
    public WebElement threeDot;

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

    /**
    * This method will return true or false according to functionality of the selected button
    * This method get one method, which select the requested button and assert its functionality
    * @param button   
    */

    public void checkBtn(String button){
        
    }






}
