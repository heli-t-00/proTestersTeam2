Feature: View cart contents


  Background:
    Given the user is on the login page
    And the user enters correct username and password
    And the user click login
    And the user is taken to the product listing page

  Scenario: Navigate to cart page when clicking cart icon
    When the user click the cart icon
    Then the user navigates to cart page

    Scenario: Navigate to Product listing from 'Your Cart'
      When the user click on 'Continue shopping' button
      Then the user navigates back to the product listing page