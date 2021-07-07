package pages;

import constants.PageLinkLocator;
import utils.elementsutils.WebElementsGetter;

public class MainPage {
    public void clickOnLinkToRedirect(PageLinkLocator link) {
        WebElementsGetter.getElementWithLocatedCondition(link.getXpath()).click();
    }
}
