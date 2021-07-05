package pages.playgroundpages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.driversutils.DriverThreadLocal;
import utils.elements.WebElementsUtils;

public class ClassAttributePage {
    private static final By blueButtonLocator = By.xpath("//button[contains(concat(' ',normalize-space(@class),' '),' btn-primary ')]");

    private WebElement blueButton;
    private Alert pageAlert;

    public ClassAttributePage clickOnBlueButton() {
        blueButton = WebElementsUtils.getElementWithWaiter(blueButtonLocator);
        blueButton.click();
        return this;
    }

    public void confirmAlert() {
        pageAlert = DriverThreadLocal.getDriver().switchTo().alert();
        pageAlert.accept();
    }
}
