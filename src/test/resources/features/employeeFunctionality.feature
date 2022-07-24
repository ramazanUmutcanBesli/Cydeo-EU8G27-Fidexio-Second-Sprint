Feature: As a Posmanager, I should be able to create and edit a new employee from "Employees" module

   #Pre-Condition
  Background: As a POS Manager, user is on the home page
    Given user is on the login page of fidexio page
    And user enters username "posmanager10@info.com"
    And user enters password "posmanager"
    And user clicks to login button
    Then user click Employees button

  Scenario: Pos manager should be able to see Employees New page after clicking Create button
    When Pos manager clicks create button
    Then Pos manager should see Employees New page

  Scenario: Pos manager should be able to see Employees Import a File page after clicking Import button
    When Pos manager clicks Import button
    Then Pos manager should see Import a File page

  Scenario: Pos manager should be able to see Next Employees Page after clicking Next button
    When Pos manager clicks Next button
    Then Pos manager should see Next Employees page


  Scenario: Pos manager should be able to see Previous Employees Page after clicking Previous button
    When Pos manager clicks Previous button
    Then Pos manager should see Previous Employees page


  Scenario: Pos manager should be able to see Listed Employees Page after clicking List button
    When Pos manager clicks List button
    Then Pos manager should see Listed Employees page

  Scenario: Pos manager should be able to see Kanban Employees Page after clicking Kanban button
    When Pos manager clicks Kanban button
    Then Pos manager should see Kanban Employees page

  Scenario: Pos manager should be able to follow any employee after clicking Follow button
    When Pos manager clicks Follow button
    Then Pos manager should see Following text on the button

  Scenario: Pos manager should be able to unfollow any employee after clicking Unfollow button
    When Pos manager clicks Unfollow button
    Then Pos manager should see Follow text on the button

  Scenario Outline: Pos manager should see "Employee Created" message after enters all credentials
    Given Pos manager clicks create button
    When Pos manager enters name "<name>"
    When Pos manager enters department "<department>"
    When Pos manager enters job position "<jobPosition>"
    When Pos manager enters manager "<manager>"
    When Pos manager enters coach "<coach>"
    When Pos manager enters work email"<workEmail>"
    When Pos manager enters work location "<workLocation>"
    When Pos manager enters work address"<workAddress>"
    When Pos manager enters work mobile"<workMobile>"
    When Pos manager enters work phone"<workPhone>"
    When Pos manager enters working hours"<workingHours>"
    When Pos manager enters e.g Part time"<egPartTimeDropdown>"
    And Pos manager clicks save button
    Then Pos manager should see Employee Created message


    Examples: Valid Credentials
      | name      | department | jobPosition | manager          | coach          | workEmail           | workLocation | workAddress         | workMobile  | workPhone  | workingHours           | egPartTimeDropdown |
      | Elon Musk | Sales      | Consultant  | Augustina Kenter | Ashley Presley | elon2space@mars.com | Mars         | &*&*)_( (copy) | 01915915915 | 0165588552 | Standard 40 hours week | Customer Support   |