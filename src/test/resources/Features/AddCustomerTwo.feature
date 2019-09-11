Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario
    Given User should be in the telecom home page.
    And User click on add customer button.
    When User enters all the fields with validdata.
      | Vinodh    | Kumar | vvin@gmail.com      | chennai | 9790779992 |
      | Hari      | Raj   | hari@gmail.com      | Theni   |   12345676 |
      | Prashanth | GR    | prashanth@gmail.com | Madurai | 9710312006 |
    And User clicks on submit button.
    Then User should be displayed and customer id is generated.

  Scenario: Title of your scenario
    Given User should be in the telecom home page.
    And User click on add customer button.
    When User enters all the fields with validdatas.
      | fname     | lname | email               | address | phno       |
      | Vinodh    | Kumar | vvin@gmail.com      | chennai | 9790779992 |
      | Hari      | Raj   | hari@gmail.com      | Theni   |   12345676 |
      | Prashanth | GR    | prashanth@gmail.com | Madurai | 9710312006 |
    And User clicks on submit button.
    Then User should be displayed and customer id is generated.
