package tests.playground;

import io.qameta.allure.Epic;
import org.testng.annotations.Test;
import pages.PageLink;
import pages.playgroundpages.SampleAppPage;
import tests.BaseTest;

@Epic("Playground")
public class SampleAppTest extends BaseTest {
    private final SampleAppPage sampleAppPage = new SampleAppPage();

    @Test
    public void test() {
        mainPage.moveTo(PageLink.SampleApp);
        sampleAppPage.login();
    }
}
