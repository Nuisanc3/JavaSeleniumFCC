package com.saucedemo.pages;

import org.openqa.selenium.By;

public class ProductPage extends BasePage{

    private By productsHeader = By.xpath("//spn[text()='Products']");



    public boolean isProductsHeaderDisplayed(){
        return find(productsHeader).isDisplayed();
    }

}
