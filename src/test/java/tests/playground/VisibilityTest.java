package tests.playground;

import io.qameta.allure.Epic;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import static constants.PageLinkLocator.VISIBILITY;
import static utils.pagesutils.IPageFactory.mainPage;
import static utils.pagesutils.IPageFactory.visibilityPage;

@Epic("Playground")
public class VisibilityTest extends BaseTest {

    @Test
    public void test() {
        mainPage.clickOnLinkToRedirect(VISIBILITY);
        Assert.assertTrue(visibilityPage.isInvisible());
    }
}
