package org.testng;

import org.base.BaseClass;
import org.pages.HomePage;
import org.pages.MensPerfumeDetailsPage;
import org.pages.MensPerfumePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestPerfume extends BaseClass {

	@BeforeMethod
	private void beforeMethod() {
		System.out.println("beforeMethod");
		launchBrowser();

	}

	@Test()
	private void test() {
		getUrl("https://tuzzut.com/");
		waitAll();
		
		
		HomePage  hp= new HomePage();
		moveToElement(hp.getMenBox());
		moveToElement(hp.getMenPerfumeBox());
		click(hp.getMenPerfumeBox());
		
		MensPerfumePage mpp = new MensPerfumePage();
		click(mpp.getAllProductsBox());
		
		
	}
			
	}
