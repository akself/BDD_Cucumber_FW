package com.dca.stepDefinitions;

import com.dca.config.TestConfiguration;
import com.dca.objects.Home_Page;
import com.dca.objects.Organisation_Page;
import com.dca.objects.User_Page;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

/**
 * Created by akbar.ayubkhan on 10/28/2016.
 */
public class Organisation_Test extends TestConfiguration {
    WebDriver driver = getDriver();
    Home_Page home_page = new Home_Page(driver);
    User_Page user_page = new User_Page(driver);
    Organisation_Page organisation_page = new Organisation_Page(driver);


    @And("^Click on Organisation link$")
    public void click_on_Organisation_link() throws Exception {
        home_page.setOrganisation_link();
    }

    @Then("^Organisation search screen should be displayed$")
    public void organisation_search_screen_should_be_displayed() {
        organisation_page.org_home();
    }

    @Given("^Application user is on search Organisation page$")
    public void application_user_is_on_search_Organisation_page() {
        organisation_page.setOrg_text();
    }

    @And("^Validate search results are from the selected country from the search results$")
    public void validate_search_results_are_from_the_selected_country_from_the_search_results() throws Exception {
        organisation_page.setCapturecountry_text();
    }

    @Given("^Application User is on the Organisation page$")
    public void application_User_is_on_the_Organisation_page() {
        organisation_page.org_home();
    }

    @And("^Click on Add\\+ button to create new organisation$")
    public void click_on_Add_button_to_create_new_organisation() throws Exception {
        organisation_page.setAdd_orgBtn();
    }

    @Then("^User selects \"([^\"]*)\"$")
    public void user_selects(String OrgTypeDD) {

        organisation_page.setOrg_type_DD(OrgTypeDD);
    }

    @And("^user types in the \"([^\"]*)\"$")
    public void user_types_in_the(String OrgName) {
        organisation_page.setOrgName(OrgName);
    }

    @And("^selects the \"([^\"]*)\" dropdown$")
    public void selects_the_dropdown(String OrgStatusDD) {

        organisation_page.setOrg_Status_DD(OrgStatusDD);
    }

    @When("^user selects the Contact Details tab$")
    public void user_selects_the_Contact_Details_tab() {
        organisation_page.setContactTab();
    }

    @Then("^user clicks the Add Contact Details button$")
    public void user_clicks_the_Add_Contact_Details_button() {
        organisation_page.setAddContactDetails();
    }

    @And("^user selects the \"([^\"]*)\" dropdown$")
    public void user_selects_the_dropdown(String contactDetailsType) {
        organisation_page.setContactTypeDD(contactDetailsType);
    }

    @And("^user adds a \"([^\"]*)\"$")
    public void user_adds_a(String value) {
        organisation_page.setValue(value);
    }

    @And("^click the add button$")
    public void click_the_add_button() throws Exception {
        organisation_page.setAddBtn();
    }

    @Then("^user select an \"([^\"]*)\" and enter the value$")
    public void user_select_an_and_enter_the_value(String Identifier) throws Exception {
        //organisation_page.setIms_ID_RB();
        organisation_page.setIms_identifier(Identifier);
    }

    @When("^User navigate to Address tab$")
    public void user_navigate_to_Address_tab() {
        organisation_page.setAddressTab();
    }

    @And("^Click Add address button$")
    public void click_Add_address_button() throws Exception {
        organisation_page.setAddAddress();
    }

    @And("^user select \"([^\"]*)\"$")
    public void selectcountry(String countryDD) {
        organisation_page.setCountry_DD(countryDD);
    }

    @And("^enter \"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"$")
    public void enter_and(String Address, String Cityname, String Zipcode) {
        organisation_page.setAddress_line(Address);
        organisation_page.setCity_name(Cityname);
        organisation_page.setPost_code(Zipcode);
    }

    @And("^Select \"([^\"]*)\"$")
    public void select(String locationStatus) {
        organisation_page.setLocation_Status_DD(locationStatus);
    }

    @And("^Check Primary Address checkbox$")
    public void check_Primary_Address_checkbox() throws Exception {
        organisation_page.setPrimary_Address();
    }

    @And("^click Add button$")
    public void click_Add_button() throws Exception {
        organisation_page.setAddBtn_1();
    }

    @Then("^Save organization$")
    public void save_organization() throws Exception {
        organisation_page.setSaveBtn();
    }

    @And("^Validate the created organisation in the backend for newly created Organisation$")
    public void validate_the_created_user_in_the_backend_for_newly_created_Organisation() throws Exception {
        organisation_page.setGetIDorg();
        Thread.sleep(1000);

        organisation_page.Oracle_Org_Validation();
        //organisation_page.setBackBtn();
    }


}
