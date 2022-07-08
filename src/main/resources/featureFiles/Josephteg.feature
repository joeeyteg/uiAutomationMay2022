Feature: Newtours
  As a User
  I want to be able to register an account
  So that I can have an account


  Scenario: Register an account with only mandatory fields
    Given I am on the NewTours homepage
    When I click on Register link
    And I enter username as "CrazyTourist", password and confirm password as "6214179"
    And I click on submit button
    Then the confirmation page is displayed with the username as "CrazyTourist"


