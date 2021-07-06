package pages.playgroundpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.elementsutils.WebElementsGetter;

public class LoadDelayPage {
    private static final By buttonLocator = By.xpath("//button[@class='btn btn-primary']");

    private WebElement button;

    public Boolean isButtonDisplayed() {
        button = WebElementsGetter.getElementWithWaiter(buttonLocator);
        return button.isDisplayed();
    }
}
