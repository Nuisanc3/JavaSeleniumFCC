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

public ProductPage clickLoginButton() {
    click(loginButton);
    return new ProductPage();

    // This is a transition method
    // Once you click login, your page will transition to product page
    // So you need to write code accordingly, hence we created a separate page class
    // ProductPage
}

// This is also called as convince method, as this method is taking care of two-three methods
public ProductPage logIntoApplication(String username, String password) {
    setUsername(username);
    setPassword(password);
    return clickLoginButton();

}

public String getErrorMessage() {
    return find(errorMessage).getText();
}

}
