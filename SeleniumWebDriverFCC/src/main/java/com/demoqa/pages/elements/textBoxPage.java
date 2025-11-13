package com.demoqa.pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import static utility.ActionsUtility.sendKeys;
import static utility.JavaScriptUtility.scrollToElementJS;

public class textBoxPage extends ElementsPage {

    private By fullNameField = By.id("userName");
    private By currentAddressField = By.xpath("//textarea[@id='currentAddress']]");
    private By submitButton = By.id("submit");

    public void clickSubmitButton() {
        scrollToElementJS(submitButton);
        click(submitButton);
    }

    public void setFullName(String name) {
        scrollToElementJS(fullNameField);
        sendKeys(find(fullNameField), Keys.chord(name));
    }

    public void setEmail(String email) {
        setFullName(Keys.chord(Keys.TAB, email));
    }

    public void setCurrentAddress(String address) {
        find(currentAddressField).sendKeys(Keys.chord(address + Keys.ENTER));
    }

}
