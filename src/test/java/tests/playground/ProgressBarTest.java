package tests.playground;

import io.qameta.allure.Epic;
import org.testng.annotations.Test;
import pages.playgroundpages.MainPage;
import tests.BaseTest;

import static constants.PageConstants.REQUIRED_PERCENT;
import static pages.playgroundpages.MainPage.PROGRESS_BAR;
import static utils.pageutils.IPageFactory.progressBarPage;

@Epic("Playground")
public class ProgressBarTest extends BaseTest {

    @Test
    public void test() {
        MainPage.clickOnLinkToRedirect(PROGRESS_BAR);
        progressBarPage.stopOnNPercent(REQUIRED_PERCENT);
    }
}
