package tests.playground;

import io.qameta.allure.Epic;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.MainPage.HIDDEN_LAYERS;
import static utils.pagesutils.IPageFactory.hiddenLayersPage;
import static utils.pagesutils.IPageFactory.mainPage;

@Epic("Playground")
public class HiddenLayersTest extends BaseTest {

    @Test
    public void test() {
        mainPage.clickOnLinkToRedirect(HIDDEN_LAYERS);
        hiddenLayersPage.clickObButton();
        Assert.assertTrue(hiddenLayersPage.isNotClickable());
    }
}
