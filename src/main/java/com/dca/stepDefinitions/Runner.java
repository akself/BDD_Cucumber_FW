package com.dca.stepDefinitions;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.File;

/**
 * Created by akbar.ayubkhan on 10/28/2016.
 */
//"json:target/cucumber.json", "html:target/default-cucumber-html-reports/cucumber-pretty",

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features",
                 glue = {"com.dca.stepDefinitions"},
                 plugin = {"com.cucumber.listener.ExtentCucumberFormatter:reports/ExtentReport.html"}
                )



public class Runner extends AbstractTestNGCucumberTests {



    @AfterClass
    public static void reportSetup() {
        Reporter.loadXMLConfig(new File("C:\\Panel_Management_Automation\\DCA_Cucumber\\extent-config.xml"));
        Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
        Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
        Reporter.setSystemInfo("64 Bit", "Windows 8");
        Reporter.setSystemInfo("2.53.0", "Selenium");
        Reporter.setSystemInfo("3.3.9", "Maven");
        Reporter.setSystemInfo("1.8.0_121", "Java Version");
    }
}