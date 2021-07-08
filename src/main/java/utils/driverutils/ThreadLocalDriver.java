package utils.driverutils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static constants.DriverConstants.DRIVER_SRC;
import static constants.DriverConstants.SYSTEM_PROPERTY_KEY;

public class ThreadLocalDriver {
    private static final ThreadLocal<WebDriver> localStorage = new ThreadLocal<>();

    public static WebDriver getDriver() {
        if (localStorage.get() == null) {
            setUp();
            getDriver();
        }
        return localStorage.get();
    }

    public static void closeDriver() {
        localStorage.get().quit();
        localStorage.remove();
    }

    private static void setUp() {
        System.setProperty(SYSTEM_PROPERTY_KEY, DRIVER_SRC);
        localStorage.set(getConfiguredDriver());
    }

    private static WebDriver getConfiguredDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("enable-automation");
        options.addArguments("--window-size=1920,1080");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-extensions");
        options.addArguments("--dns-prefetch-disable");
        options.addArguments("--ignore-ssl-errors=yes");
        options.addArguments("--ignore-certificate-errors");
        return new ChromeDriver(options);
    }
}
