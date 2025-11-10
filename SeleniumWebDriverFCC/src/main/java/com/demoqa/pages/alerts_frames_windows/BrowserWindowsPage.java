package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;

import java.util.Set;

import static utility.SwitchToUtility.switchToWindow;

public class BrowserWindowsPage extends Alerts_Frames_WindowsPage {

    private By newWindowButton = By.id("windowButton");


    public void clickNewWindowButton() {
        click(newWindowButton);
    }

    public void switchToNewWindow() {
        // Step 1 : Get the current "Main" Windows Handle

        String currentHandle = driver.getWindowHandle();
        System.out.println("Main windows ID : " + currentHandle + "\n");

        // Step 2 : Get all the windows handles
        Set<String> allHandles = driver.getWindowHandles();
        System.out.println("# of Open windows : " + allHandles.size());

        for (String handle : allHandles) {
            if (currentHandle.equals(handle)) {
                System.out.println("1st Window ID : " + handle);
            } else {
                switchToWindow(handle);
                System.out.println("2nd Window ID : " + handle);
            }
        }
        // STep 3 : Switch to new window using the window handle
    }
}
