package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.MainPage;
import utils.driversutils.ThreadLocalDriver;

public class BaseTest {
    protected MainPage mainPage;

    @BeforeClass
    public void beforeClass() {
        mainPage = new MainPage();
    }

    @BeforeMethod
    public void setUp() {
        mainPage.getToMainPage();
    }

    @AfterClass
    public void afterClass() {
        ThreadLocalDriver.closeDriver();
    }
}
