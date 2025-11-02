package com.saucedemo.pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    // All the methods will be inherited from BasePage

    private By usernameFiled = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");
    private By errorMessage = By.xpath("#login_button_container h3");



public void setUsername (String username) {
    set(usernameFiled, username);
}

public void setPassword (String password) {
    set(passwordField, password);
}

public void clickLoginButton() {
    click(loginButton);
}

}
