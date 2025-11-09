package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;

public class FramesPage extends Alerts_Frames_WindowsPage{

    private By textInFrames = By.id("sampleHeading");

    // Notice we have user Sring instead of the By, we are going to switch to the frame using the string.
    private String iFrameBigBox = "frame1";

    private By headerFramesText = By.xpath("//div[@id='app']//h1[text()='Frames']");

    private void switchToBigBox() {
        driver.switchTo().frame(iFrameBigBox);
    }


    public String getTextInBigFrame() {
        switchToBigBox();
        String bigFrameText = find(textInFrames).getText();
        System.out.println(bigFrameText);
        return bigFrameText;
    }

    public String getHeaderFramesText() {
        return find(headerFramesText).getText();
    }
}
