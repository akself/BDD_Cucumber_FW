@Organisation
Feature: Organisation search validation and creating a new Organisation
  Searching an Organisation for a specific country and adding a new Organisation and
  Modifying the newly created Organisation by creating Data Transfer and adding notification

    #Login:
  @Login
  Scenario: Verifying User Login with Valid Credentials
    Given User Navigates to IMSHealth Login Page
    When User Enters valid username and password
    And Click sign-in
    Then Home page should be displayed

    #Organisation Page:
  @NavigationTOOrgs
  Scenario: Application  should be able to navigate to Search Organisation Page
    Given User Navigates to Manage Panel
    And Click on Organisation link
    Then Organisation search screen should be displayed

    #Organisation Search based on Country:
  @OrgSeach
  Scenario Outline: Application  should be able to Search Org
    Given Application user is on search Organisation page
    When Select "<Country>" from the Country drop down
    And Click search button
    Then Search results should be displayed
    And Validate search results are from the selected country from the search results

    Examples:
      | Country |
      | Ireland |

    #Creating new Organisation:
  @OrgCreation
  Scenario Outline: Creating a new organisation by adding basic details
    Given Application User is on the Organisation page
    And Click on Add+ button to create new organisation
    Then User selects "<Organisation Type>"
    And user types in the "<Name>"
    #And selects the "<Status>" dropdown

    When User navigate to Address tab
    And Click Add address button
    And user select "<Country>"
    And enter "<Address>","<Cityname>" and "<Zip Code>"
    #And Select "<Location Status>"
    And Check Primary Address checkbox
    And click Add button
    When user selects the Contact Details tab
    #Then user clicks the Add Contact Details button
    #And user selects the "<Contact Details Type>" dropdown
    And user adds a "<Value>"
    #And click the add button
    Then user select an "<Identifier>" and enter the value
    Then Save organization
    And Validate the created organisation in the backend for newly created Organisation

    Examples:
      | Country | Address        | Cityname | Zip Code | Location Status | Organisation Type | Name                 | Status | Contact Details Type | Value          | Identifier        |
      | Japan   | Test Address-19 | Tokyo     | 600028   | Active         | Pharmacy Branch  | Test Organisation -19 | Active | Email Address        | test2@mail.com | Test Identifier-1 |


    #Data Transfer:
  @DTCreation
  Scenario Outline: Modify the newly created organization
    Given User is on Preview organization page
    And user click on edit pencil
    Then Modify Org Page should display

    Given user selects the Data Transfer tab
    Then select "<Data Domain>" and "<Panel Status>" from the dropdown
    And Click on Add button
    Then Selected data domain and Panel Status should be displayed in table

    Given user is able to see newly created domain and Panel status in the table
    Then select "<Domain with associated Panel Status>" from the dropdown
    And select "<Data Type>"
    Then click start configuration button
    Then Organization / Add Data Transfer Configuration page should be displayed

    Given User is on Organization / Add Data Transfer Configuration page General setting page
    And Data Domain ,Panel status and Data type fields are prepopulated
    Then  user types "<Data Owner>" in data owner name and select one of the suggestion
    And select "<Data Collection Method>" and "<Transfer Direction>" from the drop down
    And select "<Start Date>" from the Transfer schedule text box
    And select No end date checkbox
    And select schedule from the "<Transfer Schedule Type>" drop down.
    And select "<TimeZone>" from the drop down
    And enter "<hours>"

    Given user is able to navigate to File transfer details tab
    Then select "<Primary Transfer Method>" and "<Alternate Method>" from the respective dropdowns
    Then FTP account drop down should have create new account options
    And select a FTP Host Provider value from "<FTP Host Provider>" drop down
    And select a Data Transfer Software value from "<Data Transfer Software>" type dropdown
    And select a MFT Domain value from "<MFT Domain>" dropdown
    And select a MFT Country value from "<MFT Country>" dropdown
    And select a MFT Workflow value from "<MFT Workflow>" drop down
    Then validate File transfer host name preopulated as mft.imshealth.com
    And select a FTP Type value from "<FTP Type>" drop down
    And validate * Input directory path prepopulated as /in
    And validate Output directory path prepopulated as /out
    And Click on Alternate Transfer method –Email
    Then enter "<Email Address>" in email address text filed
    And enter again "<Confirm Email Address>" in email address confirmation field.

    Given user is able to navigate to File Specification tab
    And select a Specification Template value from "<Specification Template>" dropdown
    And Check File encryption check box
    And  select a Encrypted value from "<Encrypted by>" drop down
    Then Generate Encryption keypair check box should be displayed

    Given user is able to navigate to Activation Details tab
    Then select Activate Immediate check box
    And uncheck no end date check box
    Then enter the "<Activation End Date>"
    And click on Save button
    Then data transfer successfully created message should be displayed and user navigate to modify org page.

    Given user is on Modify org page
    And click on Data Transfer tab
    Then list of data transfer should be displayed and status as Active.
    Then click on org Save button

    Examples:
      | Data Domain | Panel Status | Domain with associated Panel Status | Data Type  | Data Owner | Data Collection Method | Transfer Direction | Start Date | Transfer Schedule Type | TimeZone|Primary Transfer Method |hours| Alternate Method | FTP Host Provider | Data Transfer Software | MFT Domain             | MFT Country   | MFT Workflow | FTP Type | Email Address  | Confirm Email Address | Specification Template | Encrypted by | Activation End Date |
      | Claims      | Active       | Claims - Active                    | Patients    | Mahendra   | Direct                 | To IMS             | 2017-07-05 | Hourly                  | Asia/Tokyo (+09:00)|File transfer|2           | Email            | IMS DCP           | Data collection agent  | Carlstadt GDC Internal | Internal Test | _nopflowXT   |FTP (21)| test1@mail.com | test1@mail.com        | JPN CLA Claim| IMS DCP      | 2017-11-18          |


