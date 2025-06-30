package stepDefinitions;

import io.cucumber.java.en.Then;
import pages.InventoryPage;
import static org.junit.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class InventorySteps {
	
    InventoryPage inventoryPage = new InventoryPage();

    @Then("User should see the product listing page with title {string}")
    public void user_should_see_inventory_page(String expectedTitle) {
        String actualTitle = inventoryPage.getPageTitle();
        assertEquals(expectedTitle, actualTitle);
    }
    
    @Then("verify the presence of productname is backpack")
    public void verify_the_presence_of_productname_is_backpack() {
    	assertTrue(inventoryPage.productnamepresent());
    }

    @Then("verify the product is clickable")
    public void verify_the_product_is_clickable() {
        inventoryPage.clickonproduct();
    }
    
    @Then("verify the presence of description of product backpack")
    public void verify_the_presence_of_description_of_product_backpack() {
    	assertTrue(inventoryPage.backpacks_description());
    }
    
    @Then("verify the presence of price of product backpack")
    public void verify_the_presence_of_price_of_product_backpack() {
    	assertTrue(inventoryPage.backpacks_price());
    }
    
    @Then("Add to cart button should be enabled")
    public void Add_to_cart_button_should_be_enabled() {
    	assertTrue(inventoryPage.Addtocartofbackpackisenabled());
    	
    }
    
    @Then("Add to cart button should be clickable")
    public void Add_to_cart_button_should_be_clickable() {
    	inventoryPage.clickon_addtocart_backpack();
    }
}