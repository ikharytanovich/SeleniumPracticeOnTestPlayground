package tests.playground;

import io.qameta.allure.Epic;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import static constants.ConstantsForPages.INPUT_FOR_TEXT_PAGE;
import static pages.MainPage.TEXT_PAGE;
import static utils.pagesutils.IPageFactory.mainPage;
import static utils.pagesutils.IPageFactory.textPage;

@Epic("Playground")
public class TextPageTest extends BaseTest {

    @Test
    public void test() {
        mainPage.clickOnLinkToRedirect(TEXT_PAGE);
        Assert.assertTrue(textPage.inputTextAndCheckIsButtonChangedValue(INPUT_FOR_TEXT_PAGE));
    }
}
