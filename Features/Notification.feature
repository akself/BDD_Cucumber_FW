@Notification
Feature: Adding notification to organisation

    #Login:
  @Login
  Scenario: Verifying User Login with Valid Credentials
    Given User Navigates to IMSHealth Login Page
    When User Enters valid username and password
    And Click sign-in
    Then Home page should be displayed

    #Organisation Page:
  @NavigateToOrgNotification
  Scenario: Application  should be able to navigate to Search Organisation Page
    Given User Navigates to Manage Panel
    And Click on Organisation link
    Then Organisation search screen should be displayed

    #Organisation Search based on Org name and adding notification:
  @AddingNotification
  Scenario Outline: Application  should be able to Search Org
    Given Application user is on search Organisation page
    When Enter  "<OrganisationName>"
    And Click search button
    Then Search results should be displayed
    And click on Modify org option
    Then Modify Organisation page should display
    Then click on Notification tab
    And click AddNotification button
    Then Add Notification For Organisation page should be displayed
    Then enter "<Scenario>","<EventGroup>","<EventCategory>","<EventType>","<DeliveryMethod>","<ContentType>","<ReportFileType>"
    And select scedule using "<StartDate>","<EndDate>","<ScheduleType>","<TimeZone>"
    And assign user by slecting from assigned users list
    Then click on save notification button
    And validate notification id with database



    Examples:
      | OrganisationName |Scenario|EventGroup|EventCategory|EventType|DeliveryMethod|ContentType|ReportFileType| StartDate|EndDate|ScheduleType|TimeZone|
      | Test Organisation -18 |Information|Report|Report |Data Quality Report|E-mail |Plain text |EXCEL         |2017-05-31|2018-05-31|Daily    |Asia/Tokyo|