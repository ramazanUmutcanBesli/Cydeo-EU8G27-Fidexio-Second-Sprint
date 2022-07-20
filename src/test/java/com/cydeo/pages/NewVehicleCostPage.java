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

    @FindBy(xpath = "(//span[@class='o_dropdown_button'])[1]")
    public WebElement vehicleDropdown;

    @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[2]")
    public WebElement typeInput;

    @FindBy(xpath = "(//span[@class='o_dropdown_button'])[2]")
    public WebElement typeDropdown;






}
