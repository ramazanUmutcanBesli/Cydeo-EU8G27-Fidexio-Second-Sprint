package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public class US36DurakSurveysPage extends BasePage {
    public US36DurakSurveysPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='navbar-collapse collapse']/ul/li/a/span[contains(.,'Surveys')]")
    public WebElement surveysButton;

    @FindBy(css = "button[accesskey=\"s\"]")
    public WebElement saveBtn;

    @FindBy(css = "button.o-kanban-button-new")
    public WebElement createBtn;

    @FindBy(css = "button.o_form_button_cancel")
    public WebElement discardBtn;

    @FindBy(css = "h1>input")
    public WebElement surveyTitle;

    @FindBy(css = ".o_cp_switch_buttons>button:first-of-type")
    public WebElement kanbanViewBtn;

    @FindBy(css = ".o_cp_switch_buttons>button:last-of-type")
    public WebElement listViewBtn;

    @FindBy(css = "button.o_button_import")
    public WebElement importBtn;

    @FindBy(css = "button.o_import_cancel")
    public WebElement cancelBtn;

    @FindBy()
    public WebElement plusBtn;

    @FindBy(css = "div.o_dropdown_kanban>a[data-toggle='dropdown']")
    public WebElement threeDot;

    @FindBy(css = "div.o_dropdown_kanban>ul>li:nth-of-type(1)")
    public WebElement threeDotMenu_EditSurvey;

    @FindBy(css = "div.o_dropdown_kanban>ul>li:nth-of-type(2)")
    public WebElement threeDotMenu_Delete;

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
    public WebElement timeSign_OnRightBottomOfCreatedSurvey;

    @FindBy(css = "div.o_thread_message_content")
    public WebElement surveyCreatedMessage;

    /**
     * This method will pick random color from three dot menu for created survey
     * This method will accept no parameter
     */
    public void setColor(){
        int randomNum = new Random().nextInt(11) + 2; //Random numbers between 2-12, 1 is default selection

        WebElement setColor = Driver.getDriver().findElement(By.cssSelector(".oe_kanban_colorpicker>li:nth-of-type("+randomNum+")"));
        setColor.click();

    }

    /**
     * This method will navigate ot the selected menu option
     *
     * @param menuOption
     */
    public void menuBar(String menuOption) {
        switch (menuOption.toLowerCase()) {
            case "surveys":
                this.surveysButton.click();
                break;
        }
    }

    /**
     * This method click selected button; only accepts one paramtere
     *
     * @param clickBtn
     */
    public void clickBtn(String clickBtn) {
        switch (clickBtn.toLowerCase()) {
            case "create":
                this.createBtn.click();
                break;
            case "import":
                this.importBtn.click();
                break;
            case "cancel":
                this.cancelBtn.click();
                break;
            case "kanban view":
                this.kanbanViewBtn.click();
                break;
            case "list view":
                this.listViewBtn.click();
                break;
            case "save":
                this.saveBtn.click();
                break;
            case "discard":
                this.discardBtn.click();
                break;
            case "design survey":
                this.designSurveyBtn.click();
                break;
            case "test survey":
                this.testSurveyBtn.click();
                break;
            case "print survey":
                this.printSurveyBtn.click();
                break;
            case "share and invite by email":
                this.shareAndInviteByEmailBtn.click();
                break;
            case "view results":
                this.viewResultsBtn.click();
                break;
            case "three dot":
                this.threeDot.click();
                break;
            case "delete":
                this.threeDotMenu_Delete.click();
                break;
            case "edit survey":
                this.threeDotMenu_EditSurvey.click();
                break;
            case "select any color":
        }
    }

    /**
     * This method will return true or false according to functionality of the selected button
     * This method get one method, which clicks the requested button
     * @param button
     */

    public void clickOrCheckBtn(String button) {

        switch (button) {
            case "":
                this.editBtn.click();
                // if edit windows shows up than
                Assert.assertTrue(Driver.getDriver().getTitle().contains("edit"));
                break;
        }
    }


    /**
     * This method is a overloading method, which also accepts a boolean parameter for make assertion
     * This method will return true or false according to functionality of the selected button
     * This method get two method, which select the requested button and assert its functionality
     *
     * @param button
     * @param checkBtn
     */

    public void clickOrCheckBtn(String button, boolean checkBtn) {

        switch (button) {
            case "":
                this.editBtn.click();
                // if edit windows shows up than make assertion
                if (checkBtn) {
                    Assert.assertTrue(Driver.getDriver().getTitle().contains("edit"));
                }
                break;
        }
    }


}
