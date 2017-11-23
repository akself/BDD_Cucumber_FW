package com.dca.objects;

import com.dca.config.TestConfiguration;
import com.dca.utilities.Actions;
import com.dca.utilities.Screenshots;
import cucumber.api.java.gl.E;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


/**
 * Created by Mahendra.Singh on 7/7/2017.
 */
public class Reports_Page extends TestConfiguration {

    WebDriver driver = getDriver();

    @FindBy (xpath = "//*[@id=\"content\"]/div/div/ui-view/div[2]/div/div[3]/form/div[1]/div/div/div/select")
    private WebElement reportType;

    @FindBy (xpath ="//div/span[5]")
    private WebElement duration;

    @FindBy (xpath = "//button[contains(.,' Generate  ')]")
    private WebElement generateButton;

    @FindBy (xpath = "//a[contains(.,'10 Records Per Page')]")
    private WebElement recordsPerPage;

    @FindBy (xpath = "//translate[contains(.,'Reports Generator')]")
    private WebElement reportPage;

    @FindBy (xpath = "//h3[contains(.,' Generated Report ')]")
    private WebElement generatedOrNot;

    public Reports_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setReportPage()throws Exception{
        String text = reportPage.getText();
        String title = "Reports Generator";
        //System.out.println("Reports Generator Page"+ text);
        System.out.println((title.equals(text)) ? "Navigated to Reports Generator page " : "Could not Navigated to Reports Generator page");
        System.out.println("=======================================================================");
    }

    public void setGeneratedOrNot()throws Exception {
        String text = generatedOrNot.getText();
        String title = "Generated Report";
        //System.out.println("Reports Generator Page"+ text);
        System.out.println((title.equals(text)) ? "Report Generated " : "Could not Generate Report");
        System.out.println("=======================================================================");
    }


    public void setReportType(String reportTyp) throws Exception {
        com.dca.utilities.Actions.selectDDLVisibletext(reportType,reportTyp);
    }


    /*public void setReportType(String reportTyp) throws Exception {

        List<WebElement> dropReportType = reportType;

        for(WebElement el : dropReportType)
        {
            if(el.getText().equals(reportTyp))
            {
                el.click();
            }

        }

    }*/

    public void setDuration() throws Exception {
        duration.click();
    }

    public void setGenerateButton() throws Exception {
        generateButton.click();
    }

    public void setRecordsPerPage() throws Exception {
        recordsPerPage.click();
    }
}

