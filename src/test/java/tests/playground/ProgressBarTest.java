package tests.playground;

import io.qameta.allure.Epic;
import org.testng.annotations.Test;
import pages.PageLink;
import pages.playgroundpages.ProgressBarPage;
import tests.BaseTest;

@Epic("Playground")
public class ProgressBarTest extends BaseTest {
    private ProgressBarPage progressBarPage = new ProgressBarPage();

    @Test
    public void test() {
        mainPage.moveTo(PageLink.ProgressBarPage);
        progressBarPage.stopOnNPercent();
    }
}
