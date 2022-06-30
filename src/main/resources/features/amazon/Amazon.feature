Feature:Amazon search functionality

  Scenario:Positive scenario for Amazon search
    Given User navigates to Amazon
    When User searches for iphone 13 case
    Then User validates the number is 40000 results on the top shown
    And User validates all headers contains iphone