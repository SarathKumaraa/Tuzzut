package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WatchDetailsPage extends BaseClass{
	
	public WatchDetailsPage(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//h1[text()='MEGIR 2064 Business Quartz Watch Men Stainless Steel Chronograph Wrist Watch - Silver']")
	private WebElement watchProductName;

	public WebElement getWatchProductName() {
		return watchProductName;
	}
	
	@FindBy(xpath = "(//span[@class='money'])[2]")
	private WebElement watchPrice;

	public WebElement getWatchPrice() {
		return watchPrice;
	}

	
	@FindBy(xpath ="//button[text()='Buy it now']")
	private WebElement watchBuyBtn;

	public WebElement getWatchBuyBtn() {
		return watchBuyBtn;
	}
	
	
	@FindBy(xpath ="//a[text()='MEGIR 2064 Business Quartz Watch Men Stainless Steel Chronograph Wrist Watch - Silver']" )
	private WebElement watchSelectedProductName;

	public WebElement getWatchSelectedProductName() {
		return watchSelectedProductName;
	}


}
