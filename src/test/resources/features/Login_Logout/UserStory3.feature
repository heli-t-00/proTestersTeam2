@Login
Feature: User Story 3 - Locked Out User

  Background:
    Given the user is on the login page

  @Message
  Scenario: Login Attempt by Locked-Out User
    And the user enters the username and password of a Locked-Out User
    When the user click login
    Then an error message should be displayed for locked out user

