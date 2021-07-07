package tests.playground;

import io.qameta.allure.Epic;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.MainPage.CLASS_ATTRIBUTE;
import static utils.pagesutils.IPageFactory.classAttributePage;
import static utils.pagesutils.IPageFactory.mainPage;

@Epic("Playground")
public class ClassAttributeTest extends BaseTest {

    @Test
    public void test() {
        mainPage.clickOnLinkToRedirect(CLASS_ATTRIBUTE);
        classAttributePage.clickOnBlueButton();
        Assert.assertTrue(classAttributePage.confirmAlert());
    }
}