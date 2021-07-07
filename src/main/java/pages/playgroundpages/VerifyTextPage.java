package pages.playgroundpages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.elementsutils.WebElementsGetter;

public class VerifyTextPage {
    private static final By elementWithTextLocator = By.xpath("//span[contains(text(),'Welcome')]/*[contains(text(),'')]/parent::span");

    @Step("Verify text with value:{expectedValue}")
    public boolean isVerified(String expectedValue) {
        WebElement elementWithText = WebElementsGetter.getElementWithLocatedCondition(elementWithTextLocator);
        return elementWithText.getText().trim().equals(expectedValue);
    }
}
