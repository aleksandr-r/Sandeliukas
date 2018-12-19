@mainTests

  Feature: Testing the order execution flow


	Scenario: Send the order for '100' Eggs
	  Given I have launched the app
	  And the count of eggs is positive
	  When I pick the option "Y" to buy eggs
	  And I provide the number of eggs equal to '10'
	  And I provide the size of eggs equal to "L"
	  And I pick the delivery date as "20190101"
	  Then I see the confirmation that my order has been executed successfully