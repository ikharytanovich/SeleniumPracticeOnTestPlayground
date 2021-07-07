package tests.playground;

import io.qameta.allure.Epic;
import org.testng.annotations.Test;
import tests.BaseTest;

import static constants.ConstantsForPages.REQUIRED_PERCENT;
import static constants.PageLinkLocator.PROGRESS_BAR;
import static utils.pagesutils.IPageFactory.mainPage;
import static utils.pagesutils.IPageFactory.progressBarPage;

@Epic("Playground")
public class ProgressBarTest extends BaseTest {

    @Test
    public void test() {
        mainPage.clickOnLinkToRedirect(PROGRESS_BAR);
        progressBarPage.stopOnNPercent(REQUIRED_PERCENT);
    }
}
