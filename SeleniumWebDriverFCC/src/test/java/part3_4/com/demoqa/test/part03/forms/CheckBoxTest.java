package part3_4.com.demoqa.test.part03.forms;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class CheckBoxTest extends BaseTest {



    @Test
    public void testCheckbox() {
        var formsPage = homePage.gotoForms().clickPracticeForms();
        formsPage.clickSportsCheckbox();
        formsPage.clickReadingCheckbox();
        formsPage.clickMusicCheckbox();
        formsPage.unclickReadingCheckbox();


        boolean isReadingCheckBoxSelected = formsPage.isReadingSelected();

        Assert.assertFalse(isReadingCheckBoxSelected, "\n Reading checkbox Is Selected \n");

    }




}
