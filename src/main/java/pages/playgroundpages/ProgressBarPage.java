package pages.playgroundpages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.BasePage;
import utils.elementutils.WebElementsGetter;

public class ProgressBarPage extends BasePage {
    private static final By startButtonLocator = By.xpath("//button[@class='btn btn-primary btn-test']");
    private static final By stopButtonLocator = By.xpath("//button[@class='btn btn-info btn-test']");
    private static final By progressBarLocator = By.xpath("//div[@class='progress-bar bg-info']");

    @Step("Stop on {percent}%")
    public Boolean isStoppedOnNPercent(int percent) {
        String percentStringValue = percent + "%";
        WebElementsGetter.getElementWithLocatedCondition(startButtonLocator).click();
        WebElement progressBar = WebElementsGetter.getElementWithLocatedCondition(progressBarLocator);
        while (true) {
            if (progressBar.getText().equals(percentStringValue)) {
                WebElementsGetter.getElementWithLocatedCondition(stopButtonLocator).click();
                break;
            }
        }
        return progressBar.getText().equals(percentStringValue);
    }
}

