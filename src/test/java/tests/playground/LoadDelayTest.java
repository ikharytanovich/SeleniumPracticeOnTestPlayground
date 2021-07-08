package tests.playground;

import io.qameta.allure.Epic;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.playgroundpages.MainPage;
import tests.BaseTest;

import static pages.playgroundpages.MainPage.LOAD_DELAY;
import static utils.pageutils.IPageFactory.loadDelayPage;

@Epic("Playground")
public class LoadDelayTest extends BaseTest {

    @Test
    public void test() {
        MainPage.clickOnLinkToRedirect(LOAD_DELAY);
        Assert.assertTrue(loadDelayPage.isButtonDisplayed());
    }
}
