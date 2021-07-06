package pages.playgroundpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.elementsutils.WebElementVisibilityValidator;
import utils.elementsutils.WebElementsGetter;

import java.util.Arrays;
import java.util.List;

public class VisibilityPage {
    private static final By hideButtonLocator = By.xpath("//button[@id='hideButton']");
    private static final By removedButtonLocator = By.xpath("//button[@id='removedButton']");
    private static final By zeroWidthButtonLocator = By.xpath("//button[@id='zeroWidthButton']");
    private static final By overlappedButtonLocator = By.xpath("//button[@id='overlappedButton']");
    private static final By transparentButtonLocator = By.xpath("//button[@id='transparentButton']");
    private static final By invisibleButtonLocator = By.xpath("//button[@id='invisibleButton']");
    private static final By notDisplayedButtonLocator = By.xpath("//button[@id='notdisplayedButton']");
    private static final By offScreenButtonLocator = By.xpath("//button[@id='offscreenButton']");

    private WebElement hideButton;
    private WebElement removedButton;
    private WebElement zeroWidthButton;
    private WebElement overlappedButton;
    private WebElement transparentButton;
    private WebElement invisibleButton;
    private WebElement notDisplayedButton;
    private WebElement offScreenButton;

    public void isEnable() {
        hideButton = WebElementsGetter.getElementWithLocatedCondition(hideButtonLocator);
        List<WebElement> buttons = setUpVisibilityButtons();
        hideButton.click();
        buttons.forEach(WebElementVisibilityValidator::isVisible);
    }

    private List<WebElement> setUpVisibilityButtons() {
        removedButton = WebElementsGetter.getElementWithLocatedCondition(removedButtonLocator);
        zeroWidthButton = WebElementsGetter.getElementWithLocatedCondition(zeroWidthButtonLocator);
        overlappedButton = WebElementsGetter.getElementWithLocatedCondition(overlappedButtonLocator);
        transparentButton = WebElementsGetter.getElementWithLocatedCondition(transparentButtonLocator);
        invisibleButton = WebElementsGetter.getElementWithLocatedCondition(invisibleButtonLocator);
        notDisplayedButton = WebElementsGetter.getElementWithLocatedCondition(notDisplayedButtonLocator);
        offScreenButton = WebElementsGetter.getElementWithLocatedCondition(offScreenButtonLocator);
        return Arrays.asList
                (removedButton, zeroWidthButton, overlappedButton, transparentButton, invisibleButton, notDisplayedButton, offScreenButton);
    }


}
