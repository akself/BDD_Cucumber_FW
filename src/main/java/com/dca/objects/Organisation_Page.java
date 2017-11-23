package com.dca.objects;

import com.dca.config.TestConfiguration;
import com.dca.utilities.GetData;
import com.dca.utilities.Screenshots;
import cucumber.api.java.ca.I;
import gherkin.lexer.Ca;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by akbar.ayubkhan on 10/28/2016.
 */
public class Organisation_Page extends TestConfiguration {
    public static String Oradriver = "oracle.jdbc.driver.OracleDriver";
    //public static String SITURL = "jdbc:oracle:thin:@cdtsdcpt-scan.rxcorp.com:1521/TDCPAD00.world";
    public static String UATURL = "jdbc:oracle:thin:@cdtsdcpu-scan.rxcorp.com:1521/UDCPAD00";
    public static String username = "DCA_DATA";
    public static String password = "DCA_DATA";

    WebDriver driver = getDriver();

    @FindBy(xpath = "//translate[text()='Organisations']")
    private WebElement org_text;


    @FindBy(xpath = "(//td)[4]")
    private WebElement capturecountry_text;

    @FindBy(xpath = "(//translate[text()='Actions'])[1]")
    private WebElement actionsBtn;

    @FindBy(xpath = "(//translate[text()='Preview'])[1]")
    private WebElement previewBtn;

    @FindBy(xpath = "//translate[text()='Organisation preview']")
    private WebElement org_preview;

    @FindBy(xpath = "//translate[contains(.,'Add New')]")
    private WebElement add_orgBtn;

    @FindBy(name = "organisationContactType")
    private WebElement Org_type_DD;

    @FindBy(name = "organisationName")
    private WebElement OrgName;

    @FindBy(name = "organisationStatus")
    private WebElement Org_Status_DD;

    @FindBy(xpath = "//a[contains(.,'Contact Details')]")
    private WebElement ContactTab;

    @FindBy(id = "externalId")
    private WebElement ims_ID_RB;

    @FindBy(xpath = "//input[@name='externalID']")
    private WebElement ims_identifier;

    @FindBy(xpath = "//span[text()='Add Contact Details']")
    private WebElement addContactDetails;

    @FindBy(name = "contactType")
    private WebElement ContactTypeDD;

    @FindBy(name = "primaryMailContactType")
    private WebElement value;

    @FindBy(xpath = "//translate[text()='Add']")
    private WebElement addBtn;

    @FindBy(xpath = "//a[text()='Addresses']")
    private WebElement addressTab;

    @FindBy(xpath = "//span[text()='Add Address']")
    private WebElement addAddress;

    @FindBy(name = "organisationCountry")
    private WebElement country_DD;

    @FindBy(name = "organisationAddress1")
    private WebElement address_line;

    @FindBy(xpath = "//input[contains(@ims-input,'City Name')]")
    private WebElement city_name;

    @FindBy(name = "organisationZipPostCode")
    private WebElement post_code;

    @FindBy(name = "organisationLocationStatus")
    private WebElement Location_Status_DD;

    @FindBy(xpath = "//input[@name='primaryChckBox']")
    private WebElement primary_Address;

    @FindBy(xpath = "//input[@value='Add']")
    private WebElement addBtn_1;

    @FindBy(xpath = "//translate[text()='Save']")
    private WebElement saveBtn;

    @FindBy(xpath = "//span[@class='label label-ims ng-binding']")
    private WebElement getIDorg;

    @FindBy(xpath = "//translate[contains(.,'Cancel')]")
    private WebElement backBtn;

    @FindBy(xpath = "(//translate[text()='Modify'])[1]")
    private WebElement modifyBtn;

    @FindBy(xpath = "(//button[2])[2]")
    private WebElement deleteBtn;

    @FindBy(xpath = "//i[contains(@class,'fa fa-pencil')]")
    private  WebElement editPencil;

    public Organisation_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setOrg_text() {
        System.out.println("======================================================");
        System.out.println(org_text.getText() + " is displayed under the Organisation home page ");
        System.out.println("======================================================");
    }

    public void org_home() {
        System.out.println(" User is under the Organisation Page ");
    }

    public void setCapturecountry_text() throws Exception {
        System.out.println("=========================================");
        Thread.sleep(2000);
        System.out.println(capturecountry_text.getText() + " is displayed under the Organisation search results page");
        System.out.println("=========================================");
    }

    public void setActionsBtn() throws Exception {
        Thread.sleep(1000);
        actionsBtn.click();
    }

    public void setPreviewBtn() throws Exception {
        Thread.sleep(1000);
        previewBtn.click();
        Thread.sleep(1000);
    }

    public void setOrg_preview() throws Exception {
        Screenshots.captureScreenShot(driver, "9.Organisation Preview Page");
        System.out.println(org_preview.getText() + " is displayed under the Organisation preview page ");
        System.out.println("===========================================================================================");
    }

    public void setAdd_orgBtn() throws Exception {
        add_orgBtn.click();
        System.out.println(".....Adding New Organisation...");
    }

    public void setOrg_type_DD(String OrgTypeDD) {
        Select sct = new Select(Org_type_DD);
        sct.selectByVisibleText(OrgTypeDD);
    }

    public void setOrgName(String Orgname) {
        OrgName.sendKeys(Orgname);
    }

    public void setOrg_Status_DD(String OrgStatusDD) {
        Select sct = new Select(Org_Status_DD);
        sct.selectByVisibleText(OrgStatusDD);
    }

    public void setContactTab() {

        //ContactTab.click();
        ((JavascriptExecutor) this.driver).executeScript("return arguments[0].click();", ContactTab);
    }

    public void setIms_ID_RB() throws Exception {
        Thread.sleep(2000);
        ims_ID_RB.click();
    }

    public void setIms_identifier(String Identifier) throws Exception {
        Thread.sleep(1000);
        ims_identifier.sendKeys(Identifier);
    }

    public void setAddContactDetails() {
        addContactDetails.click();
    }

    public void setContactTypeDD(String ContactType) {
        Select sct = new Select(ContactTypeDD);
        sct.selectByVisibleText(ContactType);
    }

    public void setValue(String Contactvalue) {
        value.sendKeys(Contactvalue);
    }

    public void setAddBtn() {
        addBtn.click();
    }

    public void setAddressTab() {
        addressTab.click();
    }

    public void setAddAddress() throws Exception {
        Thread.sleep(1500);
        addAddress.click();
    }

    public void setCountry_DD(String country) {
        Select sct = new Select(country_DD);
        sct.selectByVisibleText(country);
    }

    public void setAddress_line(String Address) {
        address_line.sendKeys(Address);
    }

    public void setCity_name(String Cityname) {
        city_name.clear();
        city_name.sendKeys(Cityname);
    }

    public void setPost_code(String PostCode) {
        post_code.sendKeys(PostCode);
    }

    public void setLocation_Status_DD(String locationStatus) {
        Select sct = new Select(Location_Status_DD);
        sct.selectByVisibleText(locationStatus);
    }

    public void setPrimary_Address() throws Exception {
        primary_Address.click();
    }

    public void setAddBtn_1() throws Exception {
        addBtn_1.click();
    }

    public void setSaveBtn() throws Exception {
        Thread.sleep(2000);
        saveBtn.click();
        System.out.println("======================================================");
        System.out.println("====Organisation Created Successfully====");
        Screenshots.captureScreenShot(driver, "10.Organisation Created Successfully");
    }

    public void setGetIDorg() throws Exception {
        String org_id = getIDorg.getText();
        System.out.println("==The ID for the newly created organisation is== " + org_id  );
        System.out.println("======================================================");
        Screenshots.captureScreenShot(driver, "8.New Organisation Creation");
        Thread.sleep(1000);
    }

    public void setVerifyOrg() {
        String org_id1 = getIDorg.getText();
        String org_id2 = getIDorg.getText();
        Assert.assertEquals(org_id1, org_id2);
        System.out.println("The newly created organisation and modifying organsation ID matches and the ID is " + getIDorg.getText());
    }

    public void Oracle_Org_Validation() throws Exception {
        System.out.println("Validating the newly created Organisation from the DataBase...");
        Class.forName(Oradriver);
        Connection conn = DriverManager.getConnection(UATURL, username, password);
        System.out.println("Connected to the Database");
        Statement st = conn.createStatement();
        String id = getIDorg.getText();
        String org_id=id.substring(17,id.length());
        String sqlStr = "select * from DC_ORG where org_id='" + org_id + "'";
        System.out.println(sqlStr);

        ResultSet rs = st.executeQuery(sqlStr);
        while (rs.next()) {
            String db_org_id = rs.getString("org_id");
            System.out.println("The org_id of the newly created Organisation from DataBase is " + db_org_id);
            System.out.println("======================================================");
        }
    }

    public void setBackBtn() {
        backBtn.click();
    }

    public void  setEditPencil(){editPencil.click();}



    public void setModifyBtn() {
        modifyBtn.click();
        System.out.println("======================================================");
        System.out.println("Modifying newly created Organisation....");
    }


}