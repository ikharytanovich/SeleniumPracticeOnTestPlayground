package tests.playground;

import io.qameta.allure.Epic;
import org.testng.annotations.Test;
import pages.playgroundpages.MainPage;
import tests.BaseTest;

import static pages.playgroundpages.MainPage.NON_BRAKING_SPACE;
import static utils.pageutils.IPageFactory.nonBrakingSpacePage;

@Epic("Playground")
public class NonBrakingSpacePageTest extends BaseTest {

    @Test
    public void test() {
        MainPage.clickOnLinkToRedirect(NON_BRAKING_SPACE);
        nonBrakingSpacePage.click();
    }
}
