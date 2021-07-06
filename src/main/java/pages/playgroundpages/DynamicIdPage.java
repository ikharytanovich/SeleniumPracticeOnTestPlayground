package pages.playgroundpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.elementsutils.WebElementsGetter;

public class DynamicIdPage {
    private static final By dynamicIdLocator = new By.ByXPath("//button[@class='btn btn-primary']");

    private WebElement button;

    public void clickOnButton() {
        button = WebElementsGetter.getElementWithWaiter(dynamicIdLocator);
        button.click();
    }
}
