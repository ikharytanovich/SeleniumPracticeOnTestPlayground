package pages.playgroundpages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.elementsutils.WebElementsGetter;

public class ClientSideDelayPage {
    private static final By buttonLocator = By.xpath("//button[@class='btn btn-primary']");
    private static final By textLocator = By.xpath("//p[@class='bg-success']");

    @Step("Click on button")
    public void clickOnButton() {
        WebElement button = WebElementsGetter.getElementWithLocatedCondition(buttonLocator);
        button.click();
    }

    @Step("Verify that text appeared")
    public boolean isTextAppeared() {
        WebElement text = WebElementsGetter.getElementWithLocatedCondition(textLocator);
        return text.isDisplayed();
    }
}
