package com.dca.stepDefinitions;

import com.dca.config.TestConfiguration;
import com.dca.utilities.Screenshots;
import cucumber.api.java.Before;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
import cucumber.api.java.bm.Bagi;
import org.apache.commons.io.FileUtils;
import com.dca.objects.*;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import org.openqa.selenium.internal.selenesedriver.TakeScreenshot;
import org.testng.annotations.BeforeTest;

/**
 * Created by Mahendra.Singh on 7/7/2017.
 */
public class Reports_Test  extends TestConfiguration {
    WebDriver driver = getDriver();
    Home_Page home_page = new Home_Page(driver);
    Reports_Page reports_page=new Reports_Page(driver);
    Login_Page login_page = new Login_Page(driver);

    @Given("^User clicks on Reports link$")
    public void user_clicks_on_Reports_link() throws Exception {

        home_page.setReportsLink();
    }

    @Then("^Report generation page should be displayed$")
    public void report_generation_page_should_be_displayed() throws Exception {
        reports_page.setReportPage();
        Thread.sleep(2000);
    }

    @Then("^Select \"([^\"]*)\" from report type drop down$")
    public void select_from_report_type_drop_down(String reportTyp) throws Exception {
        reports_page.setReportType(reportTyp);
        reports_page.setDuration();
        Thread.sleep(2000);
    }

    @Then("^click generate report button$")
    public void click_generate_report_button() throws Exception {
        reports_page.setGenerateButton();
    }


    @And("^select records per page$")
    public void selectRecordsPerPage() throws Exception {
        reports_page.setRecordsPerPage();
        Thread.sleep(3000);
    }

    @And("^validate report generated or not$")
    public void validateReportGeneratedOrNot() throws Exception {
        reports_page.setGeneratedOrNot();
    }

}
