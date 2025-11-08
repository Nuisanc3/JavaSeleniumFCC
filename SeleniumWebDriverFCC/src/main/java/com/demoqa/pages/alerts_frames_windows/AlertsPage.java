package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;

import static utility.JavaScriptUtility.scrollToElementJS;

public class AlertsPage extends Alerts_Frames_WindowsPage{


    private By informationAlertButton = By.id("alertButton");
    private By confirmationAlertButton = By.id("confirmButton");
    private By confirmationResult = By.id("confirmResult");
    private By promptsAlertButton = By.id("promtButton");
    private By promptResult = By.id("promptResult");


    public void clickIntormationAlertButton() {
        click(informationAlertButton);
    }

    public void clickConfirmationAlertButton() {
        click(confirmationAlertButton);
    }

    public void clickPromptAlertButton() {
        scrollToElementJS(promptsAlertButton);
        click(promptsAlertButton);
    }

    public String getConfirmationResult() {
        return find(confirmationResult).getText();
    }

    public String getPromptResult() {
        return find(promptResult).getText();
    }

    public void getAlertTextMessage() {

    }
}
