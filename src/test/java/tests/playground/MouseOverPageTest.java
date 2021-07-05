package tests.playground;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PageLink;
import pages.playgroundpages.MouseOverPage;
import tests.BaseTest;

public class MouseOverPageTest extends BaseTest {
    private MouseOverPage mouseOverPage = new MouseOverPage();

    @Test
    public void testName() {
        mainPage.moveTo(PageLink.MouseOverPage);
        Assert.assertTrue(mouseOverPage.getCountOfClicks());
    }
}
