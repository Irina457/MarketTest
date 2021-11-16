#language: en

Feature: check shop cart

  Background:
    Given I open shop page

  Scenario: check empty cart
    When I click the cart button
    Then I check, cart is empty