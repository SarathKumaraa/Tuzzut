package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WatchContactDetailsPage extends BaseClass{
	
	public WatchContactDetailsPage(){
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//input[@placeholder='Email or mobile phone number']")
	private WebElement watchEmailInfo;
	
	public WebElement getWatchEmailInfo() {
		return watchEmailInfo;
	}
	
	@FindBy(xpath ="//input[@placeholder='First name (optional)']")
	private WebElement watchNameInfo;

	public WebElement getWatchNameInfo() {
		return watchNameInfo;
	}

	
	@FindBy(xpath ="//input[@placeholder='Last name']")
	private WebElement watchLastNameInfo;

	public WebElement getWatchLastNameInfo() {
		return watchLastNameInfo;
	}
	
	@FindBy(xpath ="//input[@placeholder='Address']")
	private WebElement watchAddressInfo;

	public WebElement getWatchAddressInfo() {
		return watchAddressInfo;
	}
	
	@FindBy(xpath ="//input[@placeholder='City']")
	private WebElement watchCityInfo;

	public WebElement getWatchCityInfo() {
		return watchCityInfo;
	}
	
	@FindBy(xpath ="//input[@placeholder='Mobile Phone Number: - mark the above checkbox to get SMS updates.']")
	private WebElement watchPhoneInfo;

	public WebElement getWatchPhoneInfo() {
		return watchPhoneInfo;
	}
	
	
	@FindBy(id ="continue_button")
	private WebElement watchContinueBtn;

	public WebElement getWatchContinueBtn() {
		return watchContinueBtn;
	}
	
	
	
	
	
	
	
	
}
