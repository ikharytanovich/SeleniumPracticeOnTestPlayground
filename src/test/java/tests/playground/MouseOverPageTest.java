package tests.playground;

import io.qameta.allure.Epic;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.playgroundpages.MainPage;
import tests.BaseTest;

import static constants.PageConstants.TIMES_TO_PRESS;
import static pages.playgroundpages.MainPage.MOUSE_OVER;
import static utils.pageutils.IPageFactory.mouseOverPage;

@Epic("Playground")
public class MouseOverPageTest extends BaseTest {

    @Test
    public void test() {
        MainPage.clickOnLinkToRedirect(MOUSE_OVER);
        Assert.assertTrue(mouseOverPage.isResultCorrectToClicks(TIMES_TO_PRESS));
    }
}
