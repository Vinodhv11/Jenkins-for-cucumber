Feature: AddCustomer Flow

  Scenario: 
    Given User should be in the telecom home page
    And User click on add customer button
    When User enters all the fields with valid data
    And User clicks on submit button
    Then User should be displayed and customer id is generated

  Scenario: 
    Given User should be in the telecom home page
    And User click on add customer button
    When User enters all the fields with valid data.
      | Vinodh | Kumar | vvin@gmail.com | chennai | 9790779992 |
    And User clicks on submit button
    Then User should be displayed and customer id is generated

  Scenario: 
    Given User should be in the telecom home page
    And User click on add customer button
    When User enters all the fields with valid datas.
      | fname   | vinodh         |
      | lname   | kumar          |
      | mail    | vvin@gmail.com |
      | address | chennai        |
      | phno    |     9790779992 |
    And User clicks on submit button
    Then User should be displayed and customer id is generated
