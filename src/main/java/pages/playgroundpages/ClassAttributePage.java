package pages.playgroundpages;

import io.qameta.allure.Step;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import pages.BasePage;
import utils.driverutils.ThreadLocalDriver;
import utils.elementutils.WebElementsGetter;

public class ClassAttributePage extends BasePage {
    private static final By blueButtonLocator = By.xpath("//button[contains(@class,'btn-primary')]");

    @Step("Click on blue button")
    public void clickOnBlueButton() {
        WebElementsGetter.getElementWithLocatedCondition(blueButtonLocator).click();
    }

    @Step("Confirming alert")
    public Boolean isAlertConfirmed() {
        Alert pageAlert = ThreadLocalDriver.getDriver().switchTo().alert();
        pageAlert.accept();
        return true;
    }
}
