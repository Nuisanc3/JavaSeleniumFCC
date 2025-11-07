package part3_4.com.demoqa.test.part04.screenshot;

import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class CapturedFailedScreenshotTest extends BaseTest {

    @Test
    public void testClickingSubmitButtonWithoutJavaScriptExecutor() {
        var practiceFormsPage = homePage.gotoForms().clickPracticeForms();
        practiceFormsPage.clickSubmitButton();
    }

}
