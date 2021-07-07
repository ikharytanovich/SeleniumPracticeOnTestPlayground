package pages.playgroundpages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.driversutils.ThreadLocalDriver;
import utils.elementsutils.WebElementsGetter;

public class ScrollbarsPage {
    private static final By containerWithButtonLocator = By.xpath("//section/div/div[@style]");
    private static final By buttonLocator = By.xpath("//button[@class='btn btn-primary']");

    @Step("Click on button")
    public void clickOnButton() {
        WebElement containerWithButton = WebElementsGetter.getElementWithLocatedCondition(containerWithButtonLocator);
        containerWithButton.click();
        Actions actionsInContainer = new Actions(ThreadLocalDriver.getDriver());
        WebElement button = WebElementsGetter.getElementWithLocatedCondition(buttonLocator);
        actionsInContainer.moveToElement(button).click().build().perform();
    }
}
