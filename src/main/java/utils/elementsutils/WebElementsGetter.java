package utils.elementsutils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.driversutils.ThreadLocalDriver;

import java.util.List;

public class WebElementsGetter {
    private final static int DEFAULT_WAIT_TIME = 45;

    public static WebElement getElementWithWaiter(By by) {
        return new WebDriverWait(ThreadLocalDriver.getDriver(), DEFAULT_WAIT_TIME)
                .until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public static WebElement getElementWithWaiter(By by, int time) {
        return new WebDriverWait(ThreadLocalDriver.getDriver(), time)
                .until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public static List<WebElement> getElementsWithWaiter(By by) {
        return new WebDriverWait(ThreadLocalDriver.getDriver(), DEFAULT_WAIT_TIME)
                .until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
    }

    public static List<WebElement> getElementsWithWaiter(By by, int time) {
        return new WebDriverWait(ThreadLocalDriver.getDriver(), time)
                .until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
    }
}
