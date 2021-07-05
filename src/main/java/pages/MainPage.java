package pages;

import org.openqa.selenium.By;
import utils.driversutils.DriverThreadLocal;
import utils.elements.WebElementsUtils;

public class MainPage {
    private static final String MAIN_PAGE_URL = "http://uitestingplayground.com/";

    public void getToMainPage() {
        DriverThreadLocal.getDriver().get(MAIN_PAGE_URL);
    }

    public void moveTo(PageLink link) {
        clickOnLinkToRedirect(link.getXpath());
    }

    private void clickOnLinkToRedirect(By by) {
        WebElementsUtils.getElementWithWaiter(by).click();
    }
}
