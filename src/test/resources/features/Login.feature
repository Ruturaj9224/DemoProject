@Smoke
Feature: SauceDemo Login
 
  @TC001
  Scenario: Successful login with valid credentials
    Given User is on SauceDemo login page
    When User enters username "standard_user" and password "secret_sauce"
    Then User should be logged in successfully
   
   @TC002
   Scenario: UnSuccessful login with invalid credentials
    Given User is on SauceDemo login page
    When User enters username "locked_out_user" and password "secret_sauce"
    Then User should not be logged in successfully
   
   @TC003
   Scenario: UnSuccessful login with invalid password credentials
    Given User is on SauceDemo login page
    When User enters username "standard_user" and password "secretsauce"
    Then User should not be logged in successfully
   
   @TC004
   Scenario: UnSuccessful login with no credentials
    Given User is on SauceDemo login page
    When User click on login
    Then User should not be logged in successfully
    
    @TC005
    Scenario: Verify the title of loginpage
    Given  User is on SauceDemo login page
    Then   verify the title of the loginpage is as per the specification 