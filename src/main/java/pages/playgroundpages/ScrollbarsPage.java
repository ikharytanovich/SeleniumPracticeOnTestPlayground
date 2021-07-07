package pages.playgroundpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.driversutils.ThreadLocalDriver;
import utils.elementsutils.WebElementsGetter;

public class ScrollbarsPage {
    private static final By containerWithButtonLocator = By.xpath("//section/div/div[@style]");
    private static final By buttonLocator = By.xpath("//button[@class='btn btn-primary']");

    private WebElement button;
    private WebElement containerWithButton;
    private Actions actionsInContainer;

    public void clickOnButton() {
        containerWithButton = WebElementsGetter.getElementWithLocatedCondition(containerWithButtonLocator);
        containerWithButton.click();
        actionsInContainer = new Actions(ThreadLocalDriver.getDriver());
        button = WebElementsGetter.getElementWithLocatedCondition(buttonLocator);
        actionsInContainer.moveToElement(button).click().build().perform();
    }
}
