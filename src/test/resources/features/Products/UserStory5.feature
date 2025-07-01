@wip
Feature: Product Sorting

  Background:
    Given the user is on the login page
    And the user enters correct username and password
    And the user click login
    And the user is take to the product listing page


  Scenario: Sort product by Name (A to Z)
    When the user clicks on the sort dropdown
    And the user selects Name A to Z from the option dropdown
    Then  the products should be ordered alphabetically from A to Z