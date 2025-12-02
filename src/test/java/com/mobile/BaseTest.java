package com.mobile;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

//{
//        "appium:udid": "29729fbe",
//        "appium:platformVersion": "14",
//        "appium:automationName": "UiAutomator2",
//        "platformName": "Android",
//        "appium:appPackage": "com.bng.calculator",
//        "appium:appActivity": "com.bng.calc.MainActivity",
//        "appium:noReset": "true",
//        "appium:dontStopAppOnReset": "true",
//        "appium:ignoreHiddenApiPolicyError": "true"
//        }
public class BaseTest {
    AndroidDriver driver;

    @BeforeClass
    public void launchAppium() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium:udid", "29729fbe");
        capabilities.setCapability("appium:platformVersion", "14");
        capabilities.setCapability("appium:automationName", "UiAutomator2");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appium:appPackage", "com.bng.calculator");
        capabilities.setCapability("appium:appActivity", "com.bng.calc.MainActivity");
        capabilities.setCapability("appium:noReset", "true");
        capabilities.setCapability("appium:dontStopAppOnReset", "true");
        capabilities.setCapability("appium:ignoreHiddenApiPolicyError", "true");
        try {
            driver=new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
//            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//            driver.startRecordingScreen();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    @AfterClass
    public void teardown(){
        driver.quit();
    }
}