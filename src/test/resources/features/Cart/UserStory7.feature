Feature: User Story 7

  Background:
    Given the user is on the login page
    And the user enters correct username and password
    And the user click login
    And the user is take to the product listing page

  Scenario: Remove items from cart on Products page

    And the user has added 2 items to the cart

    When the user selects remove on 1 item on the products listing page

    Then the item should be removed from the cart

    And the cart icon should update to reflect the 1 item removed


  Scenario: Remove items from cart on Cart page

    And the user has added 2 items to the cart

    When the user navigates to the cart

    And the user selects remove on 1 item on the cart page

    Then the item should be removed from the cart

    And the cart icon should update to reflect the 1 item removed