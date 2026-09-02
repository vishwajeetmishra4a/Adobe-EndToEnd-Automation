Feature: Adobe Footer Navigation

  As a visitor
  I want to access footer links
  So that I can view Adobe legal and support information

  Background:
    Given User is on Adobe homepage

  Scenario: Verify Privacy Policy link
    When User clicks Privacy Policy
    Then Privacy Policy page should open

  Scenario: Verify Terms Of Use link
    When User clicks Terms Of Use
    Then Terms Of Use page should open

  Scenario: Verify Support link
    When User clicks Support link
    Then Support page should be displayed