@login
Feature: Login

  Background: Login
    Given User is on Mainpage
    When  User click on select role login button

  @possitive-test
  Scenario Outline: Pencari Login with valid credentials
    And User select role pencari
    And User land on pencari login page
    And User input email <email>
    And User input password <password>
    When User click on login button
    Then User land on pencari homepage
    Examples:
      | email                          | password              |
      | "sofialisaa098@gmail.com"      | "Test1234;"            |

  @negative-test
  Scenario Outline: Pencari Login with wrong email
    And User select role pencari
    And User land on pencari login page
    And User input email <email>
    And User input password <password>
    When User click on login button
    Then User see error message
    Examples:
      | email                          | password              |
      | "wrongemail@gmail.com"         | "Test1234;"            |


  @negative-test
  Scenario Outline: Pencari Login with wrong password
    And User select role pencari
    And User land on pencari login page
    And User input email <email>
    And User input password <password>
    When User click on login button
    Then User see error message
    Examples:
      | email                          | password              |
      | "sofialisaa098@gmail.com"      | "WrongPassword"       |


  @negative-test
  Scenario Outline: Pencari Login with blank email
    And User select role pencari
    And User land on pencari login page
    And User input password <password>
    When User click on login button
    Then User see error message
    Examples:
      | password           |
      | "Test1234;"    |


  @negative-test
  Scenario Outline: Pencari Login with blank password
    And User select role pencari
    And User land on pencari login page
    And User input email <email>
    When User click on login button
    Then User see error message
    Examples:
      | email                          |
      | "sofialisaa098@gmail.com"      |


  @negative-test
  Scenario Outline: Pencari Login with blank email and password
    And User select role pencari
    And User land on pencari login page
    And User input email <email>
    And User input password <password>
    When User click on login button
    Then User see error message
    Examples:
      | email                          | password           |
      | " "                            | " "                |


  @negative-test
  Scenario Outline: Pencari Login with invalid credentials
    And User select role pencari
    And User land on pencari login page
    And User input email <email>
    And User input password <password>
    When User click on login button
    Then User see error message
    Examples:
      | email                       | password              |
      | "wrongemail@gmail.com"      | "WrongPassword"       |


  @possitive-test
  Scenario Outline: Pemilik Login with valid credentials
    And User select role pemilik
    And User land on pemilik login page
    And User input email <email>
    And User input password <password>
    When User click on login button
    Then User land on pemilik homepage
    Examples:
      | email                          | password            |
      | "dhimasweray@gmail.com"        | "Test1234"          |


  @negative-test
  Scenario Outline: Pemilik Login with wrong email
    And User select role pemilik
    And User land on pemilik login page
    And User input email <email>
    And User input password <password>
    When User click on login button
    Then User see error message
    Examples:
      | email                         | password           |
      | "wrongemail@gmail.com"        | "Test1234"         |


  @negative-test
  Scenario Outline: Pemilik Login with wrong password
    And User select role pemilik
    And User land on pemilik login page
    And User input email <email>
    And User input password <password>
    When User click on login button
    Then User see error message
    Examples:
      | email                          | password           |
      | "dhimasweray@gmail.com"        | "WrongPassword"    |


  @negative-test
  Scenario Outline: Pemilik Login with invalid credentials
    And User select role pemilik
    And User land on pemilik login page
    And User input email <email>
    And User input password <password>
    When User click on login button
    Then User see error message
    Examples:
      | email                          | password           |
      | "wrongemail@gmail.com"         | "WrongPassword"    |

  @negative-test
  Scenario Outline: Pemilik Login with blank email
    And User select role pemilik
    And User land on pemilik login page
    And User input password <password>
    When User click on login button
    Then User see error message
    Examples:
      | password           |
      | "Test1234"         |


  @negative-test
  Scenario Outline: Pemilik Login with blank password
    And User select role pemilik
    And User land on pemilik login page
    And User input email <email>
    When User click on login button
    Then User see error message
    Examples:
      | email                          |
      | "dhimasweray@gmail.com"      |


  @negative-test
  Scenario Outline: Pemilik Login with blank email and password
    And User select role pemilik
    And User land on pemilik login page
    And User input email <email>
    And User input password <password>
    When User click on login button
    Then User see error message
    Examples:
      | email                          | password           |
      | " "                            | " "                |
