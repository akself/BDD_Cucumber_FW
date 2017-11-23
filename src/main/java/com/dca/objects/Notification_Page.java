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

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;


/**
 * Created by Mahendra.Singh on 7/20/2017.
 */
public class Notification_Page extends TestConfiguration {
    public static String Oradriver = "oracle.jdbc.driver.OracleDriver";
    public static String SITURL = "jdbc:oracle:thin:@cdtsdcpt-scan.rxcorp.com:1521/TDCPAD00.world";
    //public static String UATURL = "jdbc:oracle:thin:@cdtsdcpu-scan.rxcorp.com:1521/UDCPAD00";
    public static String username = "DCA_DATA";
    public static String password = "DCA_DATA";

    WebDriver driver = getDriver();

    @FindBy(xpath="//input[@ims-input='Organisation Name']")
    private WebElement srchOrgNm;

    @FindBy(xpath="//tr[1]/td[7]/div[1]/i")
    private WebElement modifyOrg;

    @FindBy(xpath="//translate[contains(.,'Modify Organisation')]")
    private WebElement modifyOrgPage;

    @FindBy(xpath="//a[contains(.,'Notifications')]")
    private WebElement notificationTab;

    @FindBy(xpath="//button[contains(.,' Add Notification ')]")
    private WebElement addNotificationBtn;

    @FindBy(xpath="//translate[contains(.,'Add Notification For Organisation')]")
    private WebElement addNotificationPage;

    @FindBy(xpath="//select[@name='scenario']")
    private WebElement scenario;

    @FindBy(xpath="//select[@name='group']")
    private WebElement evntGroup;

    @FindBy(xpath="//select[@name='eventCategory']")
    private WebElement evntCtgry;

    @FindBy(xpath="//select[@name='eventType']")
    private WebElement evntType;

    @FindBy(xpath="//select[@name='deliveryMethod']")
    private WebElement deliveryMethod;

    @FindBy(xpath="//select[@name='contentType']")
    private WebElement contentType;

    @FindBy(xpath="//select[@name='fileType']")
    private WebElement fileType;

    @FindBy(xpath="//input[@name='schedulerStartDate']")
    private WebElement SchduleStartDate;

    @FindBy(xpath = "//div/label/span/translate")
    private WebElement endDateCheckBox;

    @FindBy(xpath="//input[@name='schedulerEndDate']")
    private WebElement SchduleEndDate;

    @FindBy(xpath="//select[@name='schedulerType']//option")
    //private WebElement SchdulerType;
    private List<WebElement> SchdulerType;

    @FindBy(xpath="//select[@name='schedulerTimeZone']//option")
    //private WebElement SchduleTimeZone;
    private List<WebElement> SchduleTimeZone;

    @FindBy(xpath="//table/thead/tr/th[1]/input")
    private WebElement userCheckBox;

    @FindBy(xpath = "//button[1]/translate")
    private WebElement saveNotification;

    @FindBy(xpath = "//translate[contains(.,'Preview Notification For Organisation')]")
    private WebElement prviewNotifPage;

    @FindBy(xpath = "//h3/small/span")
    private WebElement modifedOrgId;

    @FindBy(xpath = "//table/tbody/tr/td[4]/div/button[2]")
    private WebElement previewNotificationBtn;

    @FindBy(xpath = "//h3/small/span[1]")
    private WebElement notificationID;

    @FindBy(xpath = "//translate[contains(.,'Cancel')]")
    private WebElement cancelNotificaitonBtn;

    public Notification_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setSrchOrgNm(String orgNm) throws Exception {
        srchOrgNm.sendKeys(orgNm);
    }

    public void setModifyOrg() throws Exception{
        modifyOrg.click();
    }

    public void setModifyOrgPage() throws Exception{
        String text = modifyOrgPage.getText();
        String title = "Modify Organisation";
        System.out.println((title.equals(text)) ? "Navigated to Modify Organisation page " : "Could not Navigated to Modify Organisation page");
        System.out.println("=======================================================================\n");

    }

    public void setNotificationTab() throws Exception{
        notificationTab.click();
    }

    public void setAddNotificationBtn() throws Exception{
        addNotificationBtn.click();
    }

    public void setAddNotificationPage() throws Exception{
        String text = addNotificationPage.getText();
        String title = "Add Notification For Organisation";
        System.out.println((title.equals(text)) ? "Navigated to Add Notification For Organisation page " : "Could not Navigated to Add Notification For Organisation page");
        System.out.println("=======================================================================\n");


    }

    public void setScenario(String scnario) throws Exception{
        com.dca.utilities.Actions.selectDDLVisibletext(scenario,scnario);

    }

    public void setEvntGroup(String evntgrp) throws Exception{
        com.dca.utilities.Actions.selectDDLVisibletext(evntGroup,evntgrp);

    }

    public void setEvntCtgry(String evntctgry) throws Exception{
        com.dca.utilities.Actions.selectDDLVisibletext(evntCtgry,evntctgry);

    }

    public void setEvntType(String eventType) throws Exception{
        com.dca.utilities.Actions.selectDDLVisibletext(evntType,eventType);
    }

    public void setDeliveryMethod(String dlvryMethod) throws Exception{
        com.dca.utilities.Actions.selectDDLVisibletext(deliveryMethod,dlvryMethod);
    }

    public void setContentType(String contentTyp) throws Exception{
        com.dca.utilities.Actions.selectDDLVisibletext(contentType,contentTyp);
    }

    public void setFileType(String filetyp) throws Exception{
        com.dca.utilities.Actions.selectDDLVisibletext(fileType,filetyp);
    }

    public void setSchduleStartDate(String startDate) throws Exception{
        SchduleStartDate.clear();
        SchduleStartDate.sendKeys(startDate);

    }

    public void setEndDateCheckBox(){
        endDateCheckBox.click();
    }

    public void setSchduleEndDate(String endDate) throws Exception{
        SchduleEndDate.sendKeys(endDate);

    }

    /*public void setSchdulerType(String schdulerType) throws Exception{

        com.dca.utilities.Actions.selectDDLVisibletext(SchdulerType,schdulerType);

    }*/

    public void setSchdulerType(String schdulerType) throws Exception {


        List<WebElement> schedules = SchdulerType;

        for(WebElement el : schedules)
        {
            if(el.getText().contains(schdulerType))
            {
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", el);
                el.click();
            }

        }

    }

    public void setSchduleTimeZone(String timeZone) throws Exception {


        List<WebElement> timezones = SchduleTimeZone;

        for(WebElement el : timezones)
        {
            if(el.getText().contains(timeZone))
            {
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", el);
                el.click();
            }

        }

    }


    public void setUserCheckBox() throws Exception{
        userCheckBox.click();

    }

    public void setSaveNotification() throws Exception{
        Screenshots.captureScreenShot(driver, "21.Notification Add");
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", saveNotification);
        saveNotification.click();

    }

    public void Oracle_NotificationId_Validation() throws Exception {
        System.out.println("*--Validating the newly added notification from the DataBase--*");
        Class.forName(Oradriver);
        Connection conn = DriverManager.getConnection(SITURL, username, password);
        System.out.println("Connected to the Database");
        Statement st = conn.createStatement();
        //Copying org id from modify org page
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", modifedOrgId);
        String modified_org_id = modifedOrgId.getText();
        String Org_id=modified_org_id.substring(17,modified_org_id.length());
        //System.out.println("Org_id"+ Org_id);
        notificationTab.click();
        Thread.sleep(1000);
        //Copying Notification id from modify notification page
        previewNotificationBtn.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", prviewNotifPage);
        String text = prviewNotifPage.getText();
        String title = "Preview Notification For Organisation";
        System.out.println((title.equals(text)) ? "Navigated to Preview Notification For Organisation page " : "Could not Navigated to Preview Notification For Organisation page");
        System.out.println("=======================================================================\n");
        String notif_id=notificationID.getText();
        //System.out.println("notifId"+ notif_id);
        String notification_id=notif_id.substring(17,notif_id.length());
        //System.out.println("notification_id"+ notification_id);
        String sqlStr = "select * from (select * from DC_NOTIF_EVNT_org_CONFIG where act_ind='1' and org_Id='" + Org_id + "' ORDER BY Notif_EVNT_org_Config_Id desc) where ROWNUM = 1";
        System.out.println(sqlStr);
        ResultSet rs = st.executeQuery(sqlStr);
        while (rs.next()){
            String db_notification_ID = rs.getString("NOTIF_EVNT_ORG_CONFIG_ID");
            System.out.println("\n The ID of the newly added notification from DataBase is " + db_notification_ID);
            System.out.println("\nThe ID of the newly added notification from UI is " + notification_id);
            System.out.println("\n======================================================");
            System.out.println((db_notification_ID.equals(notification_id)) ? "Notification added to  Organisation " : "Could not add notification for Organisation");

        }
    }


}

