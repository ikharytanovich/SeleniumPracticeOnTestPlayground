package pages.playgroundpages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import pages.BasePage;
import utils.elementutils.WebElementsGetter;

public class ClientSideDelayPage extends BasePage {
    private static final By buttonLocator = By.xpath("//button[@class='btn btn-primary']");
    private static final By textLocator = By.xpath("//p[@class='bg-success']");

    @Step("Click on button")
    public void clickOnButton() {
        WebElementsGetter.getElementWithLocatedCondition(buttonLocator).click();
    }

    @Step("Verify that text appeared")
    public boolean isTextAppeared() {
        return WebElementsGetter.getElementWithLocatedCondition(textLocator).isDisplayed();
    }
}
