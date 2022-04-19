package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobilePage extends BaseClass {
	
	public MobilePage(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="(//a[@class='product-item__title text--strong link'])[1]")
	private WebElement firstProduct;

	public WebElement getFirstProduct() {
		return firstProduct;
	}
	
	
	
	
}
