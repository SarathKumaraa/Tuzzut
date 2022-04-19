package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WatchPage extends BaseClass{
	
	public WatchPage(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//a[text()='MEGIR 2064 Business Quartz Watch Men Stainless Steel Chronograph Wrist Watch - Silver']")
	private WebElement watchFourthProduct;

	
	
	public WebElement getWatchFourthProduct() {
		return watchFourthProduct;
	}

	@FindBy(xpath ="//h1[contains(text(),'Products')]")
	private WebElement productsForWatches;

	
	public WebElement getProductsForWatches() {
		return productsForWatches;
	}
	

}
