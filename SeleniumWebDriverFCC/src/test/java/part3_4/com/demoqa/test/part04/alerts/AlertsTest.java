package part3_4.com.demoqa.test.part04.alerts;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

import static utility.SwitchToUtility.*;


@Test
public class AlertsTest extends BaseTest {



    public void testInformationAlert(){
        String expectedAlertText = "You clicked a button";
       var alertsPage = homePage.goToAlertsFramesWindowsCard().clickAlerts();
       alertsPage.clickIntormationAlertButton();
        Assert.assertEquals(getAlertText(), expectedAlertText, "\n Actual and Expected messages do not match \n ");
        acceptAlert();
    }


    public void testConfirmationAlert() {

        var alertsPage = homePage.goToAlertsFramesWindowsCard().clickAlerts();
        alertsPage.clickConfirmationAlertButton();
        dismissAlert();
        String actualConfirmationResult = alertsPage.getConfirmationResult();
        String expectedConfirmationResult = "You selected Cancel";
        Assert.assertEquals(actualConfirmationResult, expectedConfirmationResult, "\n You did not select Cancel \n");


    }
}
