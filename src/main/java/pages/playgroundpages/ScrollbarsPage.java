package pages.playgroundpages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.driversutils.DriverThreadLocal;
import utils.elements.WebElementsUtils;

public class ScrollbarsPage {
    private static final By containerWithButtonLocator = By.xpath("//div[@style='height:150px;overflow-y: scroll;width:300px;overflow-x:scroll']");
    private static final By buttonLocator = By.xpath("//button[@class='btn btn-primary']");
    private static final Keys[] keys = new Keys[]
            {Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.RIGHT, Keys.RIGHT, Keys.RIGHT, Keys.RIGHT, Keys.RIGHT, Keys.RIGHT};

    private WebElement button;
    private WebElement containerWithButton;
    private Actions actionsInContainer;

    //TODO
    public void clickOnButton() {
        containerWithButton = WebElementsUtils.getElementWithWaiter(containerWithButtonLocator);
        containerWithButton.click();
        actionsInContainer = new Actions(DriverThreadLocal.getDriver());
        actionsInContainer.sendKeys(keys);
        button = WebElementsUtils.getElementWithWaiter(buttonLocator);
        button.click();
    }
}
