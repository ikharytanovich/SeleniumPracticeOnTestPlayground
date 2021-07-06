package tests.playground;

import io.qameta.allure.Epic;
import org.testng.annotations.Test;
import pages.PageLink;
import pages.playgroundpages.NonBrakingSpacePage;
import tests.BaseTest;

@Epic("Playground")
public class NonBrakingSpacePageTest extends BaseTest {
    private NonBrakingSpacePage nonBrakingSpacePage = new NonBrakingSpacePage();

    @Test
    public void test() {
        mainPage.moveTo(PageLink.NonBrakingSpacePage);
        nonBrakingSpacePage.click();
    }
}
