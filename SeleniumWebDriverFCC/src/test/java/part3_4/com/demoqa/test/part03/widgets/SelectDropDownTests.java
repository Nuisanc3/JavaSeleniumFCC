package part3_4.com.demoqa.test.part03.widgets;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

import java.util.List;

public class SelectDropDownTests extends BaseTest {


    @Test
    public void testMultiSelectDropDown() {
    var selectMenuPage = homePage.gotoWidgets().clickSelectMenu();
    selectMenuPage.selectStandardMulti("Volvo");
    selectMenuPage.selectStandardMulti(1);
    selectMenuPage.selectStandardMulti("Audi");
    selectMenuPage.selectStandardMulti(2);

    selectMenuPage.deSelectStandardMulti("saab");
    List<String> actualSelectedOptions = selectMenuPage.getAllSelectedStandardMultiOptions();

    Assert.assertTrue(actualSelectedOptions.contains("Volvo"));
    Assert.assertTrue(actualSelectedOptions.contains("Opel"));
    Assert.assertFalse(actualSelectedOptions.contains("Saab"));
    Assert.assertTrue(actualSelectedOptions.contains("Audi"));

    }

}








