package com.inmarkit.qa.framework.mh.controller;

import org.openqa.selenium.WebDriver;

import com.inmarkit.qa.framework.mh.model.EditOfferStep6PageModel;

public class EditOfferStep6PageController extends MHControllerBase{

	EditOfferStep6PageModel editOfferStep6 = null;
	public EditOfferStep6PageController(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		editOfferStep6 = new EditOfferStep6PageModel(driver);
	}
	
	public String getOfferName(){
		String name = editOfferStep6.offerName().getText();
		return name;
	}
	
	public String getOfferSMSName(){
		String name = editOfferStep6.offerSmsName().getText();
		return name;
	}
	
	public String getOfferDesc(){
		String desc = editOfferStep6.offerDesc().getText();
		return desc;
	}
	
	public String getOfferSmsDesc(){
		String desc = editOfferStep6.offerSmsDesc().getText();
		return desc;
	}
	
	public String getOfferType(){
		String shareable = editOfferStep6.offerType().getText();
		return shareable;
	}
	
	public String getOfferUrl(){
		String url = editOfferStep6.offerUrl().getText();
		return url;
	}
	
	public String getOfferTag(){
		String tag = editOfferStep6.offerTag().getText();
		return tag;
	}
	
	public String getOfferDateRange(){
		String dateRange = editOfferStep6.dateRange().getText();
		return dateRange;
	}
	
	public String getGender(){
		String gender = editOfferStep6.gender().getText();
		return gender;
	}
	
	public String ageRange(){
		String ageRange = editOfferStep6.ageRange().getText();
		return ageRange;
	}
	
	public void clickConfirmAndSubmit(){
		editOfferStep6.confirmButton().click();
		delayFor(3000);
	}

}
