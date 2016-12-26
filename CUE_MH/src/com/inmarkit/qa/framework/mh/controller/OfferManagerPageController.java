package com.inmarkit.qa.framework.mh.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.inmarkit.qa.framework.mh.model.OfferManagerPageModel;

public class OfferManagerPageController extends MHControllerBase{

	OfferManagerPageModel offerManager = null;
	public OfferManagerPageController(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		offerManager = new OfferManagerPageModel(driver);
	}
	
	public String getPageTitle(){
		String page = offerManager.pageTitle().getText();
		return page;
	}
	
	public void selectTab(String tabname){
		offerManager.offerTabs(tabname).click();
		delayFor(2000);
	}
	
	public void selectAllOffer(){
		offerManager.selectAllLink().click();
		delayFor(2000);
	}
	
	public void clearAllOffer(){
		offerManager.clearAllLink().click();
		delayFor(2000);
	}
	
	public String getTotalOffersInfo(){
		String total = offerManager.totalOfferInfo().getText();
		return total;
	}
		
	public void selectOfferAndEdit(String offername){
		offerManager.editByOfferName(offername).click();
		delayFor(2000);
	}
	
	public void deleteOfferByOfferName(String offername){		
		String offer = getOffer(offername);
		if(offername.contains(offer)){
			//selectOfferByName(offer);
			offerManager.deleteByOfferName(offername).click();
			delayFor(2000);
			driver.switchTo().alert().accept();
			delayFor(3000);
		}
	}
	
	public void selectOfferByTheDaterange(String date){
		Select select = new Select(offerManager.selectOfferCombobox());
		select.selectByVisibleText(date);
		delayFor(2000);
	}
	
	public void filterOfferByKeyword(String keyword){
		offerManager.filterByEditbox().clear();
		offerManager.filterByEditbox().sendKeys(keyword);
		offerManager.filterByEditbox().sendKeys(Keys.RETURN);
		delayFor(2000);
	}
	

	public String getOfferEndDate(String offername){
		String endDate = offerManager.offerEnddate(offername).getText();
		return endDate;
	}
	
	public String getOfferDescription(String offername){
		String desc = offerManager.offerDescription(offername).getText();
		return desc;
	}
	
	public String getOfferRegion(String offername){
		String region = offerManager.offerRegion(offername).getText();
		return region;
	}
	
	public String getOfferShareableStatus(String offername){
		String status = offerManager.shareableStatus(offername).getText();
		return status;
	}
	
	public int getTotalOffer(){
		int offers = offerManager.offers().size();
		return offers;
	}
	
	public void deleteAllOffers(){
		offerManager.selectAllLink().click();
		delayFor(200);
		offerManager.deleteSelectedButton().click();
		delayFor(2000);
	}
	
	public void selectOfferByName(String offername){
		offerManager.checkboxByOfferName(offername).click();
		delayFor(1000);
	}
	
	public void deleteAnOffer(String offername){
		filterOfferByKeyword(offername);
		offerManager.deleteByOfferName(offername).click();
		offerManager.deleteSelectedButton().click();
		delayFor(2000);
		driver.switchTo().alert().accept();
		delayFor(2000);
	}
	
	public void verifyOfferExists(String offerName){
		String offer = "Offer not found";
		List<WebElement> offers = offerManager.offers();
    	for (WebElement offerElement : offers){
    		String strOffer = offerElement.getText();	
    		if(strOffer.contains(offerName)){
    			offer = strOffer;
    			break;
    		}
    	}
    	
    	Assert.assertEquals(offer, offerName);
    	delayFor(1000);
	}
	
	public String getOffer(String oname) {
		String offer = "Offer not found";
		List<WebElement> offers = offerManager.offers();
		for (WebElement offerElement : offers){
    		String offerText = offerElement.getText(); 
    		System.out.println("Offer Found: " + offerText);
    		if (offerText.contains(oname)){
    			offer = offerText;
    			break;
    		}
    	}
    	return offer;
    }
	
		
	public void deleteOffer(String oname){
		String offer = getOffer(oname);
		if(oname.contains(offer)){
			selectOfferByName(offer);
			
			//offerManager.deleteSelectedButton().click();
			delayFor(2000);
			driver.switchTo().alert().accept();
			delayFor(2000);
		}
	}
	
	public String getTodaysDate(){
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		//get current date time with Date()
		Date date = new Date();
		String today = dateFormat.format(date);
		return today;
	}
	
	public String getDateAddingDays(int days){
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Calendar calendar = Calendar.getInstance();
		calendar.add( Calendar.DATE, days );
		return dateFormat.format( calendar.getTime() );
	}
	

}
