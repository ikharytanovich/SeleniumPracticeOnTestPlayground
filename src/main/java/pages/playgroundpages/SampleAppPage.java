package pages.playgroundpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.elements.WebElementsUtils;

public class SampleAppPage {
    private static final By userNameFieldLocator = By.xpath("//input[@name='UserName']");
    private static final By passwordFieldLocator = By.xpath("//input[@name='Password']");
    private static final By buttonLocator = By.xpath("//button[@class='btn btn-primary']");
    private static final String userNameValue = "user name";
    private static final String passwordValue = "pwd";

    private WebElement userNameField;
    private WebElement passwordField;
    private WebElement button;

    public void login() {
        userNameField = WebElementsUtils.getElementWithWaiter(userNameFieldLocator);
        passwordField = WebElementsUtils.getElementWithWaiter(passwordFieldLocator);
        button = WebElementsUtils.getElementWithWaiter(buttonLocator);
        userNameField.sendKeys(userNameValue);
        passwordField.sendKeys(passwordValue);
        button.click();
    }
}
