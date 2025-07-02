Feature: User Story 6 - Add Item to Cart

  Background:
    Given the user is on the login page
    And the user enters correct username and password
    And the user click login
    And the user is take to the product listing page

   Scenario: Item is added to Cart
     When the user has added 6 items to the cart
     Then the items get added to the cart
     And the cart icon updates to show corresponding number of items
