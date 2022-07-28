@FIDEX-590
Feature: Check menus under "Fleet" module
  User Story: As a POS Manager, I should be able to see menus under "Fleet" module.
  Account: POS Manager


  Background: As a POS Manager, user is on the home page
    Given user is on the login page of fidexio page
    And user enters username "posmanager10@info.com"
    And user enters password "posmanager"
    And user clicks to login button

  @FIDEX-573
  Scenario: As a POS Manager, user is on the home page
    Given user click more button
    Then user click Fleet button


  @FIDEX-574
  Scenario: As a POS Manager, user is on the home page
    Given user click more button
    Then user click Fleet button
    And user check Vehicles title

  @FIDEX-575
  Scenario: As a POS Manager, user is on the home page
    Given user click more button
    Then user click Fleet button
    And user check Vehicles Odometer title

  @FIDEX-576
  Scenario: As a POS Manager, user is on the home page
    Given user click more button
    Then user click Fleet button
    And user check Vehicle Costs title

  @FIDEX-577
  Scenario: As a POS Manager, user is on the home page
    Given user click more button
    Then user click Fleet button
    And user check Vehicles Contracts title

  @FIDEX-578
  Scenario: As a POS Manager, user is on the home page
    Given user click more button
    Then user click Fleet button
    And user check Vehicles Fuel Logs title

  @FIDEX-579
  Scenario: As a POS Manager, user is on the home page
    Given user click more button
    Then user click Fleet button
    Then user check Vehicles Services Logs title

  @FIDEX-580
  Scenario: As a POS Manager, user is on the home page
    Given user click more button
    Then user click Fleet button
    Then user check Reporting title

  @FIDEX-581
  Scenario: As a POS Manager, user is on the home page
    Given user click more button
    Then user click Fleet button
    Then user check Costs title

  @FIDEX-582
  Scenario: As a POS Manager, user is on the home page
    Given user click more button
    Then user click Fleet button
    Then user check Indicative Costs title

  @FIDEX-583
  Scenario: As a POS Manager, user is on the home page
    Given user click more button
    Then user click Fleet button
    Then user check Configuration title

  @FIDEX-584
  Scenario: As a POS Manager, user is on the home page
    Given user click more button
    Then user click Fleet button
    Then user check Vehicle Model title

  @FIDEX-585
  Scenario: As a POS Manager, user is on the home page
    Given user click more button
    Then user click Fleet button
    Then user check Model make of Vehicle title

  @FIDEX-586
  Scenario: As a POS Manager, user is on the home page
    Given user click more button
    Then user click Fleet button
    Then user check Service Types title

  @FIDEX-587
  Scenario: As a POS Manager, user is on the home page
    Given user click more button
    Then user click Fleet button
    Then user check Contract Types title

  @FIDEX-588
  Scenario: As a POS Manager, user is on the home page
    Given user click more button
    Then user click Fleet button
    Then user check Vehicle status title

  @FIDEX-589
  Scenario: As a POS Manager, user is on the home page
    Given user click more button
    Then user click Fleet button
    Then user check Vehicle Tags title


  #Scenario: As a POSManager, I should be able to see menus under "Fleet" module
    #Given user click each menu option on left side of the page
    #And user assert the navigated page related to selected menu