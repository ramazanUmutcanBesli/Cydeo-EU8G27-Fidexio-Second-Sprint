Feature: As a PosManager, I should be able to create and design a new survey from "Survey" module

    #Pre-Condition
  Background: As a POS Manager, user is on the home page
    Given user is on the login page of fidexio page
    And user enters username "posmanager10@info.com"
    And user enters password "posmanager"
    And user clicks to login button


  Scenario: All buttons work as expected at the survey design stage before creating a Survey
    When user sees "POSManager10" in the title
    Then user clicks "Surveys" option at the top bar of the home page
    And user should be landing on "Surveys" page
    And user clicks all current buttons one by one
      | Action      | Verification  |
      | Create      | New           |
      | Discard     | Surveys       |
      | Import      | Import a File |
      | Cancel      | Surveys       |
      | List view   | list          |
      | Kanban view | kanban        |


  Scenario: As a user, I should be able to create a new survey in Survey module
    When user sees "POSManager10" in the title
    Then user clicks "Surveys" option at the top bar of the home page
    And user should be landing on "Surveys" page
    Then user clicks "create" button
    And user enters Survey Title as "My new Survey" on upcoming window
    Then user clicks "Save" button
    Then verify that "Survey created" message appears under the survey form sheet

  @wip
  Scenario: User should be able to see created survey is listed after clicking the Surveys module
    #Then user clicks "Surveys" option at the top bar of the home page
    #Then verify that created Survey takes place under Draft or In Progress bar


  Scenario: All buttons work as expected at the survey design stage after creating a Survey
    When user sees "POSManager10" in the title
    Then user clicks "Surveys" option at the top bar of the home page
    And user should be landing on "Surveys" page
    Then user clicks "create" button
    And user enters Survey Title as "My new Survey 6" on upcoming window
    Then user clicks "Save" button
    And user clicks all current buttons one by one
      | Action                    | Verification        |
      | Design Survey             | my-new-survey       |
      | Start Survey              | Survey has no pages |
      | Back To Survey            | My new Survey 6     |
      | Test Survey               | Survey              |
      | Back To Survey            | My new Survey 6     |
      | Print Survey              | Print               |
      | Back To Survey            | My new Survey 6     |
      | Share and invite by email | Error               |
#     | View results              | Survey Result       |
#Test Survey couldn't be verified!!!
  # Share and invite by email, error message doesn't disappear