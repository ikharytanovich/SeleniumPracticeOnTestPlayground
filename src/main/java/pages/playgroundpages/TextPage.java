package pages.playgroundpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.elements.WebElementsUtils;

public class TextPage {
    private static final By inputFieldLocator = new By.ByXPath("//input[@class='form-control']");
    private static final By buttonLocator = new By.ByXPath("//button[@class='btn btn-primary']");
    private static final String input = "INPUT_0110";

    private WebElement inputField;
    private WebElement button;

    public Boolean inputTextAndCheckIsButtonChangedValue() {
        inputField = WebElementsUtils.getElementWithWaiter(inputFieldLocator);
        inputField.sendKeys(input);
        button = WebElementsUtils.getElementWithWaiter(buttonLocator);
        button.click();
        return button.getText().equals(input);
    }
}
