package pages.playgroundpages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import pages.BasePage;
import utils.elementutils.WebElementsGetter;

public class SampleAppPage extends BasePage {
    private static final By userNameFieldLocator = By.xpath("//input[@name='UserName']");
    private static final By passwordFieldLocator = By.xpath("//input[@name='Password']");
    private static final By buttonLocator = By.xpath("//button[@class='btn btn-primary']");
    private static final String buttonLogOutValue = "Log Out";

    @Step("Login in app with UserName:{username} and password:{password}")
    public Boolean login(String username, String password) {
        WebElementsGetter.getElementWithLocatedCondition(userNameFieldLocator).sendKeys(username);
        WebElementsGetter.getElementWithLocatedCondition(passwordFieldLocator).sendKeys(password);
        WebElementsGetter.getElementWithLocatedCondition(buttonLocator).click();
        return WebElementsGetter.getElementWithLocatedCondition(buttonLocator).getText().equals(buttonLogOutValue);
    }
}
