package utils.pageutils;

import pages.playgroundpages.*;

public interface IPageFactory {
    AJAXDataPage ajaxDataPage = new AJAXDataPage();
    ClassAttributePage classAttributePage = new ClassAttributePage();
    ClickPage clickPage = new ClickPage();
    ClientSideDelayPage clientSideDelayPage = new ClientSideDelayPage();
    DynamicIdPage dynamicIdPage = new DynamicIdPage();
    DynamicTablePage dynamicTablePage = new DynamicTablePage();
    HiddenLayersPage hiddenLayersPage = new HiddenLayersPage();
    LoadDelayPage loadDelayPage = new LoadDelayPage();
    MouseOverPage mouseOverPage = new MouseOverPage();
    NonBrakingSpacePage nonBrakingSpacePage = new NonBrakingSpacePage();
    ProgressBarPage progressBarPage = new ProgressBarPage();
    SampleAppPage sampleAppPage = new SampleAppPage();
    ScrollbarsPage scrollbarsPage = new ScrollbarsPage();
    TextPage textPage = new TextPage();
    VerifyTextPage verifyTextPage = new VerifyTextPage();
    VisibilityPage visibilityPage = new VisibilityPage();
}
