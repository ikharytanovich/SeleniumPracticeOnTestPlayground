package tests.playground;

import io.qameta.allure.Epic;
import org.testng.annotations.Test;
import pages.playgroundpages.MainPage;
import tests.BaseTest;

import static pages.playgroundpages.MainPage.DYNAMIC_ID;
import static utils.pageutils.IPageFactory.dynamicIdPage;

@Epic("Playground")
public class DynamicIdTest extends BaseTest {

    @Test
    public void test() {
        MainPage.clickOnLinkToRedirect(DYNAMIC_ID);
        dynamicIdPage.clickOnButton();
    }
}
