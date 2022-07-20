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
  Scenario: Verify that user can click 'Fleet' option
    When user sees "POSManager10" in the title
    Then User should see "Fleet" option at the top of the home page
    And User should be able to click on Fleet option






