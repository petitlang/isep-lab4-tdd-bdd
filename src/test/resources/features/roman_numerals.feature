Feature: Roman numeral conversion
  Convert positive integers to their standard Roman numeral representation.

  @seed
  Scenario Outline: Convert the introductory examples
    Given a Roman numeral converter
    When I convert <number>
    Then the Roman numeral should be "<roman>"

    Examples:
      | number | roman |
      | 1 | I |
      | 2 | II |
      | 3 | III |
      | 4 | IV |
      | 5 | V |
      | 9 | IX |
      | 10 | X |
