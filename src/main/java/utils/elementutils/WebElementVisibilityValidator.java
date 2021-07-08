package utils.elementutils;

import org.openqa.selenium.*;

public class WebElementVisibilityValidator {
    private static final String WIDTH = "width";
    private static final String HEIGHT = "height";
    private static final String TOP = "top";
    private static final String RIGHT = "right";
    private static final String LEFT = "left";
    private static final String BOTTOM = "bottom";
    private static final String STYLE = "style";
    private static final String AUTO = "auto";
    private static final String PX = "px";
    private static final String OVERLAPPER = "//../*";
    private static final String ZERO_PX = "0px";
    private static final String ZERO_OPACITY = "opacity: 0;";
    private static final String VISIBILITY_HIDDEN = "visibility: hidden;";
    private static final String DISPLAY_NONE = "display: none;";


    public static Boolean isVisible(WebElement element) {
        boolean isVisible = true;
        if (isNotAttachedToDom(element)) {
            return false;
        } else if (isHaveZeroWidthAndHeight(element)) {
            isVisible = false;
        } else if (isInvisibleByStyle(element)) {
            isVisible = false;
        } else if (isOffscreen(element)) {
            isVisible = false;
        } else if (isOverlapped(element)) {
            isVisible = false;
        }
        return isVisible;
    }

    private static Boolean isNotAttachedToDom(WebElement element) {
        try {
            element.isDisplayed();
        } catch (StaleElementReferenceException exception) {
            return true;
        }
        return false;
    }

    private static Boolean isHaveZeroWidthAndHeight(WebElement element) {
        if (element.getCssValue(WIDTH).equals(ZERO_PX) || element.getCssValue(HEIGHT).equals(ZERO_PX)) {
            return true;
        }
        return false;
    }

    private static Boolean isInvisibleByStyle(WebElement element) {
        if (element.getAttribute(STYLE).equals(ZERO_OPACITY)
                || element.getAttribute(STYLE).equals(VISIBILITY_HIDDEN)
                || element.getAttribute(STYLE).equals(DISPLAY_NONE)) {
            return true;
        }
        return false;
    }

    private static Boolean isOffscreen(WebElement element) {
        String[] sides = new String[]{TOP, RIGHT, LEFT, BOTTOM};
        for (int i = 0; i < sides.length; i++) {
            String cssValue = element.getCssValue(sides[i]);
            if (cssValue.equals(AUTO)) {
                continue;
            }
            cssValue = cssValue.substring(0, cssValue.indexOf(PX));
            int px = Integer.parseInt(cssValue);
            if (px >= 100 || px <= 0) {
                return true;
            }
        }
        return false;
    }

    private static Boolean isOverlapped(WebElement element) {
        if (isNotAttachedToDom(element.findElement(By.xpath(OVERLAPPER)))) {
            return false;
        }
        WebElement overlapper = element.findElement(By.xpath(OVERLAPPER));
        return areElementsOverlapping(element, overlapper);
    }

    private static Boolean areElementsOverlapping(WebElement button, WebElement overlapObject) {
        Rectangle buttonRectangle = button.getRect();
        Point topRightButton = buttonRectangle.getPoint().moveBy(buttonRectangle.getWidth(), 0);
        Point bottomLeftButton = buttonRectangle.getPoint().moveBy(0, buttonRectangle.getHeight());

        Rectangle overlapObjectRectangle = overlapObject.getRect();
        Point topRightOverlapper = overlapObjectRectangle.getPoint().moveBy(overlapObjectRectangle.getWidth(), 0);
        Point bottomLeftOverlapper = overlapObjectRectangle.getPoint().moveBy(0, overlapObjectRectangle.getHeight());

        if (topRightButton.getY() > bottomLeftOverlapper.getY()
                || bottomLeftButton.getY() < topRightOverlapper.getY()) {
            return false;
        }
        if (topRightButton.getX() < bottomLeftOverlapper.getX()
                || bottomLeftButton.getX() > topRightOverlapper.getX()) {
            return false;
        }
        return true;
    }
}
