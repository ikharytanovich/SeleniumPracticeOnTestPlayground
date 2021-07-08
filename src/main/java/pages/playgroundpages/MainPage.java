package pages.playgroundpages;

import org.openqa.selenium.By;
import pages.BasePage;
import utils.elementutils.WebElementsGetter;

public class MainPage extends BasePage {
    public static final By AJAX_DATA = By.xpath("//a[@href='/ajax']");
    public static final By CLASS_ATTRIBUTE = By.xpath("//a[@href='/classattr']");
    public static final By CLICK_PAGE = By.xpath("//a[@href='/click']");
    public static final By CLIENT_SIDE_DELAY = By.xpath("//a[@href='/clientdelay']");
    public static final By DYNAMIC_ID = By.xpath("//a[@href='/dynamicid']");
    public static final By DYNAMIC_TABLE = By.xpath("//a[@href='/dynamictable']");
    public static final By HIDDEN_LAYERS = By.xpath("//a[@href='/hiddenlayers']");
    public static final By LOAD_DELAY = By.xpath("//a[@href='/loaddelay']");
    public static final By SAMPLE_APP = By.xpath("//a[@href='/sampleapp']");
    public static final By TEXT_PAGE = By.xpath("//a[@href='/textinput']");
    public static final By SCROLL_BARS = By.xpath("//a[@href='/scrollbars']");
    public static final By PROGRESS_BAR = By.xpath("//a[@href='/progressbar']");
    public static final By MOUSE_OVER = By.xpath("//a[@href='/mouseover']");
    public static final By NON_BRAKING_SPACE = By.xpath("//a[@href='/nbsp']");
    public static final By VERIFY_TEXT = By.xpath("//a[@href='/verifytext']");
    public static final By VISIBILITY = By.xpath("//a[@href='/visibility']");

    public static void clickOnLinkToRedirect(By linkLocator) {
        WebElementsGetter.getElementWithLocatedCondition(linkLocator).click();
    }
}
