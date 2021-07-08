package pages.playgroundpages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import pages.BasePage;
import utils.elementutils.WebElementsGetter;

public class VerifyTextPage extends BasePage {
    private static final By actualTextLocator = By.xpath("//span[contains(text(),'Welcome')]/*[contains(text(),'')]/parent::span");
    private static final String expectedText = "Welcome UserName!";

    @Step("Verify text")
    public boolean isVerified() {
        return expectedText.equals(WebElementsGetter.getElementWithLocatedCondition(actualTextLocator).getText());
    }
}
