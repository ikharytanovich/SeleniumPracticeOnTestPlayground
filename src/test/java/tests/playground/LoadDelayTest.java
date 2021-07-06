package tests.playground;

import io.qameta.allure.Epic;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PageLink;
import pages.playgroundpages.LoadDelayPage;
import tests.BaseTest;

@Epic("Playground")
public class LoadDelayTest extends BaseTest {
    private final LoadDelayPage loadDelayPage = new LoadDelayPage();

    @Test
    public void test() {
        mainPage.moveTo(PageLink.LoadDelay);
        Assert.assertTrue(loadDelayPage.isButtonDisplayed());
    }
}
