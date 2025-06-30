package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BaseClass;

public class InventoryPage {
    public InventoryPage() {
        PageFactory.initElements(BaseClass.driver, this);
    }
    
    @FindBy(xpath = "//div[text()='Sauce Labs Backpack']")
    WebElement backpackproduct;
    
    @FindBy(xpath = " //*[contains(text(), 'carry.allTheThings()')]")
    WebElement backpacksdescription;
    
    @FindBy(xpath = "//div[text()='29.99']")
    WebElement backpackproductprice;
    
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement addtocartofbackpack;
    
    @FindBy(className = "title")
    WebElement title;

    public String getPageTitle() {
        return title.getText();
    }

    public boolean productnamepresent() {
		return backpackproduct.isDisplayed();
	}
    
	public void clickonproduct() {
		backpackproduct.click();
	}

	public boolean backpacks_description() {
		return backpacksdescription.isDisplayed();
	}

	public boolean backpacks_price() {
		return backpackproductprice.isDisplayed();
	}

	public boolean Addtocartofbackpackisenabled() {
		return addtocartofbackpack.isEnabled();
	}

	public void clickon_addtocart_backpack() {
		addtocartofbackpack.click();
	}

	
    
    
}