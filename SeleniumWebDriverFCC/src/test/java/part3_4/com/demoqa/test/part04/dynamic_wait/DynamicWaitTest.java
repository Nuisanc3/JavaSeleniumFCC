package part3_4.com.demoqa.test.part04.dynamic_wait;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class DynamicWaitTest extends BaseTest {

    @Test
    public void testVisibleAfterButtonText() {
        var dynamicPage = homePage.gotoElements().clickDynamicProperties();
        String actualText = dynamicPage.getVisibleAfterButton();
        String expectedText = "Visible After 5 Seconds";
        Assert.assertEquals(actualText, expectedText, "\n  Actual and Expected text do not match\n");
    }

    @Test
    public void testProgressBar(){
        var progressBarPage = homePage.gotoWidgets().clickProgressBar();
        progressBarPage.clickStartButton();
        String actualValue = progressBarPage.getProgressValue();
        String expectedValue = "100";
        Assert.assertEquals(actualValue, expectedValue, "\n Value is not 100% \n ");


    }
}
