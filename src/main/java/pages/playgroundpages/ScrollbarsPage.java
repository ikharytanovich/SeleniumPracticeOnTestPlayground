package pages.playgroundpages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.BasePage;
import utils.driverutils.ThreadLocalDriver;
import utils.elementutils.WebElementsGetter;

public class ScrollbarsPage extends BasePage {
    private static final By containerWithButtonLocator = By.xpath("//section/div/div[@style]");
    private static final By buttonLocator = By.xpath("//button[@class='btn btn-primary']");

    @Step("Scroll to button and click")
    public Boolean clickOnButton() {
        WebElement containerWithButton = WebElementsGetter.getElementWithLocatedCondition(containerWithButtonLocator);
        containerWithButton.click();
        Actions actionsInContainer = new Actions(ThreadLocalDriver.getDriver());
        WebElement button = WebElementsGetter.getElementWithLocatedCondition(buttonLocator);
        actionsInContainer.moveToElement(button).click().build().perform();
        return true;
    }
}
