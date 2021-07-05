package ui;

import org.openqa.selenium.WebElement;

import java.util.List;

public interface TableUtils {
    int getHeaderId(List<WebElement> headers, String headerName);

    WebElement getElementFromTableByRowNameAndColumnId(String name, int id);
}
