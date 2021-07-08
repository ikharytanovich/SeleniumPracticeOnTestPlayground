package utils.listenerutils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.driverutils.ThreadLocalDriver;
import utils.loggerutils.ILogger;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import static constants.ConfigConstants.SCREENSHOTS_SRC;
import static constants.ConfigConstants.SCREENSHOT_FORMAT;

public class TestListener implements ITestListener, ILogger {
    private static final Random random = new Random();
    private static final int randomIntRange = 10000;

    @Override
    public void onTestSuccess(ITestResult result) {
        log().info("TEST{" + getSimpleClassName(result) + "}SUCCESS");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        takeScreenshot(getSimpleClassName(result));
        log().info("TEST{" + getSimpleClassName(result) + "}FAILED");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        takeScreenshot(getSimpleClassName(result));
        log().info("TEST{" + getSimpleClassName(result) + "}SKIPPED" + result.getSkipCausedBy());
    }

    private void takeScreenshot(String name) {
        String screenshotName = name + random.nextInt(randomIntRange) + SCREENSHOT_FORMAT;
        TakesScreenshot takesScreenshot = ((TakesScreenshot) (ThreadLocalDriver.getDriver()));
        File screenshot = takesScreenshot.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot, new File(SCREENSHOTS_SRC + screenshotName));
        } catch (IOException ioException) {
            log().info("ERROR WHILE TAKING SCREENSHOT");
        }
    }

    private String getSimpleClassName(ITestResult result) {
        return result.getTestClass().getRealClass().getSimpleName();
    }
}

