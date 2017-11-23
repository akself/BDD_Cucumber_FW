@ApplicationUsers
Feature: User Role validation and creating a new User
  Adding a new User

  #Login:
  @Login
  Scenario: Verifying User Login with Valid Credentials
    Given User Navigates to IMSHealth Login Page
    When User Enters valid username and password
    And Click sign-in
    Then Home page should be displayed

    #Application User's Page:
  @NavigateTOAppUser
  Scenario: Application should be able to navigate to Search Application User page
    Given User Navigates to Manage Panel
    And  User clicks on Application user link
    Then Application user search screen should be displayed

    #Creating a New Application User:
  @AppUserCreation
  Scenario Outline: Create Application User and validate with Database that User got created
    Given Application user is on  search Application User page
    And Click on Add New button to create new User
    Then Add Application User page appears
    Then  user types "<UserName>" in Search In Active Directory and select one of the suggestion
    And Select "<role>","<Country>" and "<DataDomain>" from  drop down
    And Click Add country and domain Button
    And Click on Save user Button
    Then Preview Application User page should be displayed
    Then click on cancel user button
    #And Validate the created User in the backend

    Examples:

      | UserName |role| Country | DataDomain|
      | Lohith |sudo| Japan|Claims|

   #Searching Application User:
  @AppUserSearch
  Scenario Outline: Application should be able to search User
    Given Application user is on  search Application Users page
    And enter "<srchUser>" in username textfield
    When  select "<srchCountry>" and "<srchDataDmn>" and "<srchRoles>" from  drop down
    And Click search user button
    Then Search results should be displayed
    And Validate search results are For  the selected "<SearchResultUser>"

    Examples:

      | srchUser | srchRoles | srchCountry | srchDataDmn|SearchResultUser|
      | Lohith | sudo | Japan       |Claims|Lohith Sathyanarayana (LSathyanarayana)|