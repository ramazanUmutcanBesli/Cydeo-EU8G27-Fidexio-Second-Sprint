@FIDEX-538
Feature: Default

	Background: User should be at the "url" page
		Given user is on the login page of fidexio page
		When user enters username "posmanager10@info.com"
		And user enters password "posmanager"
		And user clicks to login button



	@FIDEX-526
	Scenario: US35-TC01 Salesmanager,first lands on weekly display

		    Given user see main board
		    And user clicks the Calendar button
		    And user see Calender Page	


	@FIDEX-527
	Scenario : TC002-Users can change the display " clicks the  Day button"

		Given user clicks the Calendar button
		And user is clicks on the Day button
		Then user see text at the top of the page "Best solution for startup"



	
	@FIDEX-528
	Scenario : TC003-Users can change the display " clicks the Week button"

		Given user is clicks on the Week button
		Then user see text at the top of the page "Best solution for startup"
		


	
	@FIDEX-529
	Scenario : TC004-Users can change the display " clicks the Month button"

		Given user is clicks on the Month button
		Then user see text at the top of the page "Best solution for startup"
		



	@FIDEX-530
	Scenario : TC005 Users can create an event by clicking on the Day time box

		And user is clicks on the Day button
		And user is clicks the Daily time box
		And user is enters the"vip meeting"
		Then user creat any issue




	@FIDEX-532
	Scenario : TC006 Users can create an event by clicking on the Week time box

		Given user is clicks on the Week button
		And user is clicks the Weekly time box
		And user is enters the"vip meeting"
		Then user creat any issue




	@FIDEX-533
	Scenario : TC007 Users can create an event by clicking on the Month time box

		And user is clicks on the Month button
		And user is clicks the Monthly time box
		And user is enters the"vip meeting"
		Then user creat any issue





	@FIDEX-534
	Scenario : TC008 User can edit acreated event on Daily time box

		And user is clicks on the Day button
		And user is clicks the Daily time box
		And user is enters the"vip meeting"
		And user creat any issue
		Then user edit a created event





	@FIDEX-535
	Scenario : TC009 User can edit acreated event on Weekly time box

		And user is clicks on the Week button
		And user is clicks the Weekly time box
		And user is enters the"vip meeting"
		And user creat any issue
		Then user edit a created event



	@FIDEX-536
	Scenario : TC010 User can edit a created event on Montly time box
	on the login page

		And user is clicks on the Week button
		And user is clicks the Weekly time box
		And user is enters the"vip meeting"
		And user creat any issue
		Then user edit a created event




	@FIDEX-537
	Scenario: US35-TC02 Posmanager,first lands on weekly display
		e

		    And user see main board
		    And user clicks the Calendar button
		    And user see Calender Page