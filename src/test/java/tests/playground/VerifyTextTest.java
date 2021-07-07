package tests.playground;

import io.qameta.allure.Epic;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import static constants.ConstantsForPages.EXPECTED_VALUE_FOR_VERIFY_TEXT_PAGE;
import static pages.MainPage.VERIFY_TEXT;
import static utils.pagesutils.IPageFactory.mainPage;
import static utils.pagesutils.IPageFactory.verifyTextPage;

@Epic("Playground")
public class VerifyTextTest extends BaseTest {

    @Test
    public void test() {
        mainPage.clickOnLinkToRedirect(VERIFY_TEXT);
        Assert.assertTrue(verifyTextPage.isVerified(EXPECTED_VALUE_FOR_VERIFY_TEXT_PAGE));
    }
}
