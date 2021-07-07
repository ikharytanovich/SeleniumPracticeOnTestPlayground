package pages.playgroundpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.elementsutils.WebElementsGetter;

public class SampleAppPage {
    private static final By userNameFieldLocator = By.xpath("//input[@name='UserName']");
    private static final By passwordFieldLocator = By.xpath("//input[@name='Password']");
    private static final By buttonLocator = By.xpath("//button[@class='btn btn-primary']");


    private WebElement userNameField;
    private WebElement passwordField;
    private WebElement button;

    public void login(String username, String password) {
        userNameField = WebElementsGetter.getElementWithLocatedCondition(userNameFieldLocator);
        passwordField = WebElementsGetter.getElementWithLocatedCondition(passwordFieldLocator);
        button = WebElementsGetter.getElementWithLocatedCondition(buttonLocator);
        userNameField.sendKeys(username);
        passwordField.sendKeys(password);
        button.click();
    }
}
