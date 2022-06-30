#Feature: Login Functionality of WebOrder Page
#
#  Scenario: Validation of WebOrder Login Scenario(positive correct username and password)
#    Given User navigates to WebOrder
#    When User provides correct 'guest1@microworks.com' and 'Guest1!' for WebOrder
#    Then User validates the 'ORDER DETAILS - Weborder' from homepage
#
#  Scenario: Validation of WebOrder Login Scenario(positive correct username and password)
#    Given User navigates to WebOrder
#    When User provides incorrect 'guest1@microworks.com' or wrong 'charlie' for WebOrder
#    Then User validates the 'Sign in Failed' message from homepage
#
#  Scenario: Validation of WebOrder Login Scenario(positive correct username and password)
#    Given User navigates to WebOrder
#    When User provides incorrect 'guest1@microwork' and 'Guest1!' for WebOrder
#    Then User validates the 'Sign in Failed' from homepage
#
#  Scenario: Validation of WebOrder Login Scenario(positive correct username and password)
#    Given User navigates to WebOrder
#    When User provides incorrect empty  '' and empty '' for WebOrder
#    Then User validates the 'Sign in Failed' from homepage