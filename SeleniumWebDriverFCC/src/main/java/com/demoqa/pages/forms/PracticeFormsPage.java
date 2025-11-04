package com.demoqa.pages.forms;

import org.openqa.selenium.By;

public class PracticeFormsPage extends FormsPage{


    private By feamaleRadioButton = By.id("gender-radio-2");


    public void clickFemaleRadioButton(){
        scrollToElement(feamaleRadioButton);
        click(feamaleRadioButton);
    }
}
