Feature: Validates the Logo for Boylesports Website

  As a visitor of the Boylesports Website
  I want to validate the Boylesports Logo from the header
  I want to click the Boylesports Logo from the header

  Background:
    Given I am on the Boylesports website home page

#  Logo validation
  Scenario: Successfully validated the Boylesports Logo from the header
    Given I have validated the Boylesports Logo from the header
    When I click on the Boylesports Logo from the header
    Then I should be redirected to Boylesports home page

#  Login validation
  Scenario: Successfully logged in to Boylesports login page
    Given I want to validate if i am not logged in to Boylesports website
    When I click on the login button from the header
    Then I am successfully redirected to login page
    When I have entered a valid "<tttttddomingo>" and "<Password1!>"
    Then I click on the login button
    Then I should be logged in successfully


