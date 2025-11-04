package com.demoqa.pages.forms;

import org.openqa.selenium.By;

import static utility.JavaScriptUtility.clickJS;
import static utility.JavaScriptUtility.scrollToElementJS;

public class PracticeFormsPage extends FormsPage{


    private By feamaleRadioButton = By.id("gender-radio-2");


    public void clickFemaleRadioButton(){
        scrollToElementJS(feamaleRadioButton);
        // The script will fail with the click method
        // click(feamaleRadioButton);
        // So what we need is the Java script click method. Goto JavaSCriptUtility class
        // Check the method clickJS
        clickJS(feamaleRadioButton);
    }

    public boolean isFemaleSelected() {
        return find(feamaleRadioButton).isSelected();
    }
}
