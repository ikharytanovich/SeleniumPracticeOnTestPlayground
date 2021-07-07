package tests.playground;

import io.qameta.allure.Epic;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.MainPage.CLICK_PAGE;
import static utils.pagesutils.IPageFactory.clickPage;
import static utils.pagesutils.IPageFactory.mainPage;

@Epic("Playground")
public class ClickPageTest extends BaseTest {

    @Test
    public void test() {
        mainPage.clickOnLinkToRedirect(CLICK_PAGE);
        Assert.assertTrue(clickPage.isButtonGreenAfterClickBlue());
    }
}
