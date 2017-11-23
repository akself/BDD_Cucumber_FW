package com.dca.stepDefinitions;

import com.dca.config.TestConfiguration;
import com.dca.objects.Home_Page;
import com.dca.objects.Notification_Page;
import com.dca.objects.Organisation_Page;
import com.dca.objects.User_Page;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

/**
 * Created by Mahendra.Singh on 7/20/2017.
 */
public class Notification_Test extends TestConfiguration {

    WebDriver driver = getDriver();
    Home_Page home_page = new Home_Page(driver);
    Notification_Page notification_page=new Notification_Page(driver);

    @When("^Enter  \"([^\"]*)\"$")
    public void enter(String arg1) throws Exception {
        notification_page.setSrchOrgNm(arg1);
    }

    @Then("^click on Modify org option$")
    public void click_on_Modify_org_option() throws Exception {
        notification_page.setModifyOrg();
    }

    @Then("^Modify Organisation page should display$")
    public void modify_Organisation_page_should_display() throws Exception {
        notification_page.setModifyOrgPage();
    }

    @Then("^click on Notification tab$")
    public void click_on_Notification_tab() throws Exception {
        notification_page.setNotificationTab();
    }

    @Then("^click AddNotification button$")
    public void click_AddNotification_button() throws Exception {
        notification_page.setAddNotificationBtn();
    }

    @Then("^Add Notification For Organisation page should be displayed$")
    public void add_Notification_For_Organisation_page_should_be_displayed() throws Exception {
        notification_page.setAddNotificationPage();
    }

    @Then("^enter \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void enter(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7) throws Exception {
        notification_page.setScenario(arg1);
        Thread.sleep(1000);
        notification_page.setEvntGroup(arg2);
        Thread.sleep(1000);
        notification_page.setEvntCtgry(arg3);
        Thread.sleep(1000);
        notification_page.setEvntType(arg4);
        Thread.sleep(1000);
        notification_page.setDeliveryMethod(arg5);
        Thread.sleep(1000);
        notification_page.setContentType(arg6);
        Thread.sleep(1000);
        notification_page.setFileType(arg7);
        Thread.sleep(1000);
    }

    @Then("^select scedule using \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
    public void select_scedule_using(String arg1, String arg2, String arg3, String arg4) throws Exception {
        notification_page.setSchduleStartDate(arg1);
        notification_page.setEndDateCheckBox();
        notification_page.setSchduleEndDate(arg2);
        notification_page.setSchdulerType(arg3);
        Thread.sleep(1000);
        notification_page.setSchduleTimeZone(arg4);
        Thread.sleep(1000);
    }

    @Then("^assign user by slecting from assigned users list$")
    public void assign_user_by_slecting_from_assigned_users_list() throws Exception {
        notification_page.setUserCheckBox();
    }

    @Then("^click on save notification button$")
    public void click_on_save_notification_button() throws Exception {
        notification_page.setSaveNotification();
        Thread.sleep(2000);
    }

    @And("^validate notification id with database$")
    public void validateNotificationIdWithDatabase() throws Exception {
        Thread.sleep(2000);
        notification_page.Oracle_NotificationId_Validation();
    }
}
