package tests.playground;

import io.qameta.allure.Epic;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.playgroundpages.MainPage;
import tests.BaseTest;

import static pages.playgroundpages.MainPage.CLIENT_SIDE_DELAY;
import static utils.pageutils.IPageFactory.clientSideDelayPage;

@Epic("Playground")
public class ClientSideDelayTest extends BaseTest {

    @Test
    public void test() {
        MainPage.clickOnLinkToRedirect(CLIENT_SIDE_DELAY);
        clientSideDelayPage.clickOnButton();
        Assert.assertTrue(clientSideDelayPage.isTextAppeared());
    }
}
