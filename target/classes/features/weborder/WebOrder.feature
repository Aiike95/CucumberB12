@regression @smoke
Feature: WebOrder page Food Order Functionality

  Background:
#    Given User navigates to the WebOrder
    Given User provides credentials 'guest1@microworks.com' and 'Guest1!' for WebOrder
    When User validates the 'ORDER DETAILS - Weborder' from homepage
    And user clicks Group Order Box and Next Button
    And User sends the word 'Test' for Notes to Invitees part
    And User sends e-mail addresses which are 'aiike@gmail.com' and 'charlies@gmail.com'

   Scenario: Testing webOrder functionality for House
      And User chooses the delivery address 'My House' and validates the address '1854 Empire Blvd'
     And User clicks Create Group Order button.
      Then user validates the title of page is 'View Group Order'
      And User validates total participant is 1

  Scenario: Testing webOrder functionality for Office
    And User chooses the delivery address 'Office' and validates the address '2012 EMPIRE BLVD'
    And User clicks Create Group Order button.
    Then user validates the title of page is 'View Group Order'
    And User validates total participant is 1
#    And User validate the name of website
#    And User gets the name
#    Then User comes here