Feature: categories Product
  As a user
  I want to select a categories product
  So that I must on the product page

  Scenario: create a category
    Given I am on the altaShop categories product
    When I see list a product
    And I click create button
    Then I input a category product

  Scenario: get category by ID
    Given I am on the altaShop categories product
    When I search category product
    And I choose category by ID
    Then I get category product

  Scenario: get all categories
    Given I am on the altaShop categories product
    When I search category product
    And I see list category product
    Then I get all categories product

  Scenario: delete categories
    Given I am on the altaShop categories product
    When I select category a product
    And I click category a product
    Then I can delete category a product