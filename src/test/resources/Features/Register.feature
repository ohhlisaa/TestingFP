@Register
Feature: Register

  Background: Register
    Given User is on Homepage
    When  User click on select role register button

  @possitive-test
  Scenario Outline: Pencari Register with valid credentials
    And User select role register pencari
    And User land on pencari register page
    And User input registerEmail <registerEmail>
    And User input registerNomorTelepon <registerNomorTelepon>
    And User input registerPassword <registerPassword>
    And User input registerKonfirmasiPassword <registerkonfirmasiPassword>
    And User click on register checkbox
    When User click on register button
    Then User land on verification page
    Examples:
      | registerEmail                  | registerNomorTelepon          |registerPassword             | registerkonfirmasiPassword    |
      | "blueberry@gmail.com"          | "081231231231"                |"Test1234;"                  | "Test1234;"                   |

  @possitive-test
  Scenario Outline: Pemilik Register with valid credentials
    And User select role register pemilik
    And User land on pemilik register page
    And User input registerEmail <registerEmail>
    And User input registerNomorTelepon <registerNomorTelepon>
    And User input registerPassword <registerPassword>
    And User input registerKonfirmasiPassword <registerkonfirmasiPassword>
    And User click on register checkbox
    When User click on register button
    Then User land on verification page
    Examples:
      | registerEmail                  | registerNomorTelepon          |registerPassword             | registerkonfirmasiPassword    |
      | "blackberry@gmail.com"         | "088123123123"                |"Test1234;"                  | "Test1234;"                   |