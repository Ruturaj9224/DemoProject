@Smoke
Feature: SauceDemo Login

  Scenario: Successful login with valid credentials
    Given User is on SauceDemo login page
    When User enters username "standard_user" and password "secret_sauce"
    Then User should be logged in successfully
