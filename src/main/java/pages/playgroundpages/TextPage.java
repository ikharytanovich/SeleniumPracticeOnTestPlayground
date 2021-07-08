package pages.playgroundpages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import pages.BasePage;
import utils.elementutils.WebElementsGetter;

public class TextPage extends BasePage {
    private static final By inputFieldLocator = new By.ByXPath("//input[@class='form-control']");
    private static final By buttonLocator = new By.ByXPath("//button[@class='btn btn-primary']");

    @Step("Verify that input text:{input} after click on button is same")
    public Boolean inputTextAndCheckIsButtonChangedValue(String input) {
        WebElementsGetter.getElementWithLocatedCondition(inputFieldLocator).sendKeys(input);
        WebElementsGetter.getElementWithLocatedCondition(buttonLocator).click();
        return WebElementsGetter.getElementWithLocatedCondition(buttonLocator).getText().equals(input);
    }
}
