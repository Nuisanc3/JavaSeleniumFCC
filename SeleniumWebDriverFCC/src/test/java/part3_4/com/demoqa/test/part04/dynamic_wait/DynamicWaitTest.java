package part3_4.com.demoqa.test.part04.dynamic_wait;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class DynamicWaitTest extends BaseTest {

    @Test
    public void testVisibleAfterButtonText() {
        var dynamicPage = homePage.gotoElements().clickDynamicProperties();
        String actualText = dynamicPage.getVisibleAfterButton();
        String expectedText = "Visible After 5 seconds";
        Assert.assertEquals(actualText, expectedText, "\n  Actual and Expected text do not match\n");
    }
}
