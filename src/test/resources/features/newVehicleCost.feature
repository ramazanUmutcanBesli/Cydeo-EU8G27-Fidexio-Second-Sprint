 #TestExecuteNr
Feature: Create A New Vehicle Costs Function
  User Story: As a POS Manager, I should be able to create a new Vehicle Cost.
  Account: POS Manager

   #Pre-Condition
  Background: As a POS Manager, user is on the home page
    Given user is on the login page of fidexio page
    And user enters username "posmanager10@info.com"
    And user enters password "posmanager"
    And user clicks to login button

    #Discuss	Calendar	Notes	Contacts	CRM	Sales	Website	Point of Sale	Purchases	Inventory	Manufacturing	Repairs	Project	Events	Surveys	Employees	Attendances	Leaves	Expenses	Maintenance	Fleet	Dashboards
  #TC1
  Scenario: Verify that user can click 'Fleet' option
    When user sees "POSManager10" in the title
    Then User should see "Fleet" option at the top of the home page
    And User should be able to click on Fleet option

  #TC2
  Scenario: Verify that user can land on 'Fleet' page
    When user clicks Fleet option
    #Then User should see Vehicles options on the left side of the page respectively
      #| Vehicles | Vehicles Odometer | Vehicle Costs | Vehicles Contracts | Vehicles Fuel Logs | Vehicles Services Logs |
    Then User should see "Vehicles", "Vehicles Odometer", "Vehicle Costs", "Vehicles Contracts", "Vehicles Fuel Logs", "Vehicles Services Logs" options on the left side of the page

  #TC3
  Scenario: Verify that 'Vehicle Costs' option can be opened
    When user clicks Fleet option
    And user clicks Vehicle Costs option on the left side of the page
    Then User should see "Vehicle Costs" option text at the top of the page

  #TC4
  Scenario: Verify that 'Create' button is clickable
    When user clicks Fleet option
    And user clicks Vehicle Costs option on the left side of the page
    And user clicks Create button
    Then User should see "Cost Details" header and "Vehicle", "Type", "Total Price", "Cost Description", "Date" options correctly in the middle of the page

  #TC5
  Scenario Outline: Verify that 'Vehicle' dropdown opens and a vehicle can be selected
    When user clicks Fleet option
    And user clicks Vehicle Costs option on the left side of the page
    And user clicks Create button
    Then User should be able to select a vehicle "<vehicle>" from Vehicle dropdown

    Examples: vehicles
      | vehicle               |
      | Audi/A1/1-AUD-001     |
      | Bmw/Serie 1/1-BMW-001 |
      | Opel/Corsa/1-SYN-404  |

  #TC6
  Scenario Outline: Verify that 'Type' dropdown opens and a type of cost can be selected
    When user clicks Fleet option
    And user clicks Vehicle Costs option on the left side of the page
    And user clicks Create button
    Then User should be able to select a type of cost "<costType>" from Type dropdown

    Examples: Cost types
      | costType               |
      | Tax roll               |
      | Summer tires           |
      | Repair and maintenance |





