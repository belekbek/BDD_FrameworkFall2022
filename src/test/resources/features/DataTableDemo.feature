Feature: Data Table functionality

  Background:Login
    Given user should go to Login page
    And user should login with valid credentials
    Then user should login successfully
    And user should click add user button
    Then user should land to create new user page

  @table
  Scenario: Verify that user admin can create user in the system
    Given create new user with following data
      | firstname | lastname | email           | username | password | bio          |
      | John2     | Doe2     | john@gmail.com2 | john     | test123  | Bio test 123 |
      | John3     | Doe3     | john@gmail.com3 | john     | test123  | Bio test 123 |
      | John4     | Doe4     | john@gmail.com4 | john     | test123  | Bio test 123 |
      | John5     | Doe5     | john@gmail.com5 | john     | test123  | Bio test 123 |