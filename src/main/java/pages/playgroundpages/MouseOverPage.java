package pages.playgroundpages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import pages.BasePage;
import utils.elementutils.WebElementsGetter;

public class MouseOverPage extends BasePage {
    private static final By linkToClickLocator = By.xpath("//div/a[@class]");
    private static final By resultLocator = By.xpath("//span[@class='badge badge-light']");

    @Step("Verify that result of clicks equals to {clicks}")
    public Boolean isResultCorrectToClicks(int clicks) {
        for (int i = 0; i < clicks; i++) {
            WebElementsGetter.getElementWithLocatedCondition(linkToClickLocator).click();
        }
        return WebElementsGetter.getElementWithLocatedCondition(resultLocator).getText().equals(String.valueOf(clicks));
    }
}
