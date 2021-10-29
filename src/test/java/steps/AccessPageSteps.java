package steps;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import org.testng.Assert;
import pages.AccessPage;

public class AccessPageSteps extends CommonStep {
    private AccessPage accessPage = new AccessPage(driver);

    public AccessPageSteps(AndroidDriver driver) {
        super(driver);
    }

    @Override
    @Step("Check 'Access popup' is displayed")
    public AccessPageSteps checkPageDisplayed() {
        Assert.assertTrue(accessPage.getCancelButton().isDisplayed(), "Access popup page is not displayed");
        return this;
    }

    @Step("Tap 'Continue' Button")
    public AccessPageSteps tapAllowButton() {
        accessPage.getContinueButton().click();
        return this;
    }

    @Step("Tap 'Cancel' Button")
    public AccessPageSteps tapCancelButton() {
        accessPage.getCancelButton().click();
        return this;
    }
}