package com.inmarkit.qa.framework.mh1;




import org.junit.Test;

import junit.framework.Assert;



public class CreateOfferTesting extends MHScriptBase{
	
	@Test
	public void testxxxx_CreateValidOfferForAll(){
		
		mhLoginPage().login("miclue@cueconnect.com", "yecru3r");
		mhHomePage().clickHeaderTab("Offer Management");
		offerManagerPage().filterOfferByKeyword("Valid For All");
		offerManagerPage().deleteOfferByOfferName("Valid For All");
				
		offerManagerPage().selectTab("Create");
		String today = offerManagerPage().getTodaysDate();
		createOfferStep1Page().enterOfferDescriptionInfo("Valid For All", "This Offer is Valid For All", "Valid Offer", true, true,
				null, "youandme", null, null, true, "http://www.tysencorner.com", today , "2015-09-07");
		
		createOfferStep2Page().selectAllStoresAndNext();
		createOfferStep3Page().selectAllAllPagesAndNext();
		createOfferStep4Page().clickNextStepButton();
		createOfferStep5Page().enterStep5Information("Both", null, null, "National");
		createOfferStep6Page().clickConfirmAndSubmit();
		
		mhHomePage().clickHeaderTab("Profile");
		mhHomePage().clickHeaderTab("Offer Manager");
		String offername = offerManagerPage().getOffer("Valid For All");
		Assert.assertEquals("Valid For All", offername);
		
		
		driver.close();
		delayFor(5000);
		
		
				
		driver.close();

	}
	
	@Test
	public void test747_CreateShareableOffer(){
		
		mhLoginPage().login("nislam@inmarkit.com", "nislam");
		mhHomePage().clickHeaderTab("Offer Manager");
		offerManagerPage().deleteOfferByOfferName("Shareable Offer");
				
		offerManagerPage().selectTab("Create");
		String today = offerManagerPage().getTodaysDate();
		createOfferStep1Page().enterOfferDescriptionInfo("Shareable Offer", "This is My Offer", "Naz Offer", true, true,
				null, "youandme", null, null, true, "http://www.tysencorner.com", today , "2013-09-07");
		
		createOfferStep2Page().selectStoreAndClickNext("10003");
		createOfferStep3Page().selectAllItemAndClickNext();
		createOfferStep4Page().clickNextStepButton();
		createOfferStep5Page().enterStep5Information("Male", "18", "45", "New York");
		createOfferStep6Page().clickConfirmAndSubmit();
		
		mhHomePage().clickHeaderTab("Profile");
		mhHomePage().clickHeaderTab("Offer Manager");
		String offername = offerManagerPage().getOffer("Shareable Offer");
		Assert.assertEquals("Shareable Offer", offername);
		
		String shareable = offerManagerPage().getOfferShareableStatus("Shareable Offer");
		Assert.assertEquals("Yes", shareable.trim());
		offerManagerPage().deleteOfferByOfferName("Shareable Offer");
		
		driver.close();
		
	}
	
	@Test
	public void test672_CreateNonShareableOffer(){
		
		mhLoginPage().login("nislam@inmarkit.com", "nislam");
		mhHomePage().clickHeaderTab("Offer Manager");
		offerManagerPage().deleteOfferByOfferName("Non Shareable Offer");
		
		offerManagerPage().selectTab("Create");
		String today = offerManagerPage().getTodaysDate();
		createOfferStep1Page().enterOfferDescriptionInfo("Non Shareable Offer", "This is My Offer", "Naz Offer", false, true,
				null, "youandme", null, null, true, "http://www.tysencorner.com", today , "2013-09-07");
		
		createOfferStep2Page().selectStoreAndClickNext("10003");
		createOfferStep3Page().selectAllItemAndClickNext();
		createOfferStep4Page().clickNextStepButton();
		createOfferStep5Page().enterStep5Information("Male", "18", "90", "New York");
		createOfferStep6Page().clickConfirmAndSubmit();
		
		mhHomePage().clickHeaderTab("Profile");
		mhHomePage().clickHeaderTab("Offer Manager");
		String offername = offerManagerPage().getOffer("Non Shareable Offer");
		Assert.assertEquals("Non Shareable Offer", offername);
		
		String shareable = offerManagerPage().getOfferShareableStatus("Non Shareable Offer");
		Assert.assertEquals("No", shareable.trim());
		offerManagerPage().deleteOfferByOfferName("Non Shareable Offer");
		
		driver.close();
		
	}
	
	@Test
	public void test1276_DeleteAnOffer(){
		
		mhLoginPage().login("nislam@inmarkit.com", "nislam");
		mhHomePage().clickHeaderTab("Offer Manager");
		offerManagerPage().deleteOfferByOfferName("Naz Offer");
						
		offerManagerPage().selectTab("Create");
		String today = offerManagerPage().getTodaysDate();
		createOfferStep1Page().enterOfferDescriptionInfo("Naz Offer", "This is My Offer", "Naz Offer", false, true,
				null, "youandme", null, null, true, "http://www.tysencorner.com", today , "2013-09-07");
		
		createOfferStep2Page().selectStoreAndClickNext("10003");
		createOfferStep3Page().selectAllItemAndClickNext();
		createOfferStep4Page().clickNextStepButton();
		createOfferStep5Page().enterStep5Information("Male", "18", "45", "New York");
		createOfferStep6Page().clickConfirmAndSubmit();
		
		mhHomePage().clickHeaderTab("Profile");
		mhHomePage().clickHeaderTab("Offer Manager");
		String offername = offerManagerPage().getOffer("Naz Offer");
		Assert.assertEquals("Naz Offer", offername);
		
		int totalbeforeDelete = offerManagerPage().getTotalOffer();
		offerManagerPage().deleteOfferByOfferName("Naz Offer");
		
		mhHomePage().clickHeaderTab("Profile");
		mhHomePage().clickHeaderTab("Offer Manager");
		int totalAfterDelete = offerManagerPage().getTotalOffer();
		
		Assert.assertEquals(totalbeforeDelete - 1, totalAfterDelete);
		
		driver.close();
		
	}
	
	@Test
	public void testxxxx_DeleteOfferByButton(){
		
		mhLoginPage().login("nislam@inmarkit.com", "nislam");
		mhHomePage().clickHeaderTab("Offer Manager");
		offerManagerPage().deleteOfferByOfferName("My Test Offer");
						
		offerManagerPage().selectTab("Create");
		String today = offerManagerPage().getTodaysDate();
		createOfferStep1Page().enterOfferDescriptionInfo("My Test Offer", "This is My Offer", "Naz Offer", true, true,
				null, "youandme", null, null, true, "http://www.tysencorner.com", today , "2013-09-07");
		
		createOfferStep2Page().selectStoreAndClickNext("10003");
		createOfferStep3Page().selectAllItemAndClickNext();
		createOfferStep4Page().clickNextStepButton();
		createOfferStep5Page().enterStep5Information("Both", "18", "45", "New York");
		createOfferStep6Page().clickConfirmAndSubmit();
		
		mhHomePage().clickHeaderTab("Profile");
		mhHomePage().clickHeaderTab("Offer Manager");
		String offername = offerManagerPage().getOffer("My Test Offer");
		Assert.assertEquals("My Test Offer", offername);
		
		int totalbeforeDelete = offerManagerPage().getTotalOffer();
		offerManagerPage().deleteOffer("My Test Offer");
		
		mhHomePage().clickHeaderTab("Profile");
		mhHomePage().clickHeaderTab("Offer Manager");
		int totalAfterDelete = offerManagerPage().getTotalOffer();
		Assert.assertEquals(totalbeforeDelete - 1, totalAfterDelete);
		
		driver.close();
		
	}
	
	@Test
	public void testxxx_CreateOfferAgeUpto21(){
		
		mhLoginPage().login("tysencorner@inmarkit.com", "yecru3r");
		mhHomePage().clickHeaderTab("Offer Manager");
		offerManagerPage().filterOfferByKeyword("Offer21");
		offerManagerPage().deleteOfferByOfferName("Offer21");
				
		offerManagerPage().selectTab("Create");
		String today = offerManagerPage().getTodaysDate();
		createOfferStep1Page().enterOfferDescriptionInfo("Offer21", "This offer for age upto 21", "Naz Offer", true, true,
				null, "offer21", null, null, true, "http://www.tysencorner.com", today , "2013-09-07");
		
		createOfferStep2Page().selectStoreAndClickNext("07524");
		createOfferStep3Page().selectAllAllPagesAndNext();
		createOfferStep4Page().clickNextStepButton();
		createOfferStep5Page().enterStep5Information("Both", "18", "21", "New Jersey");
		createOfferStep6Page().clickConfirmAndSubmit();
		
		mhHomePage().clickHeaderTab("Profile");
		mhHomePage().clickHeaderTab("Offer Manager");
		offerManagerPage().filterOfferByKeyword("Offer21");
		String newoffer = offerManagerPage().getOffer("Offer21");
		Assert.assertEquals("Offer21", newoffer);
		
		
		driver.close();
		
	}
	
	@Test
	public void testxxx_CreateOfferForMaleOnly(){
		
		mhLoginPage().login("tysencorner@inmarkit.com", "yecru3r");
		mhHomePage().clickHeaderTab("Offer Manager");
		offerManagerPage().deleteOfferByOfferName("For Men Only");
				
		offerManagerPage().selectTab("Create");
		String today = offerManagerPage().getTodaysDate();
		createOfferStep1Page().enterOfferDescriptionInfo("For Men Only", "This offer for Men Onle", "MensOffer", true, true,
				null, "MensOffer", null, null, true, "http://www.tysencorner.com", today , "2013-09-07");
		
		createOfferStep2Page().selectStoreAndClickNext("07524");
		createOfferStep3Page().selectAllItemAndClickNext();
		createOfferStep4Page().clickNextStepButton();
		createOfferStep5Page().enterStep5Information("Male", "18", "55", "New Jersey");
		createOfferStep6Page().clickConfirmAndSubmit();
		
		mhHomePage().clickHeaderTab("Profile");
		mhHomePage().clickHeaderTab("Offer Manager");
		offerManagerPage().filterOfferByKeyword("For Men");
		String newoffer = offerManagerPage().getOffer("Men Only");
		Assert.assertEquals("For Men Only", newoffer);
		
		driver.close();
		delayFor(5000);
		
		
				
		driver.close();
		
	}
	
	@Test
	public void testxxx_CreateOfferRegionTest(){
		
		mhLoginPage().login("tysencorner@inmarkit.com", "yecru3r");
		mhHomePage().clickHeaderTab("Offer Manager");
		offerManagerPage().filterOfferByKeyword("NY Residents Offer");
		offerManagerPage().deleteOfferByOfferName("NY Residents Offer");
				
		offerManagerPage().selectTab("Create");
		String today = offerManagerPage().getTodaysDate();
		createOfferStep1Page().enterOfferDescriptionInfo("NY Residents Offer", "Offer For NY Residents only", "nyoffer",
				    true, true, null, "nyoffer", null, null, true, "http://www.tysencorner.com", today , "2013-09-07");
		
		createOfferStep2Page().selectStoreAndClickNext("10003");
		createOfferStep3Page().selectAllItemAndClickNext();
		createOfferStep4Page().clickNextStepButton();
		createOfferStep5Page().enterStep5Information("Male", "18", "55", "New York");
		createOfferStep6Page().clickConfirmAndSubmit();
		
		mhHomePage().clickHeaderTab("Profile");
		mhHomePage().clickHeaderTab("Offer Manager");
		offerManagerPage().filterOfferByKeyword("NY Residents Offer");
		String newoffer = offerManagerPage().getOffer("NY Residents Offer");
		Assert.assertEquals("NY Residents Offer", newoffer);
		
		driver.close();
		
		
	}
	

}
