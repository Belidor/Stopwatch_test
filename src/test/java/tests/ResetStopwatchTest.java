package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ResetStopwatchTest extends BaseClass {

    @Test(description = "Reset stopwatch")
    public void resetStopwatch() {
        stopwatchPageSteps.runStopwatch();
        System.out.println(stopwatchPageSteps.getTime());
        stopwatchPageSteps.longPressMainButton();
        System.out.println(stopwatchPageSteps.getTime());
        assertEquals(stopwatchPageSteps.getTime(),"00:00.00");
    }
}