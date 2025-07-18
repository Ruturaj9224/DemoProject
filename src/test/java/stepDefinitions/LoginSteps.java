package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.LoginPage;
import utils.BaseClass;

import static org.junit.Assert.assertTrue;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();

    @Given("User is on SauceDemo login page")
    public void user_is_on_login_page() {
        BaseClass.driver.get("https://www.saucedemo.com/");
    }

    
    @When("User enters username {string}")
    public void user_enters_username(String username) {
    	 loginPage.enterUsername(username);
    }

    @When("password {string}")
    public void password(String password) {
    	loginPage.enterPassword(password);
    }

    @Then("User should be logged in successfully")
    public void user_should_be_logged_in_successfully() {
        assertTrue(BaseClass.driver.getCurrentUrl().contains("inventory"));
    }
    

    @Then("User should not be logged in successfully")
    public void user_should_not_be_logged_in_successfully() {
       assertTrue("Invalid Credentials", loginPage.isloginErrormessageDisplayed());
    }
    
    @When("User click on login")
    public void user_click_on_login() {
        loginPage.logins();
    }
    
    @Then("verify the title of the loginpage is as per the specification")
    public void verify_the_title_of_the_loginpage_is_as_per_the_specification() {
    	assertTrue(loginPage.verifytitleofloginpage());
    }
    
    @Then("verify the presence of logo")
    public void verify_the_presence_of_logo() {
        assertTrue(loginPage.verifylogo());
    }
    
    
    @Then("verify the accepted users are is displayed on page")
    public void verify_the_accepted_users_are_is_displayed_on_page() {
    	assertTrue(loginPage.verify_The_AUA_text());
    }

    
//  @When("User enters username {string} and password {string}")
//  public void user_enters_credentials(String username, String password) {
//      loginPage.login(username, password);
//  }
    
}