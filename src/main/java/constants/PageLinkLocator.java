package constants;

import org.openqa.selenium.By;

public enum PageLinkLocator {
    AJAX_DATA(By.xpath("//a[@href='/ajax']")),
    CLASS_ATTRIBUTE(By.xpath("//a[@href='/classattr']")),
    CLICK_PAGE(By.xpath("//a[@href='/click']")),
    CLIENT_SIDE_DELAY(By.xpath("//a[@href='/clientdelay']")),
    DYNAMIC_ID(By.xpath("//a[@href='/dynamicid']")),
    DYNAMIC_TABLE(By.xpath("//a[@href='/dynamictable']")),
    HIDDEN_LAYERS(By.xpath("//a[@href='/hiddenlayers']")),
    LOAD_DELAY(By.xpath("//a[@href='/loaddelay']")),
    SAMPLE_APP(By.xpath("//a[@href='/sampleapp']")),
    TEXT_PAGE(By.xpath("//a[@href='/textinput']")),
    SCROLL_BARS(By.xpath("//a[@href='/scrollbars']")),
    PROGRESS_BAR(By.xpath("//a[@href='/progressbar']")),
    MOUSE_OVER(By.xpath("//a[@href='/mouseover']")),
    NON_BRAKING_SPACE(By.xpath("//a[@href='/nbsp']")),
    VERIFY_TEXT(By.xpath("//a[@href='/verifytext']")),
    VISIBILITY(By.xpath("//a[@href='/visibility']"));

    private final By xpath;

    PageLinkLocator(By xpath) {
        this.xpath = xpath;
    }

    public By getXpath() {
        return xpath;
    }
}
