package com.dca.stepDefinitions;

import com.dca.config.TestConfiguration;
import com.dca.objects.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.WebDriver;

/**
 * Created by Mahendra.Singh on 7/7/2017.
 */
public class Application_Users_Test  extends TestConfiguration {
    WebDriver driver = getDriver();
    Home_Page home_page = new Home_Page(driver);
    Login_Page login_page = new Login_Page(driver);
    User_Page user_page = new User_Page(driver);
    Application_User_Page appUser_Page=new Application_User_Page(driver);
    Organisation_Page organisation_page = new Organisation_Page(driver);

    @Given("^User clicks on Application user link$")
    public void user_clicks_on_Application_user_link() throws Exception {
         home_page.setAppUserMenuLink();
    }

    @Then("^Application user search screen should be displayed$")
    public void applicationUserSearchScreenShouldBeDisplayed() throws Exception {
        appUser_Page.setAppUserPage();
    }

    @Given("^Application user is on  search Application User page$")
    public void application_user_is_on_search_Application_User_page() throws Exception {
         appUser_Page.setAppUserPage();
    }

    @Given("^Click on Add New button to create new User$")
    public void click_on_Add_New_button_to_create_new_User() throws Exception {
         appUser_Page.setAddNewUserBtn();
    }

    @Then("^Add Application User page appears$")
    public void add_Application_User_page_appears() throws Exception {
         appUser_Page.setAddAppUserPage();
    }

    @Then("^user types \"([^\"]*)\" in Search In Active Directory and select one of the suggestion$")
    public void user_types_in_Search_In_Active_Directory_and_select_one_of_the_suggestion(String UserName) throws Exception {
        appUser_Page.setSearchAD(UserName);
        Thread.sleep(2000);
        appUser_Page.setUserAD();
    }

    @And("^Select \"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\" from  drop down$")
    public void select_and_from_drop_down(String role,String Country, String DataDomain) throws Exception {
        appUser_Page.setRolesDD();
        appUser_Page.setSearchRoles(role);
        appUser_Page.setRolesList(role);
        appUser_Page.setAssignCntry(Country);
        appUser_Page.setAssignDomain(DataDomain);
    }

    @And("^Click Add country and domain Button$")
    public void clickAddCountryAndDomainButton() throws Exception {
        Thread.sleep(2000);
        appUser_Page.setAddCtryDmn();
        Thread.sleep(2000);
    }

    @And("^Click on Save user Button$")
    public void clickOnSaveUserButton() throws Exception {

        appUser_Page.setSaveUser();
    }


    @Then("^Preview Application User page should be displayed$")
    public void preview_Application_User_page_should_be_displayed() throws Exception {
        appUser_Page.setPreviewAppRolePage();
    }

    @Then("^click on cancel user button$")
    public void clickOnCancelUserButton() throws Exception {
        appUser_Page.setCancelUSerPrevButton();
    }

    @Given("^Application user is on  search Application Users page$")
    public void application_user_is_on_search_Application_Users_page() throws Exception {
        appUser_Page.setAppUserPage();
    }

    @Given("^enter \"([^\"]*)\" in username textfield$")
    public void enter_in_username_textfield(String srchUser) throws Exception {
        Thread.sleep(2000);
        appUser_Page.setSearchUser(srchUser);
    }

    @When("^select \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" from  drop down$")
    public void select_and_and_from_drop_down(String srchCountry, String srchDataDmn, String srchRoles) throws Exception {
        appUser_Page.setSearchUserCntry(srchCountry);
        appUser_Page.setSearchUserDmn(srchDataDmn);
        appUser_Page.setSearchRolesDD();
        appUser_Page.setSearchRolesList(srchRoles);

    }

    @And("^Click search user button$")
    public void clickSearchUserButton() throws Exception {
        appUser_Page.setRoleLabel();
        Thread.sleep(2000);
        appUser_Page.setSearchUserButton();
    }

    @And("^Validate search results are For  the selected \"([^\"]*)\"$")
    public void validateSearchResultsAreForTheSelected(String searchResultUser) throws Exception {
        appUser_Page.setSearchedUser(searchResultUser);
    }
}

