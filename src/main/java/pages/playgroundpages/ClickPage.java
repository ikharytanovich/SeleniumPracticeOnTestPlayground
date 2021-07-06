package pages.playgroundpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.elementsutils.WebElementsGetter;

public class ClickPage {
    private static final By blueButtonLocator = By.xpath("//button[@class='btn btn-primary']");
    private static final By greenButtonLocator = By.xpath("//button[@class='btn btn-success']");

    private WebElement blueButton;
    private WebElement greenButton;

    public Boolean isButtonGreenAfterClickBlue() {
        blueButton = WebElementsGetter.getElementWithWaiter(blueButtonLocator);
        blueButton.click();
        greenButton = WebElementsGetter.getElementWithWaiter(greenButtonLocator);
        return greenButton.isDisplayed();
    }
}
