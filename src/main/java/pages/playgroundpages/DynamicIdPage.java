package pages.playgroundpages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.elementsutils.WebElementsGetter;

public class DynamicIdPage {
    private static final By dynamicIdLocator = new By.ByXPath("//button[@class='btn btn-primary']");

    @Step("Click on button")
    public void clickOnButton() {
        WebElement button = WebElementsGetter.getElementWithLocatedCondition(dynamicIdLocator);
        button.click();
    }
}
