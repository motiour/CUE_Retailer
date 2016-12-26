package com.inmarkit.qa.framework.mh.controller;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.inmarkit.qa.framework.mh.model.CreateAssortmentSelectStorePageModel;

public class CreateAssortmentSelectStorePageController extends MHControllerBase{

	CreateAssortmentSelectStorePageModel createAssortment = null;
	public CreateAssortmentSelectStorePageController(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		createAssortment = new CreateAssortmentSelectStorePageModel(driver);
	}
	
	public String getPageTitle(){
		String page = createAssortment.pageTitle().getText();
		return page;
	}
	
	public void selectAllStore(){
		createAssortment.selectAllLink().click();
		delayFor(1000);
	}
	
	public void clearAllStore(){
		createAssortment.clearAllLink().click();
		delayFor(1000);
	}
	
	public void selectStoreByZipcode(String zip){
		createAssortment.storeNameCheckbox(zip).click();
		delayFor(1000);
	}
	
	public void filterStoreByKeyword(String keyword){
		createAssortment.filterByEditbox().clear();
		createAssortment.filterByEditbox().sendKeys(keyword);
		createAssortment.filterByEditbox().sendKeys(Keys.RETURN);
		delayFor(1000);
	}

}
