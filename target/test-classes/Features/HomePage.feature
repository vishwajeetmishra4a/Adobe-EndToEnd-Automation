Feature: Adobe Homepage

  As a visitor
  I want to access Adobe homepage
  So that I can explore Adobe products and services

  Background:
    Given User launches Adobe website

  Scenario: Verify Adobe homepage loads successfully
    Then Adobe homepage should be displayed

  Scenario: Verify Adobe logo is displayed
    Then Adobe logo should be visible

  Scenario: Verify global navigation menu is displayed
    Then navigation menu should be visible

  Scenario: Verify Sign In option is available
    Then Sign In option should be displayed

  Scenario: Verify Plans and Pricing option is available
    Then Plans and Pricing option should be displayed

  Scenario: Verify footer section is displayed
    Then footer section should be visible