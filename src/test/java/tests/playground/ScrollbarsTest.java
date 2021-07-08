package tests.playground;

import io.qameta.allure.Epic;
import org.testng.annotations.Test;
import pages.playgroundpages.MainPage;
import tests.BaseTest;

import static pages.playgroundpages.MainPage.SCROLL_BARS;
import static utils.pageutils.IPageFactory.scrollbarsPage;

@Epic("Playground")
public class ScrollbarsTest extends BaseTest {

    @Test
    public void test() {
        MainPage.clickOnLinkToRedirect(SCROLL_BARS);
        scrollbarsPage.clickOnButton();
    }
}
