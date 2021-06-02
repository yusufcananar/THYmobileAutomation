package com.turkishairlines.mobile.pageConsts;

import org.openqa.selenium.By;

public class FlightInfoPageConsts {

    public static final By BTN_ONE_WAY = By.id("com.turkishairlines.mobile:id/frDashboard_tvOneWay");
    public static final By BTN_FROM = By.id("com.turkishairlines.mobile:id/frDashboard_tvFromCode");
    public static final By SEARCH_AREA = By.id("com.turkishairlines.mobile:id/frAirportSelection_etSearch");
    public static final By SELECT_SAW = By.xpath("//android.widget.RelativeLayout/android.widget.TextView[@text='SAW - Sabiha Gokcen Airport']");
    public static final By BTN_TO = By.id("com.turkishairlines.mobile:id/frDashboard_tvToCode");
    public static final By SELECT_ESB = By.xpath("//android.widget.RelativeLayout/android.widget.TextView[@text='ESB - Ankara Esenboga Airport']");
    public static final By DEPARTURE_DATE = By.id("com.turkishairlines.mobile:id/frDashboard_tvDepartureTitle");

    public static final String LIST_DATE_XPATH = "//android.widget.ListView/android.widget.LinearLayout/android.view.ViewGroup/" +
            "android.view.ViewGroup/android.widget.FrameLayout/android.widget.TextView";
    public static final By LIST_DATE = By.xpath("//android.widget.ListView/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.TextView");

    public static final By BTN_DONE = By.id("com.turkishairlines.mobile:id/frDashboard_btnDone");
    public static final By LIST_PLUS_BTN = By.xpath("//android.widget.LinearLayout/android.widget.ImageView[@resource-id='com.turkishairlines.mobile:id/cvPassengerItem_imPlus']");

    public static final By SEARCH_FLIGHT = By.id("com.turkishairlines.mobile:id/frDashboard_btnSearch");
}
