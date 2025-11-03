package part02.com.saucedemo.test.products;

import com.saucedemo.pages.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import part02.com.saucedemo.base.BaseTest;

public class ProductsTest extends BaseTest {

    @Test
    public void testProductHeaderIsDisplayed() throws InterruptedException {
        ProductPage productsPage =
       loginPage.logIntoApplication("standard_user", "secret_sauce");
        Thread.sleep(2000);
        Assert.assertTrue(productsPage.isProductsHeaderDisplayed(), "\nProducts Header is Not Displayed \n ");

    }


}
