Feature: Validates the Logo for Boylesports Website

  As a visitor of the Boylesports Website
  I want to validate the Boylesports Logo from the header
  I want to click the Boylesports Logo from the header

  Background:
    Given I am on the Boylesports website home page

  Scenario: Successfully validated the Boylesports Logo from the header
    Given I have validated the Boylesports Logo from the header
    When I click on the Boylesports Logo from the header
    Then I should be redirected to Boylesports home page

  Scenario: Successfully navigated to Boylesports login page
    Given I want to validate if i am not logged in to Boylesports website
    When I want to check if the Login button is present from the header
    Then I click on the login button from the header

  Scenario: Successfully logged in to Boylesports website with valid credentials
    When I am successfully redirected to login page
    Then I have entered a valid "<tttttddomingo>" and "<Password1!>"
    Then I click on the login button
    Then I should be logged in successfully