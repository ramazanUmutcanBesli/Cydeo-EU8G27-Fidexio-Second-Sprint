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
    And user enters generated Survey Title on upcoming window
    Then user clicks "Save" button
    Then verify that "Survey created" message appears under the survey form sheet
    Then user clicks "Surveys" option at the top bar of the home page
    Then user delete generated survey on the list


  Scenario: User should be able to see created survey is listed after clicking the Surveys module
    Then user clicks "Surveys" option at the top bar of the home page
    And user should be landing on "Surveys" page
    Then user clicks "create" button
    And user enters generated Survey Title on upcoming window
    Then user clicks "Save" button
    And user clicks "Surveys" option at the top bar of the home page
    Then verify that user should see created survey in Survey module
    Then user delete generated survey on the list


  Scenario: All buttons work as expected at the survey design stage after creating a Survey
    When user sees "POSManager10" in the title
    Then user clicks "Surveys" option at the top bar of the home page
    And user should be landing on "Surveys" page
    Then user clicks "create" button
    And user enters generated Survey Title on upcoming window
    Then user clicks "Save" button
    And user clicks all current buttons one by one
      | Action                    | Verification           |
      | Design Survey             | my-new-survey          |
      | Start Survey              | Survey has no pages    |
      | Back To Survey            | generated survey title |
      | Test Survey               | Survey                 |
      | Back To Survey            | generated survey title |
      | Print Survey              | Print                  |
      | Back To Survey            | generated survey title |
      | Share and invite by email | Error                  |
      | View results              | Survey Result          |
#Test Survey couldn't be verified!!!

  @wip
  Scenario: All buttons work as
    Then user clicks "Surveys" option at the top bar of the home page
    And user should be landing on "Surveys" page
    Then user clicks "create" button
    And user enters generated Survey Title on upcoming window
    Then user clicks "Save" button
    And user clicks "Surveys" option at the top bar of the home page
    And user should be landing on "Surveys" page
    And user clicks all current buttons one by one
      | Action                | Verification           |
      | three dot edit survey | generated survey title |
    And user clicks "Surveys" option at the top bar of the home page
    And user should be landing on "Surveys" page
    And user clicks all current buttons one by one
      | Action           | Verification |
      | three dot delete | Surveys      |