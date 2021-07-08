package tests.playground;

import io.qameta.allure.Epic;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.playgroundpages.MainPage;
import tests.BaseTest;

import static pages.playgroundpages.MainPage.AJAX_DATA;
import static utils.pageutils.IPageFactory.ajaxDataPage;

@Epic("Playground")
public class AJAXDataTest extends BaseTest {

    @Test
    public void test() {
        MainPage.clickOnLinkToRedirect(AJAX_DATA);
        Assert.assertTrue(ajaxDataPage.isDataDisplayedAfterButtonClick());
    }
}
