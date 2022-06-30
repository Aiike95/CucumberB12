Feature:testing google functionality

  Scenario: Happy path Google search Functionality
    Given User navigates to Google
    When User searches for Techtorial
    Then User gets more than 10 links on the Google page
