package pages.playgroundpages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;
import pages.BasePage;
import utils.elementutils.WebElementsGetter;

public class HiddenLayersPage extends BasePage {
    private static final By greenButtonLocator = By.xpath("//button[@class='btn btn-success']");

    @Step("Click on button")
    public void clickObButton() {
        WebElement greenButtonBeforeClick = WebElementsGetter.getElementWithLocatedCondition(greenButtonLocator);
        greenButtonBeforeClick.click();
    }

    @Step("Verify that is button not clickable")
    public Boolean isNotClickable() {
        Boolean result = false;
        WebElement greenButtonAfterClick = WebElementsGetter.getElementWithLocatedCondition(greenButtonLocator);
        try {//TODO
            greenButtonAfterClick.click();
        } catch (ElementClickInterceptedException exception) {
            result = true;
        }
        return result;
    }
}
