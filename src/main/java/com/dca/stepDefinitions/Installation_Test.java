    package com.dca.stepDefinitions;

    import com.dca.config.TestConfiguration;
    import com.dca.objects.*;
    import cucumber.api.PendingException;
    import cucumber.api.java.en.And;
    import cucumber.api.java.en.Given;
    import cucumber.api.java.en.Then;
    import cucumber.api.java.en.When;
    import gherkin.lexer.Th;
    import org.apache.poi.ss.formula.functions.T;
    import org.openqa.selenium.WebDriver;

    /**
     * Created by Mahendra.Singh on 712/2017.
     */
    public class Installation_Test  extends TestConfiguration {
        WebDriver driver = getDriver();
        Home_Page home_page = new Home_Page(driver);
        Installation_Page installation_page = new Installation_Page(driver);
        Login_Page login_page = new Login_Page(driver);

        @Given("^Click on installation link$")
        public void click_on_installation_link() throws Exception {
            home_page.setInstallationsMenuLink();
        }

        @Then("^Installation search screen should be displayed$")
        public void installation_search_screen_should_be_displayed() throws Exception {
            installation_page.setInstallationPage();
        }

        @Given("^Application User is on the Installation page$")
        public void application_User_is_on_the_Installation_page() throws Exception {
            installation_page.setInstallationPage();
        }

        @And("^Click on Add\\+ button to create new installation$")
        public void click_on_Add_button_to_create_new_installation() throws Exception {
            installation_page.setAddNewInstallation();
        }

        @Then("^add new installation page should be displayed$")
        public void add_new_installation_page_should_be_displayed() throws Exception {
            installation_page.setAddNewInstallation();
        }

        @Then("^User selects \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
        public void user_selects(String Country, String OrgName, String OrgLocation, String OrgDomain) throws Exception {
            installation_page.setInstallationCountry(Country);
            Thread.sleep(3000);
            installation_page.setInstallationOrgNm(OrgName);
            Thread.sleep(2000);
            installation_page.setInstallationOrgLoc(OrgLocation);
            Thread.sleep(2000);
            installation_page.setInstallationOrgDmn(OrgDomain);
            Thread.sleep(2000);
        }

        @Then("^Click on start config button$")
        public void click_on_start_config_button() throws Exception {
            installation_page.setStartConfigBtn();
        }

        @Then("^Modify DCA Installation And Configuration page should be displayed$")
        public void modify_DCA_Installation_And_Configuration_page_should_be_displayed() throws Exception {
            installation_page.setModifyInstallPage();
        }

        @When("^User navigate to Env Details tab$")
        public void user_navigate_to_Env_Details_tab() throws Exception {
            installation_page.setEnvDetailsTab();
        }

        @When("^select \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
        public void select(String OsProvider, String Os, String OsType, String serverType, String ServerCountry, String ServerLocation) throws Exception {
            installation_page.setOsProvider( OsProvider);
            installation_page.setOS(Os);
            installation_page.setOsType(OsType);
            installation_page.setServerTyp(serverType);
            installation_page.setServerLocCntry(ServerCountry);
            installation_page.setServerCity(ServerLocation);
        }

        @And("^click on working hours$")
        public void clickOnWorkingHours() throws Exception {
            installation_page.setWorkingHrs();
        }

        @Then("^user navigates to Env config Details tab$")
        public void user_navigates_to_Env_config_Details_tab() throws Exception {
            installation_page.setEnvConfigTab();
        }

        @Then("^Choose \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
        public void choose(String cores, String ClockRate, String AllocatedMemory, String AllocatedDisc, String AntivirusVendor, String AntivirusVersion) throws Exception {
            installation_page.setCoresNumber(cores);
            installation_page.setClockRate(ClockRate);
            installation_page.setAllocMemory(AllocatedMemory);
            installation_page.setAllocDisc(AllocatedDisc);
            installation_page.setAntivirusvendor(AntivirusVendor);
            Thread.sleep(3000);
            installation_page.setAntivirusVersion(AntivirusVersion);
        }

        @Then("^user navigates to Installation Details tab$")
        public void user_navigates_to_Installation_Details_tab() throws Exception {
            installation_page.setInstallationDetailstab();
        }

        @Then("^choose \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
        public void choose(String installerVersion, String InstallerPartyType, String InstallerPartyName) throws Exception {
            installation_page.setInstallerVersion(installerVersion);
            installation_page.setInstallerParty(InstallerPartyType);
            installation_page.setInstallerPartyName(InstallerPartyName);
        }

        @Then("^user navigates to template tab$")
        public void user_navigates_to_template_tab() throws Exception {
            installation_page.setTemplateTab();
        }

        @Then("^choose \"([^\"]*)\"$")
        public void choose(String template) throws Exception {
            Thread.sleep(3000);
            installation_page.setTemplate(template);
        }

        @And("^choose \"([^\"]*)\" from the drop down$")
        public void chooseFromTheDropDown(String datatransfer) throws Exception {
            Thread.sleep(3000);
            installation_page.setDataTransfer(datatransfer);
        }

        @Then("^click save installation button$")
        public void click_save_installation_button() throws Exception {
            Thread.sleep(4000);
            installation_page.setSaveInstallation();
            installation_page.setCreatedinstallationId();
            installation_page.Oracle_installation_Validation();
        }

        @Then("^Preview DCA Installation And Configuration page should be displayed$")
        public void preview_DCA_Installation_And_Configuration_page_should_be_displayed() throws Exception {
            installation_page.setPreviewInstallation();
        }

        @Then("^navigate back to search page bu hitting cancel button$")
        public void navigateBackToSearchPageBuHittingCancelButton() throws Exception {
            installation_page.setCancelBtn();
        }

        @And("^enter search fields \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
        public void enterSearchFields(String SrchCntry, String srchOrg, String srchInstallLoc) throws Exception {
            installation_page.setSearchCountry(SrchCntry);
            installation_page.setSearchOrg(srchOrg);
            installation_page.setSearchInstallLoc(srchInstallLoc);

        }

        @And("^hit search Installation button$")
        public void hitSearchInstallationButton() throws Exception{
            installation_page.setSearchButton();
        }

        @Then("^search result for search \"([^\"]*)\" should be displayed$")
        public void searchResultForSearchShouldBeDisplayed(String srchOrg) throws Exception {
            installation_page.setSearchResultOrgName(srchOrg);
        }
    }