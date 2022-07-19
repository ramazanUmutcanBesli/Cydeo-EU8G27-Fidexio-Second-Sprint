Feature: As a user, I should be able to create a new survey in Survey module

    #Pre-Condition
    Background: As a POS Manager, user is on the home page
        Given user is on the login page of fidexio page
        And user enters username "posmanager10@info.com"
        And user enters password "posmanager"
        And user clicks to login button

    Scenario: As a PosManager, I shoould be able to create and design a new survey from "Survey" module
        When user sees "posmanager10" in the title
        And user clicks "Surveys" option at the top bar of the home page
        And user should be landing on "Surveys" page
        Then user clicks "create" button top left side of the page
        And user enters "Survey Title" on upcoming window
        Then user clicks "Save" button top left side of the page

    
    Scenario: All buttons work as expected at the survey design stage
    Scenario: "Survey created" message appears under the survey form sheet
    Scenario: User should be able to see created survey is listed after clicking the Surveys module