Feature: Title of your feature
  I want to use this template for my feature file

  Scenario: Title of your scenario
    Given User should be in the demo home page.
    And User clicks on add tariff plan button.
    When User enters all the required fields with validcredentials.
      | 1000 | 100 | 50 | 200 | 20 | 60 | 10 |
      | 2000 | 200 | 60 | 300 | 30 | 60 | 20 |
      | 3000 | 300 | 70 | 400 | 40 | 70 | 30 |
    And User clicks on the submit button at the bottom of the page.
    Then Tariff plan is displayed.

  Scenario: Title of your scenario
    Given User should be in the demo home page.
    And User clicks on add tariff plan button.
    When User enters all the required fields with validcredentials here.
      | MR   | LM  | IM | SMS | LPMC | IPMC | SPC |
      | 1000 | 100 | 50 | 200 |   20 |   60 |  10 |
      | 2000 | 200 | 60 | 300 |   30 |   60 |  20 |
      | 3000 | 300 | 70 | 400 |   40 |   70 |  30 |
    And User clicks on the submit button at the bottom of the page.
    Then Tariff plan is displayed.
