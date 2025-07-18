package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BaseClass;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(BaseClass.driver, this);
    }

    @FindBy(id = "user-name")
    WebElement usernameField;

    @FindBy(id = "password")
    WebElement passwordField;

    @FindBy(id = "login-button")
    WebElement loginButton;
    
    @FindBy(xpath = "//h3[@data-test='error']")
    WebElement errormessage;
    
    @FindBy(css = "div[class='login_logo']")
    WebElement logo;
    
    @FindBy(xpath = "//h4[text()='Accepted usernames are:']")
    WebElement accepted_user;
  
    public void enterUsername(String username) {
        usernameField.sendKeys(username);
    }
    
    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }
    
    public void logins() {
        loginButton.click();
    }

	public boolean isloginErrormessageDisplayed() {
		return errormessage.isDisplayed();
	}

	public boolean verifytitleofloginpage() {
		String expected = "Swag Labs";
		String actual =BaseClass.driver.getTitle();
		return expected.equals(actual);
	}

	public boolean verifylogo() {
		return logo.isDisplayed();
	}

	public boolean verify_The_AUA_text() {
		return accepted_user.isDisplayed();
	}
	
//  public void login(String username, String password) {
//  usernameField.sendKeys(username);
//  passwordField.sendKeys(password);
//  loginButton.click();
//}
//
	
}