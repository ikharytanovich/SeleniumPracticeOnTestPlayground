package tests.playground;

import io.qameta.allure.Epic;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.playgroundpages.MainPage;
import tests.BaseTest;

import static pages.playgroundpages.MainPage.VISIBILITY;
import static utils.pageutils.IPageFactory.visibilityPage;

@Epic("Playground")
public class VisibilityTest extends BaseTest {

    @Test
    public void test() {
        MainPage.clickOnLinkToRedirect(VISIBILITY);
        Assert.assertTrue(visibilityPage.isInvisible());
    }
}
