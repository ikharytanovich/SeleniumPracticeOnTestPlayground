package pages.playgroundpages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.BasePage;
import utils.elementutils.WebElementsGetter;

public class DynamicIdPage extends BasePage {
    private static final By dynamicIdLocator = new By.ByXPath("//button[@class='btn btn-primary']");

    @Step("Click on button")
    public void clickOnButton() {
        WebElement button = WebElementsGetter.getElementWithLocatedCondition(dynamicIdLocator);
        button.click();
    }
}
