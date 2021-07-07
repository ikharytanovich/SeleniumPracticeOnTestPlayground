package pages.playgroundpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.elementsutils.WebElementsGetter;

public class TextPage {
    private static final By inputFieldLocator = new By.ByXPath("//input[@class='form-control']");
    private static final By buttonLocator = new By.ByXPath("//button[@class='btn btn-primary']");

    private WebElement inputField;
    private WebElement button;

    public Boolean inputTextAndCheckIsButtonChangedValue(String input) {
        inputField = WebElementsGetter.getElementWithLocatedCondition(inputFieldLocator);
        inputField.sendKeys(input);
        button = WebElementsGetter.getElementWithLocatedCondition(buttonLocator);
        button.click();
        return button.getText().equals(input);
    }
}
