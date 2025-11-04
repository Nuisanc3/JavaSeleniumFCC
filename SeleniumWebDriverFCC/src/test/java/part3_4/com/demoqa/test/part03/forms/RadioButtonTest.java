package part3_4.com.demoqa.test.part03.forms;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class RadioButtonTest extends BaseTest {


    @Test
    public void testRadioButton(){
        var formsPage = homePage.gotoForms().clickPracticeForms();
        formsPage.clickFemaleRadioButton();
        boolean isFemaleRadioButtonSelected = formsPage.isFemaleSelected();
        Assert.assertTrue(isFemaleRadioButtonSelected, "Female radio button is not selected");
    }
}
