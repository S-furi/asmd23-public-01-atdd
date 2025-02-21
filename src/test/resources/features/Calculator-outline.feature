Feature:  Computing operations with a Calculator
  In order to not learn math
  As someone who is bad at math
  I want to be able to add and multiply numbers using a Calculator

  Background: Start with a calculator
    Given I have a Calculator

  Scenario Outline: Add two numbers
    When I add <arg0> and <arg1>
    Then the sum should be <res>
    Examples:
      | arg0 | arg1 | res |
      | 1    | 1    | 2   |
      | 1    | -1   | 0   |
      | -5   | -6   | -11 |

  Scenario Outline: Multiply two numbers
    When I multiply <arg0> and <arg1>
    Then the multiplication should be <res>
    Examples:
      | arg0 | arg1 | res |
      | 1    | 2    | 2   |
      | -1   | 2    | -2  |
      | -1   | -2   | 2   |
      | 4    | 0    | 0   |
      | -4   | 0    | 0   |

  Scenario Outline: Divide two numbers
    When I divide <arg0> and <arg1>
    Then the division should be <res>
    Examples:
      | arg0 | arg1 | res |
      | 4    | 2    | 2   |
      | -4   | 2    | -2  |
      | -4   | -2   | 2   |
      | 3    | 2    | 1   |
      | 0    | 2    | 0   |