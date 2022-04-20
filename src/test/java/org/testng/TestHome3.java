package org.testng;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.pages.NewHomePage;
import org.pages.WatchDetailsPage;
import org.pages.WatchPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestHome3 extends BaseClass {


	@BeforeMethod
	private void beforeMethod() {
		System.out.println("beforeMethod");
		launchBrowser();

	}

	@Test()
	private void test() {
		getUrl("https://tuzzut.com/");
		
		waitAll();

		NewHomePage nhp = new NewHomePage();
		String e = "watches";
		
		sendkeys(nhp.getSearchBox(), e);
		click(nhp.getSubmitBtn());
		
		WatchPage wp = new WatchPage();
		String c= wp.getProductsForWatches().getText();
		System.out.println(c);
		
		String a = wp.getWatchFourthProduct().getText();
		System.out.println(a);
		click(wp.getWatchFourthProduct());
		
		
		
		WatchDetailsPage wdp = new WatchDetailsPage();
		System.out.println(wdp.getWatchProductName().getText());
		
		//SarathKumar
		//New changes
		
		
		String b = wdp.getWatchProductName().getText();
		
		
		SoftAssert s=new SoftAssert();
		
		s.assertTrue(c.contains(a), "Test1");
		
	//	Assert.assertTrue(c.contains(e), "Test");
		
//		if(c.contains(e)) {
//			System.out.println("True");
//			
//		}else {
//			System.out.println("False");
//		}

		s.assertEquals(a, e, "Test2");
		s.assertAll();
	//	Assert.assertEquals(a, e);
//		if(a.equals(b)) {
//			
//			System.out.println("true");
//		}
//			
//			else {
//				System.out.println("false");
//
//			}
	}
}

	
	

		
		
		
		
		
		
		
		
		
