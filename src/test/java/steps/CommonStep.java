package steps;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;

/**
 * Class provides common actions for the Stopwatch app pages
 */
public abstract class CommonStep extends BaseSteps {

    protected CommonStep(AndroidDriver driver) {
        super(driver);
    }

    @Step("Check the page is displayed")
    public abstract CommonStep checkPageDisplayed();
}