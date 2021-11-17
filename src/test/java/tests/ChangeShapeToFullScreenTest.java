package tests;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ChangeShapeToFullScreenTest extends BaseClass {

    @Test(description = "Change shape the stopwatch screen to full screen")
    public void changeShapeToFullScreenTest() {
        stopwatchPageSteps.tapSettingsButton();
        stopwatchPageSteps.tapFullScreenButton();
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File("src/test/resources/Screenshots/ChangeShapeToFullScreenTest.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        stopwatchPageSteps.tapSettingsButton();
    }

}