package tests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import steps.*;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class BaseClass {
    public static final String DEFAULT_DEVICE = "emulator";
    private static final String APK_NAME = "stopwatch.apk";
    private static final String URL = "http://127.0.0.1:4723/wd/hub";
    private static final String APK_PATH = "src/test/resources/";
    private static final String APP_PACKAGE = "toplab18.app.simpleststopwatch2";
    private static final String APP_ACTIVITY = "MainActivity";

    AccessPageSteps accessPageSteps;
    StopwatchPageSteps stopwatchPageSteps;
    PermissonPageSteps permissionPageSteps;
    IntroductionPageSteps introductionPageSteps;
    UpdatePageSteps updatePageSteps;

    protected static AndroidDriver<AndroidElement> driver;

    @BeforeSuite
    public void setUpAppium() throws MalformedURLException {
        URL url = new URL(URL);
        File appDir = new File(APK_PATH);
        File app = new File(appDir, APK_NAME);
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, DEFAULT_DEVICE);
        capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        capabilities.setCapability("appPackage", APP_PACKAGE);
        capabilities.setCapability("appActivity", APP_ACTIVITY);

        driver = new AndroidDriver(url, capabilities);
    }

    @BeforeTest
    public void setUp() {
        stopwatchPageSteps = new StopwatchPageSteps(driver);
        permissionPageSteps = new PermissonPageSteps(driver);
        introductionPageSteps = new IntroductionPageSteps(driver);
        accessPageSteps = new AccessPageSteps(driver);
        updatePageSteps = new UpdatePageSteps(driver);
        permissionPageSteps.checkPageDisplayed().tapAllowButton();
        introductionPageSteps.checkPageDisplayed().tapLaterButton();
    }

    @AfterSuite
    public void tearDownAppium() {
        driver.quit();
    }
}

