#Author: Stefan
#About: Check page titles on different pages
Feature: Check the page title

  #Scenario: Check the page title for Adoption pages
  #Given I am on my zoo website
  #When I navigate to Adoption
  #Then I check page title is Adoption
  #And I close the browser
  #
  #Scenario: Check the page title for About pages
  #Given I am on my zoo website
  #When I navigate to About
  #Then I check page title is About
  #And I close the browser
  #
  #Scenario: Check the page title for Contact pages
  #Given I am on my zoo website
  #When I navigate to Contact
  #Then I check page title is Contact
  #And I close the browser
  Scenario Outline: Check the page title for Contact pages
    Given I am on my zoo website
    When I navigate to "<link>"
    Then I check page title is "<title>"
    And I close the browser

    Examples: 
      | link          | title                |
      | adoption_link | Adoption             |
      | about_link    | About Zoo            |
      | contact_link  | Contact              |
      | home_link     | Zoo Adoption \| Home |
