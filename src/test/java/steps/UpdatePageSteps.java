package steps;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import org.testng.Assert;
import pages.UpdatePage;

public class UpdatePageSteps extends CommonStep {
    private UpdatePage updatePage = new UpdatePage(driver);

    public UpdatePageSteps(AndroidDriver driver) {
        super(driver);
    }

    @Override
    @Step("Check 'Update popup' is displayed")
    public UpdatePageSteps checkPageDisplayed() {
        Assert.assertTrue(updatePage.getOkButton().isDisplayed(), "Update popup page is not displayed");
        return this;
    }

    @Step("Tap 'Ok' Button")
    public UpdatePageSteps tapOkButton() {
        updatePage.getOkButton().click();
        return this;
    }

    @Step("Tap 'Check for updates' Button")
    public UpdatePageSteps tapCheckForUpdateButton() {
        updatePage.getCheckForUpdateButton().click();
        return this;
    }
}