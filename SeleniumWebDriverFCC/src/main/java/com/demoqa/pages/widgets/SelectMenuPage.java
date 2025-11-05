package com.demoqa.pages.widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static utility.DropDownUtility.*;
import static utility.JavaScriptUtility.scrollToElementJS;

public class SelectMenuPage extends WidgetsPage {


    private By standardMultiSelect = By.id("cars");

    public void setStandardMulti(String text) {
        scrollToElementJS(standardMultiSelect);
        // By Industry standards you should put this code block into utility folder
        // Select select = new Select(find(standardMultiSelect));
       // select.selectByVisibleText(text);
        // Goto DropDownUtility class to see the methods created and see how easy it is to write code now

        selectByVisibleText(standardMultiSelect, text);

    }

    // Now we are creating a overloaded method

    public void setStandardMulti(int index) {
        scrollToElementJS(standardMultiSelect);
        selectByIndex(standardMultiSelect, index);

    }
}
