package pages;

import org.openqa.selenium.By;

public enum PageLink {
    AJAXData(By.xpath("//a[@href='/ajax']")),
    ClassAttribute(By.xpath("//a[@href='/classattr']")),
    ClickPage(By.xpath("//a[@href='/click']")),
    ClientSideDelay(By.xpath("//a[@href='/clientdelay']")),
    DynamicId(By.xpath("//a[@href='/dynamicid']")),
    DynamicTable(By.xpath("//a[@href='/dynamictable']")),
    HiddenLayers(By.xpath("//a[@href='/hiddenlayers']")),
    LoadDelay(By.xpath("//a[@href='/loaddelay']")),
    SampleApp(By.xpath("//a[@href='/sampleapp']")),
    TextPage(By.xpath("//a[@href='/textinput']")),
    ScrollBars(By.xpath("//a[@href='/scrollbars']")),
    ProgressBarPage(By.xpath("//a[@href='/progressbar']")),
    MouseOverPage(By.xpath("//a[@href='/mouseover']")),
    NonBrakingSpacePage(By.xpath("//a[@href='/nbsp']"));

    private final By xpath;

    PageLink(By xpath) {
        this.xpath = xpath;
    }

    public By getXpath() {
        return xpath;
    }
}
