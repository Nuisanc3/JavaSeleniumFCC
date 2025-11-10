package com.demoqa.pages.elements;

import org.openqa.selenium.By;

import static utility.GetUtility.getText;
import static utility.WaitUtility.explicitWaitUntilVisible;

public class DynamicPropertiesPage extends ElementsPage{

    private By visibleAfterButton = By.id("visibleAfter");


    public String getVisibleAfterButton() {
        explicitWaitUntilVisible(5, visibleAfterButton);
        String visibleText = getText(visibleAfterButton);
        System.out.println("Button text : " + visibleText);
        return visibleText;


    }
}
