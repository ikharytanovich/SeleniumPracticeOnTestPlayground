package tests.playground;

import io.qameta.allure.Epic;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.playgroundpages.MainPage;
import tests.BaseTest;

import static pages.playgroundpages.MainPage.CLICK_PAGE;
import static utils.pageutils.IPageFactory.clickPage;

@Epic("Playground")
public class ClickPageTest extends BaseTest {

    @Test
    public void test() {
        MainPage.clickOnLinkToRedirect(CLICK_PAGE);
        Assert.assertTrue(clickPage.isButtonGreenAfterClickBlue());
    }
}
