package pages.playgroundpages;

import io.qameta.allure.Step;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.BasePage;
import utils.driverutils.ThreadLocalDriver;
import utils.elementutils.WebElementsGetter;

public class ClassAttributePage extends BasePage {
    private static final By blueButtonLocator = By.xpath("//button[contains(concat(' ',normalize-space(@class),' '),' btn-primary ')]");

    @Step("Click on blue button")
    public void clickOnBlueButton() {
        WebElement blueButton = WebElementsGetter.getElementWithLocatedCondition(blueButtonLocator);
        blueButton.click();
    }

    @Step("Confirming alert")
    public Boolean confirmAlert() {
        Alert pageAlert = ThreadLocalDriver.getDriver().switchTo().alert();
        String message = pageAlert.getText();
        pageAlert.accept();
        return !message.isEmpty();
    }
}
