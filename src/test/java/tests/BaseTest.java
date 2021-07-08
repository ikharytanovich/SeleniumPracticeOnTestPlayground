package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import pages.BasePage;
import utils.driverutils.ThreadLocalDriver;
import utils.listenerutils.TestListener;
import utils.loggerutils.ILogger;

@Listeners({TestListener.class})
public class BaseTest implements ILogger {
    @BeforeClass
    public void beforeClass() {
        BasePage.getToMainPage();
    }

    @AfterClass
    public void afterClass() {
        ThreadLocalDriver.closeDriver();
    }
}
