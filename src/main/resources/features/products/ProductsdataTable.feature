@productTable
Feature: Validation of Products

    Scenario: Validation of New Product Creation
      Given User navigates to product home page and click order Order Button with DataTable
        | userName | Tester |
        | password | test   |
      When User enters the product information
        | product  | MyMoney |
        | quantity | 4       |

      And User enters the address information
        | name    | Techtorial   |
        | street  | 2200 E Devon |
        | city    | Des Plaines  |
        | state   | IL           |
        | zipCode | 60045        |
      And User enters payment info and process the order
        | cardType   | Visa     |
        | cardNumber | 13213123 |
        | expireDate | 08/24    |
      Then User validates the message
      |New order has been successfully added.|
      And User clicks View All Orders and validates
        | name       | Techtorial   |
        | street     | 2200 E Devon |
        | city       | Des Plaines  |
        | state      | IL           |
        | zipCode    | 60045        |
        | product    | MyMoney      |
        | quantity   | 4            |
        | cardType   | Visa         |
        | cardNumber | 13213123     |
        | expireDate | 08/24        |