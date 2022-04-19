package org.testng;

import org.base.BaseClass;
import org.pages.FbLoginPage;
import org.pages.HomePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 extends BaseClass {
	
	@Test(priority = 1)
	private void test1() {
		FbLoginPage lp = new FbLoginPage();
		sendkeys(lp.getEmailBox(), "Sarath");
		sendkeys(lp.getPasswordBox(), "12345");
		click(lp.getLoginBtn());
	}
	@BeforeMethod
	private void beforeMethod() {
		System.out.println("beforeMethod");
		launchBrowser();
		getUrl("https://www.facebook.com/");
		
	}
	@AfterMethod
	private void afterMethod() throws InterruptedException {
		Thread.sleep(2000);
		close();
	}
	
	@Test(priority = 3)
	private void test2() {
		FbLoginPage lp = new FbLoginPage();
//		sendkeys(lp.getEmailBox(), "");
//		sendkeys(lp.getPasswordBox(), "");
		click(lp.getLoginBtn());
	}
	
	@Test(priority = 2)
	private void test3() {
		FbLoginPage lp = new FbLoginPage();
	    sendkeys(lp.getEmailBox(), "qweq");
		sendkeys(lp.getPasswordBox(), "qwerr");
		click(lp.getLoginBtn());
	}
}
