package pages.playgroundpages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.elementsutils.WebElementsGetter;

public class ClickPage {
    private static final By blueButtonLocator = By.xpath("//button[@class='btn btn-primary']");
    private static final By greenButtonLocator = By.xpath("//button[@class='btn btn-success']");

    @Step("Verify that button green after click on blue button")
    public Boolean isButtonGreenAfterClickBlue() {
        WebElement blueButton = WebElementsGetter.getElementWithLocatedCondition(blueButtonLocator);
        blueButton.click();
        WebElement greenButton = WebElementsGetter.getElementWithLocatedCondition(greenButtonLocator);
        return greenButton.isDisplayed();
    }
}
