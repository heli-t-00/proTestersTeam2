Feature: Product Sorting
  Background:
    Given the user is on the login page
    And the user enters correct username and password
    And the user click login
    And the user is take to the product listing page

    Scenario:
      When the user clicks filter option to sort by Name (A to Z)
      Then the product list should update
      And the products should be ordered alphabetically from A to Z by name