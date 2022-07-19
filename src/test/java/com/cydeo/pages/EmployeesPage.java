package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeesPage {

    public EmployeesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
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
    /*TODO
    click all follow buttons
     */
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







}
