package com.turkishairlines.mobile.base;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public class BasePage {

    public static AppiumDriver<MobileElement> driver;
    public static WebDriverWait wait;

    public BasePage() {
    }

    public MobileElement findElement(By by) {
        return driver.findElement(by);
    }

    public List<MobileElement> findElements(By by) {
        return driver.findElements(by);
    }

    public void click(By by) {
        findElement(by).click();
    }

    public void sendKeys(By by, CharSequence text) {
        MobileElement element = findElement(by);
        element.clear();
        element.sendKeys(text);
    }

    public String getText(By by) {
        return findElement(by).getText();
    }

    public Select getSelect(By by) {
        return new Select(findElement(by));
    }
}