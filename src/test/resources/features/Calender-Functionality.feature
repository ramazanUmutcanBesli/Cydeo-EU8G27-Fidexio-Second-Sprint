@FIDEX-538
Feature:

	Background: As a POS Manager, user is on the home page
		Given user is on the login page of fidexio page
		And user enters username "posmanager10@info.com"
		And user enters password "posmanager"
		And user clicks to login button


	@FIDEX-526
	Scenario: US35-TC01 Posmanager,first lands on weekly display
		Given user see "Mark all read" on main board
		And user clicks the Calendar button
		Given user pick month, day and time
			| Aug | 21 | 11:00:00 |
		And user see "Attendees" on Calendar Page
		And  user is clicks on the Log out button

	@FIDEX-527
	Scenario: TC002-Users can change the display " clicks the  Day button"
		And user clicks the Calendar button
		Given user pick month, day and time
			| Aug | 21 | 10:00:00 |
		And user is clicks on the Day button
		Then posmanager see "Sunday" on calendar Page
		And  user is clicks on the Log out button

	@FIDEX-528
	Scenario: TC003-Users can change the display " clicks the Week button"
		And user clicks the Calendar button
		Given user pick month, day and time
			| Aug | 21 | 10:00:00 |
		And user is clicks on the Week button
		Then as a posmanager see "Attendees" on calendar Page
		And  user is clicks on the Log out button

	@FIDEX-529
	Scenario: TC004-Users can change the display " clicks the Month button"
		And user clicks the Calendar button
		Given user pick month, day and time
			| Aug | 21 | 10:00:00 |
		And user is clicks on the Month button
		Then as a posmanager see "Attendees" on calendar Page
		And  user is clicks on the Log out button

	@FIDEX-530
	Scenario: Users can create an event by clicking on the Day time box
		And user clicks the Calendar button
		And user is clicks on the Day button
		Given user a pick month, day and time
			| Aug | 21 | 11:00:00 |
		And user create a Schedule name as "Demo Meeting"
		And  user is clicks on the Log out button


	@FIDEX-532
	Scenario: Users can create an event by clicking on the Week time box
		And user clicks the Calendar button
		Given user is clicks on the Week button
		Given user a pick month, day and time
			| Aug | 21 | 12:00:00 |
		And user create a Schedule name as "Demo Meeting"
		And  user is clicks on the Log out button


	@FIDEX-533
	Scenario: TC007 Users can create an event by clicking on the Month time box
		Given user clicks the Calendar button
		And user is clicks on the Month button
		Given user a pick month, day and time
			| Aug | 21 | 13:00:00 |
		And user create a Schedule name as "Demo Meeting"
		And  user is clicks on the Log out button


	@FIDEX-534
	Scenario: User can edit acreated event on Daily time box
		And user clicks the Calendar button
		And user is clicks on the Day button
		Given user a pick month, day and time
			| Aug | 22 | 10:00:00 |
		And user create a Schedule name as "Demo Meeting"
		Then user edit a created event
		And  user is clicks on the Log out button


	@FIDEX-535
	Scenario: TC009 User can edit acreated event on Weekly time box
		And user clicks the Calendar button
		Given user is clicks on the Week button
		Given user a pick month, day and time
			| Aug | 22 | 12:00:00 |
		And user create a Schedule name as "Demo Meeting"
		Then user edit a created event
		And  user is clicks on the Log out button


	@FIDEX-536
	Scenario: User can edit a created event on Monthly time box on the login page
		Given user clicks the Calendar button
		And user is clicks on the Month button
		Given user a pick month, day and time
			| Aug | 22 | 13:00:00 |
		And user create a Schedule name as "Demo Meeting"
		Then user edit a created event
		And  user is clicks on the Log out button


	@FIDEX-537
	Scenario: user hits the more button
		Given user see "Mark all read" on main board
		And user clicks the Calendar button
		And user see a "Responsible" on Calendar Page
		And  user is clicks on the Log out button