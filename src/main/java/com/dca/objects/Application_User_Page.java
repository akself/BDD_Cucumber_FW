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
public class Application_User_Page extends TestConfiguration {

    WebDriver driver = getDriver();
    WebDriverWait wait = new WebDriverWait(driver,30);

    @FindBy (xpath = "//h3[contains(.,'Application Users')]")
    private  WebElement appUserPage;

    @FindBy (xpath = "//translate[contains(.,'Add New')]")
    private  WebElement addNewUserBtn;

    @FindBy (xpath = "//translate[contains(.,'Add Application User')]")
    private  WebElement addAppUserPage;

    @FindBy (xpath="//input[@name='searchAd']")
    private WebElement searchAD;

    //@FindBy (xpath = "//a[@title='Mahendra Singh']")
    @FindBy(xpath = "//a[@ng-attr-title='{{match.label}}']")
    private WebElement userAD;

    @FindBy (xpath = "//multiselect/div/button")
    private WebElement rolesDD;

    @FindBy(xpath = "//input[@placeholder='Search...']")
    private WebElement searchRoles;

    @FindBy (xpath = "//multiselect/div/ul/li")
    private List<WebElement> rolesList;

    @FindBy (xpath = "//search-app-users//multiselect/div/button")
    private WebElement searchRolesDD;

    @FindBy(xpath ="//search-app-users//multiselect/div/ul/li")
    private List<WebElement> SearchrolesList;

    @FindBy (xpath = "//select[@name='country']")
    private WebElement assignCntry;

    @FindBy (xpath = "//country-domain/div/div[2]/select-input/select")
    private WebElement assignDomain;

    @FindBy (css = ".btn.btn-ims")
    private WebElement addCtryDmn;

    @FindBy (css = ".btn.btn-primary.ng-scope")
    private WebElement saveUser;

    @FindBy (xpath = "//translate[contains(.,'Preview Application User')]")
    private  WebElement previewUserPage;

    @FindBy (xpath = "//button[@ui-sref='searchAppUsers']")
    private  WebElement cancelUSerPrevButton;

    @FindBy (xpath = "//search-app-users//text-input/input")
    private WebElement searchUser;

    @FindBy (xpath ="//select[@name='country']")
    private WebElement searchUserCntry;

    @FindBy (xpath ="//select[@name='dataDomain']")
    private WebElement searchUserDmn;

    @FindBy (xpath = "//button[contains(.,' Search  ')]")
    private WebElement searchUserButton;

    @FindBy (xpath = "//table/tbody/tr/td[1]")
    private WebElement searchedUser;

    @FindBy (xpath = "//search-app-users//label/translate")
    private WebElement roleLabel;

    public Application_User_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setAppUserPage()throws Exception{
        String text = appUserPage.getText();
        String title = "Application Users";
        //System.out.println("Application Users page"+ text);
        System.out.println((title.equals(text)) ? "Navigated to Application Users page " : "Could not Navigated to Application Users page");
        System.out.println("=======================================================================");
    }

    public void setAddNewUserBtn() throws Exception {
        addNewUserBtn.click();
    }

    public void setAddAppUserPage()throws Exception{
        String text = addAppUserPage.getText();
        String title = "Add Application User";
        //System.out.println("Add Application User"+ text);
        System.out.println((title.equals(text)) ? "Navigated to Add Application User page " : "Could not Navigated to Add Application User page");
        System.out.println("=======================================================================");
    }

    public void setSearchAD(String UserName)throws Exception {
        searchAD.sendKeys(UserName);

    }

    public void setUserAD() throws Exception {
        userAD.click();
    }

    public void setRolesDD() throws Exception {
        rolesDD.click();
    }

    public void setSearchRolesDD() throws Exception {
        searchRolesDD.click();
    }

    public void setSearchRolesList(String srchRoles) throws Exception {

        List<WebElement> dropRoles = SearchrolesList;

        for(WebElement el : dropRoles)
        {
            if(el.getText().equals(srchRoles))
            {
                el.click();
            }

        }

    }

    public void setSearchRoles(String role){
        searchRoles.sendKeys(role);
    }

    public void setRolesList(String role) throws Exception {

        List<WebElement> drpRoles = rolesList;


        for(WebElement el : drpRoles)
        {
            System.out.println(el.getText());
            if(el.getText().equals(role))
            {
                el.click();
            }

        }

    }

    public void setAssignCntry(String Country) throws Exception {
        com.dca.utilities.Actions.selectDDLVisibletext(assignCntry, Country);
    }

    public void setAssignDomain(String DataDomain) throws Exception {
        com.dca.utilities.Actions.selectDDLVisibletext(assignDomain, DataDomain);
    }


    public void setAddCtryDmn() throws Exception {
        addCtryDmn.click();
    }

    public void setSaveUser() throws Exception {
        saveUser.click();
    }

    public void setPreviewAppRolePage() throws Exception {
        String text = previewUserPage.getText();
        String title = "Preview Application User";
        //System.out.println("Preview Application User"+ text);
        System.out.println((title.equals(text)) ? "Navigated to Preview Application User page " : "Could not Navigated to Preview Application User page");
        System.out.println("=======================================================================");
        Screenshots.captureScreenShot(driver, "17.New User creation");
    }

    public void setCancelUSerPrevButton() throws Exception {
        cancelUSerPrevButton.click();
    }

    public void setSearchUser(String srchUser) throws Exception {
        ((JavascriptExecutor) this.driver).executeScript("arguments[0].click;", searchUser);
         searchUser.sendKeys(srchUser);
    }

    public void setSearchUserCntry(String Country) throws Exception {
        com.dca.utilities.Actions.selectDDLVisibletext(searchUserCntry, Country);
    }

    public void setSearchUserDmn(String DataDmn) throws Exception {
        com.dca.utilities.Actions.selectDDLVisibletext(searchUserDmn, DataDmn);
    }

    public void setSearchUserButton() throws Exception {
        searchUserButton.click();
    }

    public void setRoleLabel() throws Exception {
        roleLabel.click();
    }

    public void setSearchedUser(String searchResultUser)throws Exception {
        String newUserId=searchResultUser.toString();
        String text = searchedUser.getAttribute("innerHTML");
        //String title = "Application Roles";
        System.out.println("Searched User Id : " + text );
        System.out.println(" Newly created User Id : " + newUserId);
        System.out.println((text.contains(newUserId)) ? "New User Created " : "Could not create new User");
        Screenshots.captureScreenShot(driver, "18.New User Search");
    }



}
