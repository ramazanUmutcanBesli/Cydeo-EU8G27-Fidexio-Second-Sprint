@FIDEX-523
Feature: Pos manager can create new Vehicle Model

  Background: User should be at the "url" page
    Given user is on the login page of fidexio page
    When user enters username "posmanager10@info.com"
    And user enters password "posmanager"
    And user clicks to login button

   @FIDEX-522
    Scenario: user hits the more button
      Given user hits the more and fleet button
      And user hits the Vehicle Model
      And user enters the Model Name
      Then edit Button is visible






















