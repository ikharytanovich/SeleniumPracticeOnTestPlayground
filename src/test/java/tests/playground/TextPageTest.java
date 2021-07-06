package tests.playground;

import io.qameta.allure.Epic;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PageLink;
import pages.playgroundpages.TextPage;
import tests.BaseTest;

@Epic("Playground")
public class TextPageTest extends BaseTest {
    private TextPage textPage = new TextPage();

    @Test
    public void testName() {
        mainPage.moveTo(PageLink.TextPage);
        Assert.assertTrue(textPage.inputTextAndCheckIsButtonChangedValue());
    }
}
