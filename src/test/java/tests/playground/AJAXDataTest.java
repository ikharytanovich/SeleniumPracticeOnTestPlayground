package tests.playground;

import io.qameta.allure.Epic;
import org.testng.annotations.Test;
import pages.playgroundpages.MainPage;
import tests.BaseTest;

import static pages.playgroundpages.MainPage.AJAX_DATA;

@Epic("Playground")
public class AJAXDataTest extends BaseTest {

    @Test
    public void test() {
        MainPage.clickOnLinkToRedirect(AJAX_DATA);
        throw new RuntimeException();
//        Assert.assertTrue(ajaxDataPage.isDataDisplayedAfterButtonClick());
    }
}
