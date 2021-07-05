package tests.playground;

import org.testng.annotations.Test;
import pages.PageLink;
import pages.playgroundpages.ProgressBarPage;
import tests.BaseTest;

public class ProgressBarTest extends BaseTest {
    private ProgressBarPage progressBarPage = new ProgressBarPage();

    @Test
    public void test() {
        mainPage.moveTo(PageLink.ProgressBarPage);
        progressBarPage.stopOnNPercent();
    }
}
