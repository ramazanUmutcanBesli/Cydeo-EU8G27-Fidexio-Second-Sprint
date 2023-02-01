package com.cydeo.pages;

import com.cydeo.utilities.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    public WebElement userNameVerifyButton;
    @FindBy(xpath = "//span[contains(.,'Discuss')]")
    public WebElement discussButton;
    @FindBy(xpath = "//span[contains(.,'  Calendar')]")
    public WebElement calendarButton;
    @FindBy(xpath = "//span[contains(.,'  Notes')]")
    public WebElement notesButton;
    @FindBy(xpath = "//*[@id='oe_main_menu_navbar']/div[2]/ul[1]/li[4]/a/span")
    public WebElement contactsButton;
    @FindBy(xpath = "//span[contains(.,' CRM')]")
    public WebElement CRMButton;
    @FindBy(xpath = "//*[@id='oe_main_menu_navbar']/div[2]/ul[1]/li[6]/a/span")
    public WebElement salesButton;
    @FindBy(xpath = "//span[contains(.,' Website')]")
    public WebElement websiteButton;
    @FindBy(xpath = "//div[@class='navbar-collapse collapse']/ul/li/a/span[contains(.,' Point of Sale')]")
    public WebElement pointOfSaleButton;
    @FindBy(xpath = "//span[contains(.,' Purchases')]")
    public WebElement purchasesButton;
    @FindBy(xpath = "//div[@class='navbar-collapse collapse']/ul/li/a/span[contains(.,' Inventory')]")
    public WebElement inventoryButton;
    @FindBy(xpath = "//span[contains(.,' Repairs')]")
    public WebElement repairsButton;
    @FindBy(xpath = "//span[contains(.,' Invoicing')]")//ahmet
    public  WebElement invoicingButton;
    @FindBy(xpath = "//span[contains(.,' Email Marketing')]")
    public WebElement eMailMarketingButton;
    @FindBy(xpath = "//div[@class='navbar-collapse collapse']/ul/li/a/span[contains(.,' Events')]")
    public WebElement eventsButton;
    @FindBy(xpath = "//div[@class='navbar-collapse collapse']/ul/li/a/span[contains(.,' Employees')]")
    public WebElement employeesButton;
    @FindBy(xpath = "//div[@class='navbar-collapse collapse']/ul/li/a/span[contains(.,' Leaves')]")
    public WebElement leavesButton;
    @FindBy(xpath = "//div[@class='navbar-collapse collapse']/ul/li/a/span[contains(.,' Expenses')]")
    public WebElement expensesButton;
    @FindBy(xpath = "//div[@class='navbar-collapse collapse']/ul/li/a/span[contains(.,' Maintenance')]")
    public WebElement maintenanceButton;
    @FindBy(xpath = "//div[@class='navbar-collapse collapse']/ul/li/a/span[contains(.,' Dashboards')]")
    public WebElement dashboardsButton;
    @FindBy(xpath = "//div[@class='navbar-collapse collapse']//ul/li/a/span[contains(.,'Surveys')]")
    public WebElement surveysButton;





}
