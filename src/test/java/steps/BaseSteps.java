package steps;

import io.appium.java_client.android.AndroidDriver;

/**
 * A base for all classes with steps.
 */
public abstract class BaseSteps {

    public final AndroidDriver driver;

    public BaseSteps(AndroidDriver driver) {
        this.driver = driver;
    }
}