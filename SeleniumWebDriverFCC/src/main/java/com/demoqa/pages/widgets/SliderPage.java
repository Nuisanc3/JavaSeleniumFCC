package com.demoqa.pages.widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import static utility.ActionsUtility.dragAndDropBy;
import static utility.GetUtility.getAttribute;

public class SliderPage extends WidgetsPage {

    private By slider = By.xpath("//div[@id='sliderContainer']//input[@type='range']");
    private By sliderValue = By.id("sliderValue");


    public void moveSlider(int x, int y) {
        dragAndDropBy(find(slider),x, y);
    }


    public String getSliderValue() {
        return getAttribute(slider, "value");
    }
}
