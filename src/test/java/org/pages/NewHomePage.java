package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewHomePage extends BaseClass {
	

		public NewHomePage() {
			PageFactory.initElements(driver, this);
		}
		@FindBy(xpath = "//input[@class='search-bar__input']")
		private WebElement searchBox;
		
		public WebElement getSearchBox() {
			return searchBox;
		}

		@FindBy(xpath = "//button[@class='search-bar__submit']")
		private WebElement submitBtn;
		
		public WebElement getSubmitBtn() {
			return submitBtn;
		}
		
		@FindBy(xpath ="//a[text()='MEGIR 2064 Business Quartz Watch Men Stainless Steel Chronograph Wrist Watch - Silver']" )
		private WebElement watchSelectedProductName;

		public WebElement getWatchSelectedProductName() {
			return watchSelectedProductName;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
}
