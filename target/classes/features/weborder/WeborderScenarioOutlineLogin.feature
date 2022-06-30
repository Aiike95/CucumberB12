Feature: WebOrder Login Functionality with Scenario Outline

  Background:
    Given User navigates to the WebOrder

  Scenario: Validation of WebOrder positive Login Scenario()
    When User provides credentials 'guest1@microworks.com' and 'Guest1!' for WebOrder
    Then User validates the 'ORDER DETAILS - Weborder' from homepage

  Scenario Outline: Validation of WebOrder negative Login Scenario
    When User provides credentials '<userName>' and '<password>' for WebOrder
    Then User validates the '<errorMessage>' error message.
    Examples:
      | userName              | password | errorMessage   |
      | guest1@microworks     | ahmet    | Sign in Failed |
      | guest1@microworks.co  | ahmet    | Sign in Failed |
      | guest1@microworks.cm  | ahmet    | Sign in Failed |
      | guest1@microworks.com |          | Sign in Failed |
      | guest1@microwork.com  | 11111    | Sign in Failed |
      |                       | ahmet    | Sign in Failed |
      | guest1@microworkscom  | ahmet    | Sign in Failed |
      | 111                   | ahmet    | Sign in Failed |
      | 11gut1@microworks.com | ahmet    | Sign in Failed |
      | --st1@microworks.com  | ahmet    | Sign in Failed |