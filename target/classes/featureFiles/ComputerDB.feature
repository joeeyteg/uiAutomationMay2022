Feature: ComputerDatabase
  As a User
  I want to be able to add new computer created to the database
  So that I can have the details of the computer stored on the Play sample application


  @runComputerDB_add

  Scenario: Add a new computer to the computer database
    Given I am on the Play sample application home page
    When I click on "Add new computer" button
    And I enter information as follows
      | FIELD             | VALUE            |
      | COMPUTER NAME     | XIAOMI ALIENWARE |
      | INTRODUCED DATE   | 1960-10-01       |
      | DISCONTINUED DATE | 2024-10-10       |
      | COMPANY NAME      | IBM              |

    And I click on the Create this computer button,

    Then I should be able to add the computer name to the database and acknowledged as "Done" computer added.

    #    "Use row (starting from the top 0-4) before column(0-1) to pick" e.g IBM will be row 4 and column 1

