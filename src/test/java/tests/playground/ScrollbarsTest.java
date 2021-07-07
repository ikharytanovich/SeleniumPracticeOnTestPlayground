package tests.playground;

import io.qameta.allure.Epic;
import org.testng.annotations.Test;
import tests.BaseTest;

import static constants.PageLinkLocator.SCROLL_BARS;
import static utils.pagesutils.IPageFactory.mainPage;
import static utils.pagesutils.IPageFactory.scrollbarsPage;

@Epic("Playground")
public class ScrollbarsTest extends BaseTest {

    @Test
    public void test() {
        mainPage.clickOnLinkToRedirect(SCROLL_BARS);
        scrollbarsPage.clickOnButton();
    }
}
