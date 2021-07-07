package tests.playground;

import io.qameta.allure.Epic;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import static constants.ConstantsForPages.DYNAMIC_TABLE_HEADER_NAME;
import static constants.ConstantsForPages.DYNAMIC_TABLE_ROW_NAME;
import static constants.PageLinkLocator.DYNAMIC_TABLE;
import static utils.pagesutils.IPageFactory.dynamicTablePage;
import static utils.pagesutils.IPageFactory.mainPage;

@Epic("Playground")
public class DynamicTableTest extends BaseTest {

    @Test
    public void test() {
        mainPage.clickOnLinkToRedirect(DYNAMIC_TABLE);
        Assert.assertTrue(dynamicTablePage.isCorrect(DYNAMIC_TABLE_HEADER_NAME, DYNAMIC_TABLE_ROW_NAME));
    }
}
