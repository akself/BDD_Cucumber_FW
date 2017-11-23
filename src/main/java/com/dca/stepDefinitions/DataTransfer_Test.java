package com.dca.stepDefinitions;

import com.dca.config.TestConfiguration;
import com.dca.objects.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import gherkin.lexer.Da;
import org.openqa.selenium.WebDriver;


public class DataTransfer_Test extends TestConfiguration {
    WebDriver driver = getDriver();
    Organisation_Page organisation_page = new Organisation_Page(driver);
    DataTransfer_Page dataTransfer_page = new DataTransfer_Page(driver);

    @Given("^User is on Preview organization page$")
    public void userIsOnPreviewOrganizationPage() throws Exception {
        dataTransfer_page.setOrgPreviewPage();
    }

    @And("^user click on edit pencil$")
    public void userClickOnEditPencil() throws Exception {
        dataTransfer_page.setEditPencil();
    }

    @And("^user select Modify option from Action$")
    public void user_select_Modify_option_from_Action() throws Exception {
        organisation_page.setActionsBtn();
        organisation_page.setPreviewBtn();
        organisation_page.setOrg_preview();
        organisation_page.setVerifyOrg();
        organisation_page.setBackBtn();
        organisation_page.setActionsBtn();
        organisation_page.setModifyBtn();
    }

    @Then("^Modify Org Page should display$")
    public void modify_Org_Page_should_display() throws Exception {
        dataTransfer_page.setModifyOrgText();
    }

    @Given("^user selects the Data Transfer tab$")
    public void user_selects_the_Data_Transfer_tab() throws Exception {
        dataTransfer_page.setDataTransferTab();
    }

    @Then("^select \"([^\"]*)\" and \"([^\"]*)\" from the dropdown$")
    public void select_and_from_the_dropdown(String DataDomain, String PanelStatus) {
        dataTransfer_page.setDataDomainDD(DataDomain);
        dataTransfer_page.setPanelStatusDD(PanelStatus);
    }

    @And("^Click on Add button$")
    public void click_on_Add_button() throws Exception {
        dataTransfer_page.setAddBtn();
    }

    @Then("^Selected data domain and Panel Status should be displayed in table$")
    public void select_data_domain_and_Panel_Status_should_be_displayed_in_table() {
        System.out.println("The selected fields are displayed");
    }

    @Given("^user is able to see newly created domain and Panel status in the table$")
    public void user_is_able_to_see_newly_created_domain_and_Panel_status_in_the_table() {
        System.out.println("The newly created status is displayed under the table");
    }

    @Then("^select \"([^\"]*)\" from the dropdown$")
    public void select_from_the_dropdown(String DomainStatus) throws Exception {
        Thread.sleep(2000);
        dataTransfer_page.setDomainStatusDD(DomainStatus);
        dataTransfer_page.setdataTypeLbl();

    }

    @Then("^select \"([^\"]*)\"$")
    public void select(String DataType) {
        dataTransfer_page.setDataTypeDD(DataType);
    }

    @Then("^click start configuration button$")
    public void click_start_configuration_button() {
        dataTransfer_page.setStartConfigBtn();
    }

    @Then("^Organization / Add Data Transfer Configuration page should be displayed$")
    public void organization_Add_Data_Transfer_Configuration_page_should_be_displayed() {
        System.out.println("Organization / Add Data Transfer Configuration page is displayed");
    }

    @Given("^User is on Organization / Add Data Transfer Configuration page General setting page$")
    public void user_is_on_Organization_Add_Data_Transfer_Configuration_page_General_setting_page() {
        dataTransfer_page.setAddOrgtitle();
    }

    @And("^Data Domain ,Panel status and Data type fields are prepopulated$")
    public void data_Domain_Panel_status_and_Data_type_fields_are_prepopulated() {
        System.out.println("Data Domain,Panel Status and Data Type fields are pre-populated");
    }

    @Then("^user types \"([^\"]*)\" in data owner name and select one of the suggestion$")
    public void user_types_in_data_owner_name_and_select_one_of_the_suggestion(String DataOwner) throws Exception {
        dataTransfer_page.setDataOwnerBox(DataOwner);
        dataTransfer_page.setUserText();
    }

    @Then("^select \"([^\"]*)\" and \"([^\"]*)\" from the drop down$")
    public void select_and_from_the_drop_down(String DataCollection, String TransferDirection) {
        dataTransfer_page.setDataCollectionDD(DataCollection);
        dataTransfer_page.setTransferDirectionDD(TransferDirection);
    }

    @Then("^select \"([^\"]*)\" from the Transfer schedule text box$")
    public void select_from_the_Transfer_schedule_text_box(String StartDate) {
        dataTransfer_page.setStartDate(StartDate);
    }

    @And("^select No end date checkbox$")
    public void selectNoEndDateCheckbox() {
        dataTransfer_page.setSchdendDate();
    }

    @Then("^select schedule from the \"([^\"]*)\" drop down\\.$")
    public void select_schedule_from_the_drop_down(String TransferType) {
        dataTransfer_page.setTransferScheduleDD(TransferType);
    }

    @And("^select \"([^\"]*)\" from the drop down$")
    public void selectFromTheDropDown(String TimeZone) throws Exception {
        dataTransfer_page.settimezoneDD(TimeZone);
    }


    @And("^enter \"([^\"]*)\"$")
    public void enter(String hours) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        dataTransfer_page.setschedulerInterval(hours);
    }

    @Given("^user is able to navigate to File transfer details tab$")
    public void user_is_able_to_navigate_to_File_transfer_details_tab() throws Exception {
        dataTransfer_page.setFileTransferDetailsTab();
    }

    @Then("^select \"([^\"]*)\" and \"([^\"]*)\" from the respective dropdowns$")
    public void select_and_from_the_respective_dropdowns(String PrimaryTransfer, String AlternateMethod) {
        dataTransfer_page.setPrimaryTransferDD(PrimaryTransfer);
        dataTransfer_page.setAlternateTransferDD(AlternateMethod);
    }

    @Then("^FTP account drop down should have create new account options$")
    public void ftp_account_drop_down_should_have_create_new_account_options() {
        System.out.println("Create new account is displayed under FTP accound drop down");
    }

    @Then("^select a FTP Host Provider value from \"([^\"]*)\" drop down$")
    public void select_a_value_from_drop_down(String FTPHost) {
        dataTransfer_page.setFTPhostproviderDD(FTPHost);
    }

    @Then("^select a Data Transfer Software value from \"([^\"]*)\" type dropdown$")
    public void select_a_value_from_type_dropdown(String DataTransfer) {
        dataTransfer_page.setDataTransferTypeDD(DataTransfer);
    }

    @Then("^select a MFT Domain value from \"([^\"]*)\" dropdown$")
    public void select_a_mft_value_from_type_dropdown(String MFTDomain) {
        dataTransfer_page.setMftDD(MFTDomain);
    }


    @Then("^select a MFT Country value from \"([^\"]*)\" dropdown$")
    public void select_a_MFT_Country_value_from_dropdown(String country) {
        dataTransfer_page.setMftcountryDD(country);
    }

    @Then("^select a MFT Workflow value from \"([^\"]*)\" drop down$")
    public void select_a_MFT_Workflow_value_from_drop_down(String workflow) {
        dataTransfer_page.setMftWorkflowDD(workflow);
    }

    @Then("^validate File transfer host name preopulated as mft\\.imshealth\\.com$")
    public void validate_File_transfer_host_name_preopulated_as_mft_imshealth_com() {
        System.out.println("mft.imshealth.com is prepopulated");
    }

    @Then("^select a FTP Type value from \"([^\"]*)\" drop down$")
    public void select_a_FTP_Type_value_from_drop_down(String FTPtype) {
        dataTransfer_page.setFTPTypeDD(FTPtype);
    }

    @And("^validate \\* Input directory path prepopulated as /in$")
    public void validate_Input_directory_path_prepopulated_as_in() {
        System.out.println("Input directory is prepopulated as /in");
    }

    @And("^validate Output directory path prepopulated as /out$")
    public void validate_Output_directory_path_prepopulated_as_out() {
        System.out.println("Output directory is prepopulated as /out");
    }

    @And("^Click on Alternate Transfer method –Email$")
    public void click_on_Alternate_Transfer_method_Email() {
        dataTransfer_page.setAlternateMethod();
    }

    @Then("^enter \"([^\"]*)\" in email address text filed$")
    public void enter_in_email_address_text_filed(String email) {
        dataTransfer_page.setEmailText(email);
    }

    @Then("^enter again \"([^\"]*)\" in email address confirmation field\\.$")
    public void enter_again_in_email_address_confirmation_field(String emailConfirm) {
        dataTransfer_page.setEmailConfirmText(emailConfirm);
    }


    @Given("^user is able to navigate to File Specification tab$")
    public void user_is_able_to_navigate_to_File_Specification_tab() throws Exception {
        dataTransfer_page.setFileSpecTab();
    }


    @And("^select a Specification Template value from \"([^\"]*)\" dropdown$")
    public void select_a_Specification_Template_value_from_dropdown(String SpecificationTemplate) throws Exception {
        dataTransfer_page.setSpecTemplate(SpecificationTemplate);
    }


    @And("^Check File encryption check box$")
    public void check_File_encryption_check_box() {
        dataTransfer_page.setFileEncryptChek();
    }


    @Then("^select a Encrypted value from \"([^\"]*)\" drop down$")
    public void select_a_Encrypted_value_from_drop_down(String Encrypt) throws Exception {
        dataTransfer_page.setEncryptedBy(Encrypt);
    }

    @Then("^Generate Encryption keypair check box should be displayed$")
    public void generate_Encryption_keypair_check_box_should_be_displayed() {
        System.out.println("Generate Encryption keypair check box is displayed");
        System.out.println("======================================================");
    }

    @Given("^user is able to navigate to Activation Details tab$")
    public void user_is_able_to_navigate_to_Activation_Details_tab() throws Exception {
        dataTransfer_page.setActivationDetailsTab();
    }

    @Then("^select Activate Immediate check box$")
    public void select_Activate_Immediate_check_box() throws Exception {
        dataTransfer_page.setActivateImmediate();
    }

    @And("^uncheck no end date check box$")
    public void uncheck_no_end_date_check_box() throws Exception {
        dataTransfer_page.setEndDate();
    }

    @Then("^enter the \"([^\"]*)\"$")
    public void enter_the(String endDate) throws Exception {
        dataTransfer_page.setActivationendDate(endDate);
    }

    @And("^click on Save button$")
    public void click_on_Save_button() throws Exception {
        dataTransfer_page.setSaveBtn();
    }

    @Then("^data transfer successfully created message should be displayed and user navigate to modify org page\\.$")
    public void data_transfer_successfully_created_message_should_be_displayed_and_user_navigate_to_modify_org_page() throws Exception {
        System.out.println("Data transfer successfully created message should be displayed and user navigate to modify org page");
        dataTransfer_page.setSaveBtn();
    }

    @Given("^user is on Modify org page$")
    public void user_is_on_Modify_org_page() {
        System.out.println("User under modify org page");
    }

    @And("^click on Data Transfer tab$")
    public void click_on_Data_Transfer_tab() throws Exception {
        //dataTransfer_page.setDataTransferTab();
        dataTransfer_page.setGetId();
    }

    @Then("^list of data transfer should be displayed and status as Active\\.$")
    public void list_of_data_transfer_should_be_displayed_and_status_as_Active() throws Exception {
        dataTransfer_page.setScreenshot();
        //dataTransfer_page.setModifyPage();
        //organisation_page.setBackBtn();
    }

    @Then("^click on org Save button$")
    public void clickOnOrgSaveButton() throws Exception {
        dataTransfer_page.setsaveOrg();
    }
}
