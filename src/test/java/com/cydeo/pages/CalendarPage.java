package com.cydeo.pages;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalendarPage extends BasePage {
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10L);
    @FindBy(
            css = ".o_cp_buttons>.o_calendar_buttons>button:nth-of-type(1)"
    )
    public WebElement goBackInDate;
    @FindBy(
            css = ".o_cp_buttons>.o_calendar_buttons>button:nth-of-type(2)"
    )
    public WebElement currentDay;
    @FindBy(
            css = ".o_cp_buttons>.o_calendar_buttons>button:nth-of-type(3)"
    )
    public WebElement goForwardInDate;
    @FindBy(
            css = ".o_cp_buttons>.o_calendar_buttons>div>button:nth-of-type(1)"
    )
    public WebElement day;
    @FindBy(
            css = ".o_cp_buttons>.o_calendar_buttons>div>button:nth-of-type(2)"
    )
    public WebElement week;
    @FindBy(
            css = ".o_cp_buttons>.o_calendar_buttons>div>button:nth-of-type(3)"
    )
    public WebElement month;
    @FindBy(
            css = ".o_control_panel>ol>li"
    )
    public WebElement getCurrentDay;
    @FindBy(
            css = ".o_calendar_mini>div>div>a:first-of-type"
    )
    public WebElement goBackOneMonth;
    @FindBy(
            css = ".o_calendar_mini>div>div>a:last-of-type"
    )
    public WebElement goForwardOneMonth;
    @FindBy(
            css = ".o_calendar_mini>div>table>tbody>tr>td>a"
    )
    List<WebElement> daysOfMonth;
    @FindBy(
            css = ".o_calendar_mini>div>div>div>span:first-of-type"
    )
    public WebElement getCurrentMonth;
    @FindBy(
            css = ".fc-time-grid>div.fc-slats>table>tbody>tr"
    )
    List<WebElement> hourList;
    @FindBy(
            xpath = "//div[@class='modal-dialog modal-sm']//input"
    )
    public WebElement summaryInput;
    @FindBy(
            css = ".btn.btn-default.disabled"
    )
    public WebElement markallread;
    @FindBy(
            xpath = "//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[2]/li/ul/li[6]/a"
    )
    public WebElement logoutcalendarButton;
    @FindBy(
            xpath = "//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[2]/li/a/span"
    )
    public WebElement posmanager;
    @FindBy(
            xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div[2]/h3"
    )
    public WebElement attendees;
    @FindBy(
            xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div/div/button[1]"
    )
    public WebElement dayButton;
    @FindBy(
            xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div[1]/div[1]/div/div/table/thead/tr/td/div/table/thead/tr/th[2]/span"
    )
    public WebElement sunday;
    @FindBy(
            xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div/div/button[2]"
    )
    public WebElement weekButton;
    @FindBy(
            xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div/div/button[3]"
    )
    public WebElement monthButton;
    @FindBy(
            css = "body > div.o_main > div.o_main_content > div.o_content > div > div > div > div.o_calendar_sidebar_container.hidden-xs > div > div:nth-child(3) > h3"
    )
    public WebElement responsible;

    public CalendarPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void pickDay(int day) {
        try {
            Iterator var2 = this.daysOfMonth.iterator();

            while(var2.hasNext()) {
                WebElement each = (WebElement)var2.next();
                if (each.getText().equals(String.valueOf(day))) {
                    each.click();
                }
            }
        } catch (StaleElementReferenceException var4) {
        }

    }

    public void pickMonth(String month) {
        this.day.click();
        List<String> months = new ArrayList();
        months.add("Jan");
        months.add("Feb");
        months.add("Mar");
        months.add("Apr");
        months.add("May");
        months.add("Jun");
        months.add("Jul");
        months.add("Aug");
        months.add("Sep");
        months.add("Oct");
        months.add("Nov");
        months.add("Dec");
        int wantedMonth = 0;

        int currentMonth;
        for(currentMonth = 0; currentMonth < 12; ++currentMonth) {
            if (((String)months.get(currentMonth)).equals(month)) {
                wantedMonth = currentMonth;
            }
        }

        currentMonth = 0;

        int monthsDiff;
        for(monthsDiff = 0; monthsDiff < 12; ++monthsDiff) {
            if (((String)months.get(monthsDiff)).equals(this.getCurrentMonth.getText())) {
                currentMonth = monthsDiff;
            }
        }

        monthsDiff = wantedMonth - currentMonth;
        int i;
        if (monthsDiff > 0) {
            for(i = 0; i < monthsDiff + 1; ++i) {
                this.goForwardOneMonth.click();
                BrowserUtils.sleep(1);
            }
        } else {
            for(i = 0; i < -monthsDiff - 1; ++i) {
                this.goBackOneMonth.click();
                BrowserUtils.sleep(1);
            }
        }

        System.out.println("Your came to this month: " + this.getCurrentMonth.getText());
    }

    public void pickHour(String hour) {
        this.day.click();
        BrowserUtils.sleep(1);
        Iterator var2 = this.hourList.iterator();

        while(var2.hasNext()) {
            WebElement eachHour = (WebElement)var2.next();
            if (eachHour.getAttribute("data-time").contains(hour)) {
                eachHour.click();
            }
        }

    }
}