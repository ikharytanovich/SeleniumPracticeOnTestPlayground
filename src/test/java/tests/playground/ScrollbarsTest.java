package tests.playground;

import io.qameta.allure.Epic;
import org.testng.annotations.Test;
import pages.PageLink;
import pages.playgroundpages.ScrollbarsPage;
import tests.BaseTest;

@Epic("Playground")
public class ScrollbarsTest extends BaseTest {
    private final ScrollbarsPage scrollbarsPage = new ScrollbarsPage();

    @Test
    public void test() {
        mainPage.moveTo(PageLink.ScrollBars);
        scrollbarsPage.clickOnButton();
    }
}
