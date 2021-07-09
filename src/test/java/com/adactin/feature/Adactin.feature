Feature: Hotel Booking functionality of adactin application

Background: user enters valid username and password
   Given User launch url of adactin application
   When User enters "SowmiyaSri" as username
   And User enters "Sowmiya05" as password
   And User click login button
   Then User validate login button

    

Scenario Outline: : user enters valid username and password
   Given User launch url of adactin application
   When User enters "<username>" as username
   And User enters "<password>" as password
   And User click login button
   Then User validate login button
		
		Examples:
		| username | password | 
		| simon | 2234 | 
		| salim | 5467 |
		| SowmiyaSri | Sowmiya05 | 

@SmokeTest
Scenario: user need to Search for Hotel
   When User enter the location 
   And User enter the hotels
   And User enter the room type
   And User enter the number of rooms
   And User enter the checkin date 
   And User enter the checkout date
   And User enter the adults per room
   And User enter the children per room
   Then User clickon search button
   
Scenario: Select hotel and continue
     When Select radio button
    Then Click continue

Scenario: User need to book a hotel
When user enters the fist name 
And user enters the last name
And user enters the billing address
And user enters the credit card no
And user enters the card type
And user enters the expiry month
And user enters the expiry year
And user enters the cvv number
Then user validate book now 

