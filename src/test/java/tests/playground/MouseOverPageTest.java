package tests.playground;

import io.qameta.allure.Epic;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import static constants.ConstantsForPages.TIMES_TO_PRESS;
import static constants.PageLinkLocator.MOUSE_OVER;
import static utils.pagesutils.IPageFactory.mainPage;
import static utils.pagesutils.IPageFactory.mouseOverPage;

@Epic("Playground")
public class MouseOverPageTest extends BaseTest {

    @Test
    public void test() {
        mainPage.clickOnLinkToRedirect(MOUSE_OVER);
        Assert.assertTrue(mouseOverPage.isResultCorrectToClicks(TIMES_TO_PRESS));
    }
}
