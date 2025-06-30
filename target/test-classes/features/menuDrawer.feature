
Feature: Menu Drawer
  
  @TC0001
  Scenario: Verify presence of logout option
    Given User is on SauceDemo login page
    And User enters username "standard_user" 
    And password "secret_sauce"
    And User click on login
    When User should see the product listing page with title "Products"
    And User clicks on menudrawer icon 
    Then logout button should be displyed

