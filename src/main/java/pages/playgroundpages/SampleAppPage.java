package pages.playgroundpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.elementsutils.WebElementsGetter;

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
        userNameField = WebElementsGetter.getElementWithWaiter(userNameFieldLocator);
        passwordField = WebElementsGetter.getElementWithWaiter(passwordFieldLocator);
        button = WebElementsGetter.getElementWithWaiter(buttonLocator);
        userNameField.sendKeys(userNameValue);
        passwordField.sendKeys(passwordValue);
        button.click();
    }
}
