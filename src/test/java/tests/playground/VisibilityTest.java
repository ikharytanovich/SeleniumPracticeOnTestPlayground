package tests.playground;

import io.qameta.allure.Epic;
import org.testng.annotations.Test;
import pages.PageLink;
import pages.playgroundpages.VisibilityPage;
import tests.BaseTest;

@Epic("Playground")
public class VisibilityTest extends BaseTest {
    private VisibilityPage visibilityPage = new VisibilityPage();

    @Test
    public void test() {
        mainPage.moveTo(PageLink.VisibilityPage);
        visibilityPage.isEnable();
    }
}
