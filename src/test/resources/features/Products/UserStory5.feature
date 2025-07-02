Feature: User Story 5 - Product Sorting

  Background:
    Given the user is on the login page
    And the user enters correct username and password
    And the user click login
    And the user is take to the product listing page


  Scenario: Sort product by Name (A to Z)
    When the user clicks on the sort dropdown
    And the user selects Name A to Z from the option dropdown
    Then  the products should be ordered alphabetically from A to Z

  Scenario: Sort product by Name (Z to A)
    When the user clicks on the sort dropdown
    And the user selects Name Z to A from the option dropdown
    Then  the products should be ordered alphabetically from Z to A

  Scenario: Sort product by Price (low to high)
    When the user clicks on the sort dropdown
    And the user selects Price low to high from the option dropdown
    Then  the products should be ordered by price low to high

  Scenario: Sort product by Price (high to low)
    When the user clicks on the sort dropdown
    And the user selects Price high to low from the option dropdown
    Then  the products should be ordered by price high to low