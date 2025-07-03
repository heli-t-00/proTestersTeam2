@Product
Feature: User Story 14 - Social Media

  Background:
    Given the user is on the login page
    And the user enters correct username and password
    And the user click login
    And the user is take to the product listing page
    And all products are displayed with the footer containing links to social media and copyright text

    @Navigation
    Scenario: Twitter Social Media
      When the user clicks the Twitter icon
      Then the user should be redirected to the Twitter webpage

    @Navigation
    Scenario: Facebook Social Media
      When the user clicks the Facebook icon
      Then the user should be redirected to the Facebook webpage

    @Navigation
    Scenario: LinkedIn Social Media
      When the user clicks the LinkedIn icon
      Then the user should be redirected to the LinkedIn webpage