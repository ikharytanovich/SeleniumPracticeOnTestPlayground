package pages.playgroundpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ui.TableUtils;
import ui.impl.WAIARIADynamicTableUtils;
import utils.elementsutils.WebElementsGetter;

import java.util.List;

public class DynamicTablePage {
    private static final TableUtils dynamicTableUtils = new WAIARIADynamicTableUtils();
    private static final By headersLocator = By.xpath("//span[@role='columnheader']");
    private static final By expectedValueLocator = By.xpath("//p[@class='bg-warning']");
    private static final String headerName = "CPU";
    private static final String rowName = "Chrome";

    private List<WebElement> headers;
    private WebElement searchedElement;
    private WebElement elementWithExpectedValue;
    private int idOfColumn;

    public Boolean isCorrect() {
        headers = WebElementsGetter.getElementsWithWaiter(headersLocator);
        idOfColumn = dynamicTableUtils.getHeaderId(headers, headerName);
        searchedElement = dynamicTableUtils.getElementFromTableByRowNameAndColumnId(rowName, idOfColumn);
        elementWithExpectedValue = WebElementsGetter.getElementWithWaiter(expectedValueLocator);
        return getPureResultFromElement(elementWithExpectedValue).equals(searchedElement.getText());
    }

    private String getPureResultFromElement(WebElement dirtyResult) {
        String[] splitStrings = dirtyResult.getText().split(headerName + ": ");
        return splitStrings[1].trim();
    }
}
