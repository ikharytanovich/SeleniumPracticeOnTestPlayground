package pages.playgroundpages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.elementsutils.WebElementsGetter;

public class LoadDelayPage {
    private static final By buttonLocator = By.xpath("//button[@class='btn btn-primary']");

    @Step("Verify that is button displayed")
    public Boolean isButtonDisplayed() {
        WebElement button = WebElementsGetter.getElementWithLocatedCondition(buttonLocator);
        return button.isDisplayed();
    }
}
