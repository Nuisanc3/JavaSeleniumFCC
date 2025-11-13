package part3_4.com.demoqa.test.part04.interactions;

import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class KeyboardTest extends BaseTest {

    @Test
    public void testApplicationUsingKeyBoard() {
        String name = "Sir Dr. Saumitra Kulkarni The Great";
        String email = "sirdrSaumitraTheGreat@godOFHumanity.com";
        var textboxPage = homePage.gotoElements().clickTextBox();
        textboxPage.setFullName(name);
        textboxPage.setEmail(email);
    }

}
