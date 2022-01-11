Feature: To Check login functionality of invalid
@smoke
  Scenario: Checking of Fb account login with invalid credentials
    Given user sets the browser and opens fb home page
    When user enters username and password
    And user hits on login buttin
    Then user navigates to fb login page and shows invalid login