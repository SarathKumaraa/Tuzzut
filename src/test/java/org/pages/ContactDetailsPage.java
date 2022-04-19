package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactDetailsPage  extends BaseClass {
	
	public ContactDetailsPage(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//input[@placeholder='Email or mobile phone number']")
	private WebElement emailInfo;

	public WebElement getEmailInfo() {
		return emailInfo;
	}
	@FindBy(xpath ="//input[@placeholder='First name (optional)']")
	private WebElement nameInfo;

	public WebElement getNameInfo() {
		return nameInfo;
	}
	@FindBy(xpath ="//input[@placeholder='Last name']")
	private WebElement lastNameInfo;

	public WebElement getLastNameInfo() {
		return lastNameInfo;
	}

	@FindBy(xpath ="//input[@placeholder='Address']")
	private WebElement addressInfo;

	public WebElement getAddressInfo() {
		return addressInfo;
	}
	
	@FindBy(xpath ="//input[@placeholder='City']")
	private WebElement cityInfo;

	public WebElement getCityInfo() {
		return cityInfo;
	}
	@FindBy(xpath ="//input[@placeholder='Mobile Phone Number: - mark the above checkbox to get SMS updates.']")
	private WebElement phoneInfo;

	public WebElement getPhoneInfo() {
		return phoneInfo;
		
		
	}
	
	@FindBy(id ="continue_button")
	private WebElement continueBtn;

	public WebElement getContinueBtn() {
		return continueBtn;
	}
	
	
	
	
	
	

	
}
