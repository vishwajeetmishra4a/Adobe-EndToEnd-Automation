Feature: Adobe Support Center

  As an Adobe user
  I want to access support resources
  So that I can resolve issues and find help

  Background:
    Given User navigates to Adobe Support page

  Scenario: Verify Support page loads successfully
    Then Adobe Support page should be displayed

  Scenario: Verify support categories are displayed
    Then support categories should be visible

  Scenario: Verify Account support section
    Then Account support section should be displayed

  Scenario: Verify Plans and Billing support section
    Then Plans and Billing support section should be displayed

  Scenario: Verify application support section
    Then application support options should be displayed

  Scenario: Search for support content
    When User searches for support topic
    Then relevant support articles should be displayed