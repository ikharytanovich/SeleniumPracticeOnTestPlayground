package utils.driversutils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThreadLocalDriver {
    private static final ThreadLocal<WebDriver> localStorage = new ThreadLocal<>();

    private static void setUp() {
        WebDriverManager.chromedriver().setup();
        localStorage.set(new ChromeDriver());
    }

    public static WebDriver getDriver() {
        if (localStorage.get() == null) {
            setUp();
        }
        return localStorage.get();
    }

    public static void closeDriver() {
        localStorage.get().quit();
        localStorage.remove();
    }
}
