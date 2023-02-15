@ChangePasswordPencari
Feature: Change Password Pencari

  Background: User has logged in
    Given User is on Mainpage
    When  User click on select role login button
    And User select role pencari
    And User land on pencari login page
    And User input email "sofialisaa098@gmail.com"
    And User input password "Test1234;"
    When User click on login button
    Then User land on pencari homepage

  @possitive-test
  Scenario Outline: Pencari Change Password with Correct Password Format
    When User click on profile icon
    And User click on setting menu
    And User land on change password pencari page
    And User input oldPassword <oldPassword>
    And User input newPassword <newPassword>
    And User input confirmation Password <confirmationPassword>
    And User click on save button
    Then User see change password success message
    Examples:
      | oldPassword              | newPassword              | confirmationPassword      |
      | "Test1234;"           | "NewPassword;"              | "NewPassword;"               |