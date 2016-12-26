package com.inmarkit.qa.framework.mh.controller;

import org.openqa.selenium.WebDriver;

import com.inmarkit.qa.framework.mh.model.CreateAssortmentReviewSavePageModel;

public class CreateAssortmentReviewSavePageController extends MHControllerBase{

	CreateAssortmentReviewSavePageModel reviewSave = null;
	public CreateAssortmentReviewSavePageController(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		reviewSave = new CreateAssortmentReviewSavePageModel(driver);
	}
	
	public String getStoreName(){
		String storename = reviewSave.storeName().getText();
		return storename;
	}
	
	public String getLocationName(){
		String location = reviewSave.location().getText();
		return location;
	}
	
	public String getRegionName(){
		String location = reviewSave.zipcode().getText();
		return location;
	}
	
	public String getZipcode(){
		String zipcode = reviewSave.zipcode().getText();
		return zipcode;
	}
	
	public void clickConfirmAndSubmit(){
		reviewSave.confirmButton().click();
		delayFor(2000);
	}

}
