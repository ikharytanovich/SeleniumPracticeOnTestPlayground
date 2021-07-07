package pages.playgroundpages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.elementsutils.WebElementsGetter;

public class SampleAppPage {
    private static final By userNameFieldLocator = By.xpath("//input[@name='UserName']");
    private static final By passwordFieldLocator = By.xpath("//input[@name='Password']");
    private static final By buttonLocator = By.xpath("//button[@class='btn btn-primary']");

    @Step("Login in app with UserName:{username} and password:{password}")
    public void login(String username, String password) {
        WebElement userNameField = WebElementsGetter.getElementWithLocatedCondition(userNameFieldLocator);
        WebElement passwordField = WebElementsGetter.getElementWithLocatedCondition(passwordFieldLocator);
        WebElement button = WebElementsGetter.getElementWithLocatedCondition(buttonLocator);
        userNameField.sendKeys(username);
        passwordField.sendKeys(password);
        button.click();
    }
}
