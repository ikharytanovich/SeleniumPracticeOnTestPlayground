package pages.playgroundpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.elements.WebElementsUtils;

public class AJAXDataPage {
    private static final By buttonLocator = By.xpath("//button[@class='btn btn-primary']");
    private static final By dataFieldLocator = By.xpath("//p[@class='bg-success']");

    private WebElement button;
    private WebElement dataField;

    public Boolean isDataDisplayedAfterButtonClick() {
        button = WebElementsUtils.getElementWithWaiter(buttonLocator);
        button.click();
        dataField = WebElementsUtils.getElementWithWaiter(dataFieldLocator);
        return dataField.isDisplayed();
    }
}
