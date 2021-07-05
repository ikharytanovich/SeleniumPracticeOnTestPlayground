package tests.playground;

import io.qameta.allure.Epic;
import org.testng.annotations.Test;
import pages.PageLink;
import pages.playgroundpages.DynamicIdPage;
import tests.BaseTest;

@Epic("Playground")
public class DynamicIdTest extends BaseTest {
    private DynamicIdPage dynamicIdPage = new DynamicIdPage();

    @Test
    public void test() {
        mainPage.moveTo(PageLink.DynamicId);
        dynamicIdPage.clickOnButton();
    }
}
