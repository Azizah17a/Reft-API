Feature: Post login
  As a user
  I want to see the main page
  So that I can access my account

  Scenario: valid login
    Given I am on the altaShop login
    When I enter my valid email and password
    And I click on the login button
    Then I can on the homepage

    Scenario: invalid login
      Given I am on the altaShop login
      When I enter my valid email
      And I enter my invalid password
      And I click on the login button
      Then I should see an error message invalid password