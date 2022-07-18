@smoke
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



  Scenario: Sales Manager should click create button
    Given sales Manager click Sales button on the Home Page
    And sales Manager click Customers button in Orders List
    When sales Manager click create button
    Then sales Manager should see "New-Odoo" in Page Title

  Scenario: Sales Manager should click individual Select button
    When sales Manager click Individual Select button
    Then sales Manager can should see individual button is selected