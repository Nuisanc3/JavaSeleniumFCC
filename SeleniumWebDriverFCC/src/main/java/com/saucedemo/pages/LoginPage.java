package com.saucedemo.pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    // All the methods will be inherited from BasePage

    private By username = By.id("user-name");
    private By password = By.id("password");
    private By loginButton = By.id("login-button");
    private By errorMessage = By.xpath("#login_button_container h3");

    




}
