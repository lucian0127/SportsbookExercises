Feature: Validates all the social media links in Home Page

  As a visitor I want to validate the Facebook page of Boylesports
  As a visitor I want to validate the Twitter page of Boylesports
  As a visitor I want to validate the Youtube page of Boylesports

Background:
  Given I am currently navigated to the Boylesports home page

#  Facebook validation
Scenario: Successfully validated the Facebook page
  Given I have validated the Facebook icon at the header
  When  I click on the Facebook icon
  Then  I redirected to Boylesports facebook page

#  Twitter validation
Scenario: Successfully validated the Boylesports Twitter
  Given I have validated the Twitter icon at the header
  When  I click on the Twitter icon
  Then  I redirected to Boylesports twitter

#  Youtube validation
Scenario: Successfully validated the Youtube channel
  Given I have validated the Youtube icon at the header
  When  I click on the Youtube icon
  Then  I redirected to Boylesports Youtube channel

