package tests.playground;

import io.qameta.allure.Epic;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.playgroundpages.MainPage;
import tests.BaseTest;

import static pages.playgroundpages.MainPage.HIDDEN_LAYERS;
import static utils.pageutils.IPageFactory.hiddenLayersPage;

@Epic("Playground")
public class HiddenLayersTest extends BaseTest {

    @Test
    public void test() {
        MainPage.clickOnLinkToRedirect(HIDDEN_LAYERS);
        hiddenLayersPage.clickObButton();
        Assert.assertTrue(hiddenLayersPage.isNotClickable());
    }
}
