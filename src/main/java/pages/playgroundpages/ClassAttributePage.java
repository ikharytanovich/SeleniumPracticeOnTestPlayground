package pages.playgroundpages;

import io.qameta.allure.Epic;
import io.qameta.allure.Step;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.driversutils.ThreadLocalDriver;
import utils.elementsutils.WebElementsGetter;

public class ClassAttributePage {
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
