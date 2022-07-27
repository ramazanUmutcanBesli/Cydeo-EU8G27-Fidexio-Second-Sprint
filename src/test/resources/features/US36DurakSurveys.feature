Feature: As a PosManager, I should be able to create and design a new survey from "Survey" module

    #Pre-Condition @FIDEX-543 @FIDEX-518
  Background: As a POS Manager, user is on the home page
    Given user is on the login page of fidexio page
    And user enters username "posmanager10@info.com"
    And user enters password "posmanager"
    And user clicks to login button

  @FIDEX-518 @FIDEX-539 @SurveyAutomated
  Scenario: US 36 TC001 [AutomationS4-AD] Verify all buttons before creating a Survey
    Then user clicks "Surveys" option at the top bar of the home page
    And user should be landing on "Surveys" page
    And user clicks listed buttons
      | Action      | Verification  |
      | Create      | New           |
      | Discard     | Surveys       |
      | Import      | Import a File |
      | Cancel      | Surveys       |
      | List view   | list          |
      | Kanban view | kanban        |

  @FIDEX-518 @FIDEX-544 @SurveyAutomated
  Scenario: US 36 TC002 [AutomationS4-AD] Verify all buttons work after creating a Survey
    Given user create a Survey
    And user clicks listed buttons
      | Action                    | Verification           |
      | Design Survey             | my-new-survey          |
      | Start Survey              | Survey has no pages    |
      | Back To Survey            | generated survey title |
      | Test Survey               | generated survey title |
      | Back To Survey            | generated survey title |
      | Print Survey              | Print                  |
      | Back To Survey            | generated survey title |
      | Share and invite by email | Error                  |
      | View results              | Survey Result          |

  @FIDEX-518 @FIDEX-545 @SurveyAutomated
  Scenario: US 36 TC003 [AutomationS4-AD] Verify all buttons work in Survey module
    Given user create a Survey
    And user clicks "Surveys" option at the top bar of the home page
    And user clicks listed buttons
      | time sign             | No activities          |
      | three dot edit survey | generated survey title |
      | Back To Survey Menu   | Surveys                |
      | three dot delete      | Surveys                |

  @FIDEX-518 @FIDEX-540 @SurveyAutomated @clearTestData_US-36-durak
  Scenario: US 36 TC004 [AutomationS4-AD] Verify that the "Survey created" message appears under the survey form sheet
    Then user clicks "Surveys" option at the top bar of the home page
    And user should be landing on "Surveys" page
    Then user clicks "create" button
    And user enters generated Survey Title on upcoming window
    Then user clicks "Save" button
    Then verify that "Survey created" message appears under the survey form sheet

  @FIDEX-518 @FIDEX-541 @SurveyAutomated @clearTestData_US-36-durak
  Scenario: US 36 TC005 [AutomationS4-AD] Verify that the user should be able to see created survey is listed after clicking the Surveys module.
    Given user create a Survey
    And user clicks "Surveys" option at the top bar of the home page
    Then verify that user should see created survey in Survey module

