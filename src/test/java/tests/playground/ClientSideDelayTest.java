package tests.playground;

import io.qameta.allure.Epic;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import static constants.PageLinkLocator.CLIENT_SIDE_DELAY;
import static utils.pagesutils.IPageFactory.clientSideDelayPage;
import static utils.pagesutils.IPageFactory.mainPage;

@Epic("Playground")
public class ClientSideDelayTest extends BaseTest {

    @Test
    public void test() {
        mainPage.clickOnLinkToRedirect(CLIENT_SIDE_DELAY);
        clientSideDelayPage.clickOnButton();
        Assert.assertTrue(clientSideDelayPage.isTextAppeared());
    }
}
