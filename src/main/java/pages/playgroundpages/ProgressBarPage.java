package pages.playgroundpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.elementsutils.WebElementsGetter;

public class ProgressBarPage {
    private static final By startButtonLocator = By.xpath("//button[@class='btn btn-primary btn-test']");
    private static final By stopButtonLocator = By.xpath("//button[@class='btn btn-info btn-test']");
    private static final By progressBarLocator = By.xpath("//div[@class='progress-bar bg-info']");


    private WebElement startButton;
    private WebElement stopButton;
    private WebElement progressBar;

    public void stopOnNPercent(int percent) {
        String percentStringValue = percent + "%";
        startButton = WebElementsGetter.getElementWithLocatedCondition(startButtonLocator);
        stopButton = WebElementsGetter.getElementWithLocatedCondition(stopButtonLocator);
        startButton.click();
        for (; ; ) {
            progressBar = WebElementsGetter.getElementWithLocatedCondition(progressBarLocator);
            if (progressBar.getText().equals(percentStringValue)) {
                stopButton.click();
                break;
            }
        }
    }
}
