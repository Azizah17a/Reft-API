Feature: Register Alta Shop
  As a user
  I want to create a new account
  So that I can login

  Scenario: valid data
    Given I am on the altaShop register
    When I enter my valid fullname, email and password
    And I click on the register button
    Then I can on the login page

  Scenario: invalid data
    Given I am on the altaShop register
    When I enter my valid fullname and password
    And I enter my invalid email
    And I click on the register button
    Then I should see an error message invalid email