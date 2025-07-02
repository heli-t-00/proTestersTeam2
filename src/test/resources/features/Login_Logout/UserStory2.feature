Feature: User Story 2 - Failed Login

  Background:
    Given the user is on the login page

  Scenario Outline: Failed Login with Invalid Credentials
    Given the user enters invalid "<username>" and "<password>"
    When the user click login
    Then an error message should be displayed for invalid credentials

    Examples:
      | username                | password       |
      | problem_user            | secret_sauce   |
      | performance_glitch_user | secret_sauce   |
      | error_user              | secret_sauce   |
      | problem_user            | Invalid_p      |
      | performance_glitch_user | Invalid_p      |
      | error_user              | Invalid_p      |
      | Standard_userS          | SSecret_SauceS |
      | standard_user           | Invalid_p      |
