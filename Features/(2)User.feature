@Users
Feature: User search validation and creating a new user
  Searching an User for a specific country and adding a new User

  #Login:
  @Login
  Scenario: Verifying User Login with Valid Credentials
    Given User Navigates to IMSHealth Login Page
    When User Enters valid username and password
    And Click sign-in
    Then Home page should be displayed

    #User's Page:
  @NavigateUserModule
  Scenario: Application should be able to navigate to Search user page
    Given User Navigates to Manage Panel
    And  User clicks on User link
    Then User search screen should be displayed

    #Creating a New User:
  @UserCreation
  Scenario Outline: Create user and validate with Database that user got created
    Given Application user is on  search user page
    And Click on Add+ button to create new user
    Then Create user page appears
    And Enter the "<First Name>","<Last Name>","<Country>","<Address>","<City Name>"and"<Post Code>" of Address Tab
    And Select "<Contact Details>" with contact "<Value>" of Contact Tab
    And Enter "<Organisation Name>" and select the "<User Role>" of Roles Tab
    Then Click on Save Button
    And Validate the created user in the backend

    Examples:

      | First Name | Last Name | Country | Address            | City Name | Post Code | Contact Details | Value          | Organisation Name | User Role        |
      | Test User9 | Demo      | India   | Test User Address6 | Bangalore | 563210    | Email Address   | TestUser10@mail.com | Test Organisation -18|Dca Installer|

    #Searching User based on the Country:
  @UserSearch
  Scenario Outline: Application should be able to search users
    Given Application user is on  search user page
    When Select "<Country>" and "<Organisation>"from the respective drop down
    And Click search button
    Then Search results should be displayed
    And Validate search results "<email>" is for the created org

    Examples:

      | Country |Organisation|email|
      | Japan   |Test Organisation -18|TestUser10@mail.com|