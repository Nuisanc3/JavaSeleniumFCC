package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;

import static utility.SwitchToUtility.*;

public class FramesPage extends Alerts_Frames_WindowsPage{

    private By textInFrames = By.id("sampleHeading");

    // Notice we have user Sring instead of the By, we are going to switch to the frame using the string.
    private String iFrameBigBox = "frame1";

    private By headerFramesText = By.xpath("//div[@id='app']//h1[text()='Frames']");

    private void switchToBigBox() {
        // driver.switchTo().frame(iFrameBigBox); // Created methods in the utility for clean code
        switchToFramesString(iFrameBigBox);
    }

    private void switchToSmallBox() {
        switchToFramesIndex(3);

    }


    public String getTextInBigFrame() {
        switchToBigBox();
        String bigFrameText = find(textInFrames).getText();
        System.out.println(bigFrameText);
        // driver.switchTo().parentFrame(); // This is imp step to come out of the frames.
        // Recommend to use the defaultContent() ; Because it will always get us back to the original html
        // Now we have created a method in the utility for the cleaner code
        switchToDefaultContent();
        return bigFrameText;
    }

    public String getTextInSmallFrame() {
        switchToSmallBox();
        String smallFrameText = find(textInFrames).getText();
        System.out.println("Small Frame Text: " + smallFrameText);
        switchToDefaultContent();
        return smallFrameText;
    }

    public String getHeaderFramesText() {
        return find(headerFramesText).getText();
    }
}
