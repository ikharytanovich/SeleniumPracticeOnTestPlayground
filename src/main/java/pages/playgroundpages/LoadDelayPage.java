package pages.playgroundpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.elements.WebElementsUtils;

public class LoadDelayPage {
    private static final By buttonLocator = By.xpath("//button[@class='btn btn-primary']");

    private WebElement button;

    public Boolean isButtonDisplayed() {
        button = WebElementsUtils.getElementWithWaiter(buttonLocator);
        return button.isDisplayed();
    }
}
