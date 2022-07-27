package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomersPage extends BasePage {
    public CustomersPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(xpath = "//div[@data-menu-parent='445']//span[contains(.,' Customers')]")
    public WebElement customersButton;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div/button[1]")
    public WebElement createButton;

    @FindBy(xpath = "//input[@data-value='person']")
    public WebElement individualbutton;

    @FindBy(xpath = "//input[@data-value='company']")
    public WebElement companyButton;

    @FindBy(xpath = "//a[.='Internal Notes']")
    public WebElement internalNotesButton;

    @FindBy(xpath = "//a[.='Sales & Purchases']")
    public WebElement salesPurchasesButton;

    @FindBy(xpath = "//a[.='Invoicing']")
    public WebElement invoicingButton;

    @FindBy(xpath = "//ul/li/a[.='2700 Des Plaines RD, Des Plaines IL']")
    public WebElement companySelectButton2;

    @FindBy(xpath = "//div[@class='o_row']/div[@name='parent_id']")
    public WebElement companySelectButton;

    @FindBy(xpath = "//select[@class='o_input o_field_widget' and@name='type']")
    public WebElement addressTypeDropdown;

    @FindBy(xpath = "//div[@class='o_field_many2manytags o_input o_field_widget']")
    public WebElement tinTagsSelectButton;

    @FindBy(xpath = "//li/a[.='dsa']")
    public WebElement tinTagsSelectButton2;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div[1]/div/div[4]/table[2]/tbody/tr[7]/td[2]/div/div")
    public WebElement titleButton;

    @FindBy(xpath = "//li/a[.='Coordinator']")
    public WebElement titleButton2;

    @FindBy(xpath = "//*[@name='lang']")
    public WebElement languageDropdown;



    //Test case 2

    @FindBy(xpath = "//input[@name='name']")
    public WebElement nameInputBox;

    @FindBy(xpath = "//input[@name='street']")
    public WebElement streetInputBox;

    @FindBy(xpath = "//input[@name='street2']")
    public WebElement street2InputBox;

    @FindBy(xpath = "//input[@name='city']")
    public WebElement cityInputBox;

    @FindBy(xpath = "//div[@name='state_id']")
    public WebElement stateInputBox;

    @FindBy(xpath = "//li[.='Aomori']")
    public WebElement state2InputBox;

    @FindBy(xpath = "//input[@name='zip']")
    public WebElement zipInputBox;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div[1]/div/div[4]/table[1]/tbody/tr[2]/td[2]/div/div[3]/div")
    public WebElement countrySelect;
    @FindBy(xpath = "//ul/li[a='Afghanistan']")
    public WebElement countrySelect2;


    @FindBy(xpath = "//input[@placeholder='e.g. Sales Director']")
    public WebElement jobPosition;

    @FindBy(xpath = "//input[@name='phone']")
    public WebElement phoneInputBox;

    @FindBy(xpath = "//input[@name='mobile']")
    public WebElement mobileInputBox;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailInputBox;

    @FindBy(xpath = "//input[@name='website']")
    public WebElement websiteInputBox;

    @FindBy(xpath = "//button[contains(.,' Save')]")
    public WebElement saveButton;

    @FindBy(xpath = "//h1/span[@class='o_field_char o_field_widget']")
    public WebElement nameVerification;

    @FindBy(xpath = "//td/span[@class='o_field_widget']")
    public WebElement addressTypeVerification;



//    @FindBy(xpath = "//*[@id='modal_92']/div/div/div[3]/button[1]/span")
//    public WebElement createButtonforNewState;
//
//    @FindBy(xpath = "//*[@id='modal_98']/div/div/div[3]/button[1]/span")
//    public WebElement saveButtonforNewState;
//
//    @FindBy (xpath = "//input[@name='code']")
//    public WebElement stateCodeforNewState;
//
//    @FindBy(xpath = "//*[@id=\"modal_98\"]/div/div/div[2]/div/div/table/tbody/tr[3]/td[2]/div")






}
