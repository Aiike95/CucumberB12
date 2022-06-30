@product
Feature: Validation of Products

#    Scenario: Validation of New Product Creation
#      Given User navigates to product home page and click order page
#      When User enters the product information 'MyMoney' and '4'
#      And User enters the address information 'Aiike', 'Buckingham','Pine Brook','NJ', '07058'
#      And User enters payment info '123456789','12/12', 'VISA'
#      Then User validates the message 'New order has been successfully added.'
#      And User clicks View All Orders and validates 'name', 'Product','quantity','Street','City','State','Zip','card','card number','expirationDate'
#
#
#  Scenario Outline: Validation of New Product Creation
#    Given User navigates to product home page and click order page
#    When User enters the product information '<productName>' and '<quantity>'
#    And User enters the address information '<customerName>', '<street>','<city>','<State>', '<ZipCode>'
#    And User enters payment info '<CardNumber>','<ExpirationDate>', '<CardType>'
#    Then User validates the message '<Message>'
#    And User clicks View All Orders and validates '<customerName>', '<productName>','<quantity>','<street>','<city>','<State>','<ZipCode>','<CardType>','<CardNumber>','<ExpirationDate>'
#
#    Examples:
#      | productName | quantity | customerName | street     | city       | State | ZipCode | CardNumber | ExpirationDate | CardType         | Message                                |
#      | MyMoney     | 4        | Aiike        | Buckingham | Pine Brook | NJ    | 07058   | 1234567898 | 12/12          | Visa             | New order has been successfully added. |
#      | FamilyAlbum | 10       | Aiike        | Buckingham | Pine Brook | NJ    | 07058   | 123456789  | 12/12          | American Express | New order has been successfully added. |
#      | ScreenSaver | 5        | Aiike        | Buckingham | Pine Brook | NJ    | 07058   | 123456789  | 12/12          | American Express | New order has been successfully added. |
