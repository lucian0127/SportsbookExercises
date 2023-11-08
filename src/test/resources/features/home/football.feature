Feature: Validates the Football page

  As a visitor of the Boylesports Website
  I want to validate the Football link in Left Navigation bar
  I want to click the Football link in Left Navigation bar
  I want to validate the Football title in Football page

  Background:
    Given I am on the Boylesports website home page

#  Football page validation
  Scenario: Successfully validated the Football title in Football page
    Given I have validated the Football link in Left Navigation bar in home page.
    When I click on the Football link from Left Navigation bar
    Then I should redirected to Football page
    Then I have validated the Football title in Football page