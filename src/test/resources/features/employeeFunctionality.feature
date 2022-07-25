Feature: As a Posmanager, I should be able to create and edit a new employee from "Employees" module

   #Pre-Condition
  Background: As a POS Manager, user is on the home page
    Given user is on the login page of fidexio page
    And user enters username "posmanager10@info.com"
    And user enters password "posmanager"
    And user clicks to login button
    Then user click Employees button
  #Smoke tag for Jenkins
  @smoke @FIDEX-559 @FIDEX-516
  Scenario: Pos manager should be able to see Employees New page after clicking Create button
    When Pos manager clicks create button
    Then Pos manager should see Employees New page
  @FIDEX-560 @FIDEX-516
  Scenario: Pos manager should be able to see Employees Import a File page after clicking Import button
    When Pos manager clicks Import button
    Then Pos manager should see Import a File page
  @FIDEX-561 @FIDEX-516
  Scenario: Pos manager should be able to see Next Employees Page after clicking Next button
    When Pos manager clicks Next button
    Then Pos manager should see Next Employees page
  @FIDEX-562 @FIDEX-516
  Scenario: Pos manager should be able to see Previous Employees Page after clicking Previous button
    When Pos manager clicks Previous button
    Then Pos manager should see Previous Employees page
  @FIDEX-563 @FIDEX-516
  Scenario: Pos manager should be able to see Listed Employees Page after clicking List button
    When Pos manager clicks List button
    Then Pos manager should see Listed Employees page
  @FIDEX-564 @FIDEX-516
  Scenario: Pos manager should be able to see Kanban Employees Page after clicking Kanban button
    When Pos manager clicks Kanban button
    Then Pos manager should see Kanban Employees page
  @FIDEX-565 @FIDEX-516
  Scenario: Pos manager should be able to follow any employee after clicking Follow button
    When Pos manager clicks Follow button
    Then Pos manager should see Following text on the button
  @FIDEX-566 @FIDEX-516
  Scenario: Pos manager should be able to unfollow any employee after clicking Unfollow button
    When Pos manager clicks Unfollow button
    Then Pos manager should see Follow text on the button
  @FIDEX-567 @FIDEX-516
  Scenario Outline: Pos manager should see "Employee Created" message after enters all credentials
    Given Pos manager clicks create button
    When Pos manager enters name "<name>"
    And Pos manager enters department "<department>"
    And Pos manager enters job position "<jobPosition>"
    And Pos manager enters manager "<manager>"
    And Pos manager enters coach "<coach>"
    And Pos manager enters work email"<workEmail>"
    And Pos manager enters work location "<workLocation>"
    And Pos manager enters work address"<workAddress>"
    And Pos manager enters work mobile"<workMobile>"
    And Pos manager enters work phone"<workPhone>"
    And Pos manager enters working hours"<workingHours>"
    And Pos manager enters e.g Part time"<egPartTimeDropdown>"
    And Pos manager clicks save button
    Then Pos manager should see Employee Created message

    @positiveTesting
    Examples: Valid Credentials
      | name      | department | jobPosition | manager          | coach          | workEmail           | workLocation | workAddress | workMobile  | workPhone  | workingHours           | egPartTimeDropdown |
      | Elon Musk | Sales      | Consultant  | Augustina Kenter | Ashley Presley | elon2space@mars.com | Atmosphere   | Mars        | 01915915915 | 0165588552 | Standard 40 hours/week | Customer Support   |


  @FIDEX-568 @FIDEX-516
  Scenario Outline: Pos manager should not be able to see "Employee Created" message after enters special chars
    Given Pos manager clicks create button
    When Pos manager enters name "<name>"
    And Pos manager enters department "<department>"
    And Pos manager enters job position "<jobPosition>"
    And Pos manager enters manager "<manager>"
    And Pos manager enters coach "<coach>"
    And Pos manager enters work email"<workEmail>"
    And Pos manager enters work location "<workLocation>"
    And Pos manager enters work address"<workAddress>"
    And Pos manager enters work mobile"<workMobile>"
    And Pos manager enters work phone"<workPhone>"
    And Pos manager enters working hours"<workingHours>"
    And Pos manager enters e.g Part time"<egPartTimeDropdown>"
    And Pos manager clicks save button
    Then Pos manager should see not be able to Employee Created message

    @negativeTesting
    Examples: Valid Credentials
      | name   | department | jobPosition | manager          | coach          | workEmail           | workLocation | workAddress | workMobile  | workPhone  | workingHours           | egPartTimeDropdown |
      | !$@%@^ | @$%#$%     | Consultant  | Augustina Kenter | Ashley Presley | elon2space@mars.com | Atmosphere   | Mars        | 01915915915 | 0165588552 | Standard 40 hours/week | Customer Support   |

  @FIDEX-569 @FIDEX-516
  Scenario Outline: Pos manager should see created employee on the employee list
    Given Pos manager clicks create button
    When Pos manager enters name "<name>"
    And Pos manager enters department "<department>"
    And Pos manager enters job position "<jobPosition>"
    And Pos manager enters manager "<manager>"
    And Pos manager enters coach "<coach>"
    And Pos manager enters work email"<workEmail>"
    And Pos manager enters work location "<workLocation>"
    And Pos manager enters work address"<workAddress>"
    And Pos manager enters work mobile"<workMobile>"
    And Pos manager enters work phone"<workPhone>"
    And Pos manager enters working hours"<workingHours>"
    And Pos manager enters e.g Part time"<egPartTimeDropdown>"
    And Pos manager clicks save button
    And Pos manager should see Employee Created message
    Then Pos manager should see "<name>" on the employee list

    @positiveTesting
    Examples: Valid Credentials
      | name      | department | jobPosition | manager          | coach          | workEmail           | workLocation | workAddress | workMobile  | workPhone  | workingHours           | egPartTimeDropdown |
      | Elon Musk | Sales      | Consultant  | Augustina Kenter | Ashley Presley | elon2space@mars.com | Atmosphere   | Mars        | 01915915915 | 0165588552 | Standard 40 hours/week | Customer Support   |




