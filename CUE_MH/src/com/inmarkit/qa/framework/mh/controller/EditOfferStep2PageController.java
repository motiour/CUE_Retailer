package com.inmarkit.qa.framework.mh.controller;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.inmarkit.qa.framework.mh.model.EditOfferStep2PageModel;

public class EditOfferStep2PageController extends MHControllerBase{

	EditOfferStep2PageModel editOfferStep2 = null;
	public EditOfferStep2PageController(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		editOfferStep2 = new EditOfferStep2PageModel(driver);
	}
	
	public void selectCity(String city){
		Select select = new Select(editOfferStep2.selectCityComboBox());
		select.selectByVisibleText(city); 
		delayFor(2000);
	}
	
	public void selectAllStores(){
		editOfferStep2.selectAllLink().click();
		delayFor(1000);
	}
	
	public void clearAllStores(){
		editOfferStep2.clearAllLink().click();
		delayFor(1000);
	}
	
	public Boolean isStoreSelected(String storename){
		boolean checkbox = false;
		boolean store = editOfferStep2.storeNameCheckbox(storename).isSelected();
		if(store != false){
			checkbox = store;
		}
		return checkbox;
	}
	
	public void selectStore(String storename){
		boolean store = editOfferStep2.storeNameCheckbox(storename).isSelected();
		if(store != true){
			editOfferStep2.storeNameCheckbox(storename).click();
		}
		
	}
	
	public void clickNextButton(){
		editOfferStep2.nextButton().click();
		delayFor(2000);
	}
	
	public void filterByKeyword(String keyword){
		editOfferStep2.filterByEditbox().clear();
		editOfferStep2.filterByEditbox().sendKeys(keyword);
		editOfferStep2.filterByEditbox().sendKeys(Keys.RETURN);
		delayFor(2000);
	}
	
	public void selectStoreByZipcode(String zip){
		editOfferStep2.storeNameCheckbox(zip).click();
		delayFor(1000);
	}
	
	public void selectStoreAndClickNext(String zip){
		editOfferStep2.storeNameCheckbox(zip).click();
		delayFor(1000);
		editOfferStep2.nextButton().click();
		delayFor(2000);
	}
	
	public String getStoreName(String zip){
		String name = editOfferStep2.storeName(zip).getText();
		return name;
	}
	
	public String getStoreLocation(String zip){
		String name = editOfferStep2.location(zip).getText();
		return name;
	}
	
	public String getStoreRegion(String zip){
		String name = editOfferStep2.region(zip).getText();
		return name;
	}
	
	public String getStoreZipcode(String name){
		String zip = editOfferStep2.zipcode(name).getText();
		return zip;
	}
	
	public Boolean isNextEnable(){
		boolean next = false;
		if(editOfferStep2.nextButton().isEnabled() != false){
			next = true;
		}
		return next;
	
	}
	
	public Boolean isPreviousEnable(){
		boolean prev = false;
		if(editOfferStep2.prevButton().isEnabled() != false){
			prev = true;
		}
		return prev;
	
	}


}
