package pages.playgroundpages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import pages.BasePage;
import utils.elementutils.WebElementsGetter;

public class AJAXDataPage extends BasePage {
    private static final By buttonLocator = By.xpath("//button[@class='btn btn-primary']");
    private static final By dataFieldLocator = By.xpath("//p[@class='bg-success']");

    @Step("Verify that data displayed after click on button")
    public Boolean isDataDisplayedAfterButtonClick() {
        WebElementsGetter.getElementWithLocatedCondition(buttonLocator).click();
        return WebElementsGetter.getElementWithLocatedCondition(dataFieldLocator).isDisplayed();
    }
}
