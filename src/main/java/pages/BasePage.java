package pages;

import utils.driverutils.ThreadLocalDriver;
import utils.loggerutils.ILogger;

public class BasePage implements ILogger {
    private static final String MAIN_PAGE_URL = "http://uitestingplayground.com/";

    public static void getToMainPage() {
        ThreadLocalDriver.getDriver().get(MAIN_PAGE_URL);
    }
}
