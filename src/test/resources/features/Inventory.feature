
Feature: Inventory Page Verification
  
  @TC011
  Scenario: Verify user is on inventory page after login
    Given User is on SauceDemo login page
    When User enters username "standard_user" 
    And password "secret_sauce"
    And User click on login    
    Then User should see the product listing page with title "Products"

   @TC012
   Scenario: Verify the product name "backpack" is present and it it clickable
    Given User is on SauceDemo login page
    When User enters username "standard_user" 
    And password "secret_sauce"
    And User click on login   
    Then verify the presence of productname is backpack
    And verify the product is clickable 
    
   @TC013
   Scenario: Verify the description of product "backpack"  
    Given User is on SauceDemo login page
    When User enters username "standard_user" 
    And password "secret_sauce"
    And User click on login   
    Then verify the presence of description of product backpack
    
   @TC015
   Scenario: Verify the description of product "backpack"  
    Given User is on SauceDemo login page
    When User enters username "standard_user" 
    And password "secret_sauce"
    And User click on login   
    Then verify the presence of price of product backpack
    
   @TC016
   Scenario: Verify the description of product "backpack"  
    Given User is on SauceDemo login page
    When User enters username "standard_user" 
    And password "secret_sauce"
    And User click on login 
    Then Add to cart button should be enabled 
    And Add to cart button should be clickable 
    
   