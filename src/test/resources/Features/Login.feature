Feature: Adobe Login

  As a registered Adobe user
  I want to log in to my account
  So that I can access Adobe services

  Background:
    Given User navigates to Adobe login page

  Scenario: Login with valid credentials
    When User enters a valid email address
    And User clicks Continue
    And User enters a valid password
    And User clicks Sign In
    Then User should be logged into Adobe account

  Scenario: Login with invalid email
    When User enters an invalid email address
    And User clicks Continue
    Then appropriate email validation message should be displayed

  Scenario: Login with empty email
    When User leaves email field blank
    And User clicks Continue
    Then email required validation message should be displayed

  Scenario: Login with invalid password
    When User enters a valid email address
    And User clicks Continue
    And User enters an invalid password
    And User clicks Sign In
    Then login should fail with appropriate error message

  Scenario: Verify Forgot Password functionality
    When User clicks Forgot Password option
    Then password recovery page should be displayed