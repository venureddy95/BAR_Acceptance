@facebook
Feature: facebook test

Scenario: facebook login
    Given I am on facebook login page
    And I enter username "shravan.scorpio@gmail.com"
    And I enter password "04D61a044"
    When I click on submit button
    Then I logged in
