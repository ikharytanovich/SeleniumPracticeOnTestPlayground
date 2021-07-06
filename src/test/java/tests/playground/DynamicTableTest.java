package tests.playground;

import io.qameta.allure.Epic;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PageLink;
import pages.playgroundpages.DynamicTablePage;
import tests.BaseTest;

@Epic("Playground")
public class DynamicTableTest extends BaseTest {
    private final DynamicTablePage dynamicTablePage = new DynamicTablePage();

    @Test
    public void test() {
        mainPage.moveTo(PageLink.DynamicTable);
        Assert.assertTrue(dynamicTablePage.isCorrect());
    }
}
