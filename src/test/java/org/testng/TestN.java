package org.testng;

import org.base.BaseClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestN extends BaseClass {

	@BeforeMethod
	private void beforeMethod() {
		System.out.println("beforeMethod");
		launchBrowser();
		
	}

	@AfterMethod
	private void afterMethod() {
		System.out.println("afterMethod");
		close();
		
	}

	@Test()
	private void test1() {
		System.out.println("test");
		getUrl("https://www.facebook.com/");
		
	}
	
	@Test(priority=-1)
	private void test2() {
		System.out.println("test");
		getUrl("https://tuzzut.com/");
		
	}

}
