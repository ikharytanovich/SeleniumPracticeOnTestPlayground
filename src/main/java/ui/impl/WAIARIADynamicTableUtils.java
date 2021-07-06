package ui.impl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ui.TableUtils;
import utils.elements.WebElementsUtils;

import java.util.List;

public class WAIARIADynamicTableUtils implements TableUtils {
    private static final String searchedElementLocatorWith = "//span[@role='cell'][text()='%s']//following-sibling::span[%s]";

    @Override
    public int getHeaderId(List<WebElement> headers, String headerName) {
        WebElement searchedElement = headers.stream().filter(x -> x.getText().equals(headerName)).findFirst().get();
        return headers.indexOf(searchedElement);
    }

    @Override
    public WebElement getElementFromTableByRowNameAndColumnId(String name, int columnId) {
        return WebElementsUtils.getElementWithWaiter(By.xpath(String.format(searchedElementLocatorWith, name, columnId)));
    }
}