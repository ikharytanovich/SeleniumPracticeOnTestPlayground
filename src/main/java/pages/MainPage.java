package pages;

import org.openqa.selenium.By;
import utils.driversutils.ThreadLocalDriver;
import utils.elementsutils.WebElementsGetter;

public class MainPage {
    private static final String MAIN_PAGE_URL = "http://uitestingplayground.com/";

    public void getToMainPage() {
        ThreadLocalDriver.getDriver().get(MAIN_PAGE_URL);
    }

    public void moveTo(PageLink link) {
        clickOnLinkToRedirect(link.getXpath());
    }

    private void clickOnLinkToRedirect(By by) {
        WebElementsGetter.getElementWithLocatedCondition(by).click();
    }
}
