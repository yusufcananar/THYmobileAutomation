package com.turkishairlines.mobile.helper;

import com.thoughtworks.gauge.Step;

import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;


import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static com.turkishairlines.mobile.pageConsts.FlightSelectPageConsts.*;
import static com.turkishairlines.mobile.pageConsts.MainPageConsts.*;
import static com.turkishairlines.mobile.pageConsts.FlightInfoPageConsts.*;


public class StepImplementation extends HookImplementation{

    @Step("Wait <time>")
    public void waitTime(int time){
        driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
    }

    @Step("thread sleep <time>")
    public void sleepTime(int time) throws InterruptedException {
        Thread thread = new Thread();
        thread.sleep(time*1000);
    }

    @Step("Grant permission")
    public void clickAllow(){
        wait.until(ExpectedConditions.elementToBeClickable(BTN_ALLOW));
        click(BTN_ALLOW);
    }
    @Step("Accept Cookies")
    public void clickAcceptCookies(){
        wait.until(ExpectedConditions.elementToBeClickable(BTN_ACCEPT_COOKIES));
        click(BTN_ACCEPT_COOKIES);
    }

    @Step("Buy ticket")
    public void clickBookFlight(){
        wait.until(ExpectedConditions.elementToBeClickable(BTN_BOOK_FLIGHT));
        click(BTN_BOOK_FLIGHT);
        System.out.println("INFO-BTN_BOOK_FLIGHT IS PASSED");
    }

    @Step("Pick one way flight")
    public void clickOneWayFlight(){
        wait.until(ExpectedConditions.elementToBeClickable(BTN_ONE_WAY));
        click(BTN_ONE_WAY);
    }

    @Step("Click From")
    public void clickFrom(){
        wait.until(ExpectedConditions.elementToBeClickable(BTN_FROM));
        click(BTN_FROM);
    }

    @Step("Search <airport>")
    public void searchAirport(String airport){
        wait.until(ExpectedConditions.elementToBeClickable(SEARCH_AREA));
        click(SEARCH_AREA);
        sendKeys(SEARCH_AREA, airport);
    }
    @Step("Click SAW")
    public void clickSaw(){
        wait.until(ExpectedConditions.elementToBeClickable(SELECT_SAW));
        click(SELECT_SAW);
    }

    @Step("Click To")
    public void clickTo(){
        wait.until(ExpectedConditions.elementToBeClickable(BTN_TO));
        click(BTN_TO);
    }

    @Step("Click ESB")
    public void clickEsb(){
        wait.until(ExpectedConditions.elementToBeClickable(SELECT_ESB));
        click(SELECT_ESB);
    }

    @Step("Click departure date")
    public void clickDepartureDate(){
        wait.until(ExpectedConditions.elementToBeClickable(DEPARTURE_DATE));
        click(DEPARTURE_DATE);
    }

    @Step("Click the date <day> days after today")
    public void click2DaysLater(int day){
        Date dt = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(dt);
        c.add(Calendar.DATE, day);
        dt = c.getTime();
        int date2 = dt.getDate();

        List<MobileElement> dateList = findElements(By.xpath(LIST_DATE_XPATH+"[@text='" + date2 + "']"));
        dateList.get(0).click();
    }

    @Step("Click done")
    public void clickDone(){
        wait.until(ExpectedConditions.elementToBeClickable(BTN_DONE));
        click(BTN_DONE);
    }

    @Step("Increase adult count by <number>")
    public void increaseAdultCount(int number) {
        List<MobileElement> plusList = findElements(LIST_PLUS_BTN);
        for (int i = 0; i < number; i++) {
            plusList.get(0).click();
        }
    }

    @Step("Click Search Flight")
    public void clickSearchFlight(){
        wait.until(ExpectedConditions.elementToBeClickable(SEARCH_FLIGHT));
        click(SEARCH_FLIGHT);
    }

    @Test
    @Step({"Flight list check"})
    public void listCheck(){
        MobileElement checkElement = findElement(CHECK_FLIGHT_LIST);
        Assert.assertTrue(checkElement.isDisplayed());
        System.out.println("Flight List Checked.");
    }

    @Step("Select a Flight")
    public void clickAFlight(){
        List<MobileElement> plusList = findElements(SELECT_FLIGHT);
        plusList.get(0).click();
    }
    @Step("Select Eco Flight")
    public void clickEcoFlight(){
        wait.until(ExpectedConditions.elementToBeClickable(SELECT_ECO));
        click(SELECT_ECO);
    }

    @Step("Click Continue")
    public void clickContinue(){
        wait.until(ExpectedConditions.elementToBeClickable(BTN_CONTINUE));
        click(BTN_CONTINUE);
    }
}

