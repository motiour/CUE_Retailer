package com.inmarkit.qa.framework.mh.controller;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.inmarkit.qa.framework.mh.model.LoadExistingRegionPageModel;

public class LoadExistingRegionPageController extends MHControllerBase{

	LoadExistingRegionPageModel existingRegion = null;
	public LoadExistingRegionPageController(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		existingRegion = new LoadExistingRegionPageModel(driver);
	}
	
	public String getPageTitle(){
		String page = existingRegion.pageTitle().getText();
		return page;
	}
	
	public void selectRegion(String region){
		Select select = new Select(existingRegion.selectRegionbox());
		select.selectByVisibleText(region); 
		delayFor(2000);
	}
	
	public void selectStates(String state){
		Select select = new Select(existingRegion.stateSelectionBox());
		select.selectByVisibleText(state); 
		delayFor(2000);
	}
	
	public void selectFromRegionDetails(String state){
		Select select = new Select(existingRegion.regionDetailsBox());
		select.selectByVisibleText(state); 
		delayFor(2000);
	}
	
	public void addMoreStatesToRegion(String region, String... states){
		
		selectRegion(region);
		
		ArrayList<WebElement> elements = new ArrayList<WebElement>();
		for(String state : states){
			elements.add(driver.findElement(By.xpath("//select[@id='states']/option[text()='" + state + "']")));
		}
	
		existingRegion.stateSelectionBox().sendKeys(Keys.CONTROL);
		for(WebElement e : elements){
			e.click();
		}
		existingRegion.addRegionButton().click();
		delayFor(1000);
	}
	
	public void removeStatesFromList(String region, String... states){
		
		selectRegion(region);
		
		ArrayList<WebElement> elements = new ArrayList<WebElement>();
		for(String state : states){
			elements.add(driver.findElement(By.xpath("//select[@id='selected_regions']/option[text()='" + state + "']")));
		}
	
		existingRegion.stateSelectionBox().sendKeys(Keys.CONTROL);
		for(WebElement e : elements){
			e.click();
		}
		existingRegion.removeRegionButton().click();
		delayFor(1000);
	}
	
	public void clickSaveList(){
		existingRegion.saveListButton().click();
		delayFor(2000);
	}
	
	public void clickDeleteList(){
		existingRegion.deleteListButton().click();
		delayFor(2000);
	}
	
//	public void verifyOfferExists(String offerName){
//		String offer = "Offer not found";
//		List<WebElement> offers = offerManager.offers();
//    	for (WebElement offerElement : offers){
//    		String strOffer = offerElement.getText();	
//    		if(strOffer.contains(offerName)){
//    			offer = strOffer;
//    			break;
//    		}
//    	}
//    	
//    	Assert.assertEquals(offer, offerName);
//    	delayFor(1000);
//	}
	
	public void verifyRegionExists(String regionName){
		Boolean region = false;			
		for(WebElement element : existingRegion.regionList()){
			if(element.getText().contains(regionName)){
				region = true;
				break;
			}
			
			Assert.assertTrue(region);
		}
				
	}

}
