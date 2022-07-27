@wip
Feature:Fidexio Sales Functionality

  User Story:
  As a Sales Manager, I should be able to create and edit a new customers from "Sales" module

  Accounts are SalesManager

  Acceptance Criteria:
  1. Verify that all buttons work as expected at the Customers design stage

  2. Verify that the page title changed the customer name and address.

  3. Verify that the user should be able to see created customer is listed after clicking the Customers module.



  Background: User should be at the "url" page
    Given user is on the login page of fidexio page
    When user enters username "salesmanager10@info.com"
    And user enters password "salesmanager"
    And user clicks to login button

  @FIDEX-593 @wip
  Scenario: Sales Manager should select all button as expected in Design Stage
    When sales Manager click Sales button
    And  sales Manager click Customers button
    And  sales Manager click create button
    Then sales Manager should see Individual was automatically selected
    When sales Manager click Company Button
    Then sales Manager should see Company is selected
    When sales Manager click Internal Notes
    Then sales Manager should see Internal Notes can be selected
    When sales Manager click Sales & Purchases
    Then sales Manager should see Sales & Purchases can be selected
    When sales Manager click Invoicing
    Then sales Manager should see Invoicing can be selected
    When sales Manager click Company select button
    Then sales Manager should see Company select button can be writtable
    When sales Manager click Address Type select button
    Then sales Manager should see Address Type can be selected
    When sales Manager click TIN Tags
    When sales Manager click Language select Button
    Then sales Manager should see English can be selected
  @FIDEX-594 @wip @smoke
  Scenario: Sales Manager create new Customer
    When sales Manager click Sales button
    And  sales Manager click Customers button
    And  sales Manager click create button
    And sales Manager select individual type of customer
    And sales Manager write customers' name
    And sales Manager select customers' company
    And sales Manager select Address Type
    And sales Manager write customers' Address
    And sales Manager select customers' country
    And sales Manager select TIN Tags
    And sales Manager write customers' Job Position
    And sales Manager write customers' phone
    And sales Manager write customers' Mobile phone
    And sales Manager write customers' Email
    And sales Manager write customers' Website
    And sales Manager write customers' Title
    And sales Manager write customers' Language
    And sales Manager click save button
    Then sales Manager should see created Customer




