package tests.playground;

import io.qameta.allure.Epic;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.playgroundpages.MainPage;
import tests.BaseTest;

import static constants.PageConstants.INPUT_FOR_TEXT_PAGE;
import static pages.playgroundpages.MainPage.TEXT_PAGE;
import static utils.pageutils.IPageFactory.textPage;

@Epic("Playground")
public class TextPageTest extends BaseTest {

    @Test
    public void test() {
        MainPage.clickOnLinkToRedirect(TEXT_PAGE);
        Assert.assertTrue(textPage.inputTextAndCheckIsButtonChangedValue(INPUT_FOR_TEXT_PAGE));
    }
}
