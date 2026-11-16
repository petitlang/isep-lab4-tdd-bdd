Feature: Roman numeral conversion
  Convert positive integers to standard Roman numerals.

  Scenario: Convert 1 to I
    Given a Roman numeral converter
    When I convert 1
    Then the Roman numeral should be "I"

  Scenario: Convert 2 to II
    Given a Roman numeral converter
    When I convert 2
    Then the Roman numeral should be "II"

  Scenario: Convert 3 to III
    Given a Roman numeral converter
    When I convert 3
    Then the Roman numeral should be "III"

  Scenario: Convert 4 to IV
    Given a Roman numeral converter
    When I convert 4
    Then the Roman numeral should be "IV"

  Scenario: Convert 5 to V
    Given a Roman numeral converter
    When I convert 5
    Then the Roman numeral should be "V"

  Scenario: Convert 9 to IX
    Given a Roman numeral converter
    When I convert 9
    Then the Roman numeral should be "IX"

  Scenario: Convert 10 to X
    Given a Roman numeral converter
    When I convert 10
    Then the Roman numeral should be "X"
