package tests.playground;

import io.qameta.allure.Epic;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PageLink;
import pages.playgroundpages.AJAXDataPage;
import tests.BaseTest;

@Epic("Playground")
public class AJAXDataTest extends BaseTest {
    private final AJAXDataPage ajaxDataPage = new AJAXDataPage();

    @Test
    public void test() {
        mainPage.moveTo(PageLink.AJAXData);
        Assert.assertTrue(ajaxDataPage.isDataDisplayedAfterButtonClick());
    }
}
