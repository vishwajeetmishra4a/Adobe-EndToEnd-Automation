Feature: Adobe Product Navigation

  As a visitor
  I want to access Adobe product pages
  So that I can learn more about individual products

  Background:
    Given User is on Adobe homepage

  Scenario: Navigate to Photoshop page
    When User opens Photoshop product page
    Then Photoshop page should be displayed

  Scenario: Navigate to Illustrator page
    When User opens Illustrator product page
    Then Illustrator page should be displayed

  Scenario: Navigate to Acrobat page
    When User opens Acrobat product page
    Then Acrobat page should be displayed

  Scenario: Verify product information availability
    When User opens a product page
    Then product description should be displayed
    And product benefits should be displayed

  Scenario: Verify pricing information availability
    When User opens a product page
    Then pricing information should be visible