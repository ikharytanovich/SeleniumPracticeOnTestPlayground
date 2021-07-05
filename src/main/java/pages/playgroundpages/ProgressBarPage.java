package pages.playgroundpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.elements.WebElementsUtils;

public class ProgressBarPage {
    private static final By startButtonLocator = By.xpath("//button[@class='btn btn-primary btn-test']");
    private static final By stopButtonLocator = By.xpath("//button[@class='btn btn-info btn-test']");
    private static final By progressBarLocator = By.xpath("//div[@class='progress-bar bg-info']");
    private static final int REQUIRED_PERCENT = 75;

    private WebElement startButton;
    private WebElement stopButton;
    private WebElement progressBar;

    public void stopOnNPercent() {
        String percent = REQUIRED_PERCENT + "%";
        startButton = WebElementsUtils.getElementWithWaiter(startButtonLocator);
        stopButton = WebElementsUtils.getElementWithWaiter(stopButtonLocator);
        startButton.click();
        for (; ; ) {
            progressBar = WebElementsUtils.getElementWithWaiter(progressBarLocator);
            if (progressBar.getText().equals(percent)) {
                stopButton.click();
                break;
            }
        }
    }
}
