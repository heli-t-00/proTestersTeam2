Feature: User Story 1

  Background:
    Given the user is on the login page

  Scenario: Successful Login for returning user
    And the user enters correct username and password
    When the user click login
    Then the user is take to the product listing page