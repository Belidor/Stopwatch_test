package steps;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import org.testng.Assert;
import pages.PermissionPage;

public class PermissonPageSteps extends CommonStep {
    private PermissionPage permissionPage = new PermissionPage(driver);

    public PermissonPageSteps(AndroidDriver driver) {
        super(driver);
    }

    @Override
    @Step("Check 'Permission popup' is displayed")
    public PermissonPageSteps checkPageDisplayed() {
        Assert.assertTrue(permissionPage.getAllowButton().isDisplayed(), "Permission popup page is not displayed");
        return this;
    }

    @Step("Tap 'Allow' Button")
    public PermissonPageSteps tapAllowButton() {
        permissionPage.getAllowButton().click();
        return this;
    }

    @Step("Tap 'Deny' Button")
    public PermissonPageSteps tapDenyButton() {
        permissionPage.getDenyButton().click();
        return this;
    }
}