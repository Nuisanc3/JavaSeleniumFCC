package com.demoqa.pages.elements;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static utility.JavaScriptUtility.clickJS;

public class ElementsPage extends HomePage {

    private  By webTablesMenuItem = By.xpath("//li[@id='item-3']/span[text()='Web Tables']");

    public WebTablesPage clickWebTables() {
        // Temp change from Click to ClickJS
        // Code worked fine
        clickJS(webTablesMenuItem);
        return new WebTablesPage();
    }
}
