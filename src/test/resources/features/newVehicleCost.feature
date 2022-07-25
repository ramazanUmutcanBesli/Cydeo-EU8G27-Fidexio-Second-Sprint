@FIDEX-557
Feature: Create A New Vehicle Costs Function
  User Story: As a POS Manager, I should be able to create a new Vehicle Cost.
  Account: POS Manager

  Background: As a POS Manager, user is on the home page
    Given user is on the login page of fidexio page
    And user enters username "posmanager10@info.com"
    And user enters password "posmanager"
    And user clicks to login button

  @FIDEX-547  #1
  Scenario: Verify that user can click 'Fleet' option
    When user sees "POSManager10" in the title
    Then User should see "Fleet" option at the top of the home page
    And User should be able to click on Fleet option

  @FIDEX-548  #2
  Scenario: Verify that user can land on 'Fleet' page
    When user clicks Fleet option
    Then User should see Vehicles options on the left side of the page respectively
      | Vehicles | Vehicles Odometer | Vehicle Costs | Vehicles Contracts | Vehicles Fuel Logs | Vehicles Services Logs |

  @FIDEX-549  #3
  Scenario: Verify that 'Vehicle Costs' option can be opened
    When user clicks Fleet option
    And user clicks Vehicle Costs option on the left side of the page
    Then User should see "Vehicle Costs" option text at the top of the page

  @FIDEX-550  #4
  Scenario: Verify that 'Create' button is clickable
    When user clicks Fleet option
    And user clicks Vehicle Costs option on the left side of the page
    And user clicks Create button
    Then User should see "Cost Details" header and "Vehicle", "Type", "Total Price", "Cost Description", "Date" options correctly in the middle of the page

  @FIDEX-551  #5
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

  @FIDEX-552  #6
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

  @FIDEX-553  #7
  Scenario Outline:  Verify that 'Date' calendar dropdown opens and a date can be selected
    When user clicks Fleet option
    And user clicks Vehicle Costs option on the left side of the page
    And user clicks Create button
    Then User should be able to select a date "<date>" from Calendar

    Examples: date
      | date       |
      | 01/01/2005 |
      | 03/03/2018 |

  @FIDEX-554  #8
  Scenario Outline: Verify that user can enter numeric characters into the 'Total Price'
    When user clicks Fleet option
    And user clicks Vehicle Costs option on the left side of the page
    And user clicks Create button
    And user selects a vehicle "<vehicle>" and a type of cost
    When user enters the numeric characters "<numerics>" into the Total Price box
    Then User should be able to successfully save a cost for the vehicle "<vehicle>"

    Examples: Numeric characters
      | numerics  | vehicle               |
      | 10000     | Audi/A1/1-AUD-001     |
      | 10000.00  | Bmw/Serie 1/1-BMW-001 |
      | 10,000    | Opel/Corsa/1-SYN-404  |
      | 987654321 | Audi/A1/1-AUD-001     |
      | 10,000.00 | Bmw/Serie 1/1-BMW-001 |


  @FIDEX-555  #9 #negative TC
  Scenario Outline: Verify that after entering non numeric characters into 'Total Price' and saving, "The following fields are invalid" is displayed
    When user clicks Fleet option
    And user clicks Vehicle Costs option on the left side of the page
    And user clicks Create button
    And user selects a vehicle "<vehicle>" and a type of cost
    When user enters the non numeric characters "<non-numerics>" into the Total Price box
    Then User should see "The following fields are invalid:" error message after saving

    Examples: Non numeric characters
      | non-numerics      | vehicle               |
      | 10000$            | Audi/A1/1-AUD-001     |
      | One Thousand Euro | Bmw/Serie 1/1-BMW-001 |
      | 10-000            | Opel/Corsa/1-SYN-404  |
      | 10000#            | Audi/A1/1-AUD-001     |
      | 1000+1000         | Bmw/Serie 1/1-BMW-001 |
      | 10000(Dollar)     | Opel/Corsa/1-SYN-404  |

  @FIDEX-556  #10
  Scenario Outline: Verify that user can see the new vehicle cost on the list
    When user clicks Fleet option
    And user clicks Vehicle Costs option on the left side of the page
    And user clicks Create button
    And user selects a vehicle "<vehicle>" and a type of cost
    And user enters total price "<price>" and selects a date "<date>"
    When user clicks Save button
    Then User should see the new vehicle "<vehicle>" cost at the top of the list as dated "<date>"
    Examples: date
      | date       | vehicle              | price |
      | 01/01/1992 | Audi/A1/1-AUD-001     | 1000  |
      | 01/01/1991 | Bmw/Serie 1/1-BMW-001 | 1500  |





