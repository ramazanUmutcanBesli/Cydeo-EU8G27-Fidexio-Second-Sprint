package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewVehicleCostPage {

    public NewVehicleCostPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy( xpath = "//div/ul/li/a/span[contains(.,'Fleet')]")
    public WebElement fleetBtn;

    @FindBy(xpath = "//img[@src='https://qa.fidexio.com/web/binary/company_logo?db=BriteErpDemo&company=1']")
    public WebElement imageAfterClickFleet;

    //the options under "Vehicles" header:
    @FindBy(xpath = "//div/ul/li//a[@data-action-id='155']")
    public WebElement vehiclesOpt;

    @FindBy(xpath = "//div/ul/li//a[@data-action-id='156']")
    public WebElement vehiclesOdoOpt;

    @FindBy(xpath = "//div/ul/li//a[@data-action-id='161']")
    public WebElement vehicleCostOpt;

    @FindBy(xpath = "//div/ul/li//a[@data-action-id='163']")
    public WebElement vehiclesContOpt;

    @FindBy(xpath = "//div/ul/li//a[@data-action-id='164']")
    public WebElement vehiclesFuelOpt;

    @FindBy(xpath = "//div/ul/li//a[@data-action-id='165']")
    public WebElement vehiclesServOpt;

    //under Vehicle Costs option:
    @FindBy(xpath = "//div/ol/li[@class='active']")
    public WebElement vehicleCostsText;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_list_button_add']")
    public WebElement createBtn;

    @FindBy(xpath = "//div[@class='o_horizontal_separator']")
    public WebElement costDetailsTxt;

    @FindBy(xpath = "//label[@class='o_form_label o_required_modifier']")
    public WebElement vehicleTxt;

    @FindBy(xpath = "(//label[@class='o_form_label'])[1]")
    public WebElement typeTxt;

    @FindBy(xpath = "(//label[@class='o_form_label'])[2]")
    public WebElement totPriceTxt;

    @FindBy(xpath = "(//label[@class='o_form_label'])[3]")
    public WebElement costDescTxt;

    @FindBy(xpath = "(//label[@class='o_form_label'])[4]")
    public WebElement dateTxt;

    //for inputs:
    @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[1]")
    public WebElement vehicleInput;

    @FindBy(xpath = "//ul[1]/li[@class='ui-menu-item'][1]")
    public WebElement vehicleSelect;

    @FindBy(xpath = "//ul[1]/li[@class='ui-menu-item'][2]")
    public WebElement vehicle2Select;

    @FindBy(xpath = "//ul[1]/li[@class='ui-menu-item'][3]")
    public WebElement vehicle3Select;

    @FindBy(xpath = "//ul[1]/li[@class='ui-menu-item'][4]")
    public WebElement vehicle4Select;

    @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[2]")
    public WebElement typeInput;

    @FindBy(xpath = "//ul[2]/li[@class='ui-menu-item'][1]")
    public WebElement typeSelect;

    @FindBy(xpath = "//input[@class='o_datepicker_input o_input']")
    public WebElement calendarInput;

    @FindBy(xpath = "//input[@class='o_field_float o_field_number o_field_widget o_input']")
    public WebElement totPriceInput;

    //save:
    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o_form_button_save']")
    public WebElement saveBtn;

    //after saving

    @FindBy(xpath = "//div/ol/li[@class='active']")
    public WebElement vehicleNameHeader;

    @FindBy(xpath = "//a[@class='o_form_uri o_field_widget o_required_modifier']")
    public WebElement vehicleAfterSave;

    @FindBy(xpath = "//div[@class='o_notification_title']")
    public WebElement invalidMessage;

    @FindBy(xpath = "//tr/th[6]")
    public WebElement dateTab;

    @FindBy(xpath = "//tr[1]/td[@class='o_data_cell'][3]")
    public WebElement dateToVerify;


}
