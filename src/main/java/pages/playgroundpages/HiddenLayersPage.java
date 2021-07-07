package pages.playgroundpages;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;
import utils.elementsutils.WebElementsGetter;

public class HiddenLayersPage {
    private static final By greenButtonLocator = By.xpath("//button[@class='btn btn-success']");

    private WebElement greenButtonBeforeClick;
    private WebElement greenButtonAfterClick;

    public void clickObButton() {
        greenButtonBeforeClick = WebElementsGetter.getElementWithLocatedCondition(greenButtonLocator);
        greenButtonBeforeClick.click();
    }

    public Boolean isNotClickable() {
        Boolean result = false;
        greenButtonAfterClick = WebElementsGetter.getElementWithLocatedCondition(greenButtonLocator);
        try {//TODO
            greenButtonAfterClick.click();
        } catch (ElementClickInterceptedException exception) {
            result = true;
        }
        return result;
    }
}
