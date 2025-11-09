package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;

public class FramesPage extends Alerts_Frames_WindowsPage{

    private By textInFrames = By.id("sampleHeading");


    public String getTextInBigFrame() {
        String bigFrameText = find(textInFrames).getText();
        System.out.println(bigFrameText);
        return bigFrameText;
    }
}
