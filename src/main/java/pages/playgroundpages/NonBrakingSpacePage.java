package pages.playgroundpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.elementsutils.WebElementsGetter;

public class NonBrakingSpacePage {
    private static final By buttonLocator = By.xpath("//button[contains(text(),'My')][contains(text(),'Button')]");

    private WebElement button;

    public void click() {
        button = WebElementsGetter.getElementWithWaiter(buttonLocator);
        button.click();
    }
}
