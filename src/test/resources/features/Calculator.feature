Feature:  Computing operations with a Calculator
  In order to not learn math
  As someone who is bad at math
  I want to be able to add and multiply numbers using a Calculator

  Scenario:  Add two positive numbers
    Given I have a Calculator
    When I add 1 and 1
    Then the sum should be 2

  Scenario:  Add a positive and negative number
    Given I have a Calculator
    When I add 1 and -1
    Then the sum should be 0

  Scenario:  Add two negative numbers
    Given I have a Calculator
    When I add -1 and -1
    Then the sum should be -2

  Scenario: Multiply two positive numbers
    Given I have a Calculator
    When I multiply 1 and 2
    Then the multiplication should be 2

  Scenario: Multiply a positive and a negative number
    Given I have a Calculator
    When I multiply -1 and 2
    Then the multiplication should be -2

  Scenario: Multiply two negative numbers
    Given I have a Calculator
    When I multiply -1 and -2
    Then the multiplication should be 2

  Scenario: Multiply a number by zero
    Given I have a Calculator
    When I multiply 4 and 0
    Then the multiplication should be 0