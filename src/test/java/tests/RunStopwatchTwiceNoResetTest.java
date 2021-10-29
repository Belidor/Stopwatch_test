package tests;

import org.testng.annotations.Test;

public class RunStopwatchTwiceNoResetTest extends BaseClass {

    @Test(description = "Run the stopwatch starting with a point of time when the previous stopwatch was ended")
    public void runStopwatch() throws InterruptedException {
        stopwatchPageSteps.runStopwatch();
        System.out.println(stopwatchPageSteps.getTime());
        stopwatchPageSteps.runStopwatch();
        System.out.println(stopwatchPageSteps.getTime());
    }
}