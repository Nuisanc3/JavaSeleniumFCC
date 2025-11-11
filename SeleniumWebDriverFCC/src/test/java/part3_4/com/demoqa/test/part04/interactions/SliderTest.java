package part3_4.com.demoqa.test.part04.interactions;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class SliderTest extends BaseTest {


    @Test
    public void testSliderResult() {
        int x = 180;
        int y = 0;
       var sliderPage =  homePage.gotoWidgets().clickSlider();
       sliderPage.moveSlider(x , y);
       String actualValue = sliderPage.getSliderValue();
       String expectedValue = "85";
        Assert.assertEquals(actualValue, expectedValue, "\n Actual and Expected values do not match\n");

    }
}
