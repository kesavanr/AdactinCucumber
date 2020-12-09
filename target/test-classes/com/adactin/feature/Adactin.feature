@AdactinHotel
Feature: Booking functionality of the adaction hotel
	@LoginHotel
  Scenario Outline: Adactin hotel login scenario
    Given :Launch the application url
    When User enter valid "<username>" and "<password>"
    And User click on the login button
    Then User verifies whether navigated to search hotel page

		Examples:
		|username|password|
		|demolink1984|dummy|
		|dummy|123456|		
		|dummy|dummy|		
		|demolink1984|123456|
		
  @SearchHotel
  Scenario: Adactin search hotel scenario
 		When User select the location "Sydney" as "value"  from the dropdown
  	And User select the hotel 2 as "index" from the dropdown
  	And User select the room type 2 as "index" from the dropdown
  	And User select the number of rooms 2 as "index" from the dropdown
  	And User enter checkin date "04/12/2020" from the textbox
  	And User enter checkout date "05/12/2020" from the textbox
  	And User select the adults per room 2 as "index" from the dropdown
  	And User select the children per room 2 as "index" from the dropdown
  	And User click the search button
  	Then User verifies whether navigated to select hotel page
	
	@SelectHotel		 
	Scenario: Adactin select hotel scenario
		When User select the hotel from the options
		And User click the continue button
		Then User verifies whether navigated to book a hotel page
	
	@BookHotel	
	Scenario: Adaction book a hotel page scenario
		When User enter the firstname "test fname" from the textbox
		And User enter the lastname "test lname" from the textbox
		And User enter the billing address "test billing address details" from the big textbox
		And User enter the credit card no "4111111111111111" from the textbox
		And User select the credit card type "VISA" as "value" from the dropdown
		And User select the month of expiry date "12" as "value" from the dropdown
		And User select the year of expiry date "2022" as "value" from the dropdown
		And User enter the cvv number "111" from the textbox
		And User click the book now button
		Then User verifies whether navigated to booking confirmation page
		
	@BookedHistory
	Scenario: Adactin booked itinerary page scenario
		When User click the my itinerary button
		Then User verifies whether navigated to booked itinerary page
  