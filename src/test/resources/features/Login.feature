@Smoke
Feature: SauceDemo Login
 
  @TC001
  Scenario: Successful login with valid credentials
    Given User is on SauceDemo login page
    When User enters username "standard_user" 
    And password "secret_sauce"
    And User click on login
    Then User should be logged in successfully
   
   @TC002
   Scenario: UnSuccessful login with invalid credentials
    Given User is on SauceDemo login page
    When User enters username "sandauser" 
    And password "secrece"
    And User click on login
    Then User should not be logged in successfully
   
   @TC003
   Scenario: UnSuccessful login with invalid password credentials
    Given User is on SauceDemo login page
    When User enters username "standard_user" 
    And password "secre"
    And User click on login
    Then User should not be logged in successfully
    
    @TC004
   Scenario:  UnSuccessful login with invalid username credentials
    Given User is on SauceDemo login page
    When User enters username "user" 
    And password "secret_sauce"
    And User click on login
    Then User should not be logged in successfully
    
    @TC005
   Scenario:  UnSuccessful login with empty username credentials 
    Given User is on SauceDemo login page
    When password "secret_sauce"
    And User click on login 
    Then User should not be logged in successfully
    
    @TC006
   Scenario:  UnSuccessful login with empty password credentials 
    Given User is on SauceDemo login page
    When User enters username "standard_user"
    And User click on login 
    Then User should not be logged in successfully
   
   @TC007
   Scenario: UnSuccessful login with no credentials
    Given User is on SauceDemo login page
    When User click on login
    Then User should not be logged in successfully
    
    @TC008
   Scenario: Verify the title of loginpage
    Given  User is on SauceDemo login page
    Then   verify the title of the loginpage is as per the specification 
    
    @TC009
   Scenario: verify the Swag labs logo is displyed on login page
    Given User is on SauceDemo login page
    Then verify the presence of logo
    
    @TC010
    Scenario: verify the "Accepted users are:" text
    Given User is on SauceDemo login page
    Then verify the accepted users are is displayed on page