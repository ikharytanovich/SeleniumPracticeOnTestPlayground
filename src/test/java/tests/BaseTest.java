package tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import pages.BasePage;
import utils.driverutils.ThreadLocalDriver;
import utils.listenerutils.TestListener;
import utils.loggerutils.ILogger;

@Listeners({TestListener.class})
public class BaseTest implements ILogger {
    @BeforeTest
    public void beforeTest() {
        BasePage.getToMainPage();
    }

    @AfterTest
    public void afterTest() {
        ThreadLocalDriver.closeDriver();
    }
}
