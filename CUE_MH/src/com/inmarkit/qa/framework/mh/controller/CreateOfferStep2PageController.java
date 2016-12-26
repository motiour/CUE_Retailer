package com.inmarkit.qa.framework.mh.controller;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.inmarkit.qa.framework.mh.model.CreateOfferStep2PageModel;

public class CreateOfferStep2PageController extends MHControllerBase{

	CreateOfferStep2PageModel createOfferStep2 = null;
	public CreateOfferStep2PageController(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		createOfferStep2 = new CreateOfferStep2PageModel(driver);
	}
	
	public void selectCity(String city){
		Select select = new Select(createOfferStep2.selectCityComboBox());
		select.selectByVisibleText(city); 
		delayFor(2000);
	}
	
	public void selectAllStoresAndNext(){
		createOfferStep2.selectAllLink().click();
		delayFor(1000);
		createOfferStep2.nextButton().click();
		delayFor(2000);
	}
	
	public void clearAllStores(){
		createOfferStep2.clearAllLink().click();
		delayFor(1000);
	}
	
	public void clickNextButton(){
		createOfferStep2.nextButton().click();
		delayFor(2000);
	}
	
	public void filterByKeyword(String keyword){
		createOfferStep2.filterByEditbox().clear();
		createOfferStep2.filterByEditbox().sendKeys(keyword);
		createOfferStep2.filterByEditbox().sendKeys(Keys.RETURN);
		delayFor(2000);
	}
	
	public void selectStoreByZipcode(String zip){
		createOfferStep2.storeNameCheckbox(zip).click();
		delayFor(1000);
	}
	
	public void selectStoreAndClickNext(String zip){
		createOfferStep2.storeNameCheckbox(zip).click();
		delayFor(1000);
		createOfferStep2.nextButton().click();
		delayFor(2000);
	}
	
	public String getStoreName(String zip){
		String name = createOfferStep2.storeName(zip).getText();
		return name;
	}
	
	public String getStoreLocation(String zip){
		String name = createOfferStep2.location(zip).getText();
		return name;
	}
	
	public String getStoreRegion(String zip){
		String name = createOfferStep2.region(zip).getText();
		return name;
	}
	
	public String getStoreZipcode(String name){
		String zip = createOfferStep2.zipcode(name).getText();
		return zip;
	}
	
	public Boolean isNextEnable(){
		boolean next = false;
		if(createOfferStep2.nextButton().isEnabled() != false){
			next = true;
		}
		return next;
	
	}
	
	public Boolean isPreviousEnable(){
		boolean prev = false;
		if(createOfferStep2.prevButton().isEnabled() != false){
			prev = true;
		}
		return prev;
	
	}

}
