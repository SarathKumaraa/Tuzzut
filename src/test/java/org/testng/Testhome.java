package org.testng;

import org.base.BaseClass;
import org.pages.ContactDetailsPage;
import org.pages.NewHomePage;
import org.pages.WatchContactDetailsPage;
import org.pages.WatchDetailsPage;
import org.pages.WatchPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testhome extends BaseClass {

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
		sendkeys(nhp.getSearchBox(), "watches");
		click(nhp.getSubmitBtn());
		WatchPage wp = new WatchPage();
		click(wp.getWatchFourthProduct());
		
		

		
		WatchDetailsPage wdp = new WatchDetailsPage();
		System.out.println(wdp.getWatchProductName().getText());
		click(wdp.getWatchProductName());
				
		
		String price = wdp.getWatchPrice().getText();
		System.out.println(price);

		click(wdp.getWatchBuyBtn());
		
		WatchContactDetailsPage wcdp =new WatchContactDetailsPage();
		sendkeys(wcdp.getWatchEmailInfo(), "sarath1234@test.com");
		sendkeys(wcdp.getWatchNameInfo(), "sa");
		sendkeys(wcdp.getWatchLastNameInfo(), "kumar");
		sendkeys(wcdp.getWatchAddressInfo(), "chennai");
		sendkeys(wcdp.getWatchCityInfo(), "chemmai");
		sendkeys(wcdp.getWatchPhoneInfo(), "123456");
		click(wcdp.getWatchContinueBtn());
		
		

		
	}

	@AfterMethod
	private void afterMethod() {
		System.out.println("afterMethod");
		close();
	}

}
