Feature: Calculator

  Scenario Outline: calculation
    Given the first operand is <operand1>
    And the second operand is <operand2>
    When I perform <operation>
    Then the result should be <result>

    Examples:
      | operand1 | operand2 | operation | result |
      | 5        | 3        | add       | 8      |
      | 10       | 2        | subtract   | 8      |
      | 4        | 2        | multiply   | 8      |
      | 16       | 4        | divide     | 4      |
