package com.dca.objects;

import com.dca.config.TestConfiguration;
import com.dca.utilities.Screenshots;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by akbar.ayubkhan on 10/28/2016.
 */
public class Home_Page extends TestConfiguration
{
    WebDriver driver = getDriver();

    @FindBy(css = ".hamburger-wrapper.pull-left")
    private WebElement manage_panel;

    @FindBy(xpath="//a[@id='usersMenuLink']")
    private WebElement userTab;

    @FindBy(xpath = "//a[@id='organisationsMenuLink']")
    private WebElement organisationTab;

    @FindBy(xpath = "//a[@id='applicationRolesMenuLink']")
    private  WebElement appRoleMenuLink;

    @FindBy(xpath = "//a[@id='applicationUsersMenuLink']")
    private WebElement appUserMenuLink;

    @FindBy (xpath ="//a[@id='reportsMenuLink']")
    private  WebElement reportsLink;

    @FindBy(xpath = "//a[@id='installationsMenuLink']")
    private WebElement installationsMenuLink;

    public Home_Page(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void get_title() throws Exception
    {
        String title = driver.getTitle();
        System.out.println("======================================================");
        System.out.println("The title of the home page is " + title  );
        Thread.sleep(500);
        Screenshots.captureScreenShot(driver,"2.HomePage");
    }

    public void setManage_panel() throws Exception
    {
        Thread.sleep(1000);
        manage_panel.click();
    }
    public void setUserTab() throws Exception
    {
        Thread.sleep(1000);
        userTab.click();
        Thread.sleep(1000);
        Screenshots.captureScreenShot(driver,"3.Users Page");
    }

    public void setOrganisation_link() throws Exception
    {
        Thread.sleep(1000);
        organisationTab.click();
        Thread.sleep(1000);
        Screenshots.captureScreenShot(driver,"4.Organisation Page");
    }

    public void setAppRoleMenuLink()throws Exception {
        Thread.sleep(1000);
        appRoleMenuLink.click();
        Thread.sleep(1000);
        Screenshots.captureScreenShot(driver,"5.Application Role Page");
    }

    public void setAppUserMenuLink() throws Exception {
        Thread.sleep(1000);
        appUserMenuLink.click();
        Thread.sleep(1000);
        Screenshots.captureScreenShot(driver,"6.Application User Page");
    }

    public void setReportsLink() throws Exception {
        Thread.sleep(1000);
        reportsLink.click();
        Thread.sleep(1000);
        Screenshots.captureScreenShot(driver,"7.Reports Page");
    }

    public void setInstallationsMenuLink() throws Exception {
        Thread.sleep(1000);
        installationsMenuLink.click();
        Thread.sleep(1000);
        Screenshots.captureScreenShot(driver,"8.Installation Page");
    }
}