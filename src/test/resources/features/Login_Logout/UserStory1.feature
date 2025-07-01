Feature: User Story 1 - Successful Login

  Background:
    Given the user is on the login page

  Scenario: Successful Login for returning user
    And the user enters correct username and password
    When the user click login
    Then the user is take to the product listing page


    Scenario Outline: Unsuccessful Login empty username or password
      And  the user has left "<username>" or "<password>" fields empty
      When the user click login
      Then a specific error message for "<username>" or "<password>" should be displayed
      And the user should not be logged in


      Examples:
      | username | password |
      | standard_user |              |
      |               | secret_sauce |
      |               |              |
