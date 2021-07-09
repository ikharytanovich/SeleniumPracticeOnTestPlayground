package pages.playgroundpages;

import io.qameta.allure.Step;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import pages.BasePage;
import utils.driverutils.ThreadLocalDriver;
import utils.elementutils.WebElementsGetter;

public class ClassAttributePage extends BasePage {
    private static final By blueButtonLocator = By.xpath("//button[contains(@class,'btn-primary')]");

    @Step("Click on blue button")
    public void clickOnBlueButton() {
        WebElementsGetter.getElementWithLocatedCondition(blueButtonLocator).click();
    }

    @Step("Click on blue button with JS")
    public void clickOnButtonWithJS() {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) ThreadLocalDriver.getDriver();
        javascriptExecutor.executeScript("arguments[0].click();", WebElementsGetter.getElementWithLocatedCondition(blueButtonLocator));
    }

    @Step("Confirming alert")
    public Boolean isAlertConfirmed() {
        Alert pageAlert = ThreadLocalDriver.getDriver().switchTo().alert();
        pageAlert.accept();
        return true;
    }
}
