package tests.playground;

import org.testng.annotations.Test;
import pages.PageLink;
import pages.playgroundpages.ScrollbarsPage;
import tests.BaseTest;

public class ScrollbarsTest extends BaseTest {
    private ScrollbarsPage scrollbarsPage = new ScrollbarsPage();

    @Test
    public void test() {
        mainPage.moveTo(PageLink.ScrollBars);
        scrollbarsPage.clickOnButton();
    }
}
