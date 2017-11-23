package com.dca.stepDefinitions;

import com.dca.config.TestConfiguration;
import com.dca.objects.*;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

/**
 * Created by akbar.ayubkhan on 10/28/2016.
 */

public class User_Test extends TestConfiguration {
    WebDriver driver = getDriver();
    Home_Page home_page = new Home_Page(driver);
    User_Page user_page = new User_Page(driver);
    CreateUser_Page createUser_page = new CreateUser_Page(driver);
    Organisation_Page organisation_page = new Organisation_Page(driver);

    @Given("^User Navigates to Manage Panel$")
    public void user_Navigates_to_Manage_Panel() throws Exception {
        home_page.setManage_panel();
    }

    @And("^User clicks on User link$")
    public void user_clicks_on_User_link() throws Exception {
        home_page.setUserTab();
    }

    @Then("^User search screen should be displayed$")
    public void user_search_screen_should_be_displayed() throws Exception {
        user_page.setUser_text();
    }

    @Given("^Application user is on  search user page$")
    public void application_user_is_on_search_user_page() throws Exception {
        user_page.setUser_home();
    }

    @When("^Select \"([^\"]*)\" from the Country drop down$")
    public void select_from_the_Country_drop_down(String country) {
        user_page.setCountry_dropdown(country);
    }

    @And("^Click search button$")
    public void click_search_button() {
        user_page.setSearch_Btn();
    }

    @Then("^Search results should be displayed$")
    public void search_results_should_be_displayed() throws Exception {
        user_page.search_result();
    }

    @And("^Validate search results are from the selected country\\.$")
    public void validate_search_results_are_from_the_selected_country() throws Exception {
        //user_page.setDetails_Btn();
        user_page.setCapture_text();
    }

    @And("^Click on Add\\+ button to create new user$")
    public void click_on_Add_button_to_create_new_user() throws Exception {
        user_page.setAddUserBtn();
    }

    @Then("^Create user page appears$")
    public void create_user_page_appears() {
        createUser_page.user_text();
    }

    @Then("^Enter the \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"and\"([^\"]*)\" of Address Tab$")
    public void enter_the_and_of_Address_Tab(String firstname, String lastname, String country, String address, String cityname, String zipcode) {
        createUser_page.setFirstname(firstname);
        createUser_page.setLastname(lastname);
        createUser_page.setCountry_dd(country);
        createUser_page.setAddress_line(address);
        createUser_page.setCityname(cityname);
        createUser_page.setPostcode(zipcode);
        createUser_page.setContact_details();
    }

    @And("^Select \"([^\"]*)\" with contact \"([^\"]*)\" of Contact Tab$")
    public void select_with_contact_of_Contact_Tab(String contactdetails, String value) throws Exception {
        createUser_page.setAdd_contact_details();
        createUser_page.setContact_type_DD(contactdetails);
        createUser_page.setValueTextBox(value);
        Thread.sleep(2000);
        createUser_page.setAdd_Contact_Btn();
        createUser_page.setRoles();
    }

    @And("^Enter \"([^\"]*)\" and select the \"([^\"]*)\" of Roles Tab$")
    public void enter_and_select_the_of_Roles_Tab(String Orgname, String userrole) throws Exception {
        createUser_page.setAdd_user_org();
        createUser_page.setOrganisation(Orgname);
        Thread.sleep(2000);
        createUser_page.setOrgText();
        Thread.sleep(2000);
        createUser_page.setrolesDD();
        createUser_page.setUserrole_DD(userrole);
        createUser_page.setAdd_Role_Btn();
    }

    @Then("^Click on Save Button$")
    public void click_on_Save_Button() throws Exception {
        createUser_page.setSaveBtn();
    }

    @And("^Validate the created user in the backend$")
    public void validate_the_created_user_in_the_backend() throws Exception {
        createUser_page.setGetID();
        createUser_page.Oracle_User_Validation();
        organisation_page.setBackBtn();
    }

    @When("^Select \"([^\"]*)\" and \"([^\"]*)\"from the respective drop down$")
    public void selectAndFromTheRespectiveDropDown(String cntry, String org) throws Exception {
        user_page.setCountry_dropdown(cntry);
        user_page.setSrchOrgName(org);


    }

    @And("^Validate search results \"([^\"]*)\" is for the created org$")
    public void validateSearchResultsIsForTheCreatedOrg(String email) throws Exception {
        user_page.setSrchUsrEmail(email);

    }
}