@smoke
Feature: AddTariff flow

@sanity @regression
  Scenario: 
   # Given User should be in the demo home page
    And User clicks on add tariff plan button
    When User enters all the required fields with valid credentials
    And User clicks on the submit button at the bottom of the page
    Then Tariff plan is displayed
    
  Scenario: 
    Given User should be in the demo home page
    And User clicks on add tariff plan button
    When User enters all the required fields with valid credentials.
    |1000|100|50|200|20|60|10|
    And User clicks on the submit button at the bottom of the page
    Then Tariff plan is displayed
    
  Scenario: 
    Given User should be in the demo home page
    And User clicks on add tariff plan button
    When User enters all the required fields with valid user credentials.
    |monthly rental|1000|
    |free local|100|
    |free intl|50|
    |free sms|200|
    |local per min charge|20|
    |intl per min charge|60|
    |sms per charge|10|
    And User clicks on the submit button at the bottom of the page
    Then Tariff plan is displayed
    
    

 
