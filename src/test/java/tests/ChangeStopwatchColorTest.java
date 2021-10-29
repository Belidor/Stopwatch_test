package tests;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;

public class ChangeStopwatchColorTest extends BaseClass {

    @Test(description = "Change color of the stopwatch screen")
    public void changeStopwatchColorTest() throws InterruptedException {
        stopwatchPageSteps.tapSettingsButton();
        stopwatchPageSteps.tapColorsPalette();
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File("src/test/resources/Screenshots/ChangeStopwatchColorTest.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}