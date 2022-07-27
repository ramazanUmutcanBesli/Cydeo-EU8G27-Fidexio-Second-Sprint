package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FideoAta {

    public FideoAta() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//a[.='More ']")
    public WebElement moreButton;

    @FindBy(xpath = "//a[@href='/web#menu_id=134&action=']")
    public WebElement FleetButton;


    @FindBy(xpath = "//a[@data-action-id='155']")
    public WebElement vehiclesButton;

    @FindBy(xpath = "//a[@data-action-id='156']")
    public WebElement vehiclesOdometerButton;

    @FindBy(xpath = "//a[@data-action-id='161']")
    public WebElement vehicleCostsButton;

    @FindBy(xpath = "//a[@data-action-id='163']")
    public WebElement vehicleContractsButton;

    @FindBy(xpath = "//a[@data-action-id='164']")
    public WebElement vehicleFuelLogsButton;

    @FindBy(xpath = "//a[@data-action-id='165']")
    public WebElement vehiclesServicesLogsButton;

    @FindBy(xpath = "//div[@data-menu-xmlid='fleet.menu_fleet_reporting']")
    public WebElement ReportingTitle;

    @FindBy(xpath = "//a[@data-action-id='166']")
    public WebElement costsButton;

    @FindBy(xpath = "//a[@data-action-id='167']")
    public WebElement indicativeCostsButton;

    @FindBy(xpath = "//div[@data-menu-xmlid='fleet.fleet_configuration']")
    public WebElement configurationTitle;

    @FindBy(xpath = "//a[@data-action-id='153']")
    public WebElement vehicleModelButton;

    @FindBy(xpath = "//a[@data-action-id='154']")
    public WebElement modelMakeOfVehicleButton;

    @FindBy(xpath = "//a[@data-action-id='157']")
    public WebElement serviceTypeButton;

    @FindBy(xpath = "//a[@data-action-id='158']")
    public WebElement contractTypesButton;

    @FindBy(xpath = "//a[@data-action-id='159']")
    public WebElement vehicleStatusButton;

    @FindBy(xpath = "//a[@data-action-id='160']")
    public WebElement vehicleTagsButton;



}