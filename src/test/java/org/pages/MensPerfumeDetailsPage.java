package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MensPerfumeDetailsPage extends BaseClass {
	
	public MensPerfumeDetailsPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h1[@class='product-meta__title heading h1']")
	private WebElement productsName;

	public WebElement getProductsName() {
		return productsName;
	}

}
