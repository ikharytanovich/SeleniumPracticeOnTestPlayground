package tests.playground;

import io.qameta.allure.Epic;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.playgroundpages.MainPage;
import tests.BaseTest;

import static constants.PageConstants.DYNAMIC_TABLE_HEADER_NAME;
import static constants.PageConstants.DYNAMIC_TABLE_ROW_NAME;
import static pages.playgroundpages.MainPage.DYNAMIC_TABLE;
import static utils.pageutils.IPageFactory.dynamicTablePage;

@Epic("Playground")
public class DynamicTableTest extends BaseTest {

    @Test
    public void test() {
        MainPage.clickOnLinkToRedirect(DYNAMIC_TABLE);
        Assert.assertTrue(dynamicTablePage.isCorrect(DYNAMIC_TABLE_HEADER_NAME, DYNAMIC_TABLE_ROW_NAME));
    }
}
