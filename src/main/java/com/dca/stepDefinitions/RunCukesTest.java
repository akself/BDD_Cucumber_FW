package com.dca.stepDefinitions;


/**
 * Created by Mahendra.Singh on 8/10/2017.
 */


import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import java.io.File;

import static com.dca.utilities.Screenshots.*;


/**
 * A sample test to demonstrate
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "Features",
        glue = {"com.dca.stepDefinitions"},
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:reports/ExtentReport.html"}
)

public class RunCukesTest {


    @AfterClass
    public static void reportSetup()  throws Exception{
        Reporter.loadXMLConfig(new File("extent-config.xml"));
        Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
        Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
        Reporter.setSystemInfo("64 Bit", "Windows 8");
        Reporter.setSystemInfo("2.53.0", "Selenium");
        Reporter.setSystemInfo("3.3.9", "Maven");
        Reporter.setSystemInfo("1.8.0_121", "Java Version");
        Reporter.addScreenCaptureFromPath("ScreenShots");

    }
}
