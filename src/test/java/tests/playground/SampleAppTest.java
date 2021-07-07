package tests.playground;

import io.qameta.allure.Epic;
import org.testng.annotations.Test;
import tests.BaseTest;

import static constants.ConstantsForPages.PASSWORD_VALUE;
import static constants.ConstantsForPages.USER_NAME_VALUE;
import static constants.PageLinkLocator.SAMPLE_APP;
import static utils.pagesutils.IPageFactory.mainPage;
import static utils.pagesutils.IPageFactory.sampleAppPage;

@Epic("Playground")
public class SampleAppTest extends BaseTest {

    @Test
    public void test() {
        mainPage.clickOnLinkToRedirect(SAMPLE_APP);
        sampleAppPage.login(USER_NAME_VALUE, PASSWORD_VALUE);
    }
}
