@Organisation
Feature: Creating a new installation
  Searching for the newly creation installation

  #Login:
  @Login
  Scenario: Verifying User Login with Valid Credentials
    Given User Navigates to IMSHealth Login Page
    When User Enters valid username and password
    And Click sign-in
    Then Home page should be displayed

    #Installation Page:
  @NavigateToInstallation
  Scenario: Application  should be able to navigate to Installation Page
    Given User Navigates to Manage Panel
    And Click on installation link
    Then Installation search screen should be displayed

    #Creating new Installation:
  @InstallationCreation
  Scenario Outline: Creating a new Installation by adding basic details
    Given Application User is on the Installation page
    And Click on Add+ button to create new installation
    Then add new installation page should be displayed
    Then User selects "<Country>","<OrgName>","<OrgLocation>","<OrgDomain>"
    And Click on start config button
    Then Modify DCA Installation And Configuration page should be displayed
    When User navigate to Env Details tab
    And select "<OsProvider>","<Os>","<OsType>","<serverType>","<ServerCountry>","<ServerLocation>"
    #And click on working hours
    Then user navigates to Env config Details tab
    And Choose "<cores>","<ClockRate>","<AllocatedMemory>","<AllocatedDisc>","<AntivirusVendor>","<AntivirusVersion>"
    Then user navigates to Installation Details tab
    And choose "<installerVersion>","<InstallerPartyType>","<InstallerPartyName>"
    Then user navigates to template tab
    And choose "<template>"
    And choose "<datatransfer>" from the drop down
    And click save installation button
    Then Preview DCA Installation And Configuration page should be displayed
    Then navigate back to search page bu hitting cancel button

    Examples:
      | Country | OrgName        | OrgLocation | OrgDomain | OsProvider | Os | OsType     | serverType | ServerCountry | ServerLocation  |cores|ClockRate|AllocatedMemory|AllocatedDisc|AntivirusVendor|AntivirusVersion|installerVersion|InstallerPartyType|InstallerPartyName|template|datatransfer|
      | Japan   | Test Organisation -18| Tokyo       | Claims    | Red Hat    | Linux| 64       |         PC | Japan        | Tokyo             |4    |128      |5000          |5000000      |Cisco          |Clam|1.1.0 - new plugins-updater support|Supplier|Test Organisation -18|Japan - Claims (1.0.0)|CLAI|


    #Searching created new Installation:
  @SearchInstallation
  Scenario Outline: Searching new Installation
    Given Application User is on the Installation page
    And enter search fields "<SrchCntry>","<srchOrg>","<srchInstallLoc>"
    And hit search Installation button
    Then search result for search "<SrchOrganisation>" should be displayed

    Examples:
      | SrchCntry |srchOrg|srchInstallLoc|SrchOrganisation|
      | Japan   |Test Organisation -1|Tokyo|Test Organisation -1|