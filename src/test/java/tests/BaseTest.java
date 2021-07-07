package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utils.driversutils.ThreadLocalDriver;

import static utils.pagesutils.IPageFactory.basePage;

public class BaseTest {
    @BeforeClass
    public void setUp() {
        basePage.getToMainPage();
    }

    @AfterClass
    public void afterClass() {
        ThreadLocalDriver.closeDriver();
    }
}
