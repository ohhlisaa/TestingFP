@AddKost
Feature: AddKost

  Background: Pemilik has logged in
    Given User is on Mainpage
    When  User click on select role login button
    And User select role pemilik
    And User land on pemilik login page
    And User input email "dhimasweray@gmail.com"
    And User input password "Test1234;"
    When User click on login button
    Then User land on pemilik homepage

  @possitive-test
  Scenario Outline: Pemilik menambahkan kost
    When User click on addKost menu
    And User land on addKost page
    And User upload inside kost picture
    And User upload outside kost picture
    And User input kost name <kostName>
    And User select kost type
    And User input kost description <kostDescription>
    And User select payment scheme
    And User select regulations
    And User input additional regulations <additionalRegulations>
    And User click on next button
    And User land on addKost next page
    And User input kost address <address>
    And User input kost province <province>
    And User input kost district <district>
    And User input kost subDistrict <subDistrict>
    And User input kost notes <notes>
    And User click on addkost button
    Then User see addKost success message
    Examples:
      | kostName     | kostDescription   | additionalRegulations   | address          | province      | district     | subDistrict   | notes   |
      | "Ungu"       | "Exclusive"       | "Gada"                  | "Jl. Babarsari"  | "Yogyakarta"  | "Sleman"     | "Depok"       | "Gada"  |