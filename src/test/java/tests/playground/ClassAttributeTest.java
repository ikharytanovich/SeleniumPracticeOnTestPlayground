package tests.playground;

import io.qameta.allure.Epic;
import org.testng.annotations.Test;
import pages.PageLink;
import pages.playgroundpages.ClassAttributePage;
import tests.BaseTest;

@Epic("Playground")
public class ClassAttributeTest extends BaseTest {
    private final ClassAttributePage classAttributePage = new ClassAttributePage();

    @Test
    public void test() {
        mainPage.moveTo(PageLink.ClassAttribute);
        classAttributePage.clickOnBlueButton();
        classAttributePage.confirmAlert();
    }
}