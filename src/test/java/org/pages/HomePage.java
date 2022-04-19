package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass {

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@class='search-bar__input']")
	private WebElement searchBox;

	@FindBy(xpath = "//button[@class='search-bar__submit']")
	private WebElement submitBtn;

	@FindBy(xpath = "(//a[@class='nav-bar__link link'])[2]")
	private WebElement elecrtonicBtn;

	@FindBy(xpath = "/html/body/div[4]/section/nav/div/div/ul/li[2]/ul/li[3]/a")
	private WebElement homeApplianceBtn;

	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	public WebElement getElecrtonicBtn() {
		return elecrtonicBtn;
	}

	public WebElement getHomeApplianceBtn() {
		return homeApplianceBtn;
	}

	@FindBy(xpath = "(//a[@class='nav-bar__link link'])[4]")
	private WebElement menBox;

	public WebElement getMenBox() {
		return menBox;

	}
	
	@FindBy(xpath = "//a[text()='Men's Perfumes']")
	private WebElement menPerfumeBox;

	public WebElement getMenPerfumeBox() {
		return menPerfumeBox;
	}
	
}
