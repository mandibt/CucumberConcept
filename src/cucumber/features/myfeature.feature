Feature: Proof of concept

  Scenario: First test
    Given I navigate to the zoo website
    When I click on the adoption link
    Then I check to see that no animals are available
