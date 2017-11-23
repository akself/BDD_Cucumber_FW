$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("(1)Login.feature");
formatter.feature({
  "line": 2,
  "name": "User Login Validation",
  "description": "Validating user login by passing valid credentials",
  "id": "user-login-validation",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Login"
    }
  ]
});
formatter.scenario({
  "comments": [
    {
      "line": 5,
      "value": "#Login:"
    }
  ],
  "line": 6,
  "name": "Verifying User Login with Valid Credentials",
  "description": "",
  "id": "user-login-validation;verifying-user-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "User Navigates to IMSHealth Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User Enters valid username and password",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Click sign-in",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Home page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_Test.userNavigatesToIMSLoginPage()"
});
formatter.result({
  "duration": 13280300763,
  "status": "passed"
});
formatter.match({
  "location": "Login_Test.userEnterValidUNandPWD()"
});
formatter.result({
  "duration": 792166218,
  "status": "passed"
});
formatter.match({
  "location": "Login_Test.userClicksOnSigninButton()"
});
formatter.result({
  "duration": 2558352289,
  "status": "passed"
});
formatter.match({
  "location": "Login_Test.homePageShouldBeDisplayed()"
});
formatter.result({
  "duration": 1025152539,
  "status": "passed"
});
formatter.uri("(2)User.feature");
formatter.feature({
  "line": 2,
  "name": "User search validation and creating a new user",
  "description": "Searching an User for a specific country and adding a new User",
  "id": "user-search-validation-and-creating-a-new-user",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Users"
    }
  ]
});
formatter.scenario({
  "comments": [
    {
      "line": 5,
      "value": "#Login:"
    }
  ],
  "line": 6,
  "name": "Verifying User Login with Valid Credentials",
  "description": "",
  "id": "user-search-validation-and-creating-a-new-user;verifying-user-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "User Navigates to IMSHealth Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User Enters valid username and password",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Click sign-in",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Home page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_Test.userNavigatesToIMSLoginPage()"
});
formatter.result({
  "duration": 56245707,
  "status": "passed"
});
formatter.match({
  "location": "Login_Test.userEnterValidUNandPWD()"
});
formatter.result({
  "duration": 523919543,
  "status": "passed"
});
formatter.match({
  "location": "Login_Test.userClicksOnSigninButton()"
});
formatter.result({
  "duration": 2701365840,
  "status": "passed"
});
formatter.match({
  "location": "Login_Test.homePageShouldBeDisplayed()"
});
formatter.result({
  "duration": 909515312,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 12,
      "value": "#User\u0027s Page:"
    }
  ],
  "line": 13,
  "name": "Application should be able to navigate to Search user page",
  "description": "",
  "id": "user-search-validation-and-creating-a-new-user;application-should-be-able-to-navigate-to-search-user-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "User Navigates to Manage Panel",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "User clicks on User link",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User search screen should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "User_Test.user_Navigates_to_Manage_Panel()"
});
formatter.result({
  "duration": 1121104117,
  "status": "passed"
});
formatter.match({
  "location": "User_Test.user_clicks_on_User_link()"
});
formatter.result({
  "duration": 2537139917,
  "status": "passed"
});
formatter.match({
  "location": "User_Test.user_search_screen_should_be_displayed()"
});
formatter.result({
  "duration": 1060805760,
  "status": "passed"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 18,
      "value": "#Searching User based on the Country:"
    }
  ],
  "line": 19,
  "name": "Application should be able to search users",
  "description": "",
  "id": "user-search-validation-and-creating-a-new-user;application-should-be-able-to-search-users",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 20,
  "name": "Application user is on  search user page",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "Select \"\u003cCountry\u003e\" from the Country drop down",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "Click search button",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Search results should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "Validate search results are from the selected country.",
  "keyword": "And "
});
formatter.examples({
  "line": 26,
  "name": "",
  "description": "",
  "id": "user-search-validation-and-creating-a-new-user;application-should-be-able-to-search-users;",
  "rows": [
    {
      "cells": [
        "Country"
      ],
      "line": 28,
      "id": "user-search-validation-and-creating-a-new-user;application-should-be-able-to-search-users;;1"
    },
    {
      "cells": [
        "India"
      ],
      "line": 29,
      "id": "user-search-validation-and-creating-a-new-user;application-should-be-able-to-search-users;;2"
    },
    {
      "cells": [
        "Japan"
      ],
      "line": 30,
      "id": "user-search-validation-and-creating-a-new-user;application-should-be-able-to-search-users;;3"
    },
    {
      "cells": [
        "Ireland"
      ],
      "line": 31,
      "id": "user-search-validation-and-creating-a-new-user;application-should-be-able-to-search-users;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 29,
  "name": "Application should be able to search users",
  "description": "",
  "id": "user-search-validation-and-creating-a-new-user;application-should-be-able-to-search-users;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Users"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "Application user is on  search user page",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "Select \"India\" from the Country drop down",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "Click search button",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Search results should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "Validate search results are from the selected country.",
  "keyword": "And "
});
formatter.match({
  "location": "User_Test.application_user_is_on_search_user_page()"
});
formatter.result({
  "duration": 1961873,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "India",
      "offset": 8
    }
  ],
  "location": "User_Test.select_from_the_Country_drop_down(String)"
});
formatter.result({
  "duration": 195013664,
  "status": "passed"
});
formatter.match({
  "location": "User_Test.click_search_button()"
});
formatter.result({
  "duration": 124957665,
  "status": "passed"
});
formatter.match({
  "location": "User_Test.search_results_should_be_displayed()"
});
formatter.result({
  "duration": 121925,
  "status": "passed"
});
formatter.match({
  "location": "User_Test.validate_search_results_are_from_the_selected_country()"
});
formatter.result({
  "duration": 3426489273,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "Application should be able to search users",
  "description": "",
  "id": "user-search-validation-and-creating-a-new-user;application-should-be-able-to-search-users;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Users"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "Application user is on  search user page",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "Select \"Japan\" from the Country drop down",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "Click search button",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Search results should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "Validate search results are from the selected country.",
  "keyword": "And "
});
formatter.match({
  "location": "User_Test.application_user_is_on_search_user_page()"
});
formatter.result({
  "duration": 3477102,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Japan",
      "offset": 8
    }
  ],
  "location": "User_Test.select_from_the_Country_drop_down(String)"
});
formatter.result({
  "duration": 141590690,
  "status": "passed"
});
formatter.match({
  "location": "User_Test.click_search_button()"
});
formatter.result({
  "duration": 52691018,
  "status": "passed"
});
formatter.match({
  "location": "User_Test.search_results_should_be_displayed()"
});
formatter.result({
  "duration": 94830,
  "status": "passed"
});
formatter.match({
  "location": "User_Test.validate_search_results_are_from_the_selected_country()"
});
formatter.result({
  "duration": 3373429608,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "Application should be able to search users",
  "description": "",
  "id": "user-search-validation-and-creating-a-new-user;application-should-be-able-to-search-users;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Users"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "Application user is on  search user page",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "Select \"Ireland\" from the Country drop down",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "Click search button",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Search results should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "Validate search results are from the selected country.",
  "keyword": "And "
});
formatter.match({
  "location": "User_Test.application_user_is_on_search_user_page()"
});
formatter.result({
  "duration": 3109686,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ireland",
      "offset": 8
    }
  ],
  "location": "User_Test.select_from_the_Country_drop_down(String)"
});
formatter.result({
  "duration": 170243319,
  "status": "passed"
});
formatter.match({
  "location": "User_Test.click_search_button()"
});
formatter.result({
  "duration": 59930943,
  "status": "passed"
});
formatter.match({
  "location": "User_Test.search_results_should_be_displayed()"
});
formatter.result({
  "duration": 73483,
  "status": "passed"
});
formatter.match({
  "location": "User_Test.validate_search_results_are_from_the_selected_country()"
});
formatter.result({
  "duration": 3349397378,
  "status": "passed"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 33,
      "value": "#Creating a New User:"
    }
  ],
  "line": 34,
  "name": "Create user and validate with Database that user got created",
  "description": "",
  "id": "user-search-validation-and-creating-a-new-user;create-user-and-validate-with-database-that-user-got-created",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 35,
  "name": "Application user is on  search user page",
  "keyword": "Given "
});
formatter.step({
  "line": 36,
  "name": "Click on Add+ button to create new user",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "Create user page appears",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "Enter the \"\u003cFirst Name\u003e\",\"\u003cLast Name\u003e\",\"\u003cCountry\u003e\",\"\u003cAddress\u003e\",\"\u003cCity Name\u003e\"and\"\u003cPost Code\u003e\" of Address Tab",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "Select \"\u003cContact Details\u003e\" with contact \"\u003cValue\u003e\" of Contact Tab",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "Enter \"\u003cOrganisation Name\u003e\" and select the \"\u003cUser Role\u003e\" of Roles Tab",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "Click on Save Button",
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "Validate the created user in the backend",
  "keyword": "And "
});
formatter.examples({
  "line": 44,
  "name": "",
  "description": "",
  "id": "user-search-validation-and-creating-a-new-user;create-user-and-validate-with-database-that-user-got-created;",
  "rows": [
    {
      "cells": [
        "First Name",
        "Last Name",
        "Country",
        "Address",
        "City Name",
        "Post Code",
        "Contact Details",
        "Value",
        "Organisation Name",
        "User Role"
      ],
      "line": 46,
      "id": "user-search-validation-and-creating-a-new-user;create-user-and-validate-with-database-that-user-got-created;;1"
    },
    {
      "cells": [
        "Test User1",
        "Demo",
        "India",
        "Test User Address1",
        "Bangalore",
        "563210",
        "Email Address",
        "test1@mail.com",
        "IMSTest",
        "Business Contact"
      ],
      "line": 47,
      "id": "user-search-validation-and-creating-a-new-user;create-user-and-validate-with-database-that-user-got-created;;2"
    },
    {
      "cells": [
        "Test User2",
        "Demo",
        "Japan",
        "Test User Address2",
        "Chennai",
        "600028",
        "Email Address",
        "test2@mail.com",
        "Agent Test",
        "Dca Installer"
      ],
      "line": 48,
      "id": "user-search-validation-and-creating-a-new-user;create-user-and-validate-with-database-that-user-got-created;;3"
    },
    {
      "cells": [
        "Test User3",
        "Demo",
        "Ireland",
        "Test User Address3",
        "Mysore",
        "568746",
        "Email Address",
        "test3@mail.com",
        "IMSTest",
        "Business Contact"
      ],
      "line": 49,
      "id": "user-search-validation-and-creating-a-new-user;create-user-and-validate-with-database-that-user-got-created;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 47,
  "name": "Create user and validate with Database that user got created",
  "description": "",
  "id": "user-search-validation-and-creating-a-new-user;create-user-and-validate-with-database-that-user-got-created;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Users"
    }
  ]
});
formatter.step({
  "line": 35,
  "name": "Application user is on  search user page",
  "keyword": "Given "
});
formatter.step({
  "line": 36,
  "name": "Click on Add+ button to create new user",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "Create user page appears",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "Enter the \"Test User1\",\"Demo\",\"India\",\"Test User Address1\",\"Bangalore\"and\"563210\" of Address Tab",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "Select \"Email Address\" with contact \"test1@mail.com\" of Contact Tab",
  "matchedColumns": [
    6,
    7
  ],
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "Enter \"IMSTest\" and select the \"Business Contact\" of Roles Tab",
  "matchedColumns": [
    8,
    9
  ],
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "Click on Save Button",
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "Validate the created user in the backend",
  "keyword": "And "
});
formatter.match({
  "location": "User_Test.application_user_is_on_search_user_page()"
});
formatter.result({
  "duration": 2475023,
  "status": "passed"
});
formatter.match({
  "location": "User_Test.click_on_Add_button_to_create_new_user()"
});
formatter.result({
  "duration": 1324400836,
  "status": "passed"
});
formatter.match({
  "location": "User_Test.create_user_page_appears()"
});
formatter.result({
  "duration": 52005040,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test User1",
      "offset": 11
    },
    {
      "val": "Demo",
      "offset": 24
    },
    {
      "val": "India",
      "offset": 31
    },
    {
      "val": "Test User Address1",
      "offset": 39
    },
    {
      "val": "Bangalore",
      "offset": 60
    },
    {
      "val": "563210",
      "offset": 74
    }
  ],
  "location": "User_Test.enter_the_and_of_Address_Tab(String,String,String,String,String,String)"
});
formatter.result({
  "duration": 1112091979,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Email Address",
      "offset": 8
    },
    {
      "val": "test1@mail.com",
      "offset": 37
    }
  ],
  "location": "User_Test.select_with_contact_of_Contact_Tab(String,String)"
});
formatter.result({
  "duration": 5285325113,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "IMSTest",
      "offset": 7
    },
    {
      "val": "Business Contact",
      "offset": 32
    }
  ],
  "location": "User_Test.enter_and_select_the_of_Roles_Tab(String,String)"
});
formatter.result({
  "duration": 4527617914,
  "status": "passed"
});
formatter.match({
  "location": "User_Test.click_on_Save_Button()"
});
formatter.result({
  "duration": 574282915,
  "status": "passed"
});
formatter.match({
  "location": "User_Test.validate_the_created_user_in_the_backend()"
});
formatter.result({
  "duration": 32212392603,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\".label.label-ims.ng-binding\"}\n  (Session info: chrome\u003d54.0.2840.99)\n  (Driver info: chromedriver\u003d2.24.417431 (9aea000394714d2fbb20850021f6204f2256b9cf),platform\u003dWindows NT 6.1.7601 SP1 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 30.68 seconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1cd5757287168e54b817830adce9b0158d\u0027, time: \u00272016-06-30 19:26:09\u0027\nSystem info: host: \u0027BLRW3003539\u0027, ip: \u002710.205.51.164\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_77\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.24.417431 (9aea000394714d2fbb20850021f6204f2256b9cf), userDataDir\u003dC:\\Users\\ICHOWD~1\\AppData\\Local\\Temp\\scoped_dir8404_11784}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d54.0.2840.99, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: ec508a0e82349a98344a1be97eed8602\n*** Element info: {Using\u003dcss selector, value\u003d.label.label-ims.ng-binding}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByCssSelector(RemoteWebDriver.java:492)\r\n\tat org.openqa.selenium.By$ByCssSelector.findElement(By.java:430)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy18.getText(Unknown Source)\r\n\tat com.dca.objects.CreateUser_Page.setGetID(CreateUser_Page.java:177)\r\n\tat com.dca.stepDefinitions.User_Test.validate_the_created_user_in_the_backend(User_Test.java:109)\r\n\tat ✽.And Validate the created user in the backend((2)User.feature:42)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 48,
  "name": "Create user and validate with Database that user got created",
  "description": "",
  "id": "user-search-validation-and-creating-a-new-user;create-user-and-validate-with-database-that-user-got-created;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Users"
    }
  ]
});
formatter.step({
  "line": 35,
  "name": "Application user is on  search user page",
  "keyword": "Given "
});
formatter.step({
  "line": 36,
  "name": "Click on Add+ button to create new user",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "Create user page appears",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "Enter the \"Test User2\",\"Demo\",\"Japan\",\"Test User Address2\",\"Chennai\"and\"600028\" of Address Tab",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "Select \"Email Address\" with contact \"test2@mail.com\" of Contact Tab",
  "matchedColumns": [
    6,
    7
  ],
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "Enter \"Agent Test\" and select the \"Dca Installer\" of Roles Tab",
  "matchedColumns": [
    8,
    9
  ],
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "Click on Save Button",
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "Validate the created user in the backend",
  "keyword": "And "
});
formatter.match({
  "location": "User_Test.application_user_is_on_search_user_page()"
});
formatter.result({
  "duration": 1378935,
  "status": "passed"
});
formatter.match({
  "location": "User_Test.click_on_Add_button_to_create_new_user()"
});
formatter.result({
  "duration": 30033327627,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//translate[text()\u003d\u0027Add\u0027]\"}\n  (Session info: chrome\u003d54.0.2840.99)\n  (Driver info: chromedriver\u003d2.24.417431 (9aea000394714d2fbb20850021f6204f2256b9cf),platform\u003dWindows NT 6.1.7601 SP1 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 30.03 seconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1cd5757287168e54b817830adce9b0158d\u0027, time: \u00272016-06-30 19:26:09\u0027\nSystem info: host: \u0027BLRW3003539\u0027, ip: \u002710.205.51.164\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_77\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.24.417431 (9aea000394714d2fbb20850021f6204f2256b9cf), userDataDir\u003dC:\\Users\\ICHOWD~1\\AppData\\Local\\Temp\\scoped_dir8404_11784}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d54.0.2840.99, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: ec508a0e82349a98344a1be97eed8602\n*** Element info: {Using\u003dxpath, value\u003d//translate[text()\u003d\u0027Add\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:500)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy18.click(Unknown Source)\r\n\tat com.dca.objects.User_Page.setAdd_Btn(User_Page.java:79)\r\n\tat com.dca.stepDefinitions.User_Test.click_on_Add_button_to_create_new_user(User_Test.java:66)\r\n\tat ✽.And Click on Add+ button to create new user((2)User.feature:36)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "User_Test.create_user_page_appears()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Test User2",
      "offset": 11
    },
    {
      "val": "Demo",
      "offset": 24
    },
    {
      "val": "Japan",
      "offset": 31
    },
    {
      "val": "Test User Address2",
      "offset": 39
    },
    {
      "val": "Chennai",
      "offset": 60
    },
    {
      "val": "600028",
      "offset": 72
    }
  ],
  "location": "User_Test.enter_the_and_of_Address_Tab(String,String,String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Email Address",
      "offset": 8
    },
    {
      "val": "test2@mail.com",
      "offset": 37
    }
  ],
  "location": "User_Test.select_with_contact_of_Contact_Tab(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Agent Test",
      "offset": 7
    },
    {
      "val": "Dca Installer",
      "offset": 35
    }
  ],
  "location": "User_Test.enter_and_select_the_of_Roles_Tab(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "User_Test.click_on_Save_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "User_Test.validate_the_created_user_in_the_backend()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 49,
  "name": "Create user and validate with Database that user got created",
  "description": "",
  "id": "user-search-validation-and-creating-a-new-user;create-user-and-validate-with-database-that-user-got-created;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Users"
    }
  ]
});
formatter.step({
  "line": 35,
  "name": "Application user is on  search user page",
  "keyword": "Given "
});
formatter.step({
  "line": 36,
  "name": "Click on Add+ button to create new user",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "Create user page appears",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "Enter the \"Test User3\",\"Demo\",\"Ireland\",\"Test User Address3\",\"Mysore\"and\"568746\" of Address Tab",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "Select \"Email Address\" with contact \"test3@mail.com\" of Contact Tab",
  "matchedColumns": [
    6,
    7
  ],
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "Enter \"IMSTest\" and select the \"Business Contact\" of Roles Tab",
  "matchedColumns": [
    8,
    9
  ],
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "Click on Save Button",
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "Validate the created user in the backend",
  "keyword": "And "
});
formatter.match({
  "location": "User_Test.application_user_is_on_search_user_page()"
});
formatter.result({
  "duration": 1364157,
  "status": "passed"
});
formatter.match({
  "location": "User_Test.click_on_Add_button_to_create_new_user()"
});
formatter.result({
  "duration": 30042933376,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//translate[text()\u003d\u0027Add\u0027]\"}\n  (Session info: chrome\u003d54.0.2840.99)\n  (Driver info: chromedriver\u003d2.24.417431 (9aea000394714d2fbb20850021f6204f2256b9cf),platform\u003dWindows NT 6.1.7601 SP1 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 30.04 seconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1cd5757287168e54b817830adce9b0158d\u0027, time: \u00272016-06-30 19:26:09\u0027\nSystem info: host: \u0027BLRW3003539\u0027, ip: \u002710.205.51.164\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_77\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.24.417431 (9aea000394714d2fbb20850021f6204f2256b9cf), userDataDir\u003dC:\\Users\\ICHOWD~1\\AppData\\Local\\Temp\\scoped_dir8404_11784}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d54.0.2840.99, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: ec508a0e82349a98344a1be97eed8602\n*** Element info: {Using\u003dxpath, value\u003d//translate[text()\u003d\u0027Add\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:500)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy18.click(Unknown Source)\r\n\tat com.dca.objects.User_Page.setAdd_Btn(User_Page.java:79)\r\n\tat com.dca.stepDefinitions.User_Test.click_on_Add_button_to_create_new_user(User_Test.java:66)\r\n\tat ✽.And Click on Add+ button to create new user((2)User.feature:36)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "User_Test.create_user_page_appears()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Test User3",
      "offset": 11
    },
    {
      "val": "Demo",
      "offset": 24
    },
    {
      "val": "Ireland",
      "offset": 31
    },
    {
      "val": "Test User Address3",
      "offset": 41
    },
    {
      "val": "Mysore",
      "offset": 62
    },
    {
      "val": "568746",
      "offset": 73
    }
  ],
  "location": "User_Test.enter_the_and_of_Address_Tab(String,String,String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Email Address",
      "offset": 8
    },
    {
      "val": "test3@mail.com",
      "offset": 37
    }
  ],
  "location": "User_Test.select_with_contact_of_Contact_Tab(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "IMSTest",
      "offset": 7
    },
    {
      "val": "Business Contact",
      "offset": 32
    }
  ],
  "location": "User_Test.enter_and_select_the_of_Roles_Tab(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "User_Test.click_on_Save_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "User_Test.validate_the_created_user_in_the_backend()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("(3)Organisation.feature");
formatter.feature({
  "line": 2,
  "name": "Organisation search validation and creating a new Organisation",
  "description": "Searching an Organisation for a specific country and adding a new Organisation and\r\nModifying the newly created Organisation by creating Data Transfer",
  "id": "organisation-search-validation-and-creating-a-new-organisation",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Organisation"
    }
  ]
});
formatter.scenario({
  "comments": [
    {
      "line": 6,
      "value": "#Login:"
    }
  ],
  "line": 7,
  "name": "Verifying User Login with Valid Credentials",
  "description": "",
  "id": "organisation-search-validation-and-creating-a-new-organisation;verifying-user-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "User Navigates to IMSHealth Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User Enters valid username and password",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Click sign-in",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Home page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_Test.userNavigatesToIMSLoginPage()"
});
formatter.result({
  "duration": 97654824,
  "status": "passed"
});
formatter.match({
  "location": "Login_Test.userEnterValidUNandPWD()"
});
formatter.result({
  "duration": 487084026,
  "status": "passed"
});
formatter.match({
  "location": "Login_Test.userClicksOnSigninButton()"
});
formatter.result({
  "duration": 4512298963,
  "status": "passed"
});
formatter.match({
  "location": "Login_Test.homePageShouldBeDisplayed()"
});
formatter.result({
  "duration": 930615611,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 13,
      "value": "#Organisation Page:"
    }
  ],
  "line": 14,
  "name": "Application  should be able to navigate to Search Organisation Page",
  "description": "",
  "id": "organisation-search-validation-and-creating-a-new-organisation;application--should-be-able-to-navigate-to-search-organisation-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "User Navigates to Manage Panel",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "Click on Organisation link",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Organisation search screen should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "User_Test.user_Navigates_to_Manage_Panel()"
});
formatter.result({
  "duration": 1109409644,
  "status": "passed"
});
formatter.match({
  "location": "Organisation_Test.click_on_Organisation_link()"
});
formatter.result({
  "duration": 2468761303,
  "status": "passed"
});
formatter.match({
  "location": "Organisation_Test.organisation_search_screen_should_be_displayed()"
});
formatter.result({
  "duration": 127261,
  "status": "passed"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 19,
      "value": "#Organisation Search based on Country:"
    }
  ],
  "line": 20,
  "name": "Application  should be able to Search Org",
  "description": "",
  "id": "organisation-search-validation-and-creating-a-new-organisation;application--should-be-able-to-search-org",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 21,
  "name": "Application user is on search Organisation page",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "Select \"\u003cCountry\u003e\" from the Country drop down",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "Click search button",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Search results should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "Validate search results are from the selected country from the search results",
  "keyword": "And "
});
formatter.examples({
  "line": 27,
  "name": "",
  "description": "",
  "id": "organisation-search-validation-and-creating-a-new-organisation;application--should-be-able-to-search-org;",
  "rows": [
    {
      "cells": [
        "Country"
      ],
      "line": 28,
      "id": "organisation-search-validation-and-creating-a-new-organisation;application--should-be-able-to-search-org;;1"
    },
    {
      "cells": [
        "Ireland"
      ],
      "line": 29,
      "id": "organisation-search-validation-and-creating-a-new-organisation;application--should-be-able-to-search-org;;2"
    },
    {
      "cells": [
        "Japan"
      ],
      "line": 30,
      "id": "organisation-search-validation-and-creating-a-new-organisation;application--should-be-able-to-search-org;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 29,
  "name": "Application  should be able to Search Org",
  "description": "",
  "id": "organisation-search-validation-and-creating-a-new-organisation;application--should-be-able-to-search-org;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Organisation"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "Application user is on search Organisation page",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "Select \"Ireland\" from the Country drop down",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "Click search button",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Search results should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "Validate search results are from the selected country from the search results",
  "keyword": "And "
});
formatter.match({
  "location": "Organisation_Test.application_user_is_on_search_Organisation_page()"
});
formatter.result({
  "duration": 55869671,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ireland",
      "offset": 8
    }
  ],
  "location": "User_Test.select_from_the_Country_drop_down(String)"
});
formatter.result({
  "duration": 153698556,
  "status": "passed"
});
formatter.match({
  "location": "User_Test.click_search_button()"
});
formatter.result({
  "duration": 100551451,
  "status": "passed"
});
formatter.match({
  "location": "User_Test.search_results_should_be_displayed()"
});
formatter.result({
  "duration": 302964,
  "status": "passed"
});
formatter.match({
  "location": "Organisation_Test.validate_search_results_are_from_the_selected_country_from_the_search_results()"
});
formatter.result({
  "duration": 2051315366,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "Application  should be able to Search Org",
  "description": "",
  "id": "organisation-search-validation-and-creating-a-new-organisation;application--should-be-able-to-search-org;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Organisation"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "Application user is on search Organisation page",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "Select \"Japan\" from the Country drop down",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "Click search button",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Search results should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "Validate search results are from the selected country from the search results",
  "keyword": "And "
});
formatter.match({
  "location": "Organisation_Test.application_user_is_on_search_Organisation_page()"
});
formatter.result({
  "duration": 29077106,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Japan",
      "offset": 8
    }
  ],
  "location": "User_Test.select_from_the_Country_drop_down(String)"
});
formatter.result({
  "duration": 136306070,
  "status": "passed"
});
formatter.match({
  "location": "User_Test.click_search_button()"
});
formatter.result({
  "duration": 95295158,
  "status": "passed"
});
formatter.match({
  "location": "User_Test.search_results_should_be_displayed()"
});
formatter.result({
  "duration": 91136,
  "status": "passed"
});
formatter.match({
  "location": "Organisation_Test.validate_search_results_are_from_the_selected_country_from_the_search_results()"
});
formatter.result({
  "duration": 2036326063,
  "status": "passed"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 32,
      "value": "#Creating new Organisation:"
    }
  ],
  "line": 33,
  "name": "Creating a new organisation by adding basic details",
  "description": "",
  "id": "organisation-search-validation-and-creating-a-new-organisation;creating-a-new-organisation-by-adding-basic-details",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 34,
  "name": "Application User is on the Organisation page",
  "keyword": "Given "
});
formatter.step({
  "line": 35,
  "name": "Click on Add+ button to create new organisation",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "User selects \"\u003cOrganisation Type\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "user types in the \"\u003cName\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "selects the \"\u003cStatus\u003e\" dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "user selects the Contact Details tab",
  "keyword": "When "
});
formatter.step({
  "line": 41,
  "name": "user clicks the Add Contact Details button",
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "user selects the \"\u003cContact Details Type\u003e\" dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "user adds a \"\u003cValue\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "click the add button",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "user select an \"\u003cIdentifier\u003e\" and enter the value",
  "keyword": "Then "
});
formatter.step({
  "line": 47,
  "name": "User navigate to Address tab",
  "keyword": "When "
});
formatter.step({
  "line": 48,
  "name": "Click Add address button",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "user select \"\u003cCountry\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "enter \"\u003cAddress\u003e\",\"\u003cCity Name\u003e\" and \"\u003cZip Code\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "Select \"\u003cLocation Status\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "Check Primary Address checkbox",
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "click Add button",
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "Save organization",
  "keyword": "Then "
});
formatter.step({
  "line": 55,
  "name": "Validate the created organisation in the backend for newly created Organisation",
  "keyword": "And "
});
formatter.examples({
  "line": 57,
  "name": "",
  "description": "",
  "id": "organisation-search-validation-and-creating-a-new-organisation;creating-a-new-organisation-by-adding-basic-details;",
  "rows": [
    {
      "cells": [
        "Country",
        "Address",
        "City Name",
        "Zip Code",
        "Location Status",
        "Organisation Type",
        "Name",
        "Status",
        "Contact Details Type",
        "Value",
        "Identifier"
      ],
      "line": 58,
      "id": "organisation-search-validation-and-creating-a-new-organisation;creating-a-new-organisation-by-adding-basic-details;;1"
    },
    {
      "cells": [
        "India",
        "Test Address-1",
        "Bangalore",
        "564231",
        "Active",
        "Ims Health",
        "Test Organisation -1",
        "Active",
        "Email Address",
        "test1@mail.com",
        "Test Identifier-1"
      ],
      "line": 59,
      "id": "organisation-search-validation-and-creating-a-new-organisation;creating-a-new-organisation-by-adding-basic-details;;2"
    },
    {
      "cells": [
        "Japan",
        "Test Address-2",
        "Tokyo",
        "600028",
        "Active",
        "Gp Clinic",
        "Test Organisation -2",
        "Active",
        "Email Address",
        "test2@mail.com",
        "Test Identifier-2"
      ],
      "line": 60,
      "id": "organisation-search-validation-and-creating-a-new-organisation;creating-a-new-organisation-by-adding-basic-details;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 59,
  "name": "Creating a new organisation by adding basic details",
  "description": "",
  "id": "organisation-search-validation-and-creating-a-new-organisation;creating-a-new-organisation-by-adding-basic-details;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Organisation"
    }
  ]
});
formatter.step({
  "line": 34,
  "name": "Application User is on the Organisation page",
  "keyword": "Given "
});
formatter.step({
  "line": 35,
  "name": "Click on Add+ button to create new organisation",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "User selects \"Ims Health\"",
  "matchedColumns": [
    5
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "user types in the \"Test Organisation -1\"",
  "matchedColumns": [
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "selects the \"Active\" dropdown",
  "matchedColumns": [
    7
  ],
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "user selects the Contact Details tab",
  "keyword": "When "
});
formatter.step({
  "line": 41,
  "name": "user clicks the Add Contact Details button",
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "user selects the \"Email Address\" dropdown",
  "matchedColumns": [
    8
  ],
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "user adds a \"test1@mail.com\"",
  "matchedColumns": [
    9
  ],
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "click the add button",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "user select an \"Test Identifier-1\" and enter the value",
  "matchedColumns": [
    10
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 47,
  "name": "User navigate to Address tab",
  "keyword": "When "
});
formatter.step({
  "line": 48,
  "name": "Click Add address button",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "user select \"India\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "enter \"Test Address-1\",\"Bangalore\" and \"564231\"",
  "matchedColumns": [
    1,
    2,
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "Select \"Active\"",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "Check Primary Address checkbox",
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "click Add button",
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "Save organization",
  "keyword": "Then "
});
formatter.step({
  "line": 55,
  "name": "Validate the created organisation in the backend for newly created Organisation",
  "keyword": "And "
});
formatter.match({
  "location": "Organisation_Test.application_User_is_on_the_Organisation_page()"
});
formatter.result({
  "duration": 617421,
  "status": "passed"
});
formatter.match({
  "location": "Organisation_Test.click_on_Add_button_to_create_new_organisation()"
});
formatter.result({
  "duration": 69964043,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ims Health",
      "offset": 14
    }
  ],
  "location": "Organisation_Test.user_selects(String)"
});
formatter.result({
  "duration": 588929845,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test Organisation -1",
      "offset": 19
    }
  ],
  "location": "Organisation_Test.user_types_in_the(String)"
});
formatter.result({
  "duration": 183284707,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Active",
      "offset": 13
    }
  ],
  "location": "Organisation_Test.selects_the_dropdown(String)"
});
formatter.result({
  "duration": 210836733,
  "status": "passed"
});
formatter.match({
  "location": "Organisation_Test.user_selects_the_Contact_Details_tab()"
});
formatter.result({
  "duration": 158035285,
  "status": "passed"
});
formatter.match({
  "location": "Organisation_Test.user_clicks_the_Add_Contact_Details_button()"
});
formatter.result({
  "duration": 34484,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Email Address",
      "offset": 18
    }
  ],
  "location": "Organisation_Test.user_selects_the_dropdown(String)"
});
formatter.result({
  "duration": 105093,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test1@mail.com",
      "offset": 13
    }
  ],
  "location": "Organisation_Test.user_adds_a(String)"
});
formatter.result({
  "duration": 152770782,
  "status": "passed"
});
formatter.match({
  "location": "Organisation_Test.click_the_add_button()"
});
formatter.result({
  "duration": 29147,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test Identifier-1",
      "offset": 16
    }
  ],
  "location": "Organisation_Test.user_select_an_and_enter_the_value(String)"
});
formatter.result({
  "duration": 3303619100,
  "status": "passed"
});
formatter.match({
  "location": "Organisation_Test.user_navigate_to_Address_tab()"
});
formatter.result({
  "duration": 90835272,
  "status": "passed"
});
formatter.match({
  "location": "Organisation_Test.click_Add_address_button()"
});
formatter.result({
  "duration": 1666060740,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "India",
      "offset": 13
    }
  ],
  "location": "Organisation_Test.selectcountry(String)"
});
formatter.result({
  "duration": 706012512,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test Address-1",
      "offset": 7
    },
    {
      "val": "Bangalore",
      "offset": 24
    },
    {
      "val": "564231",
      "offset": 40
    }
  ],
  "location": "Organisation_Test.enter_and(String,String,String)"
});
formatter.result({
  "duration": 494485284,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Active",
      "offset": 8
    }
  ],
  "location": "Organisation_Test.select(String)"
});
formatter.result({
  "duration": 219516761,
  "status": "passed"
});
formatter.match({
  "location": "Organisation_Test.check_Primary_Address_checkbox()"
});
formatter.result({
  "duration": 91767152,
  "status": "passed"
});
formatter.match({
  "location": "Organisation_Test.click_Add_button()"
});
formatter.result({
  "duration": 73498206,
  "status": "passed"
});
formatter.match({
  "location": "Organisation_Test.save_organization()"
});
formatter.result({
  "duration": 2075522479,
  "status": "passed"
});
formatter.match({
  "location": "Organisation_Test.validate_the_created_user_in_the_backend_for_newly_created_Organisation()"
});
formatter.result({
  "duration": 3831457053,
  "error_message": "java.lang.ClassNotFoundException: oracle.jdbc.driver.OracleDriver\r\n\tat java.net.URLClassLoader.findClass(URLClassLoader.java:381)\r\n\tat java.lang.ClassLoader.loadClass(ClassLoader.java:424)\r\n\tat sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:331)\r\n\tat java.lang.ClassLoader.loadClass(ClassLoader.java:357)\r\n\tat java.lang.Class.forName0(Native Method)\r\n\tat java.lang.Class.forName(Class.java:264)\r\n\tat com.dca.objects.Organisation_Page.Oracle_Org_Validation(Organisation_Page.java:275)\r\n\tat com.dca.stepDefinitions.Organisation_Test.validate_the_created_user_in_the_backend_for_newly_created_Organisation(Organisation_Test.java:147)\r\n\tat ✽.And Validate the created organisation in the backend for newly created Organisation((3)Organisation.feature:55)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 60,
  "name": "Creating a new organisation by adding basic details",
  "description": "",
  "id": "organisation-search-validation-and-creating-a-new-organisation;creating-a-new-organisation-by-adding-basic-details;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Organisation"
    }
  ]
});
formatter.step({
  "line": 34,
  "name": "Application User is on the Organisation page",
  "keyword": "Given "
});
formatter.step({
  "line": 35,
  "name": "Click on Add+ button to create new organisation",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "User selects \"Gp Clinic\"",
  "matchedColumns": [
    5
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "user types in the \"Test Organisation -2\"",
  "matchedColumns": [
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "selects the \"Active\" dropdown",
  "matchedColumns": [
    7
  ],
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "user selects the Contact Details tab",
  "keyword": "When "
});
formatter.step({
  "line": 41,
  "name": "user clicks the Add Contact Details button",
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "user selects the \"Email Address\" dropdown",
  "matchedColumns": [
    8
  ],
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "user adds a \"test2@mail.com\"",
  "matchedColumns": [
    9
  ],
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "click the add button",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "user select an \"Test Identifier-2\" and enter the value",
  "matchedColumns": [
    10
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 47,
  "name": "User navigate to Address tab",
  "keyword": "When "
});
formatter.step({
  "line": 48,
  "name": "Click Add address button",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "user select \"Japan\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "enter \"Test Address-2\",\"Tokyo\" and \"600028\"",
  "matchedColumns": [
    1,
    2,
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "Select \"Active\"",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "Check Primary Address checkbox",
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "click Add button",
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "Save organization",
  "keyword": "Then "
});
formatter.step({
  "line": 55,
  "name": "Validate the created organisation in the backend for newly created Organisation",
  "keyword": "And "
});
formatter.match({
  "location": "Organisation_Test.application_User_is_on_the_Organisation_page()"
});
formatter.result({
  "duration": 580065,
  "status": "passed"
});
formatter.match({
  "location": "Organisation_Test.click_on_Add_button_to_create_new_organisation()"
});
formatter.result({
  "duration": 230452594,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Gp Clinic",
      "offset": 14
    }
  ],
  "location": "Organisation_Test.user_selects(String)"
});
formatter.result({
  "duration": 356474736,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test Organisation -2",
      "offset": 19
    }
  ],
  "location": "Organisation_Test.user_types_in_the(String)"
});
formatter.result({
  "duration": 178289504,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Active",
      "offset": 13
    }
  ],
  "location": "Organisation_Test.selects_the_dropdown(String)"
});
formatter.result({
  "duration": 270167907,
  "status": "passed"
});
formatter.match({
  "location": "Organisation_Test.user_selects_the_Contact_Details_tab()"
});
formatter.result({
  "duration": 84873296,
  "status": "passed"
});
formatter.match({
  "location": "Organisation_Test.user_clicks_the_Add_Contact_Details_button()"
});
formatter.result({
  "duration": 25863,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Email Address",
      "offset": 18
    }
  ],
  "location": "Organisation_Test.user_selects_the_dropdown(String)"
});
formatter.result({
  "duration": 96062,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test2@mail.com",
      "offset": 13
    }
  ],
  "location": "Organisation_Test.user_adds_a(String)"
});
formatter.result({
  "duration": 127695421,
  "status": "passed"
});
formatter.match({
  "location": "Organisation_Test.click_the_add_button()"
});
formatter.result({
  "duration": 29147,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test Identifier-2",
      "offset": 16
    }
  ],
  "location": "Organisation_Test.user_select_an_and_enter_the_value(String)"
});
formatter.result({
  "duration": 3236227785,
  "status": "passed"
});
formatter.match({
  "location": "Organisation_Test.user_navigate_to_Address_tab()"
});
formatter.result({
  "duration": 77336565,
  "status": "passed"
});
formatter.match({
  "location": "Organisation_Test.click_Add_address_button()"
});
formatter.result({
  "duration": 1623032122,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Japan",
      "offset": 13
    }
  ],
  "location": "Organisation_Test.selectcountry(String)"
});
formatter.result({
  "duration": 173265155,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test Address-2",
      "offset": 7
    },
    {
      "val": "Tokyo",
      "offset": 24
    },
    {
      "val": "600028",
      "offset": 36
    }
  ],
  "location": "Organisation_Test.enter_and(String,String,String)"
});
formatter.result({
  "duration": 425280703,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Active",
      "offset": 8
    }
  ],
  "location": "Organisation_Test.select(String)"
});
formatter.result({
  "duration": 167667309,
  "status": "passed"
});
formatter.match({
  "location": "Organisation_Test.check_Primary_Address_checkbox()"
});
formatter.result({
  "duration": 99652002,
  "status": "passed"
});
formatter.match({
  "location": "Organisation_Test.click_Add_button()"
});
formatter.result({
  "duration": 56244476,
  "status": "passed"
});
formatter.match({
  "location": "Organisation_Test.save_organization()"
});
formatter.result({
  "duration": 2066593265,
  "status": "passed"
});
formatter.match({
  "location": "Organisation_Test.validate_the_created_user_in_the_backend_for_newly_created_Organisation()"
});
formatter.result({
  "duration": 3476581701,
  "error_message": "java.lang.ClassNotFoundException: oracle.jdbc.driver.OracleDriver\r\n\tat java.net.URLClassLoader.findClass(URLClassLoader.java:381)\r\n\tat java.lang.ClassLoader.loadClass(ClassLoader.java:424)\r\n\tat sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:331)\r\n\tat java.lang.ClassLoader.loadClass(ClassLoader.java:357)\r\n\tat java.lang.Class.forName0(Native Method)\r\n\tat java.lang.Class.forName(Class.java:264)\r\n\tat com.dca.objects.Organisation_Page.Oracle_Org_Validation(Organisation_Page.java:275)\r\n\tat com.dca.stepDefinitions.Organisation_Test.validate_the_created_user_in_the_backend_for_newly_created_Organisation(Organisation_Test.java:147)\r\n\tat ✽.And Validate the created organisation in the backend for newly created Organisation((3)Organisation.feature:55)\r\n",
  "status": "failed"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 63,
      "value": "#Data Transfer:"
    }
  ],
  "line": 64,
  "name": "Modify the newly created organisation",
  "description": "",
  "id": "organisation-search-validation-and-creating-a-new-organisation;modify-the-newly-created-organisation",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 65,
  "name": "User is on Search Organization page",
  "keyword": "Given "
});
formatter.step({
  "line": 66,
  "name": "user select Modify option from Action",
  "keyword": "And "
});
formatter.step({
  "line": 67,
  "name": "Modify Org Page should display",
  "keyword": "Then "
});
formatter.step({
  "line": 69,
  "name": "user selects the Data Transfer tab",
  "keyword": "Given "
});
formatter.step({
  "line": 70,
  "name": "select \"\u003cData Domain\u003e\" and \"\u003cPanel Status\u003e\" from the dropdown",
  "keyword": "Then "
});
formatter.step({
  "line": 71,
  "name": "Click on Add button",
  "keyword": "And "
});
formatter.step({
  "line": 72,
  "name": "Selected data domain and Panel Status should be displayed in table",
  "keyword": "Then "
});
formatter.step({
  "line": 74,
  "name": "user is able to see newly created domain and Panel status in the table",
  "keyword": "Given "
});
formatter.step({
  "line": 75,
  "name": "select \"\u003cDomain with associated Panel Status\u003e\" from the dropdown",
  "keyword": "Then "
});
formatter.step({
  "line": 76,
  "name": "select \"\u003cData Type\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 77,
  "name": "click start configuration button",
  "keyword": "Then "
});
formatter.step({
  "line": 78,
  "name": "Organization / Add Data Transfer Configuration page should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 80,
  "name": "User is on Organization / Add Data Transfer Configuration page General setting page",
  "keyword": "Given "
});
formatter.step({
  "line": 81,
  "name": "Data Domain ,Panel status and Data type fields are prepopulated",
  "keyword": "And "
});
formatter.step({
  "line": 82,
  "name": "user types \"\u003cData Owner\u003e\" in data owner name and select one of the suggestion",
  "keyword": "Then "
});
formatter.step({
  "line": 83,
  "name": "select \"\u003cData Collection Method\u003e\" and \"\u003cTransfer Direction\u003e\" from the drop down",
  "keyword": "And "
});
formatter.step({
  "line": 84,
  "name": "select \"\u003cStart Date\u003e\" from the Transfer schedule text box",
  "keyword": "And "
});
formatter.step({
  "line": 85,
  "name": "select schedule from the \"\u003cTransfer Schedule Type\u003e\" drop down.",
  "keyword": "And "
});
formatter.step({
  "line": 87,
  "name": "user is able to navigate to File transfer details tab",
  "keyword": "Given "
});
formatter.step({
  "line": 88,
  "name": "select \"\u003cPrimary Transfer Method\u003e\" and \"\u003cAlternate Method\u003e\" from the respective dropdowns",
  "keyword": "Then "
});
formatter.step({
  "line": 89,
  "name": "FTP account drop down should have create new account options",
  "keyword": "Then "
});
formatter.step({
  "line": 90,
  "name": "select a FTP Host Provider value from \"\u003cFTP Host Provider\u003e\" drop down",
  "keyword": "And "
});
formatter.step({
  "line": 91,
  "name": "select a Data Transfer Software value from \"\u003cData Transfer Software\u003e\" type dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 92,
  "name": "select a MFT Domain value from \"\u003cMFT Domain\u003e\" dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 93,
  "name": "select a MFT Country value from \"\u003cMFT Country\u003e\" dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 94,
  "name": "select a MFT Workflow value from \"\u003cMFT Workflow\u003e\" drop down",
  "keyword": "And "
});
formatter.step({
  "line": 95,
  "name": "validate File transfer host name preopulated as mft.imshealth.com",
  "keyword": "Then "
});
formatter.step({
  "line": 96,
  "name": "select a FTP Type value from \"\u003cFTP Type\u003e\" drop down",
  "keyword": "And "
});
formatter.step({
  "line": 97,
  "name": "validate * Input directory path prepopulated as /in",
  "keyword": "And "
});
formatter.step({
  "line": 98,
  "name": "validate Output directory path prepopulated as /out",
  "keyword": "And "
});
formatter.step({
  "line": 99,
  "name": "Click on Alternate Transfer method –Email",
  "keyword": "And "
});
formatter.step({
  "line": 100,
  "name": "enter \"\u003cEmail Address\u003e\" in email address text filed",
  "keyword": "Then "
});
formatter.step({
  "line": 101,
  "name": "enter again \"\u003cConfirm Email Address\u003e\" in email address confirmation field.",
  "keyword": "And "
});
formatter.step({
  "line": 103,
  "name": "user is able to navigate to File Specification tab",
  "keyword": "Given "
});
formatter.step({
  "line": 104,
  "name": "select a Specification Template value from \"\u003cSpecification Template\u003e\" dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 105,
  "name": "Check File encryption check box",
  "keyword": "And "
});
formatter.step({
  "line": 106,
  "name": "select a Encrypted value from \"\u003cEncrypted by\u003e\" drop down",
  "keyword": "And "
});
formatter.step({
  "line": 107,
  "name": "Generate Encryption keypair check box should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 109,
  "name": "user is able to navigate to Activation Details tab",
  "keyword": "Given "
});
formatter.step({
  "line": 110,
  "name": "select Activate Immediate check box",
  "keyword": "Then "
});
formatter.step({
  "line": 111,
  "name": "uncheck no end date check box",
  "keyword": "And "
});
formatter.step({
  "line": 112,
  "name": "enter the \"\u003cActivation End Date\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 113,
  "name": "click on Save button",
  "keyword": "And "
});
formatter.step({
  "line": 114,
  "name": "data transfer successfully created message should be displayed and user navigate to modify org page.",
  "keyword": "Then "
});
formatter.step({
  "line": 116,
  "name": "user is on Modify org page",
  "keyword": "Given "
});
formatter.step({
  "line": 117,
  "name": "click on Data Transfer tab",
  "keyword": "And "
});
formatter.step({
  "line": 118,
  "name": "list of data transfer should be displayed and status as Active.",
  "keyword": "Then "
});
formatter.examples({
  "line": 120,
  "name": "",
  "description": "",
  "id": "organisation-search-validation-and-creating-a-new-organisation;modify-the-newly-created-organisation;",
  "rows": [
    {
      "cells": [
        "Data Domain",
        "Panel Status",
        "Domain with associated Panel Status",
        "Data Type",
        "Data Owner",
        "Data Collection Method",
        "Transfer Direction",
        "Start Date",
        "Transfer Schedule Type",
        "Primary Transfer Method",
        "Alternate Method",
        "FTP Host Provider",
        "Data Transfer Software",
        "MFT Domain",
        "MFT Country",
        "MFT Workflow",
        "FTP Type",
        "Email Address",
        "Confirm Email Address",
        "Specification Template",
        "Encrypted by",
        "Activation End Date"
      ],
      "line": 121,
      "id": "organisation-search-validation-and-creating-a-new-organisation;modify-the-newly-created-organisation;;1"
    },
    {
      "cells": [
        "Claims",
        "ACTIVE",
        "Claims - ACTIVE",
        "Patient",
        "Mahendra",
        "Direct",
        "To IMS",
        "2016-11-03",
        "Daily",
        "File transfer",
        "Email",
        "IMS DCP",
        "Data collection agent",
        "Carlstadt GDC Internal",
        "Internal Test",
        "_nopflowXT",
        "FTP",
        "test1@mail.com",
        "test1@mail.com",
        "Global SIN INV IND",
        "IMS DCP",
        "2016-11-18"
      ],
      "line": 122,
      "id": "organisation-search-validation-and-creating-a-new-organisation;modify-the-newly-created-organisation;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 122,
  "name": "Modify the newly created organisation",
  "description": "",
  "id": "organisation-search-validation-and-creating-a-new-organisation;modify-the-newly-created-organisation;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Organisation"
    }
  ]
});
formatter.step({
  "line": 65,
  "name": "User is on Search Organization page",
  "keyword": "Given "
});
formatter.step({
  "line": 66,
  "name": "user select Modify option from Action",
  "keyword": "And "
});
formatter.step({
  "line": 67,
  "name": "Modify Org Page should display",
  "keyword": "Then "
});
formatter.step({
  "line": 69,
  "name": "user selects the Data Transfer tab",
  "keyword": "Given "
});
formatter.step({
  "line": 70,
  "name": "select \"Claims\" and \"ACTIVE\" from the dropdown",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 71,
  "name": "Click on Add button",
  "keyword": "And "
});
formatter.step({
  "line": 72,
  "name": "Selected data domain and Panel Status should be displayed in table",
  "keyword": "Then "
});
formatter.step({
  "line": 74,
  "name": "user is able to see newly created domain and Panel status in the table",
  "keyword": "Given "
});
formatter.step({
  "line": 75,
  "name": "select \"Claims - ACTIVE\" from the dropdown",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 76,
  "name": "select \"Patient\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 77,
  "name": "click start configuration button",
  "keyword": "Then "
});
formatter.step({
  "line": 78,
  "name": "Organization / Add Data Transfer Configuration page should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 80,
  "name": "User is on Organization / Add Data Transfer Configuration page General setting page",
  "keyword": "Given "
});
formatter.step({
  "line": 81,
  "name": "Data Domain ,Panel status and Data type fields are prepopulated",
  "keyword": "And "
});
formatter.step({
  "line": 82,
  "name": "user types \"Mahendra\" in data owner name and select one of the suggestion",
  "matchedColumns": [
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 83,
  "name": "select \"Direct\" and \"To IMS\" from the drop down",
  "matchedColumns": [
    5,
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 84,
  "name": "select \"2016-11-03\" from the Transfer schedule text box",
  "matchedColumns": [
    7
  ],
  "keyword": "And "
});
formatter.step({
  "line": 85,
  "name": "select schedule from the \"Daily\" drop down.",
  "matchedColumns": [
    8
  ],
  "keyword": "And "
});
formatter.step({
  "line": 87,
  "name": "user is able to navigate to File transfer details tab",
  "keyword": "Given "
});
formatter.step({
  "line": 88,
  "name": "select \"File transfer\" and \"Email\" from the respective dropdowns",
  "matchedColumns": [
    9,
    10
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 89,
  "name": "FTP account drop down should have create new account options",
  "keyword": "Then "
});
formatter.step({
  "line": 90,
  "name": "select a FTP Host Provider value from \"IMS DCP\" drop down",
  "matchedColumns": [
    11
  ],
  "keyword": "And "
});
formatter.step({
  "line": 91,
  "name": "select a Data Transfer Software value from \"Data collection agent\" type dropdown",
  "matchedColumns": [
    12
  ],
  "keyword": "And "
});
formatter.step({
  "line": 92,
  "name": "select a MFT Domain value from \"Carlstadt GDC Internal\" dropdown",
  "matchedColumns": [
    13
  ],
  "keyword": "And "
});
formatter.step({
  "line": 93,
  "name": "select a MFT Country value from \"Internal Test\" dropdown",
  "matchedColumns": [
    14
  ],
  "keyword": "And "
});
formatter.step({
  "line": 94,
  "name": "select a MFT Workflow value from \"_nopflowXT\" drop down",
  "matchedColumns": [
    15
  ],
  "keyword": "And "
});
formatter.step({
  "line": 95,
  "name": "validate File transfer host name preopulated as mft.imshealth.com",
  "keyword": "Then "
});
formatter.step({
  "line": 96,
  "name": "select a FTP Type value from \"FTP\" drop down",
  "matchedColumns": [
    16
  ],
  "keyword": "And "
});
formatter.step({
  "line": 97,
  "name": "validate * Input directory path prepopulated as /in",
  "keyword": "And "
});
formatter.step({
  "line": 98,
  "name": "validate Output directory path prepopulated as /out",
  "keyword": "And "
});
formatter.step({
  "line": 99,
  "name": "Click on Alternate Transfer method –Email",
  "keyword": "And "
});
formatter.step({
  "line": 100,
  "name": "enter \"test1@mail.com\" in email address text filed",
  "matchedColumns": [
    17
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 101,
  "name": "enter again \"test1@mail.com\" in email address confirmation field.",
  "matchedColumns": [
    18
  ],
  "keyword": "And "
});
formatter.step({
  "line": 103,
  "name": "user is able to navigate to File Specification tab",
  "keyword": "Given "
});
formatter.step({
  "line": 104,
  "name": "select a Specification Template value from \"Global SIN INV IND\" dropdown",
  "matchedColumns": [
    19
  ],
  "keyword": "And "
});
formatter.step({
  "line": 105,
  "name": "Check File encryption check box",
  "keyword": "And "
});
formatter.step({
  "line": 106,
  "name": "select a Encrypted value from \"IMS DCP\" drop down",
  "matchedColumns": [
    20
  ],
  "keyword": "And "
});
formatter.step({
  "line": 107,
  "name": "Generate Encryption keypair check box should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 109,
  "name": "user is able to navigate to Activation Details tab",
  "keyword": "Given "
});
formatter.step({
  "line": 110,
  "name": "select Activate Immediate check box",
  "keyword": "Then "
});
formatter.step({
  "line": 111,
  "name": "uncheck no end date check box",
  "keyword": "And "
});
formatter.step({
  "line": 112,
  "name": "enter the \"2016-11-18\"",
  "matchedColumns": [
    21
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 113,
  "name": "click on Save button",
  "keyword": "And "
});
formatter.step({
  "line": 114,
  "name": "data transfer successfully created message should be displayed and user navigate to modify org page.",
  "keyword": "Then "
});
formatter.step({
  "line": 116,
  "name": "user is on Modify org page",
  "keyword": "Given "
});
formatter.step({
  "line": 117,
  "name": "click on Data Transfer tab",
  "keyword": "And "
});
formatter.step({
  "line": 118,
  "name": "list of data transfer should be displayed and status as Active.",
  "keyword": "Then "
});
formatter.match({
  "location": "DataTransfer_Test.user_is_on_Search_Organization_page()"
});
formatter.result({
  "duration": 137110689,
  "status": "passed"
});
formatter.match({
  "location": "DataTransfer_Test.user_select_Modify_option_from_Action()"
});
formatter.result({
  "duration": 4713554168,
  "status": "passed"
});
formatter.match({
  "location": "DataTransfer_Test.modify_Org_Page_should_display()"
});
formatter.result({
  "duration": 624702937,
  "status": "passed"
});
formatter.match({
  "location": "DataTransfer_Test.user_selects_the_Data_Transfer_tab()"
});
formatter.result({
  "duration": 1081196271,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Claims",
      "offset": 8
    },
    {
      "val": "ACTIVE",
      "offset": 21
    }
  ],
  "location": "DataTransfer_Test.select_and_from_the_dropdown(String,String)"
});
formatter.result({
  "duration": 338975105,
  "status": "passed"
});
formatter.match({
  "location": "DataTransfer_Test.click_on_Add_button()"
});
formatter.result({
  "duration": 95984010,
  "status": "passed"
});
formatter.match({
  "location": "DataTransfer_Test.select_data_domain_and_Panel_Status_should_be_displayed_in_table()"
});
formatter.result({
  "duration": 91546,
  "status": "passed"
});
formatter.match({
  "location": "DataTransfer_Test.user_is_able_to_see_newly_created_domain_and_Panel_status_in_the_table()"
});
formatter.result({
  "duration": 58705,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Claims - ACTIVE",
      "offset": 8
    }
  ],
  "location": "DataTransfer_Test.select_from_the_dropdown(String)"
});
formatter.result({
  "duration": 149970627,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Patient",
      "offset": 8
    }
  ],
  "location": "DataTransfer_Test.select(String)"
});
formatter.result({
  "duration": 425553288,
  "status": "passed"
});
formatter.match({
  "location": "DataTransfer_Test.click_start_configuration_button()"
});
formatter.result({
  "duration": 89654207,
  "status": "passed"
});
formatter.match({
  "location": "DataTransfer_Test.organization_Add_Data_Transfer_Configuration_page_should_be_displayed()"
});
formatter.result({
  "duration": 77999,
  "status": "passed"
});
formatter.match({
  "location": "DataTransfer_Test.user_is_on_Organization_Add_Data_Transfer_Configuration_page_General_setting_page()"
});
formatter.result({
  "duration": 26294194,
  "status": "passed"
});
formatter.match({
  "location": "DataTransfer_Test.data_Domain_Panel_status_and_Data_type_fields_are_prepopulated()"
});
formatter.result({
  "duration": 68967,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mahendra",
      "offset": 12
    }
  ],
  "location": "DataTransfer_Test.user_types_in_data_owner_name_and_select_one_of_the_suggestion(String)"
});
formatter.result({
  "duration": 30063181847,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"name\",\"selector\":\"dataOwner\"}\n  (Session info: chrome\u003d54.0.2840.99)\n  (Driver info: chromedriver\u003d2.24.417431 (9aea000394714d2fbb20850021f6204f2256b9cf),platform\u003dWindows NT 6.1.7601 SP1 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 30.06 seconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1cd5757287168e54b817830adce9b0158d\u0027, time: \u00272016-06-30 19:26:09\u0027\nSystem info: host: \u0027BLRW3003539\u0027, ip: \u002710.205.51.164\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_77\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.24.417431 (9aea000394714d2fbb20850021f6204f2256b9cf), userDataDir\u003dC:\\Users\\ICHOWD~1\\AppData\\Local\\Temp\\scoped_dir8404_11784}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d54.0.2840.99, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: ec508a0e82349a98344a1be97eed8602\n*** Element info: {Using\u003dname, value\u003ddataOwner}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByName(RemoteWebDriver.java:461)\r\n\tat org.openqa.selenium.By$ByName.findElement(By.java:303)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy18.sendKeys(Unknown Source)\r\n\tat com.dca.objects.DataTransfer_Page.setDataOwnerBox(DataTransfer_Page.java:188)\r\n\tat com.dca.stepDefinitions.DataTransfer_Test.user_types_in_data_owner_name_and_select_one_of_the_suggestion(DataTransfer_Test.java:99)\r\n\tat ✽.Then user types \"Mahendra\" in data owner name and select one of the suggestion((3)Organisation.feature:82)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Direct",
      "offset": 8
    },
    {
      "val": "To IMS",
      "offset": 21
    }
  ],
  "location": "DataTransfer_Test.select_and_from_the_drop_down(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "2016-11-03",
      "offset": 8
    }
  ],
  "location": "DataTransfer_Test.select_from_the_Transfer_schedule_text_box(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Daily",
      "offset": 26
    }
  ],
  "location": "DataTransfer_Test.select_schedule_from_the_drop_down(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DataTransfer_Test.user_is_able_to_navigate_to_File_transfer_details_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "File transfer",
      "offset": 8
    },
    {
      "val": "Email",
      "offset": 28
    }
  ],
  "location": "DataTransfer_Test.select_and_from_the_respective_dropdowns(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DataTransfer_Test.ftp_account_drop_down_should_have_create_new_account_options()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "IMS DCP",
      "offset": 39
    }
  ],
  "location": "DataTransfer_Test.select_a_value_from_drop_down(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Data collection agent",
      "offset": 44
    }
  ],
  "location": "DataTransfer_Test.select_a_value_from_type_dropdown(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Carlstadt GDC Internal",
      "offset": 32
    }
  ],
  "location": "DataTransfer_Test.select_a_mft_value_from_type_dropdown(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Internal Test",
      "offset": 33
    }
  ],
  "location": "DataTransfer_Test.select_a_MFT_Country_value_from_dropdown(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "_nopflowXT",
      "offset": 34
    }
  ],
  "location": "DataTransfer_Test.select_a_MFT_Workflow_value_from_drop_down(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DataTransfer_Test.validate_File_transfer_host_name_preopulated_as_mft_imshealth_com()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "FTP",
      "offset": 30
    }
  ],
  "location": "DataTransfer_Test.select_a_FTP_Type_value_from_drop_down(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DataTransfer_Test.validate_Input_directory_path_prepopulated_as_in()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DataTransfer_Test.validate_Output_directory_path_prepopulated_as_out()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DataTransfer_Test.click_on_Alternate_Transfer_method_Email()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "test1@mail.com",
      "offset": 7
    }
  ],
  "location": "DataTransfer_Test.enter_in_email_address_text_filed(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "test1@mail.com",
      "offset": 13
    }
  ],
  "location": "DataTransfer_Test.enter_again_in_email_address_confirmation_field(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DataTransfer_Test.user_is_able_to_navigate_to_File_Specification_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Global SIN INV IND",
      "offset": 44
    }
  ],
  "location": "DataTransfer_Test.select_a_Specification_Template_value_from_dropdown(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DataTransfer_Test.check_File_encryption_check_box()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "IMS DCP",
      "offset": 31
    }
  ],
  "location": "DataTransfer_Test.select_a_Encrypted_value_from_drop_down(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DataTransfer_Test.generate_Encryption_keypair_check_box_should_be_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DataTransfer_Test.user_is_able_to_navigate_to_Activation_Details_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DataTransfer_Test.select_Activate_Immediate_check_box()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DataTransfer_Test.uncheck_no_end_date_check_box()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "2016-11-18",
      "offset": 11
    }
  ],
  "location": "DataTransfer_Test.enter_the(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DataTransfer_Test.click_on_Save_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DataTransfer_Test.data_transfer_successfully_created_message_should_be_displayed_and_user_navigate_to_modify_org_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DataTransfer_Test.user_is_on_Modify_org_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DataTransfer_Test.click_on_Data_Transfer_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DataTransfer_Test.list_of_data_transfer_should_be_displayed_and_status_as_Active()"
});
formatter.result({
  "status": "skipped"
});
});