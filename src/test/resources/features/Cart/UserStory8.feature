@Cart
Feature: User Story 8 - View Cart Contents


  Background:
    Given the user is on the login page
    And the user enters correct username and password
    And the user click login
    And the user is take to the product listing page

  @Navigation
  Scenario: Navigate to cart page when clicking cart icon
    When the user click the cart icon
    Then the user navigates to cart page

  @Navigation
    Scenario: Navigate to Product listing from 'Your Cart'
      When the user click the cart icon
      And the user navigates to cart page
      Then the user click on 'Continue shopping' button
      And the user navigates back to the product listing page