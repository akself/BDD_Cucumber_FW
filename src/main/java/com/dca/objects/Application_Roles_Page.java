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
public class Application_Roles_Page extends TestConfiguration {

    WebDriver driver = getDriver();

    @FindBy (xpath = "//h3[contains(.,'Application Roles')]")
    private  WebElement appRolePage;

    @FindBy (xpath = "//translate[contains(.,'Add New')]")
    private  WebElement addNewBtn;

    @FindBy (xpath = "//translate[contains(.,'Add New Application Role')]")
    private  WebElement addNewRolePage;

    @FindBy (xpath="//input[@name='roleName']")
    private WebElement roleName;

    @FindBy (xpath="//select[@name='roleType']")
    private WebElement roleType;

    @FindBy (xpath="//select[@name='feature']")
    private WebElement functionality;

    @FindBy (xpath ="//feature-permission/div/div[1]/select-input/label")
    private WebElement permission;

    @FindBy (xpath = "//select[@name='permissions']/option")
    //private WebElement permType;
    private List<WebElement> permissionList;

    @FindBy (xpath = "//button[@type='submit' and contains(.,' Add ')]")
    private WebElement addRole;

    @FindBy (xpath = "//button[@ng-click='$ctrl.save()']")
    private WebElement saveRole;

    @FindBy (xpath = "//translate[contains(.,'Preview Application Role')]")
    private  WebElement previewAppRolePage;

    @FindBy (xpath = "//button[@ui-sref='searchAppRoles']")
    private  WebElement cancelButton;

    @FindBy (xpath = "//button[contains(.,' Search  ')]")
    private WebElement searchButton;

    @FindBy (xpath = "//table/tbody/tr[1]/td[1]")
    private WebElement searchedRole;

    public Application_Roles_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setAppRolePage()throws Exception{
        String text = appRolePage.getText();
        String title = "Application Roles";
        //System.out.println("Application Roles page"+ text);
        System.out.println((title.equals(text)) ? "Navigated to Application Roles page " : "Could not Navigated to Application Roles page");
        System.out.println("=======================================================================");
    }

    public void setAddNewBtn() throws Exception {
        addNewBtn.click();
    }

    public void setAddNewRolePage()throws Exception{
        String text = addNewRolePage.getText();
        String title = "Add New Application Role";
        //System.out.println("Add New Application Role"+ text);
        System.out.println((title.equals(text)) ? "Navigated to Add New Application Role page " : "Could not Navigated to Add New Application Role page");
        System.out.println("=======================================================================");
    }

    public void setRoleName(String roleNm)throws Exception {
        //roleName.sendKeys(roleNm);
        ((JavascriptExecutor) this.driver).executeScript("arguments[0].focus();", roleName);
        roleName.sendKeys(roleNm);
    }

    public void setRoleType(String roletyp) throws Exception {
        com.dca.utilities.Actions.selectDDLVisibletext(roleType, roletyp);
    }

    public void setFunctionality(String function) throws Exception {
        com.dca.utilities.Actions.selectDDLVisibletext(functionality, function);
    }

    public void setPermission() throws Exception {
        permission.click();
    }
    public void setPermissionList(String permissions) throws Exception {

        List<WebElement> dropPerms = permissionList;

        for(WebElement el : dropPerms)
        {
            if(el.getText().equals(permissions))
            {
                el.click();
            }

        }

    }

    public void setAddRole() throws Exception {
        addRole.click();
    }

    public void setSaveRole() throws Exception {
        saveRole.click();
    }

    public void setPreviewAppRolePage() throws Exception {
        String text = previewAppRolePage.getText();
        String title = "Preview Application Role";
        //System.out.println("Preview Application Role"+ text);
        System.out.println((title.equals(text)) ? "Navigated to Preview Application Role page " : "Could not Navigated to Preview Application Role page");
        System.out.println("=======================================================================");
        Screenshots.captureScreenShot(driver, "15.New Role Creation");
    }

    public void setCancelButton() throws Exception {
        cancelButton.click();
    }

    public void setSearchButton() throws Exception {
        searchButton.click();
    }

    public void setSearchedRole(String srchRole)throws Exception {
        String newRoleId=srchRole.toString();
        String text = searchedRole.getAttribute("innerHTML");
        //String title = "Application Roles";
        System.out.println("Searched Role Id : " + text );
        System.out.println("Newly created Role Id : " + newRoleId);
        System.out.println((newRoleId.equals(text)) ? "New Role Created " : "Could not create new role");
        Screenshots.captureScreenShot(driver, "16.New Role Search");
    }



}
