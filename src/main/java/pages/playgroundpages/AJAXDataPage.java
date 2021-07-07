package pages.playgroundpages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.elementsutils.WebElementsGetter;

public class AJAXDataPage {
    private static final By buttonLocator = By.xpath("//button[@class='btn btn-primary']");
    private static final By dataFieldLocator = By.xpath("//p[@class='bg-success']");

    @Step("Verify that data displayed after click on button")
    public Boolean isDataDisplayedAfterButtonClick() {
        WebElement button = WebElementsGetter.getElementWithLocatedCondition(buttonLocator);
        button.click();
        WebElement dataField = WebElementsGetter.getElementWithLocatedCondition(dataFieldLocator);
        return dataField.isDisplayed();
    }
}
