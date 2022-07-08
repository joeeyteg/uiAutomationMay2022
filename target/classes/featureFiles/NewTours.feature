Feature: NewTours

  As a User
  I want to be able to register an account
  So that I can have an account

  Background:
    Given I am on the NewTours homepage,
    When I click on the Register link,

# @runForestRunEncap

  Scenario:  Register and account with only mandatory fields,

    And  I enter firstname as "Joseph", lastname as "Teg", phone as "07987654321", email as "josephteg@lazertag.com",
    And I enter address as "District 1, Queen Mary drive", city as "Glasgow", state as "Hamilton", postal code as "G12H 5RP", select country as "BULGARIA"
    And I enter username as "Crazy_Tourist", password and confirm password as "654321",
    And I click on the submit button,
    Then the acknowledgement page is displayed with the username as "Crazy_Tourist",



#    Using Scenario outline/ Examples


  @runNewTours

  Scenario Outline:  Register and account with only mandatory fields,

    When  I enter contact information of "<F_Name>", "<L_Name>","<P_Number>","<Email>",
    And I enter mailing information of "<Address>","<City>","<State>","<Postal_code>","<Country>"
    And I enter User information as "<U_Name>" and "<P_Word>",
    And I click on the submit button,
    Then the acknowledgement page is displayed with the username as "<U_Name>",

    Examples:
      | F_Name  | L_Name    | P_Number    | Email           | Address                    | City      | State     | Postal_code | Country | U_Name    | P_Word     |
      | William | Wallace   | 07454545456 | ww@mail.com     | Apartment 1, Angola Street | Lock-hill | Sheffield | SH2 4RR     | GERMANY | Wilwal007 | 78etiuqgu  |
      | Micheal | Jackson   | 08090909090 | mj@mail.fa      | 101, Museum Road           | Red-hill  | Dublin    | D12 6HH     | FRANCE  | Micjac007 | oguQOgfjjo |
      | Lorenzo | Alejandro | 00389766780 | la01@mail.co.uk | 007, James Bond Crescent   | Cry-river | Edinburgh | EH1 9GG     | SWEDEN  | Loal007   | 859577tt9j |




