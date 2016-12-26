package com.inmarkit.qa.framework.mh.controller;

import org.openqa.selenium.WebDriver;

import com.inmarkit.qa.framework.mh.model.CreateOfferStep6PageModel;

public class CreateOfferStep6PageController extends MHControllerBase{

	CreateOfferStep6PageModel createOfferStep6 = null;
	public CreateOfferStep6PageController(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		createOfferStep6 = new CreateOfferStep6PageModel(driver);
	}
	
	public String getOfferName(){
		String name = createOfferStep6.offerName().getText();
		return name;
	}
	
	public String getOfferSMSName(){
		String name = createOfferStep6.offerSmsName().getText();
		return name;
	}
	
	public String getOfferDesc(){
		String desc = createOfferStep6.offerDesc().getText();
		return desc;
	}
	
	public String getOfferSmsDesc(){
		String desc = createOfferStep6.offerSmsDesc().getText();
		return desc;
	}
	
	public String getOfferType(){
		String shareable = createOfferStep6.offerType().getText();
		return shareable;
	}
	
	public String getOfferUrl(){
		String url = createOfferStep6.offerUrl().getText();
		return url;
	}
	
	public String getOfferTag(){
		String tag = createOfferStep6.offerTag().getText();
		return tag;
	}
	
	public String getOfferDateRange(){
		String dateRange = createOfferStep6.dateRange().getText();
		return dateRange;
	}
	
	public String getGender(){
		String gender = createOfferStep6.gender().getText();
		return gender;
	}
	
	public String ageRange(){
		String ageRange = createOfferStep6.ageRange().getText();
		return ageRange;
	}
	
	public void clickConfirmAndSubmit(){
		createOfferStep6.confirmButton().click();
		delayFor(3000);
	}

}
