package com.dca.stepDefinitions;

import com.dca.config.TestConfiguration;
import com.dca.objects.Home_Page;
import com.dca.objects.Login_Page;
import com.dca.objects.Organisation_Page;
import com.dca.objects.Application_Roles_Page;
import com.dca.objects.User_Page;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;


/**
 * Created by Mahendra.Singh on 7/7/2017.
 */
public class Application_Roles_Test extends TestConfiguration {
    WebDriver driver = getDriver();
    Home_Page home_page = new Home_Page(driver);
    Login_Page login_page = new Login_Page(driver);
    User_Page user_page = new User_Page(driver);
    Organisation_Page organisation_page = new Organisation_Page(driver);
    Application_Roles_Page roles_page=new Application_Roles_Page(driver);

    @Given("^User clicks on Application Roles link$")
    public void user_clicks_on_Application_Roles_link() throws Exception {
        home_page.setAppRoleMenuLink();
            }

    @Then("^Application Roles search screen should be displayed$")
    public void application_Roles_search_screen_should_be_displayed() throws Exception {
        roles_page.setAppRolePage();
    }

    @Given("^Application user is on  search Application Roles page page$")
    public void application_user_is_on_search_Application_Roles_page_page() throws Exception {
        roles_page.setAppRolePage();
    }

    @Given("^Click on Add New button to create new Role$")
    public void click_on_Add_New_button_to_create_new_Role() throws Exception {
        roles_page.setAddNewBtn();
    }

    @Then("^Add New Application Role page appears$")
    public void add_New_Application_Role_page_appears() throws Exception {
        roles_page.setAddNewRolePage();
    }

    @Then("^Enter the \"([^\"]*)\"$")
    public void enter_the(String roleNm) throws Exception {
        Thread.sleep(1000);
        roles_page.setRoleName(roleNm);
    }

    @And("^Select \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" from respective drop downs$")
    public void select_from_respective_drop_downs(String roletyp, String function,String permissions) throws Exception {
        roles_page.setRoleType(roletyp);
        roles_page.setPermission();
        roles_page.setFunctionality(function);
        roles_page.setPermissionList(permissions);
    }

    @Then("^Click Add Button$")
    public void click_Add_Button() throws Exception {
        roles_page.setAddRole();
    }

    @And("^Click on role Save Button$")
    public void clickOnRoleSaveButton() throws Exception {
        roles_page.setSaveRole();
    }

    @Then("^Preview Application Role page should be displayed$")
    public void preview_Application_Role_page_should_be_displayed() throws Exception {
        roles_page.setPreviewAppRolePage();
    }

    @Then("^press Cancel buton$")
    public void pressCancelButon() throws Exception {
        roles_page.setCancelButton();
    }

    @Then("^Validate the created Role in the backend$")
    public void validate_the_created_Role_in_the_backend() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^Application user is on  search Application Roles page$")
    public void application_user_is_on_search_Application_Roles_page() throws Exception {
        roles_page.setAppRolePage();
    }

    @When("^Enters \"([^\"]*)\" in Role name textBox$")
    public void enters_in_Role_name_textBox(String searchrole) throws Exception {
        roles_page.setRoleName(searchrole);
    }

    @And("^Click Role search button$")
    public void clickRoleSearchButton() throws Exception {
        Thread.sleep(2000);
        roles_page.setSearchButton();
        Thread.sleep(2000);
    }

    @And("^Validate search results are For  the \"([^\"]*)\"$")
    public void validateSearchResultsAreForThe(String srchRole) throws Throwable {
        roles_page.setSearchedRole(srchRole);
    }

}
