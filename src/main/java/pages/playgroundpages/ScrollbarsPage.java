package pages.playgroundpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.elements.WebElementsUtils;

public class ScrollbarsPage {
    private static final By buttonLocator = By.xpath("//button[@class='btn btn-primary']");

    private WebElement button;

    //TODO
    public void clickOnButton() {
        button = WebElementsUtils.getElementWithWaiter(buttonLocator);
        button.click();
    }
}
