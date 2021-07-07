package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import utils.driversutils.ThreadLocalDriver;

import static utils.pagesutils.IPageFactory.basePage;

public class BaseTest {

    @BeforeClass
    public void beforeClass() {
    }

    @BeforeMethod
    public void setUp() {
        basePage.getToMainPage();
    }

    @AfterClass
    public void afterClass() {
        ThreadLocalDriver.closeDriver();
    }
}
