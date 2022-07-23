package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FidexioCalendarPage {

    public FidexioCalendarPage(){
    PageFactory.initElements(Driver.getDriver(), this);}

@FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/ol/li")
    public WebElement inbox;
    @FindBy(xpath = "//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[1]/li[2]/a/span")
    public WebElement calendarButton;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div[1]/div[1]/div/div/table/thead/tr/td/div/table/thead/tr/th[2]/span")
    public WebElement saturday;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div/div/button[1]")
    public WebElement dayButton;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div/div/button[2]")
    public WebElement weekButton;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div/div/button[3]")
    public WebElement monthButton;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div[1]/div[1]/div/div/table/tbody/tr/td/div[1]/div/div[1]/table/tbody/tr/td[1]/span")
    public WebElement allDay;
    @FindBy(xpath = "//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[2]/li/ul/li[6]/a")
    public WebElement logoutButton;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div[1]/div[1]/div/div/table/thead/tr/td/div/table/thead/tr/th[1]/span")
    public WebElement wBox;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div[1]/div[1]/div/div/table/tbody/tr/td/div[2]/div/div[2]/table/tbody/tr[13]/td[2]")
    public WebElement dailyCalendar;
    @FindBy(xpath = "//*[@id=\"modal_41\"]/div/div/div[2]/div/input")
    public WebElement inputDay;
    @FindBy(xpath = "//*[@id=\"modal_41\"]/div/div/div[3]/button[1]/span")
    public WebElement createButton;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div[1]/div[1]/div/div/table/tbody/tr/td/div[2]/div/div[2]/table/tbody/tr[14]/td[2]")
    public WebElement weeklyCalendar;
    @FindBy(xpath = "//*[@id=\"modal_105\"]/div/div/div[2]/div/input")
    public WebElement inputWeeek;
    @FindBy(xpath = "//*[@id=\"modal_115\"]/div/div/div[2]/div/input")
    public WebElement inputMonth;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div[1]/div[1]/div/div/table/tbody/tr/td/div/div/div[4]/div[1]/table/tbody/tr/td[8]")
    public WebElement monthlyCalendar;
    @FindBy(xpath = "//*[@id=\"modal_115\"]/div/div/div[3]/button[1]/span")
    public WebElement monthCreateButton;
    @FindBy(xpath = "//*[@id=\"dp1658517266279\"]/div/table/tbody/tr[5]/td[7]/a")
    public WebElement date;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div[1]/div[1]/div/div/table/thead/tr/td/div/table/thead/tr/th[1]/span")
    public WebElement w31;
    @FindBy(xpath = "//*[@id=\"modal_96\"]/div/div/div[2]/div/input")
    public WebElement dailyInput;
    @FindBy(xpath = "//*[@id=\"modal_96\"]/div/div/div[3]/button[1]/span")
    public WebElement dailyCreate;
    @FindBy(xpath = "//*[@id=\"modal_105\"]/div/div/div[3]/button[1]/span")
    public WebElement weeklyCreate;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div[1]/div[1]/div/div/table/tbody/tr/td/div/div/div[4]/div[1]/table/tbody/tr/td[8]")
    public WebElement editDay;
    @FindBy(xpath = "//*[@id=\"modal_214\"]/div/div/div[3]/button[1]/span")
    public WebElement editButton;
    @FindBy(xpath = "//*[@id=\"modal_272\"]/div/div/div[3]/button[1]/span")
    public WebElement editSaveButton;







}
