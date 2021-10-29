package tests;

import org.testng.annotations.Test;

public class RunStopwatchTest extends BaseClass {

    @Test(description = "Run a stopwatch")
    public void runStopwatch() throws InterruptedException {
        stopwatchPageSteps.runStopwatch();
        System.out.println(stopwatchPageSteps.getTime());
    }
}