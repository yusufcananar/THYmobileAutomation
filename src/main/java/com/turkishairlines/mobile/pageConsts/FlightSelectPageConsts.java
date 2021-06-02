package com.turkishairlines.mobile.pageConsts;

import org.openqa.selenium.By;

public class FlightSelectPageConsts {
    public static final By SELECT_FLIGHT = By.xpath("//*/android.widget.ImageView[@resource-id='com.turkishairlines.mobile:id/itemFlightSearchParent_ivArrow']");
    public static final By SELECT_ECO = By.xpath("//android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[@index='0']");//("//android.widget.FrameLayout/android.view.ViewGroup[@resource-id='com.turkishairlines.mobile:id/brandItem']");
    public static final By BTN_CONTINUE = By.id("com.turkishairlines.mobile:id/frFlightSearch_btnContinue");

    public static final By CHECK_FLIGHT_LIST = By.id("com.turkishairlines.mobile:id/frFlightSearch_rvFlight");

}
