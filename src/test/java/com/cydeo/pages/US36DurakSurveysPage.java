package com.cydeo.pages;

import com.cydeo.step_definitions.US36SurveysDurakStepDefs;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class US36DurakSurveysPage extends BasePage {
    public US36DurakSurveysPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
    Actions actions = new Actions(Driver.getDriver());

    public String generatedSurveyTitle;

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

    @FindBy(css = "div[data-id='1']>div>div>span:last-of-type>i")
    public WebElement plusBtn;

    @FindBy(css = "div[data-id='1']>div.o_kanban_quick_create>input")
    public WebElement quickSurveyTitle;

    @FindBy(css = "div[data-id='1']>div.o_kanban_quick_create>button:nth-of-type(1)")
    public WebElement quickAdd;

    @FindBy(css = "div[data-id='1']>div.o_kanban_quick_create>button:nth-of-type(2)")
    public WebElement quickEdit;

    @FindBy(css = "div[data-id='1']>div.o_kanban_quick_create>button:nth-of-type(3)")
    public WebElement quickDiscard;

    @FindBy()
    public WebElement editBtn;

    @FindBy(css = "div.o_statusbar_buttons>button:nth-of-type(1)")
    public WebElement designSurveyBtn;

    @FindBy(css = ".btn.btn-primary.btn-lg")
    public WebElement startSurvey;

    @FindBy(css = "div.o_dialog_warning.modal-body")
    public WebElement warningMessage;

    @FindBy(css = "div.modal-footer>button.btn.btn-sm.btn-primary")
    public WebElement warningClickOk;

    @FindBy(css = ".pull-right>a")
    public WebElement backToSurvey;

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

    @FindBy(css = ".modal-footer>button:first-of-type")
    public WebElement confirmationOK;

    @FindBy(css = ".modal-footer>button:first-of-type")
    public WebElement errorOK;

    @FindBy(xpath = "//div[@data-id='1']/div[contains(@class,'oe_kanban_card')]//div/h4/span")
    List<WebElement> surveyList;

    /**
     * This method will pick random color from three dot menu for created survey
     * This method will accept no parameter
     */
    public void setColor() {
        int randomNum = new Random().nextInt(11) + 2; //Random numbers between 2-12, 1 is default selection

        WebElement setColor = Driver.getDriver().findElement(By.cssSelector(".oe_kanban_colorpicker>li:nth-of-type(" + randomNum + ")"));
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
     * This method click selected button; only accepts one parameter
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
            case "start survey":
                this.startSurvey.click();
                break;
            case "back to survey":
                this.backToSurvey.click();
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
            case "three dot delete":
                this.eraseGeneratedSurvey();
                break;
            case "three dot edit survey":
                this.editGeneratedSurvey();
                break;
            case "select any color":
                this.setColor();
                break;
            case "plus button":
                this.plusBtn.click();
                break;
            case "quick survey title":
                this.quickSurveyTitle.click();
                break;
            case "quick add":
                this.quickAdd.click();
                break;
            case "quick edit":
                this.quickEdit.click();
                break;
            case "quick discard":
                this.quickDiscard.click();
                break;
        }
    }

    /**
     * This method verify selected message; only accepts one parameter
     *
     * @param verificationValue
     */
    public void verify(String verificationValue) {
        if (generatedSurveyTitle.equals("generated survey title")) {
            verificationValue = generatedSurveyTitle;
        }
        try {
            wait.withTimeout(Duration.ofSeconds(2)).until(ExpectedConditions.titleContains(verificationValue));
        } catch (TimeoutException ignored) {}

        if (Driver.getDriver().getTitle().contains(verificationValue)) {
            Assert.assertTrue(Driver.getDriver().getTitle().contains(verificationValue));
        } else if (Driver.getDriver().getCurrentUrl().contains(verificationValue))
            Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(verificationValue));
        else {
            switch (verificationValue) {
                case "Error":
                    String actualResult = this.warningMessage.getText();
                    Assert.assertEquals("You cannot send an invitation for a survey that has no questions.", actualResult);
                    //wait.until(ExpectedConditions.elementToBeClickable(this.warningClickOk));
                    this.warningClickOk.click();
                    break;
            }
        }
    }

    /**
     * This method check whether the created survey is on the survey list
     * This method accepts only one parameter
     *
     * @param wantedSurveyTitle
     */
    public boolean searchSurveyTitle(String wantedSurveyTitle) {
        List<WebElement> surveyList = Driver.getDriver().findElements(By.cssSelector("div[data-id='1']>div.oe_kanban_card>div>h4>span"));
        for (WebElement each : surveyList) {
            if (each.getText().equalsIgnoreCase(wantedSurveyTitle)) return true;
        }
        return false;
    }

    /**
     * This method simply erases the generated survey
     * If any failure happens during deletion, then it should be done manually
     */
    public void eraseGeneratedSurvey() {
        String willBeDeletedSurvey = generatedSurveyTitle;
        for (WebElement each : surveyList) {
            if (each.getText().equalsIgnoreCase(willBeDeletedSurvey)) {
                String threeDot = "//div[@data-id='1']/div[contains(@class,'oe_kanban_card')]//div/h4/span[text()='" + willBeDeletedSurvey + "']/../../..//a[@class='dropdown-toggle btn']";
                WebElement threeDotBtn = Driver.getDriver().findElement(By.xpath(threeDot));
                actions.click(threeDotBtn);
                String path = "//div[@data-id='1']/div[contains(@class,'oe_kanban_card')]//div/h4/span[text()='" + willBeDeletedSurvey + "']/../../..//ul/li//a[@*='delete']";
                WebElement deleteSurvey = Driver.getDriver().findElement(By.xpath(path));
                actions.click(deleteSurvey).perform();

                //Confirmation message pops up
                //This command clicks OK
                this.confirmationOK.click();
                BrowserUtils.sleep(1);
                //If a failure message pops up, these lines close it
                Driver.getDriver().manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
                try {
                    if (this.errorOK.isDisplayed()) {
                        this.errorOK.click();
                        System.out.println("Survey couldn't be erased!!!");
                    }
                } catch (Exception ignored) {
                }
            }
        }
    }

    /**
     * This method simply navigates the generated survey to edit page
     */
    public void editGeneratedSurvey() {
        String editSurveyTitle = generatedSurveyTitle;
        for (WebElement each : surveyList) {
            if (each.getText().equalsIgnoreCase(editSurveyTitle)) {
                String threeDot = "//div[@data-id='1']/div[contains(@class,'oe_kanban_card')]//div/h4/span[text()='" + editSurveyTitle + "']/../../..//a[@class='dropdown-toggle btn']";
                WebElement threeDotBtn = Driver.getDriver().findElement(By.xpath(threeDot));
                actions.click(threeDotBtn);
                String path = "//div[@data-id='1']/div[contains(@class,'oe_kanban_card')]//div/h4/span[text()='" + editSurveyTitle + "']/../../..//ul/li//a[@*='edit']";
                WebElement editSurvey = Driver.getDriver().findElement(By.xpath(path));
                actions.click(editSurvey).perform();
            }
        }
    }

    /**
     * This method generates a random Survey Title
     * no @param
     */
    public void generateSurvey(){
        Faker fakeSurveyTitle = new Faker();
        generatedSurveyTitle = fakeSurveyTitle.animal().name();
        System.out.println(generatedSurveyTitle);
        this.surveyTitle.click();
        BrowserUtils.sleep(1);
        this.surveyTitle.sendKeys(generatedSurveyTitle);
    }
}
