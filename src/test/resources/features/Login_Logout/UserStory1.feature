Feature: User Story 1

  Background:
    Given the user is on the login page

  Scenario: Successful Login for returning user
    And the user enters correct username and password
    When the user click login
    Then the user is take to the product listing page

    Scenario: Unsuccessful Login for returning user
    And the user has left username and password fields empty
    When the user click login
    Then an error message should be displayed
    And the user should not be logged in