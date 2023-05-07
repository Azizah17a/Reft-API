Feature: Get user information
  As a user
  I want to get user information
  So that I must on the account page

  Scenario: user information
    Given I am on the altaShop account
    When I input email and password
    And I click on the account button
    Then I can see user information