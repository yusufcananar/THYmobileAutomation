
package com.turkishairlines.mobile.helper;

import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.BeforeScenario;
import com.turkishairlines.mobile.base.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public class HookImplementation extends BasePage {
    //public static AppiumDriver<MobileElement> driver;

    @Before
    @BeforeScenario
    public void beforeScenario() throws MalformedURLException {
        System.out.println("**TEST IS STARTING..**");

        DesiredCapabilities cap = new DesiredCapabilities();

        //cap.setCapability("deviceName", "Android");
        cap.setCapability("udid","emulator-5554");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "8.1.0");
        cap.setCapability("appPackage","com.turkishairlines.mobile");
        cap.setCapability("appActivity", "com.turkishairlines.mobile.ui.ACSplash");

        URL url =  new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AppiumDriver<MobileElement>(url, cap);
        wait = new WebDriverWait(driver, 15, 750);
        System.out.println("**TEST HAS STARTED..**");
    }

    @After
    @AfterScenario
    public void afterScenario(){
        System.out.println("**TEST IS ENDING..**");
        if (driver != null){
            driver.quit();
        }
        System.out.println("**TEST HAS ENDED..**");
    }
}
