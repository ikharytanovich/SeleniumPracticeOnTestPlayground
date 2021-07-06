package tests.playground;

import io.qameta.allure.Epic;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PageLink;
import pages.playgroundpages.ClickPage;
import tests.BaseTest;

@Epic("Playground")
public class ClickPageTest extends BaseTest {
    private final ClickPage clickPage = new ClickPage();

    @Test
    public void test() {
        mainPage.moveTo(PageLink.ClickPage);
        Assert.assertTrue(clickPage.isButtonGreenAfterClickBlue());
    }
}
