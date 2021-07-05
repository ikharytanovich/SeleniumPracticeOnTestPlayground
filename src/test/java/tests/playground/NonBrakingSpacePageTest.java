package tests.playground;

import org.testng.annotations.Test;
import pages.PageLink;
import pages.playgroundpages.NonBrakingSpacePage;
import tests.BaseTest;

public class NonBrakingSpacePageTest extends BaseTest {
    private NonBrakingSpacePage nonBrakingSpacePage = new NonBrakingSpacePage();

    @Test
    public void test() {
        mainPage.moveTo(PageLink.NonBrakingSpacePage);
        nonBrakingSpacePage.click();
    }
}
