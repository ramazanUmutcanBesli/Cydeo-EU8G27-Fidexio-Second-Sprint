package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

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
    @FindBy(xpath = "//input[@class='o_field_char o_field_widget o_input o_required_modifier']")
    public WebElement inputEmployeeName;
    @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[1]")
    public WebElement inputegPartTimeClickable;
    @FindBy(xpath = "(//*[@class='ui-menu-item'])/a")
    public List<WebElement> inputegPartTime;
    @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[2]")
    public WebElement inputWorkAddress;
    @FindBy(xpath = "(//input[@class='o_field_char o_field_widget o_input'])[1]")
    public WebElement inputWorkLocation;
    @FindBy(xpath = "(//input[@class='o_field_email o_field_widget o_input'])")
    public WebElement inputWorkEmail;
    @FindBy(xpath = "(//input[@class='o_field_char o_field_widget o_input'])[2]")
    public WebElement inputMobile;
    @FindBy(xpath = "(//input[@class='o_field_char o_field_widget o_input'])[3]")
    public WebElement inputPhone;
    @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[3]")
    public WebElement inputDepartment;
    @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[4]")
    public WebElement inputJobPosition;
    @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[5]")
    public WebElement inputManager;
    @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[6]")
    public WebElement inputCoach;
    @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[7]")
    public WebElement inputWorkingHours;
    @FindBy(xpath = "(//*[.='Standard 40 Hours/Week'])[1]")
    public WebElement inputWorkingHours40Hours;
    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement saveButton;
    @FindBy(xpath = "//*[.='Employee created']")
    public WebElement employeeCreatedMessage;
    @FindBy(xpath = "//div/strong/div/strong/span")
    public List<WebElement> createdEmployeeNames;
    @FindBy(xpath = "//*[@id=\"ui-id-73\"]/a")
    public WebElement oneOfEGPartTimeOption;





}
