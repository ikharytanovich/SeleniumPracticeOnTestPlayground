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
        WebElementsGetter.getElementWithLocatedCondition(containerWithButtonLocator).click();
        WebElement button = WebElementsGetter.getElementWithLocatedCondition(buttonLocator);
        new Actions(ThreadLocalDriver.getDriver()).moveToElement(button).click().build().perform();
        return true;
    }
}
