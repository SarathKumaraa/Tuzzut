package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLoginPage extends BaseClass {
	
	public  FbLoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	private WebElement emailBox;

	public WebElement getEmailBox() {
		return emailBox;
	}
	
	@FindBy(id = "pass")
	private WebElement passwordBox;

	public WebElement getPasswordBox() {
		return passwordBox;
	}
	@FindBy(xpath = "//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")
	private WebElement loginBtn;

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	

}




