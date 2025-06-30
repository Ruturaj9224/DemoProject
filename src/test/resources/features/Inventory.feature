@Regression
Feature: Inventory Page Verification

  Scenario: Verify user is on inventory page after login
    Given User is on SauceDemo login page
    When User enters username "standard_user" 
    And password "secret_sauce"
    And User click on login    
    Then User should see the product listing page with title "Products"
