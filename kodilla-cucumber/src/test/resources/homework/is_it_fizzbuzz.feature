Feature: The Fizz Buzz game
  Scenario Outline: it is Fizz or Buzz
    Given the number <number>
    When I check for FizzBuzz
    Then I receive <result>
    Examples:
      | number | result |
      | 1     | "None" |
      | 2     | "None" |
      | 4     | "None" |
      | 7     | "None" |
      | 8     | "None" |
      | 11     | "None" |
      | 13     | "None" |
      | 14     | "None" |
      | 16     | "None" |
      | 17     | "None" |
      | 19     | "None" |
      | 3     | "Fizz" |
      | 6     | "Fizz" |
      | 9     | "Fizz" |
      | 12     | "Fizz" |
      | 18     | "Fizz" |
      | 21     | "Fizz" |
      | 5     | "Buzz" |
      | 10     | "Buzz" |
      | 20     | "Buzz" |
      | 15     | "FizzBuzz" |


