package com.demoqa.pages;

import com.demoqa.pages.elements.ElementsPage;
import com.demoqa.pages.forms.FormsPage;
import com.demoqa.pages.widgets.WidgetsPage;
import com.saucedemo.pages.BasePage;
import org.openqa.selenium.By;

import static utility.JavaScriptUtility.scrollToElementJS;
import static utility.Utility.setUtilityDriver;

public class HomePage extends BasePage {

    private By formsCard = By.xpath("//div[@id='app']//h5[text()='Forms']");
    private By elementsCard = By.xpath("//div[@id='app']//h5[text()='Elements']");
    private By widgetsCard = By.xpath("//div[@id='app']//h5[text()='Widgets']");

    public FormsPage gotoForms() {
        scrollToElementJS(formsCard);
        click(formsCard);
        return new FormsPage();
    }

    public ElementsPage gotoElements() {
        scrollToElementJS(elementsCard);
        click(elementsCard);
        return new ElementsPage();
    }

    public WidgetsPage gotoWidgets() {
        scrollToElementJS(widgetsCard);
        click(widgetsCard);
        return new WidgetsPage();
    }



}
