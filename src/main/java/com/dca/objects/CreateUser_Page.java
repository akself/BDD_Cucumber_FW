package com.dca.objects;

import com.dca.config.TestConfiguration;
import com.dca.utilities.GetData;
import com.dca.utilities.Screenshots;
import cucumber.api.DataTable;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

/**
 * Created by akbar.ayubkhan on 10/28/2016.
 */
public class CreateUser_Page extends TestConfiguration {
    public static String Oradriver = "oracle.jdbc.driver.OracleDriver";
    //public static String SITURL = "jdbc:oracle:thin:@cdtsdcpt-scan.rxcorp.com:1521/TDCPAD00.world";
    public static String UATURL = "jdbc:oracle:thin:@cdtsdcpu-scan.rxcorp.com:1521/UDCPAD00";
    public static String username = "DCA_DATA";
    public static String password = "DCA_DATA";

    WebDriver driver = getDriver();

    @FindBy(xpath = "//translate[contains(.,'Add New User')]")
    private WebElement add_user_text;

    @FindBy(name = "userName")
    private WebElement firstname;

    @FindBy(name = "userLastName")
    private WebElement lastname;

    @FindBy(id = "usedAddress")
    private WebElement country_dd;

    @FindBy(id = "usrAddressLine1")
    private WebElement address_line;

    @FindBy(id = "usrCityName1")
    private WebElement cityname;

    @FindBy(id = "usrZipPostCode1")
    private WebElement postcode;

    @FindBy(xpath = "//li/a[text()='Contact Details']")
    private WebElement contact_details;

    @FindBy(xpath = "//div/span[text()='Add Contact Details']")
    private WebElement add_contact_details;

    @FindBy(name = "contactType")
    private WebElement contact_type_DD;

    @FindBy(name = "contactValue")
    private WebElement valueTextBox;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/form/div[3]/div/div/input")
    private WebElement add_Contact_Btn;

    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/form/div[3]//input")
    private WebElement add_Role_Btn;

    //span[contains(.,'Add Role')]

    @FindBy(xpath = "//li/a[text()='Roles']")
    private WebElement roles;

    @FindBy(xpath = "//span[contains(.,'Add Role')]")
    private WebElement add_user_org;

    @FindBy(name = "organisation")
    private WebElement organisation;

    //@FindBy(xpath = "//strong[contains(.,'Test Organisation')]")
    @FindBy(xpath = "//h3[contains(.,'Add Role')]")
    private WebElement orgText;

    @FindBy(xpath = "//div[2]/div/select")
    private WebElement rolesDD;

    @FindBy(xpath = "//select[@name='role']/option")
    private List<WebElement> userrole_DD;

    @FindBy(xpath = "//translate[text()='Save']")
    private WebElement saveBtn;

    @FindBy(css = ".label.label-ims.ng-binding")
    private WebElement getID;


    public CreateUser_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void user_text() {
        System.out.println("======================================================\n");
        System.out.println(add_user_text.getText() + " is displayed under the Create user page \n");
        System.out.println("======================================================\n");
    }

    public void setFirstname(String first) {
        firstname.sendKeys(first);
    }

    public void setLastname(String last) {
        lastname.sendKeys(last);
    }

    public void setCountry_dd(String country) {
        Select sct = new Select(country_dd);
        sct.selectByVisibleText(country);
    }

    public void setAddress_line(String address) {

        address_line.sendKeys(address);
    }

    public void setCityname(String city) {

        cityname.sendKeys(city);
    }

    public void setPostcode(String post) {
        postcode.sendKeys(post);
    }

    public void setContact_details() {
        ((JavascriptExecutor) this.driver).executeScript("return arguments[0].click();", contact_details);
        //contact_details.click();
    }

    public void setAdd_contact_details() throws Exception {
        Thread.sleep(1500);
        add_contact_details.click();
    }

    public void setContact_type_DD(String contactDetails) {
        Select sct = new Select(contact_type_DD);
        sct.selectByVisibleText(contactDetails);
    }

    public void setValueTextBox(String value) {
        valueTextBox.sendKeys(value);
    }

    public void setAdd_Contact_Btn() throws Exception {
        Thread.sleep(1500);
        ((JavascriptExecutor) this.driver).executeScript("return arguments[0].click();", add_Contact_Btn);
        //add_Btn.click();
    }

    public void setRoles() throws Exception {
        Thread.sleep(1500);
        ((JavascriptExecutor) this.driver).executeScript("return arguments[0].click();", roles);
       // roles.click();
    }

    public void setAdd_user_org() {
        add_user_org.click();
    }

    public void setOrganisation(String Orgname) throws Exception {
        Thread.sleep(1000);
        organisation.sendKeys(Orgname);
        Thread.sleep(2000);
        organisation.sendKeys(Keys.ENTER);
    }

    public void setOrgText()throws Exception{
        orgText.click();
    }

    /*public void setUserrole_DD(String userrole) throws Exception {
        com.dca.utilities.Actions.selectDDLVisibletext(userrole_DD,userrole);
    }*/

    public void setrolesDD(){
        rolesDD.click();
    }
    public void setUserrole_DD(String userrole) throws Exception {

        List<WebElement> roles = userrole_DD;


        for(WebElement rolesList : roles)
        {
            if(rolesList.getText().contains(userrole))
            {
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", rolesList);
                rolesList.click();
            }

        }
    }

    public void setAdd_Role_Btn() throws Exception{
        add_Role_Btn.click();
    }

    public void setSaveBtn() throws Exception {
        Thread.sleep(500);
        saveBtn.click();
        System.out.println("======================================================\n");
        System.out.println("Successfully saved the User details\n");
    }

    public void setGetID() throws Exception {
        Thread.sleep(1500);
        String id = getID.getText();
        System.out.println("The ID for the newly created user is " + id);
        System.out.println("======================================================\n");
        Screenshots.captureScreenShot(driver, "14.New User Creation");

    }

    public void Oracle_User_Validation() throws Exception {

        Class.forName(Oradriver);
        Connection conn = DriverManager.getConnection(UATURL, username, password);

        Statement st = conn.createStatement();
        System.out.println("Connected to the Database");
        String id = getID.getText();
        String user_id=id.substring(9,id.length());
        String sqlStr = "select * from grr_party  where pers_id=('" + user_id + "')";
        //System.out.println(sqlStr);
        ResultSet rs = st.executeQuery(sqlStr);
        while (rs.next()) {
            String db_user_id = rs.getString("pers_id");
            System.out.println("The user_id from DB of the User is " + db_user_id);
        }
    }

}