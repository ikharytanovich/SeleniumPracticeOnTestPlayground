package pages.playgroundpages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import pages.BasePage;
import utils.elementutils.WebElementsGetter;

public class ClickPage extends BasePage {
    private static final By blueButtonLocator = By.xpath("//button[@class='btn btn-primary']");
    private static final By greenButtonLocator = By.xpath("//button[@class='btn btn-success']");

    @Step("Verify that button green after click on blue button")
    public Boolean isButtonGreenAfterClickBlue() {
        WebElementsGetter.getElementWithLocatedCondition(blueButtonLocator).click();
        return WebElementsGetter.getElementWithLocatedCondition(greenButtonLocator).isDisplayed();
    }
}
