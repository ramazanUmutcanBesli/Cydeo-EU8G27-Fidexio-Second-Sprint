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
    @FindBy(xpath = "//button[@accessKey='c']")
    public WebElement createButton;
    @FindBy(xpath = "//button[@accessKey='c']")
    public WebElement newLabel;

}
