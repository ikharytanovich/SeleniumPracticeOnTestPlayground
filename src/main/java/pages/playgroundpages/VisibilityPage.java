package pages.playgroundpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.elements.ElementVisibilityUtil;
import utils.elements.WebElementsUtils;

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
        hideButton = WebElementsUtils.getElementWithWaiter(hideButtonLocator);
        List<WebElement> buttons = setUpVisibilityButtons();
        hideButton.click();
        buttons.forEach(ElementVisibilityUtil::isVisible);
    }

    private List<WebElement> setUpVisibilityButtons() {
        removedButton = WebElementsUtils.getElementWithWaiter(removedButtonLocator);
        zeroWidthButton = WebElementsUtils.getElementWithWaiter(zeroWidthButtonLocator);
        overlappedButton = WebElementsUtils.getElementWithWaiter(overlappedButtonLocator);
        transparentButton = WebElementsUtils.getElementWithWaiter(transparentButtonLocator);
        invisibleButton = WebElementsUtils.getElementWithWaiter(invisibleButtonLocator);
        notDisplayedButton = WebElementsUtils.getElementWithWaiter(notDisplayedButtonLocator);
        offScreenButton = WebElementsUtils.getElementWithWaiter(offScreenButtonLocator);
        return Arrays.asList
                (removedButton, zeroWidthButton, overlappedButton, transparentButton, invisibleButton, notDisplayedButton, offScreenButton);
    }


}
