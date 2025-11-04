package com.demoqa.pages.forms;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static utility.JavaScriptUtility.scrollToElementJS;

public class FormsPage extends HomePage {


    private By practiceFormsMenuItem = By.xpath("//li[@id='item-0']/span[text()='Practice Form']");


    public PracticeFormsPage clickPracticeForms() {
        scrollToElementJS(practiceFormsMenuItem);
        click(practiceFormsMenuItem);
        return new PracticeFormsPage();
    }
}
