@Reports
Feature: Report generation

  #Login:
  @login
  Scenario: Verifying User Login with Valid Credentials
    Given User Navigates to IMSHealth Login Page
    When User Enters valid username and password
    And Click sign-in
    Then Home page should be displayed

    #Reports Page:
    @extractReport
  Scenario Outline: Application should be able to navigate to Reports page and generate report
    Given User Navigates to Manage Panel
    And  User clicks on Reports link
    Then Report generation page should be displayed
    Then Select "<reportTyp>" from report type drop down
    And click generate report button
    And select records per page
    And validate report generated or not

    Examples:

      | reportTyp |
      |File Transfer|