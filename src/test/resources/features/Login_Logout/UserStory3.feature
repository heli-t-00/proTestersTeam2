Feature: User Story 3

  Background:
    Given the user is on the login page

  Scenario: Login Attempt by Locked-Out User

    And the user enters the username and password of a Locked-Out User

    When the user click login

    Then an error message should be displayed for locked out user

    And the user should not be logged in
