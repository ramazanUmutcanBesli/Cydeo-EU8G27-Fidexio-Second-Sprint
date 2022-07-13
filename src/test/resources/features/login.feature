@FIDEX-520 @smoke
Feature: Fidexio Login feature

  Background: User in "url" page
    Given user is on the login page of fidexio page

  @FIDEX-520
  Scenario Outline: Positive Login Scenarios
    When user enters username "<Username>"
    And user enters password "<Password>"
    And user clicks to login button
    Then user sees "<UserID>" in the title


    Examples: Search values we are going to be using in this scenario is as below table
      | Username                | Password     | UserID         |
      | salesmanager10@info.com | salesmanager | SalesManager10 |
      | posmanager10@info.com   | posmanager   | POSManager10   |

