Feature: Validate Footer Sections

  As a visitor, when not logged in
  I want to validate all the Helpful links in footer

  Background:
    Given I am on the Boylesports website home page

  Scenario: Successfully validated the Promotion Links in Helpful links
    When I check Promotion Links if exists
    Then I click Promotion Links from Helpful Links section
    And I redirected to Promotion page

  Scenario: Successfully validated the Fast Racing Result Links in Helpful links
    When I check Fast Racing Result Links if exists
    Then I click Fast Racing Result Links from Helpful Links section
    And I redirected to Fast Racing Result page