@Login
Feature: User Login Validation
  Validating user login by passing valid credentials

  #Login:
  @SuccessLogin
  Scenario: Verifying User Login with Valid Credentials
    Given User Navigates to IMSHealth Login Page
    When User Enters valid username and password
    And Click sign-in
    Then Home page should be displayed