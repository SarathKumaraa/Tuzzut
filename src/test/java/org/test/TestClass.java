package org.test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.pages.HomePage;

public class TestClass extends BaseClass {

	public static void main(String[] args) throws IOException {

		TestClass t = new TestClass();
		t.launchBrowser();
		t.getUrl("https://www.facebook.com/");

		t.waitAll();

		WebElement userName = driver.findElement(By.id("email"));
		t.sendkeys(userName, "Sarath");

		WebElement passName = driver.findElement(By.id("pass"));
		t.sendkeys(passName, "12345");

		WebElement createNewAccBtn = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		t.click(createNewAccBtn);

		WebElement dayBtn = driver.findElement(By.xpath("//select[@id='day']"));
		t.selectByValue(dayBtn, "25");
		
		
		HomePage hp=new HomePage();
		hp.getSearchBox();

	}

}
