package tests.playground;

import io.qameta.allure.Epic;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PageLink;
import pages.playgroundpages.VerifyTextPage;
import tests.BaseTest;

@Epic("Playground")
public class VerifyTextTest extends BaseTest {
    private VerifyTextPage verifyTextPage = new VerifyTextPage();

    @Test
    public void test() {
        mainPage.moveTo(PageLink.VerifyTextPage);
        Assert.assertTrue(verifyTextPage.isVerified());
    }
}
