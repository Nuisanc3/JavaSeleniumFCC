package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SwitchToUtility extends Utility {

    private static WebDriver.TargetLocator switchTo() {
        return driver.switchTo(); // switchTo will return Target locator interface.
    }

    public static String getAlertText() {
       return switchTo().alert().getText();
    }

    public static void acceptAlert() {
        switchTo().alert().accept();
    }

    public static void dismissAlert() {
        switchTo().alert().dismiss();
    }

    public static void setAlertText(String text) {
        switchTo().alert().sendKeys(text);
    }

    public static void switchToFramesString(String value) {
        switchTo().frame(value);
    }

    public static void switchToDefaultContent() {
        switchTo().defaultContent();
    }

    public static void switchToFramesIndex(int index) {
        switchTo().frame(index);
    }

    public static void switchToFramesElement(WebElement element) {
        switchTo().frame(element);
    }

    public static void switchToWindow(String handle) {
        switchTo().window(handle);
    }
}
