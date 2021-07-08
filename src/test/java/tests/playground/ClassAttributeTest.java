package tests.playground;

import io.qameta.allure.Epic;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.playgroundpages.MainPage;
import tests.BaseTest;

import static pages.playgroundpages.MainPage.CLASS_ATTRIBUTE;
import static utils.pageutils.IPageFactory.classAttributePage;

@Epic("Playground")
public class ClassAttributeTest extends BaseTest {

    @Test
    public void test() {
        MainPage.clickOnLinkToRedirect(CLASS_ATTRIBUTE);
        classAttributePage.clickOnBlueButton();
        Assert.assertTrue(classAttributePage.isAlertConfirmed());
    }
}