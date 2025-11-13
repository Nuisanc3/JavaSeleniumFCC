package com.demoqa.pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import static utility.ActionsUtility.sendKeys;
import static utility.JavaScriptUtility.scrollToElementJS;

public class textBoxPage extends ElementsPage {

    private By fullNameField = By.id("userName");

    public void setFullName(String name) {
        scrollToElementJS(fullNameField);
        sendKeys(find(fullNameField), Keys.chord(name));
    }

    public void setEmail(String email) {
        setFullName(Keys.chord(Keys.TAB, email));
    }

}
