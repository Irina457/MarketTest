#language: en

Feature: Check shop cart

  Background:
    Given I open shop page

  Scenario: Check empty cart
    When I click the cart button
    Then I check cart is empty