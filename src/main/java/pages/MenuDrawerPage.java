package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.BaseClass;

public class MenuDrawerPage {
	 public MenuDrawerPage() {
	        PageFactory.initElements(BaseClass.driver, this);
	    }
	
	@FindBy(id = "react-burger-menu-btn")
    WebElement menu;
	
	@FindBy(id = "logout_sidebar_link")
    WebElement logoutbutton;
    
    public void clickOnMenu() {
    	menu.click();
    }
    
    public boolean verifylogoutispresent() {
        return logoutbutton.isDisplayed();	
    }
	
}
