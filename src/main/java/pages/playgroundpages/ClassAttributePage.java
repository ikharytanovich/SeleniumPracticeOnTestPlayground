package pages.playgroundpages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.driversutils.ThreadLocalDriver;
import utils.elementsutils.WebElementsGetter;

public class ClassAttributePage {
    private static final By blueButtonLocator = By.xpath("//button[contains(concat(' ',normalize-space(@class),' '),' btn-primary ')]");

    private WebElement blueButton;
    private Alert pageAlert;

    public ClassAttributePage clickOnBlueButton() {
        blueButton = WebElementsGetter.getElementWithWaiter(blueButtonLocator);
        blueButton.click();
        return this;
    }

    public void confirmAlert() {
        pageAlert = ThreadLocalDriver.getDriver().switchTo().alert();
        pageAlert.accept();
    }
}
