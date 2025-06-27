Feature: User Story 7

  Background:
    Given the user is on the login page
    And the user enters correct username and password
    And the user click login
    And the user is take to the product listing page

  Scenario:

    And the user has added items to the cart

    When the user selects remove on the products listing page

    Then the item should be removed from the cart

    And the cart icon should update to reflect the change

