package pages.playgroundpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.elements.WebElementsUtils;

public class VerifyTextPage {
    private static final By elementWithTextLocator = By.xpath("//span[contains(text(),'Welcome')]/*[contains(text(),'')]/parent::span");
    private static final String expectedValue = "Welcome UserName!";

    private WebElement elementWithText;

    public boolean isVerified() {
        elementWithText = WebElementsUtils.getElementWithWaiter(elementWithTextLocator);
        System.out.println(elementWithText.getText().trim());
        return elementWithText.getText().trim().equals(expectedValue);
    }
}
