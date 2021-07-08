package pages.playgroundpages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.BasePage;
import utils.elementutils.WebElementsGetter;

public class VerifyTextPage extends BasePage {
    private static final By actualTextLocator = By.xpath("//span[contains(text(),'Welcome')]/*[contains(text(),'')]/parent::span");
    private static final String expectedText = "Welcome UserName!";

    @Step("Verify text")
    public boolean isVerified() {
        WebElement actualText = WebElementsGetter.getElementWithLocatedCondition(actualTextLocator);
        return expectedText.equals(actualText.getText());
    }
}
