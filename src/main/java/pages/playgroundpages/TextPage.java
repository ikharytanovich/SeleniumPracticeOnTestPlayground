package pages.playgroundpages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.BasePage;
import utils.elementutils.WebElementsGetter;

public class TextPage extends BasePage {
    private static final By inputFieldLocator = new By.ByXPath("//input[@class='form-control']");
    private static final By buttonLocator = new By.ByXPath("//button[@class='btn btn-primary']");

    @Step("Verify that input text:{input} after click on button is same")
    public Boolean inputTextAndCheckIsButtonChangedValue(String input) {
        WebElement inputField = WebElementsGetter.getElementWithLocatedCondition(inputFieldLocator);
        inputField.sendKeys(input);
        WebElement button = WebElementsGetter.getElementWithLocatedCondition(buttonLocator);
        button.click();
        return button.getText().equals(input);
    }
}
