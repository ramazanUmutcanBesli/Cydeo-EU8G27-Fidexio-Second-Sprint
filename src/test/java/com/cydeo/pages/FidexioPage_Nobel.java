package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FidexioPage_Nobel {

    public FidexioPage_Nobel(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy (xpath = "//a[@href=\"/web#menu_id=136&action=153\"]")
    public WebElement vehicleModelButton;

    @FindBy (xpath = "//a[.=\"More \"]")
    public WebElement moreButton;

    @FindBy (xpath = "//a[@href=\"/web#menu_id=134&action=\"]")
    public WebElement fleetButton;

    @FindBy (xpath = "//button[@accesskey='c']")
    public WebElement createButton;

    @FindBy (xpath = "//input[@class='o_field_char o_field_widget o_input o_required_modifier']")
    public WebElement inputModelName;

    @FindBy (xpath = "//input[@class=\"o_input ui-autocomplete-input\"]")
    public WebElement inputMakeName;

    @FindBy (xpath = "//button[@accesskey=\"s\"]")
    public WebElement saveVehicleButton;

    @FindBy (xpath = "//span[.='Create']")
    public WebElement saveButtonAfter;

    @FindBy (xpath = "//button[@accesskey=\"a\"]")
    public WebElement editButton;

    @FindBy (xpath = "//a[@href='/web#menu_id=147&action=164']")
    public WebElement vehiclesFuelLogsButton;

    @FindBy (xpath = "//input[@class=\"o_input ui-autocomplete-input\"]")
    public WebElement vehicleDetailsButton;

    @FindBy (css = "input[name=\"liter\"]")
    public WebElement literDetailButton;

    @FindBy (css = "input[name=\"price_per_liter\"]")
    public WebElement pricePerLiterBox;












    @FindBy (css = "input[name='login']")
    public WebElement emailInputBox;

    @FindBy (css = "input[name='password']")
    public WebElement passwordInputBox;

    @FindBy (css = "button[type='submit']")
    public WebElement submitButton;

    @FindBy (xpath = "//div[.='Congratulations, your inbox is empty']")
    public WebElement message;

    @FindBy (xpath = "//span[.='POSManager10']")
    public WebElement logout1;

    @FindBy (xpath = "//a[.='Log out']")
    public WebElement logout2;

    @FindBy (xpath = "//b[.='Sign in']")
    public WebElement signInButton;

    @FindBy (xpath = "//span[.='Inbox']")
    public WebElement inBoxButton;

    @FindBy (xpath = "//p[@class='alert alert-danger']")
    public WebElement errorMessage;

    @FindBy (xpath = "//a[.='Reset Password']")
    public WebElement resetPassword;

    @FindBy (xpath = "//button[.='Confirm']")
    public WebElement buttonConfirm;

    @FindBy (css = "#password")
    public WebElement passwordBulletSign;

    @FindBy (css = "span[class='oe_topbar_name']")
    public WebElement logoutStep1Button;

    @FindBy (xpath = "//a[.='Log out']")
    public WebElement logoutStep2Button;

    @FindBy (xpath = "//h4[.='Odoo Session Expired']")
    public WebElement odooSessionMessage;








}
