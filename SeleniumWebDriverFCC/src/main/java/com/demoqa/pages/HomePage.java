package com.demoqa.pages;

import com.demoqa.pages.forms.FormsPage;
import com.saucedemo.pages.BasePage;
import org.openqa.selenium.By;

import static utility.JavaScriptUtility.scrollToElementJS;
import static utility.Utility.setUtilityDriver;

public class HomePage extends BasePage {

    private By formsCard = By.xpath("//div[@id='app']//h5[text()='Forms']");

    public FormsPage gotoForms() {
        scrollToElementJS(formsCard);
        click(formsCard);
        return new FormsPage();
    }

}
