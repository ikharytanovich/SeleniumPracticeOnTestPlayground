package tests.playground;

import io.qameta.allure.Epic;
import org.testng.annotations.Test;
import tests.BaseTest;

import static constants.PageLinkLocator.NON_BRAKING_SPACE;
import static utils.pagesutils.IPageFactory.mainPage;
import static utils.pagesutils.IPageFactory.nonBrakingSpacePage;

@Epic("Playground")
public class NonBrakingSpacePageTest extends BaseTest {

    @Test
    public void test() {
        mainPage.clickOnLinkToRedirect(NON_BRAKING_SPACE);
        nonBrakingSpacePage.click();
    }
}
