Feature: Adopt an animal


	@web
  Scenario: Check if animal is available and adopt
    Given I am on my zoo website
    When I navigate to "adoption_link"
    And Check for an available animal
    And Populate the form
    Then There should be a confirmation message