Feature: Cash withdrawal
  Scenario: Successful withdrawal
    Given I have deposited $200 in my wallet
    When I request $30
    Then $30 should be dispensed
    And the balance of my wallet should be $170

  Scenario: Incorrect withdrawal
    Given I have deposited $200 in my wallet
    When I request $220
    Then the cash should not be possible

  Scenario: Incorrect deposit
    Given I have empty wallet
    When I try to deposited negative amount
    Then the balance should not be changed
