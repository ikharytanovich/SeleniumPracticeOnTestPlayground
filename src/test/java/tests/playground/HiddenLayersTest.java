package tests.playground;

import io.qameta.allure.Epic;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PageLink;
import pages.playgroundpages.HiddenLayersPage;
import tests.BaseTest;

@Epic("Playground")
public class HiddenLayersTest extends BaseTest {
    private final HiddenLayersPage hiddenLayersPage = new HiddenLayersPage();

    @Test
    public void test() {
        mainPage.moveTo(PageLink.HiddenLayers);
        hiddenLayersPage.clickObButton();
        Assert.assertTrue(hiddenLayersPage.isNotClickable());
    }
}
