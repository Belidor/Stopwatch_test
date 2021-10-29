package steps;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import org.testng.Assert;
import pages.IntroductionPage;

public class IntroductionPageSteps extends CommonStep {

    private IntroductionPage introductionPage = new IntroductionPage(driver);

    public IntroductionPageSteps(AndroidDriver driver) {
        super(driver);
    }

    @Override
    @Step("Check 'Introduction dialog' is displayed")
    public IntroductionPageSteps checkPageDisplayed() {
        Assert.assertTrue(introductionPage.getLaterButton().isDisplayed(), "Introduction dialog page is not displayed");
        return this;
    }

    @Step("Tap Later button")
    public IntroductionPageSteps tapLaterButton() {
        introductionPage.getLaterButton().click();
        return this;
    }
}