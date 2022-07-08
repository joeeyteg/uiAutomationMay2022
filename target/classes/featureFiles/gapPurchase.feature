Feature: Adding items to the cart on the GAP website

  As a user i want to be able to add items to the cart so I can purchase them


  @gapPurchase

  Scenario: Adding an item from the women's category to the cart should not be possible without selecting size
    Given I am on the GAP homepage,
    When I pick one item from the Summer Essentials under the "women's" category,
    And I choose the first item from the list,
    And I click on the "Add to Cart" button
    Then I should see an error message displayed as "Please choose size before adding to bag"


