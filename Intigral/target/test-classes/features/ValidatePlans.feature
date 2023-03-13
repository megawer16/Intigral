Feature: Validate Egypt Subscribtion plans
				I want to validate Egypt Subscribtion plans

@TestScenario1
Scenario: Validate The Subscribtion plans in Egypt
Given I open the application
When I select Egypt from countries list
Then I validate Egypt Lite plan
And I validate Egypt Classic plan
And I validate Egypt Premium plan
And I validate Egypt Currency

@TestScenario2
Scenario Outline: Validate The Subscribtion plans in UAE and Jordan
Given I open the application
When I select "<country>" 
Then I validate the Lite plan of the "<country>"

Examples:
|country|
|UAE|
|Jordan|







				
