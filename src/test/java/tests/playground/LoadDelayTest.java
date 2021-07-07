package tests.playground;

import io.qameta.allure.Epic;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import static constants.PageLinkLocator.LOAD_DELAY;
import static utils.pagesutils.IPageFactory.loadDelayPage;
import static utils.pagesutils.IPageFactory.mainPage;

@Epic("Playground")
public class LoadDelayTest extends BaseTest {

    @Test
    public void test() {
        mainPage.clickOnLinkToRedirect(LOAD_DELAY);
        Assert.assertTrue(loadDelayPage.isButtonDisplayed());
    }
}
