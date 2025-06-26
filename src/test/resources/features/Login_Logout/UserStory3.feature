Feature: User Story 3

  Background:
    Given the user is on the login page

  Scenario: Login Attempt by Locked-Out User

    And the user enters the username and password of a Locked-Out User

    When the user clicks the login button

    Then an error message should be displayed

    And the user will not be logged in
