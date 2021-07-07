package pages.playgroundpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.elementsutils.WebElementsGetter;

public class ClientSideDelayPage {
    private static final By buttonLocator = By.xpath("//button[@class='btn btn-primary']");
    private static final By textLocator = By.xpath("//p[@class='bg-success']");

    private WebElement button;
    private WebElement text;

    public void clickOnButton() {
        button = WebElementsGetter.getElementWithLocatedCondition(buttonLocator);
        button.click();
    }

    public boolean isTextAppeared() {
        text = WebElementsGetter.getElementWithLocatedCondition(textLocator);
        return text.isDisplayed();
    }
}
