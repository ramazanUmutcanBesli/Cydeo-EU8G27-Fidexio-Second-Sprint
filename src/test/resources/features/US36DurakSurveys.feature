Feature: As a PosManager, I should be able to create and design a new survey from "Survey" module

    #Pre-Condition
    Background: As a POS Manager, user is on the home page
        Given user is on the login page of fidexio page
        And user enters username "posmanager10@info.com"
        And user enters password "posmanager"
        And user clicks to login button

    Scenario: All buttons work as expected at the survey design stage before creating a Survey


    Scenario: As a user, I should be able to create a new survey in Survey module
        When user sees "posmanager10" in the title
        Then user clicks "Surveys" option at the top bar of the home page
        And user should be landing on "Surveys" page
        Then user clicks "create" button top left side of the page
        And user enters "Survey Title" on upcoming window
        Then user clicks "Save" button top left side of the page
        Then verify that "Survey created" message appears under the survey form sheet

    
    Scenario: All buttons work as expected at the survey design stage during creation of a Survey
        Given user clicks "buttons" on the page one by one  # buttons can be data table


    Scenario: User should be able to see created survey is listed after clicking the Surveys module
        Then user clicks "Surveys" option at the top bar of the home page
        Then verify that created Survey takes place under Draft or In Progress bar


    Scenario: All buttons work as expected at the survey design stage after creating a Survey