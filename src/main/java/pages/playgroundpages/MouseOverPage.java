package pages.playgroundpages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.elementsutils.WebElementsGetter;

public class MouseOverPage {
    private static final By linkToClickLocator = By.xpath("//div/a[@class]");
    private static final By resultLocator = By.xpath("//span[@class='badge badge-light']");

    @Step("Verify that result of clicks equals to {clicks}")
    public Boolean isResultCorrectToClicks(int clicks) {
        for (int i = 0; i < clicks; i++) {
            WebElement link = WebElementsGetter.getElementWithLocatedCondition(linkToClickLocator);
            link.click();
        }
        WebElement result = WebElementsGetter.getElementWithLocatedCondition(resultLocator);
        return Integer.parseInt(result.getText()) == clicks;
    }
}
