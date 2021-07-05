package pages.playgroundpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.elements.WebElementsUtils;

public class MouseOverPage {
    private static final By linkToClickLocator = By.xpath("//div/a[@class]");
    private static final By resultLocator = By.xpath("//span[@class='badge badge-light']");
    private static final int TIMES_TO_PRESS_LINK = 2;

    private WebElement link;
    private WebElement result;

    public Boolean getCountOfClicks() {
        for (int i = 0; i < TIMES_TO_PRESS_LINK; i++) {
            link = WebElementsUtils.getElementWithWaiter(linkToClickLocator);
            link.click();
        }
        result = WebElementsUtils.getElementWithWaiter(resultLocator);
        return Integer.parseInt(result.getText()) == TIMES_TO_PRESS_LINK;
    }
}
