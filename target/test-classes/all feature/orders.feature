Feature: Orders
  As a user
  I want to buy a product
  So that I must order the product

  Scenario: create a new order
    Given I am on the altaShop order product
    When I select a product
    And I click buy button
    Then I can see a new product

  Scenario: get order by ID
    Given I am on the altaShop order product
    When I search a product by ID
    And I click a product
    Then I get order by ID

  Scenario: get all orders
    Given I am on the altaShop order product
    When I click basket button
    And I click ceklis list
    Then I get all orders product