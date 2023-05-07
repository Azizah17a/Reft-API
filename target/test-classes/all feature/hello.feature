Feature: Get hello
  As a user
  I want to get hello
  So that I must on the index page

  Scenario: get hello
    Given I am on the altaShop page
    When I success login
    And I click on the index button
    Then I get hello from altaShop