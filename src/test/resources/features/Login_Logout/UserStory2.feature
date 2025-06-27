Feature: Failed Login

  Background:
    Given the user is on the login page

  Scenario Outline: Failed Login with Invalid Credentials
    Given the user enters invalid "<username>" and "<password>"
    When the user click login
    Then the user should not be logged in
    And an error message should be displayed for invalid credentials

    Examples:
      | username                | password     |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |
      | error_user              | secret_sauce |
      | standard_user           | Invalid_Pass |
      | Standard_userS          | Secret_Sauce |
