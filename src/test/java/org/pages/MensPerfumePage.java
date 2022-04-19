package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MensPerfumePage extends BaseClass {
	
	public MensPerfumePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='product-item product-item--vertical  1/3--tablet-and-up 1/4--desk']")
	private WebElement allProductsBox;

	public WebElement getAllProductsBox() {
		return allProductsBox;
	}

}
