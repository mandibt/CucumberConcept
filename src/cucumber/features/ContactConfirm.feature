#Author: Stefan
#Contents: First WebDriver Automated Scenario
Feature: To test Contact Form on ZOO Adoption page

  Scenario: Check form is validated where there are no errors
    Given I am on my zoo website
    When I click on the contact link
    And populate the contact form
    Then I should be on the contact confirmation page
