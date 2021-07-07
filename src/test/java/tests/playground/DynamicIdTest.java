package tests.playground;

import io.qameta.allure.Epic;
import org.testng.annotations.Test;
import tests.BaseTest;

import static constants.PageLinkLocator.DYNAMIC_ID;
import static utils.pagesutils.IPageFactory.dynamicIdPage;
import static utils.pagesutils.IPageFactory.mainPage;

@Epic("Playground")
public class DynamicIdTest extends BaseTest {

    @Test
    public void test() {
        mainPage.clickOnLinkToRedirect(DYNAMIC_ID);
        dynamicIdPage.clickOnButton();
    }
}
