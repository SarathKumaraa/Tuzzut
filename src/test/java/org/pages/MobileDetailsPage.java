package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobileDetailsPage extends BaseClass {

	public MobileDetailsPage(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//h1[text()='5D Premium 9H Hardness Tempered Glass Screen Protector for iPhone Mobiles']")
	private WebElement productName;

	
	public WebElement getProductName() {
		return productName;
		
		}
	@FindBy(xpath = "(//label[@class='block-swatch__item'])[7]")
	private WebElement mobileName;


	public WebElement getMobileName() {
		return mobileName;
	}
	@FindBy(className = "product-form__selected-value")
	private WebElement selectedName;


	public WebElement getSelectedName() {
		return selectedName;
	}
	
	@FindBy(xpath = "(//span[@class='money'])[2]")
	private WebElement price;


	public WebElement getPrice() {
		return price;
	}
	
	@FindBy(xpath ="//button[text()='Buy it now']")
	private WebElement butBtn;


	public WebElement getButBtn() {
		return butBtn;
	}
}


