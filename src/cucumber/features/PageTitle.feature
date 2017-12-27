#Author: Stefan
#About: Check page titles on different pages
Feature: Check the page title

  Scenario: Check the page title for Adoption pages
    Given I am on my zoo website
    When I navigate to "adoption_link"
    Then I check page title is "Adoption"
    And I close the browser

  Scenario: Check the page title for About pages
    Given I am on my zoo website
    When I navigate to "about_link"
    Then I check page title is "About Zoo"
    And I close the browser

  Scenario: Check the page title for Contact pages
    Given I am on my zoo website
    When I navigate to "contact_link"
    Then I check page title is "Contact"
    And I close the browser
