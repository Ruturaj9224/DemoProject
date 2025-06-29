package stepDefinitions;


import static org.junit.Assert.assertTrue;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.MenuDrawerPage;

public class MenuDrawerSteps {
	MenuDrawerPage menuDrawer = new MenuDrawerPage();
	
	@And("User clicks on menudrawer icon")
	public void user_clicks_on_menudrawer_icon() throws InterruptedException {
	    menuDrawer.clickOnMenu();
	    Thread.sleep(5000);
	}

	@Then("logout button should be displyed")
	public void logout_button_should_be_displyed() {
	    assertTrue(menuDrawer.verifylogoutispresent());
	}

}
