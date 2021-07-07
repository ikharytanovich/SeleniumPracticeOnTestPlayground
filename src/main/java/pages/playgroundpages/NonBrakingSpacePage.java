package pages.playgroundpages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.elementsutils.WebElementsGetter;

public class NonBrakingSpacePage {
    private static final By buttonLocator = By.xpath("//button[contains(text(),'My')][contains(text(),'Button')]");

    @Step("Click")
    public void click() {
        WebElement button = WebElementsGetter.getElementWithLocatedCondition(buttonLocator);
        button.click();
    }
}
