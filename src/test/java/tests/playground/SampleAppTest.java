package tests.playground;

import io.qameta.allure.Epic;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.playgroundpages.MainPage;
import tests.BaseTest;

import static constants.PageConstants.PASSWORD_VALUE;
import static constants.PageConstants.USER_NAME_VALUE;
import static pages.playgroundpages.MainPage.SAMPLE_APP;
import static utils.pageutils.IPageFactory.sampleAppPage;

@Epic("Playground")
public class SampleAppTest extends BaseTest {

    @Test
    public void test() {
        MainPage.clickOnLinkToRedirect(SAMPLE_APP);
        Assert.assertTrue(sampleAppPage.login(USER_NAME_VALUE, PASSWORD_VALUE));
    }
}
