package part02.com.saucedemo.test.login;

import org.testng.Assert;
import org.testng.annotations.Test;
import part02.com.saucedemo.base.BaseTest;

public class LoginTests extends BaseTest {


    @Test
    public void testLoginErrorMessage() {
        loginPage.setUsername("standard_user");
        loginPage.setPassword("abc123");
        var productPage = loginPage.clickLoginButton(); // After we click login it will transition to product page
        // Hence we have added this way^

        String actualMessage = loginPage.getErrorMessage();

        Assert.assertTrue(actualMessage.contains("Epic sadface"));
    }
}
