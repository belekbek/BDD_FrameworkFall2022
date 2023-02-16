Feature: Scenario Outline examples

  Background: Go to login page
    Given user should go to Login page

  @Outline
  Scenario Outline:  Login test
    Given enter in username field "<username>"
    And enter in password field "<password>"
    When user click Login button
    Then login not successful
    Examples:
      | username | password  |
      | test1    | PASS123   |
      | test123  | 12343bb   |
      | 123test  | test12345 |