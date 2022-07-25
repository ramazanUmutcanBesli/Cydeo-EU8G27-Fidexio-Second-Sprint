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

  #TC7
  Scenario Outline:  Verify that 'Date' calendar dropdown opens and a date can be selected
    When user clicks Fleet option
    And user clicks Vehicle Costs option on the left side of the page
    And user clicks Create button
    Then User should be able to select a date "<date>" from Calendar

    Examples: date
      | date       |
      | 01/01/2005 |
      | 03/03/2018 |

  #TC8
  Scenario Outline: Verify that user can enter numeric characters into the 'Total Price'
    When user clicks Fleet option
    And user clicks Vehicle Costs option on the left side of the page
    And user clicks Create button
    And user selects a vehicle "<carBrand>" and a type of cost
    When user enters the numeric characters "<numerics>" into the Total Price box
    Then User should be able to successfully save a cost for the vehicle "<carBrand>"

    Examples: Numeric characters
      | numerics  | carBrand |
      | 10000     | Audi     |
      | 10000.00  | Mercedes |
      | 10,000    | BMW      |
      | 987654321 | Opel     |
      | 10,000.00 | Audi     |


  #TC9 #negative test case
  Scenario Outline: Verify that after entering non numeric characters into 'Total Price' and saving, "The following fields are invalid" is displayed
    When user clicks Fleet option
    And user clicks Vehicle Costs option on the left side of the page
    And user clicks Create button
    And user selects a vehicle "<carBrand>" and a type of cost
    When user enters the non numeric characters "<non-numerics>" into the Total Price box
    Then User should see "The following fields are invalid:" error message after saving

    Examples: Non numeric characters
      | non-numerics      | carBrand |
      | 10000$            | Audi     |
      | One Thousand Euro | Mercedes |
      | 10-000            | BMW      |
      | 10000#            | Opel     |
      | 1000+1000         | Audi     |
      | 10000(Dollar)     | BMW      |

  #TC10
  Scenario Outline: Verify that user can see the new vehicle cost on the list
    When user clicks Fleet option
    And user clicks Vehicle Costs option on the left side of the page
    And user clicks Create button
    And user selects a vehicle "<carBrand>" and a type of cost
    And user enters total price "<price>" and selects a date "<date>"
    When user clicks Save button
    Then User should see the new vehicle "<carBrand>" cost at the top of the list as dated "<date>"
    Examples: date
      | date       | carBrand | price |
      | 01/01/1992 | Audi     | 1000  |
      | 01/01/1991 | BMW      | 1500  |





