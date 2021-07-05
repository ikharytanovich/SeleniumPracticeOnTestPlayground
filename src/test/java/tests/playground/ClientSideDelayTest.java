package tests.playground;

import io.qameta.allure.Epic;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PageLink;
import pages.playgroundpages.ClientSideDelayPage;
import tests.BaseTest;

@Epic("Playground")
public class ClientSideDelayTest extends BaseTest {
    private ClientSideDelayPage clientSideDelayPage = new ClientSideDelayPage();

    @Test
    public void test() {
        mainPage.moveTo(PageLink.ClientSideDelay);
        clientSideDelayPage.clickOnButton();
        Assert.assertTrue(clientSideDelayPage.isTextAppeared());
    }
}
