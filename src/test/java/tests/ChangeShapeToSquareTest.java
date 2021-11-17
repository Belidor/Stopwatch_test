package tests;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ChangeShapeToSquareTest extends BaseClass {

    @Test(description = "Change shape of the stopwatch screen to square")
    public void changeShapeToSquareTest() {
        stopwatchPageSteps.tapSettingsButton();
        stopwatchPageSteps.tapSquareButton();
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File("src/test/resources/Screenshots/ChangeShapeToSquareTest.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        stopwatchPageSteps.tapSettingsButton();
    }
}