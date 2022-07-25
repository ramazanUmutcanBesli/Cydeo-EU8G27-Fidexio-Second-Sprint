@FIDEX-525
Feature:As a POSMANAGER, I should be able to enter a new Fuel Log for the vehicle

  Background: User should be at the "url" page
    Given user is on the login page of fidexio page
    When user enters username "posmanager10@info.com"
    And user enters password "posmanager"
    And user clicks to login button


  @FIDEX-524
  Scenario: Pos manager can create new Vehicles Fuel Logs
    Given user hits the more and fleet button
    And user hits the Vehicles Fuel Logs
    And user hits the Create Button
    And user enters vehicle informations
    Then user saves the datas successfully
