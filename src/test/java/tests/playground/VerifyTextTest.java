package tests.playground;

import io.qameta.allure.Epic;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.playgroundpages.MainPage;
import tests.BaseTest;

import static pages.playgroundpages.MainPage.VERIFY_TEXT;
import static utils.pageutils.IPageFactory.verifyTextPage;

@Epic("Playground")
public class VerifyTextTest extends BaseTest {

    @Test
    public void test() {
        MainPage.clickOnLinkToRedirect(VERIFY_TEXT);
        Assert.assertTrue(verifyTextPage.isVerified());
    }
}
