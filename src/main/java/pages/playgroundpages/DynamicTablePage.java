package pages.playgroundpages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.BasePage;
import ui.TableUtils;
import ui.impl.WAIARIADynamicTableUtils;
import utils.elementutils.WebElementsGetter;

import java.util.List;

public class DynamicTablePage extends BasePage {
    private static final TableUtils dynamicTableUtils = new WAIARIADynamicTableUtils();
    private static final By headersLocator = By.xpath("//span[@role='columnheader']");
    private static final By expectedValueLocator = By.xpath("//p[@class='bg-warning']");

    @Step("Verify that {rowName} by header {headerName} is equals to field")
    public Boolean isCorrect(String headerName, String rowName) {
        List<WebElement> headers = WebElementsGetter.getElementsWithLocatedCondition(headersLocator);
        int idOfColumn = dynamicTableUtils.getHeaderId(headers, headerName);
        WebElement searchedElement = dynamicTableUtils.getElementFromTableByRowNameAndColumnId(rowName, idOfColumn);
        WebElement elementWithExpectedValue = WebElementsGetter.getElementWithLocatedCondition(expectedValueLocator);
        return getPureResultFromElement(elementWithExpectedValue, headerName).equals(searchedElement.getText());
    }

    @Step("Getting clean version of element text with header {headerName}")
    private String getPureResultFromElement(WebElement dirtyResult, String headerName) {
        String[] splitStrings = dirtyResult.getText().split(headerName + ": ");
        return splitStrings[1].trim();
    }
}
