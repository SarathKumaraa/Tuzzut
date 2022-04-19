package org.test;

import org.base.BaseClass;
import org.pages.ContactDetailsPage;
import org.pages.HomePage;
import org.pages.MobileDetailsPage;
import org.pages.MobilePage;

public class Testpom extends BaseClass {

	public static void main(String[] args) {

		launchBrowser();
		getUrl("https://tuzzut.com/");

		waitAll();

		HomePage hp = new HomePage();
		sendkeys(hp.getSearchBox(), "mobiles");
		click(hp.getSubmitBtn());

		MobilePage mp = new MobilePage();
		click(mp.getFirstProduct());

		MobileDetailsPage mdp = new MobileDetailsPage();
		System.out.println(mdp.getProductName().getText());
		click(mdp.getMobileName());

		System.out.println(mdp.getMobileName().getText());
		System.out.println(mdp.getSelectedName().getText());

		String mobName = mdp.getMobileName().getText();
		String SelectedMobName = mdp.getSelectedName().getText();

		String price1 = mdp.getPrice().getText();
		
		System.out.println(price1);
		
		mdp.getButBtn().click();
		
		ContactDetailsPage cdp = new ContactDetailsPage();
		sendkeys(cdp.getEmailInfo(), "Sarath@test.com");
		sendkeys(cdp.getNameInfo(), "sa");
		sendkeys(cdp.getLastNameInfo(), "kumar");
		sendkeys(cdp.getAddressInfo(), "chennai");
		sendkeys(cdp.getCityInfo(), "chemmai");
		sendkeys(cdp.getPhoneInfo(), "123456");
		click(cdp.getContinueBtn());
		
		
		String[] split = price1.split(" ");
		System.out.println(split[1]);

		float parseFloat = Float.parseFloat(split[1]);
		double parseDouble = Double.parseDouble(split[1]);
		System.out.println(parseDouble);

		if (parseDouble < 20.00) {
			System.out.println(parseDouble);

		} else {
			backward();
		}

	
	
	}
}
