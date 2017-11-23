@ApplicationRoles
Feature: User Role validation and creating a new Role

  #Login:
  @Login
  Scenario: Verifying User Login with Valid Credentials
    Given User Navigates to IMSHealth Login Page
    When User Enters valid username and password
    And Click sign-in
    Then Home page should be displayed

    #Application Roles's Page:
  @NavigationTORoles
  Scenario: Application should be able to navigate to Search Application Roles page
    Given User Navigates to Manage Panel
    And User clicks on Application Roles link
    Then Application Roles search screen should be displayed

    #Creating a New Application Roles:
  @RoleCreation
  Scenario Outline: Create Application Roles and validate with Database that Role got created
    Given Application user is on  search Application Roles page page
    And Click on Add New button to create new Role
    Then Add New Application Role page appears
    And Enter the "<Role Name>"
    And Select "<Role Type>","<Functionality>","<Permissons>" from respective drop downs
    And Click Add Button
    And Click on role Save Button
    Then Preview Application Role page should be displayed
    Then press Cancel buton
    #And Validate the created Role in the backend

    Examples:

      | Role Name | Role Type | Functionality |Permissons|
      | autorole9 | Internal | Application Users|Preview|

   #Searching Application Roles:
  @searchRoles
  Scenario Outline: Application should be able to search Roles
    Given Application user is on  search Application Roles page
    When Enters "<Role Name>" in Role name textBox
    And Click Role search button
    Then Search results should be displayed
    And Validate search results are For  the "<selected Role>"

    Examples:

      | Role Name |selected Role|
      | autorole9|autorole9|