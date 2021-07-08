package pages.playgroundpages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import pages.BasePage;
import utils.elementutils.WebElementsGetter;

public class NonBrakingSpacePage extends BasePage {
    private static final By buttonLocator = By.xpath("//button[contains(text(),'My')][contains(text(),'Button')]");

    @Step("Click")
    public Boolean click() {
        WebElementsGetter.getElementWithLocatedCondition(buttonLocator).click();
        return true;
    }
}
