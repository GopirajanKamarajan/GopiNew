Feature: Validation of login scenario
 
  @tag1
  Scenario: validating valid username and password
    Given User should be in login page
    When User enters username and password
    And User clicks the submit button
    Then User should enters the login page