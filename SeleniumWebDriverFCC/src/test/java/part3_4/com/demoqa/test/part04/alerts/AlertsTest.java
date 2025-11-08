package part3_4.com.demoqa.test.part04.alerts;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

import static utility.SwitchToUtility.*;

public class AlertsTest extends BaseTest {


    @Test
    public void testInformationAlert(){
        String expectedAlertText = "You clicked a button";
       var alertsPage = homePage.goToAlertsFramesWindowsCard().clickAlerts();
       alertsPage.clickIntormationAlertButton();
        Assert.assertEquals(getAlertText(), expectedAlertText, "\n Actual and Expected messages do not match \n ");
        acceptAlert();
    }
}
