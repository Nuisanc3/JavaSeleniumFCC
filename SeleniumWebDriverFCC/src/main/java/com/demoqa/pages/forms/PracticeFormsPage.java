package com.demoqa.pages.forms;

import org.openqa.selenium.By;

import static utility.JavaScriptUtility.clickJS;
import static utility.JavaScriptUtility.scrollToElementJS;

public class PracticeFormsPage extends FormsPage{


    private By feamaleRadioButton = By.id("gender-radio-2");
    private By sportsHobbiesCheckbox = By.id("hobbies-checkbox-1");
    private By readingHobbiesCheckbox = By.id("hobbies-checkbox-2");
    private By musicHobbiesCheckbox = By.id("hobbies-checkbox-3");
    private By submitButton = By.id("submit");


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

    public void clickSportsCheckbox() {
        if (!find(sportsHobbiesCheckbox).isSelected()) {
            scrollToElementJS(sportsHobbiesCheckbox);
            clickJS(sportsHobbiesCheckbox);
        }
    }


    public void clickReadingCheckbox() {
        if (!find(readingHobbiesCheckbox).isSelected()) {
            scrollToElementJS(readingHobbiesCheckbox);
            clickJS(readingHobbiesCheckbox);
        }
    }

    public void clickMusicCheckbox() {
        if (!find(musicHobbiesCheckbox).isSelected()) {
            scrollToElementJS(musicHobbiesCheckbox);
            clickJS(musicHobbiesCheckbox);
        }
    }

    public void unclickReadingCheckbox() {
        if (find(readingHobbiesCheckbox).isSelected()) {
            scrollToElementJS(readingHobbiesCheckbox);
            clickJS(readingHobbiesCheckbox);
        }
    }

    public boolean isReadingSelected() {
        return find(readingHobbiesCheckbox).isSelected();
    }

    public void clickSubmitButton() {
        // scrollToElementJS(submitButton);
        click(submitButton);
    }
}
