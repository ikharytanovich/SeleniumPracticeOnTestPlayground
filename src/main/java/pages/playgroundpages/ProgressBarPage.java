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
    private static final int RANGE = 5;

    @Step("Stop on {percent}%")
    public Boolean isStoppedOnNPercent(int percent) {
        int maxValue = percent + RANGE;
        WebElementsGetter.getElementWithLocatedCondition(startButtonLocator).click();
        WebElement progressBar = WebElementsGetter.getElementWithLocatedCondition(progressBarLocator);
        while (true) {
            if (getIntFormStringPercent(progressBar.getText()) >= percent) {
                WebElementsGetter.getElementWithLocatedCondition(stopButtonLocator).click();
                break;
            }
        }
        return (getIntFormStringPercent(progressBar.getText()) == percent
                || getIntFormStringPercent(progressBar.getText()) <= maxValue);
    }

    private int getIntFormStringPercent(String string) {
        return Integer.parseInt(string.substring(0, string.indexOf("%")));
    }
}

