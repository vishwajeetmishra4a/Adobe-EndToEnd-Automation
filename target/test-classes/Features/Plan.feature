Feature: Adobe Plans And Pricing

  As a customer
  I want to review subscription plans
  So that I can choose a suitable plan

  Background:
    Given User is on Adobe homepage

  Scenario: Navigate to Plans and Pricing page
    When User clicks Plans and Pricing
    Then Plans page should be displayed
    

  Scenario: Verify Individual plans section
    Given User is on Plans page
    Then Individual plans should be displayed

  Scenario: Verify Business plans section
    Given User is on Plans page
    Then Business plans should be displayed

  Scenario: Verify Students and Teachers plans section
    Given User is on Plans page
    Then Students and Teachers plans should be displayed

  Scenario: Verify plan details
    Given User is on Plans page
    Then plan name should be displayed
    And plan price should be displayed
    And purchase option should be displayed