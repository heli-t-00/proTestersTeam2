@Login
Feature: User Story 12 - Logout

  Background:
    Given the user is on the login page
    And the user enters correct username and password
    And the user click login
    And the user is take to the product listing page

  @Navigation
  Scenario: View logout option
    When the user clicks the menu button
    Then the logout option should be visible

  @Navigation
  Scenario: Log out successfully
    When the user clicks the menu button
    And the user clicks the Logout option from the menu
    Then the user is redirected to the login page
    And the session is ended
