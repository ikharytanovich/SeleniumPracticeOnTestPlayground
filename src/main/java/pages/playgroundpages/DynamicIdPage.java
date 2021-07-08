package pages.playgroundpages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import pages.BasePage;
import utils.elementutils.WebElementsGetter;

public class DynamicIdPage extends BasePage {
    private static final By dynamicIdLocator = new By.ByXPath("//button[@class='btn btn-primary']");

    @Step("Find button by xpath and click on it")
    public Boolean isButtonClicked() {
        WebElementsGetter.getElementWithLocatedCondition(dynamicIdLocator).click();
        return true;
    }
}

