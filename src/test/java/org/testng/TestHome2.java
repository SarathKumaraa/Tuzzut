package org.testng;

import org.base.BaseClass;
import org.pages.NewHomePage;
import org.pages.WatchDetailsPage;
import org.pages.WatchPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHome2 extends BaseClass {

	@BeforeMethod
	private void beforeMethod() {
		System.out.println("beforeMethod");
		launchBrowser();

	}

	@Test()
	private void test() {
		getUrl("https://tuzzut.com/");
		waitAll();
		
		//test wait

		NewHomePage nhp = new NewHomePage();
		sendkeys(nhp.getSearchBox(), "watches");
		click(nhp.getSubmitBtn());
		WatchPage wp = new WatchPage();
		click(wp.getWatchFourthProduct());
		
		
		//TestData
		

		WatchDetailsPage wdp = new WatchDetailsPage();
		System.out.println(wdp.getWatchProductName().getText());
		click(wdp.getWatchProductName());

		String price = wdp.getWatchPrice().getText();
		System.out.println(price);
		
		String[] split = price.split(" ");
		System.out.println(split[1]);

		double parseDouble = Double.parseDouble(split[1]);
		System.out.println(parseDouble);

		if (parseDouble < 20.00) {
			System.out.println(parseDouble);

		} else {
			backward();
		}
		
		//Kumar changes
	}
	
	
	
	
	
	
}











