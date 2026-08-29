Feature: Adobe Homepage Validation

  As a visitor
  I want to access Adobe homepage
  So that I can explore Adobe services

  Scenario: Verify Adobe homepage loads successfully
    Given User launches Adobe website
    Then Adobe homepage should be displayed

  Scenario: Verify Adobe logo is visible
    Given User is on Adobe homepage
    Then Adobe logo should be visible

  Scenario: Verify homepage banners are displayed
    Given User is on Adobe homepage
    Then promotional banners should be visible

  Scenario: Verify main navigation menu is available
    Given User is on Adobe homepage
    Then all primary navigation options should be displayed