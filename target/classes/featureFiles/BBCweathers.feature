Feature: BBC weathers


  As a User
  I want to be able to select a location and view current weather result


  Background:
    Given I am the BBC weather homepage,


  @runBBCweather

  Scenario:

    When I enter the city "Bournemouth, Bournemouth",

    And I click the on search icon, I should be able to see the current weather results.


  Scenario:

    When I enter the city "Bournemouth, Bournemouth",

    And I click the on search icon, I should be able to see the current weather results.

    Then I should be able to ascertain that tomorrows "18°C" is greater than tomorrows "11°C"

