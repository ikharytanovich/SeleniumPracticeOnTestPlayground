package tests.playground;

import io.qameta.allure.Epic;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import static constants.PageLinkLocator.AJAX_DATA;
import static utils.pagesutils.IPageFactory.ajaxDataPage;
import static utils.pagesutils.IPageFactory.mainPage;

@Epic("Playground")
public class AJAXDataTest extends BaseTest {

    @Test
    public void test() {
        mainPage.clickOnLinkToRedirect(AJAX_DATA);
        Assert.assertTrue(ajaxDataPage.isDataDisplayedAfterButtonClick());
    }
}
