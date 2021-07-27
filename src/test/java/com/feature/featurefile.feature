Feature: Hotel Booking Functionality

Scenario: user want to login the apllication

   Given user launch the application
   When user enter the valid username
   And user enter the valid password
   Then user validate the username and password 
   
Scenario: user want to search a hotel 
  
  	Given user is on the search hotel page
  	When user select a location from the list
  	And user select a hotel from the list
  	And user select the room type
  	And user select number of rooms
  	And user enter the valid check in date
  	And user enter the valid check out date
  	And user select adults count
  	And user select children count
  	Then user can able to search hotel
 
 Scenario: user want to select one hotel 
  
  	Given user is on the select hotel page
  	When user select one available hotel from the list
  	Then user can able to continue the booking process 	
  	
 Scenario: user need to give some mandatory details for payment process
   
   Given user is on the book hotel page
   When user enter the valid first name
   And user enter the valid last name 
   And user enter the proper billing address
  	And user enter the valid credit card number
  	And user select the credit card type from the list
  	And user select the card expiry month and year
  	And  user enter the valid CVV number
  	Then user can able to book the hotel
  	
Scenario: user want to confirm the hotel booking and logout the application

      Given user is on the confirmation page
      Then user can able to logout the application
      
      
      
      