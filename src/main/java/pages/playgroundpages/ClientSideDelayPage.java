package pages.playgroundpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.elementsutils.WebElementsGetter;

public class ClientSideDelayPage {
    private static final By buttonLocator = By.xpath("//button[@class='btn btn-primary']");
    private static final By textLocator = By.xpath("//p[@class='bg-success']");

    private WebElement button;
    private WebElement text;

    public ClientSideDelayPage clickOnButton() {
        button = WebElementsGetter.getElementWithWaiter(buttonLocator);
        button.click();
        return this;
    }

    public boolean isTextAppeared() {
        text = WebElementsGetter.getElementWithWaiter(textLocator);
        return text.isDisplayed();
    }
}
