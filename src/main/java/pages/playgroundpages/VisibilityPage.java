package pages.playgroundpages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.BasePage;
import utils.elementutils.WebElementVisibilityValidator;
import utils.elementutils.WebElementsGetter;

import java.util.Arrays;
import java.util.List;

public class VisibilityPage extends BasePage {
    private static final By hideButtonLocator = By.xpath("//button[@id='hideButton']");
    private static final By removedButtonLocator = By.xpath("//button[@id='removedButton']");
    private static final By zeroWidthButtonLocator = By.xpath("//button[@id='zeroWidthButton']");
    private static final By overlappedButtonLocator = By.xpath("//button[@id='overlappedButton']");
    private static final By transparentButtonLocator = By.xpath("//button[@id='transparentButton']");
    private static final By invisibleButtonLocator = By.xpath("//button[@id='invisibleButton']");
    private static final By notDisplayedButtonLocator = By.xpath("//button[@id='notdisplayedButton']");
    private static final By offScreenButtonLocator = By.xpath("//button[@id='offscreenButton']");

    @Step("Verify that button invisible")
    public Boolean isInvisible() {
        Boolean result = true;
        WebElement hideButton = WebElementsGetter.getElementWithLocatedCondition(hideButtonLocator);
        List<WebElement> buttons = setUpVisibilityButtons();
        hideButton.click();
        for (WebElement element : buttons) {
            if (WebElementVisibilityValidator.isVisible(element)) {
                result = false;
            }
        }
        return result;
    }

    @Step("Setup buttons")
    private List<WebElement> setUpVisibilityButtons() {
        WebElement removedButton = WebElementsGetter.getElementWithLocatedCondition(removedButtonLocator);
        WebElement zeroWidthButton = WebElementsGetter.getElementWithLocatedCondition(zeroWidthButtonLocator);
        WebElement overlappedButton = WebElementsGetter.getElementWithLocatedCondition(overlappedButtonLocator);
        WebElement transparentButton = WebElementsGetter.getElementWithLocatedCondition(transparentButtonLocator);
        WebElement invisibleButton = WebElementsGetter.getElementWithLocatedCondition(invisibleButtonLocator);
        WebElement notDisplayedButton = WebElementsGetter.getElementWithLocatedCondition(notDisplayedButtonLocator);
        WebElement offScreenButton = WebElementsGetter.getElementWithLocatedCondition(offScreenButtonLocator);
        return Arrays.asList
                (removedButton, zeroWidthButton, overlappedButton, transparentButton, invisibleButton, notDisplayedButton, offScreenButton);
    }
}
