Feature: Product
  As a user
  I want to see a product
  So that I must on the homepage

  Scenario: get all products
    Given I am on the altaShop homepage
    When I search a product
    And I get one list a product
    Then I get all product

  Scenario: Create a new product
    Given I am on the altaShop homepage
    When I click the new button
    And I input the product
    Then I get a new list product

  Scenario: get product by ID
    Given I am on the altaShop homepage
    When I search the product with ID
    And I can to choose the product
    Then I get product by ID

  Scenario: Delete a product
    Given I am on the altaShop homepage
    When I search a product
    And I get list a product
    Then I can delete a product

  Scenario: assign a product rating
    Given I am on the altaShop homepage
    When I buy a product
    And I get a product
    Then I will assign a product rating

  Scenario: get product ratings
    Given I am on the altaShop homepage
    When I search a product
    And I get list a product
    Then I can to see product ratings

  Scenario: create a comment for product
    Given I am on the altaShop homepage
    When I choose a product
    And I create a comment product
    Then I should see another comment a product

  Scenario: get product comments
    Given I am on the altaShop homepage
    When I search a product
    And I choose a product
    Then I get product comments