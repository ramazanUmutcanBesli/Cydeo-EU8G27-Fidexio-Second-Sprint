package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeesPage {

    public EmployeesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[@accesskey='c']")
    public WebElement createButton;
    @FindBy(xpath = "//button[@class='btn btn-sm btn-default o_button_import']")
    public WebElement importButton;
    @FindBy(xpath = "//button[@aria-label='Next']")
    public WebElement nextButton;
    @FindBy(xpath = "//button[@aria-label='Previous']")
    public WebElement previousButton;
    @FindBy(xpath = "//button[@aria-label='list']")
    public WebElement listIcon;
    @FindBy(xpath = "//button[@aria-label='kanban']")
    public WebElement kanbanIcon;
    @FindBy(xpath = "//div[@class='o_form_sheet']")
    public WebElement createPageFormSheet;
    @FindBy(css = "[class='oe_import_box col-sm-9']")
    public WebElement importFileSheet;
    @FindBy(css = "[class='o_pager_value']")
    public WebElement nextPageEmployeeCounter;
    @FindBy(css = "[class='o_list_view table table-condensed table-striped o_list_view_ungrouped']")
    public WebElement employeesList;
    @FindBy(css = "[class='o_kanban_view o_hr_employee_kanban o_kanban_ungrouped']")
    public WebElement employeesKanban;
    @FindBy(xpath = "//div[1]/div[2]/div[3]/button")
    public WebElement followButton;
    @FindBy(xpath = "//span[@class='o_unfollow']/..")
    public WebElement unfollowButton;
    ///html/body/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[3]/button/span[1]
    ///html/body/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[3]/button/span[1]
    @FindBy(xpath = "//a[@href='/web#menu_id=115&action=120']")
    public WebElement badgesLinkTag;
    @FindBy(xpath = "//a[@href='/web#menu_id=293&action=399']")
    public WebElement challengesLinkTag;
    @FindBy(xpath = "//a[@href='/web#menu_id=294&action=398']")
    public WebElement goalsHistoryLinkTag;
    @FindBy(id = "o_field_input_19")
    public WebElement inputEmployeeName;

    @FindBy(id = "o_field_input_20")
    public WebElement inputegPartTime;

    @FindBy(id = "o_field_input_22")
    public WebElement inputWorkAddress;
    @FindBy(css = "#o_field_input_712")
    public WebElement inputWorkLocation;
    @FindBy(css = "#o_field_input_713")
    public WebElement inputWorkEmail;
    @FindBy(css = "#o_field_input_714")
    public WebElement inputMobile;
    @FindBy(css = "#o_field_input_715")
    public WebElement inputPhone;
    @FindBy(css = "#o_field_input_716")
    public WebElement inputDepartment;
    @FindBy(css = "#o_field_input_717")
    public WebElement inputJobPosition;
    @FindBy(css = "#o_field_input_718")
    public WebElement inputManager;
    @FindBy(css = "#o_field_input_719")
    public WebElement inputCoach;
    @FindBy(css = "#o_field_input_721")
    public WebElement inputWorkingHours;
    @FindBy(xpath = "//*[.='Save']")
    public WebElement saveButton;
    @FindBy(xpath = "//*[.='Employee created']")
    public WebElement employeeCreatedMessage;





}
