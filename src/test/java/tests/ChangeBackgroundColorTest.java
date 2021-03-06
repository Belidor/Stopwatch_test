package tests;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ChangeBackgroundColorTest extends BaseClass {

    @Test(description = "Change background mode")
    public void changeBackgroundColorTest() {
        stopwatchPageSteps.tapSettingsButton();
        stopwatchPageSteps.tapSquareButton();
        stopwatchPageSteps.tapBackgroundButton();
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File("src/test/resources/Screenshots/ChangeBackgroundColorTest.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        stopwatchPageSteps.tapSettingsButton();
    }
}