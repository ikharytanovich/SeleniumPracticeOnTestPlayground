package pages.playgroundpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.elementsutils.WebElementsGetter;

public class MouseOverPage {
    private static final By linkToClickLocator = By.xpath("//div/a[@class]");
    private static final By resultLocator = By.xpath("//span[@class='badge badge-light']");

    private WebElement link;
    private WebElement result;

    public Boolean isResultCorrectToClicks(int clicks) {
        for (int i = 0; i < clicks; i++) {
            link = WebElementsGetter.getElementWithLocatedCondition(linkToClickLocator);
            link.click();
        }
        result = WebElementsGetter.getElementWithLocatedCondition(resultLocator);
        return Integer.parseInt(result.getText()) == clicks;
    }
}
