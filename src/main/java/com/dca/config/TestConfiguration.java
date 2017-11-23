package com.dca.config;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import com.dca.utilities.*;
import org.testng.annotations.*;

/**
 * Created by akbar.ayubkhan on 10/28/2016.
 */

public class TestConfiguration {
    protected static WebDriver driver;

    protected WebDriver getDriver() {
        if (driver == null) {
            String browser_name = GetData.fromProperties("./Test Data/config.properties", "browser");

            if (browser_name.equals("FF")) {
                System.out.println("======================================================");
                System.out.println("Launching Firefox Browser");
                System.out.println("======================================================");
                System.setProperty("webdriver.gecko.driver", "./browser_drivers/geckodriver.exe");
                driver = new FirefoxDriver();
            } else if (browser_name.equals("GC")) {
                System.out.println("======================================================");
                System.out.println("Launching Chrome Browser");
                System.out.println("======================================================");
                System.setProperty("webdriver.chrome.driver", "./browser_drivers/chromedriver.exe");
                driver = new ChromeDriver();
            } else if (browser_name.equals("IE")) {
                System.out.println("======================================================");
                System.out.println("Launching IE Browser");
                System.out.println("======================================================");
                System.setProperty("webdriver.ie.driver", "./browser_drivers/IEDriverServer.exe");
                driver = new InternetExplorerDriver();
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
        return driver;
    }
}
