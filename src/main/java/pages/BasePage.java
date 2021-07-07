package pages;

import utils.driversutils.ThreadLocalDriver;

public class BasePage {
    private static final String MAIN_PAGE_URL = "http://uitestingplayground.com/";

    public void getToMainPage() {
        ThreadLocalDriver.getDriver().get(MAIN_PAGE_URL);
    }
}
